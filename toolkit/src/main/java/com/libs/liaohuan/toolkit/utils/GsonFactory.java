package com.libs.liaohuan.toolkit.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsonFactory {
	/**
	 * @param clazz
	 *            传入bean类
	 * @param json
	 *            传入json
	 * */
	public static Object getInstanceByJson(String json, Class<?> clazz) {
		Object obj = null;
		Gson gson = new Gson();
		obj = gson.fromJson(json, clazz);
		return obj;
	}

	/**
	 * @author LH
	 * @param json
	 * @param clazz 未知
	 * @deprecated  无法传参废弃。
	 */
	public static <T> List<T> jsonToList(String json, Class<T[]> clazz) {
		Gson gson = new Gson();
		T[] array = gson.fromJson(json, clazz);
		return Arrays.asList(array);
	}

	/**
	 * @param json 传入json
	 * @param clazz 传入bean类
	 * @return
	 */
	public static <T> ArrayList<T> jsonToArrayList(String json, Class<T> clazz) {
		Type type = new TypeToken<ArrayList<JsonObject>>() {
		}.getType();
		ArrayList<JsonObject> jsonObjects = new Gson().fromJson(json, type);

		ArrayList<T> arrayList = new ArrayList<>();
		for (JsonObject jsonObject : jsonObjects) {
			arrayList.add(new Gson().fromJson(jsonObject, clazz));
		}
		return arrayList;
	}
}