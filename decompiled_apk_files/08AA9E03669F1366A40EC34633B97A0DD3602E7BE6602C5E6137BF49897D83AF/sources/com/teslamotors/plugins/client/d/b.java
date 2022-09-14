package com.teslamotors.plugins.client.d;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: JSONHelper.java */
/* loaded from: classes.dex */
public class b {
    public static Object a(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                jSONObject.put(obj2.toString(), a(map.get(obj2)));
            }
            return jSONObject;
        } else if (obj instanceof Iterable) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj3 : (Iterable) obj) {
                jSONArray.put(obj3);
            }
            return jSONArray;
        } else if (!(obj instanceof Bundle)) {
            return obj;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            Bundle bundle = (Bundle) obj;
            for (String str : bundle.keySet()) {
                jSONObject2.put(str, a(bundle.get(str)));
            }
            return jSONObject2;
        }
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, b(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(b(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static Object b(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static JSONObject a(an anVar) {
        JSONObject jSONObject = new JSONObject();
        if (anVar == null) {
            return null;
        }
        ReadableMapKeySetIterator a2 = anVar.a();
        if (!a2.hasNextKey()) {
            return null;
        }
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            switch (anVar.getType(nextKey)) {
                case Null:
                    jSONObject.put(nextKey, (Object) null);
                    continue;
                case Boolean:
                    jSONObject.put(nextKey, anVar.getBoolean(nextKey));
                    continue;
                case Number:
                    jSONObject.put(nextKey, (long) anVar.getDouble(nextKey));
                    continue;
                case String:
                    jSONObject.put(nextKey, anVar.getString(nextKey));
                    continue;
                case Map:
                    jSONObject.put(nextKey, a(anVar.d(nextKey)));
                    continue;
                case Array:
                    jSONObject.put(nextKey, anVar.e(nextKey));
                    continue;
                default:
                    continue;
            }
        }
        return jSONObject;
    }

    public static ar b(JSONObject jSONObject) {
        Object obj;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        if (!keys.hasNext()) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException unused) {
            }
            if (obj != null && !obj.toString().equals("null")) {
                if (obj instanceof Boolean) {
                    writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeMap.putString(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    writableNativeMap.a(next, b((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeMap.a(next, b((JSONArray) obj));
                }
            }
            writableNativeMap.putNull(next);
        }
        return writableNativeMap;
    }

    public static aq b(JSONArray jSONArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object obj = jSONArray.get(i);
                    if (obj == null) {
                        writableNativeArray.pushNull();
                    } else if (obj instanceof Boolean) {
                        writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        writableNativeArray.pushInt(((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        writableNativeArray.pushDouble(((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        writableNativeArray.pushString((String) obj);
                    } else if (obj instanceof JSONObject) {
                        writableNativeArray.a(b((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        writableNativeArray.a(b((JSONArray) obj));
                    }
                } catch (JSONException unused) {
                }
            }
            return writableNativeArray;
        }
        return null;
    }
}
