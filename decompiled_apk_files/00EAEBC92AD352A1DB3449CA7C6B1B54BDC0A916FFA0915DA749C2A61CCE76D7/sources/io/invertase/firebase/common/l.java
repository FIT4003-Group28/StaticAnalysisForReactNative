package io.invertase.firebase.common;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class l {
    private static WritableArray a(List<Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object obj : list) {
            a(obj, createArray);
        }
        return createArray;
    }

    public static WritableArray a(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(a(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(a(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap a(Exception exc) {
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        createMap.putString("code", "unknown");
        createMap.putString("nativeErrorCode", "unknown");
        createMap.putString("message", message);
        createMap.putString("nativeErrorMessage", message);
        return createMap;
    }

    public static WritableMap a(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public static WritableMap a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, a(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public static String a(long j) {
        Date date = new Date((j + Calendar.getInstance().getTimeZone().getOffset(j)) * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static void a(Object obj, WritableArray writableArray) {
        double longValue;
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        char c2 = 65535;
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    c2 = 4;
                    break;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    c2 = 2;
                    break;
                }
                break;
            case 146015330:
                if (name.equals("org.json.JSONArray$1")) {
                    c2 = 7;
                    break;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    c2 = 0;
                    break;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    c2 = 1;
                    break;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1195259493:
                if (name.equals("java.lang.String")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1614941136:
                if (name.equals("org.json.JSONObject$1")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                writableArray.pushBoolean(((Boolean) obj).booleanValue());
                return;
            case 1:
                longValue = ((Long) obj).longValue();
                writableArray.pushDouble(longValue);
                return;
            case 2:
                longValue = ((Float) obj).floatValue();
                writableArray.pushDouble(longValue);
                return;
            case 3:
                longValue = ((Double) obj).doubleValue();
                writableArray.pushDouble(longValue);
                return;
            case 4:
                writableArray.pushInt(((Integer) obj).intValue());
                return;
            case 5:
                writableArray.pushString((String) obj);
                return;
            case 6:
                writableArray.pushMap(a((JSONObject) obj));
                return;
            case 7:
                writableArray.pushArray(a((JSONArray) obj));
                return;
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushArray(a((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushMap(a((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
                    writableArray.pushNull();
                    return;
                }
        }
    }

    public static void a(String str, Object obj, WritableMap writableMap) {
        double longValue;
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        char c2 = 65535;
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    c2 = 4;
                    break;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    c2 = 2;
                    break;
                }
                break;
            case 146015330:
                if (name.equals("org.json.JSONArray$1")) {
                    c2 = 7;
                    break;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    c2 = 0;
                    break;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    c2 = 1;
                    break;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1195259493:
                if (name.equals("java.lang.String")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1614941136:
                if (name.equals("org.json.JSONObject$1")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 1:
                longValue = ((Long) obj).longValue();
                writableMap.putDouble(str, longValue);
                return;
            case 2:
                longValue = ((Float) obj).floatValue();
                writableMap.putDouble(str, longValue);
                return;
            case 3:
                longValue = ((Double) obj).doubleValue();
                writableMap.putDouble(str, longValue);
                return;
            case 4:
                writableMap.putInt(str, ((Integer) obj).intValue());
                return;
            case 5:
                writableMap.putString(str, (String) obj);
                return;
            case 6:
                writableMap.putMap(str, a((JSONObject) obj));
                return;
            case 7:
                writableMap.putArray(str, a((JSONArray) obj));
                return;
            default:
                if (List.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putArray(str, a((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putMap(str, a((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
                    writableMap.putNull(str);
                    return;
                }
        }
    }

    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                try {
                    return ((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED;
                } catch (ClassCastException unused) {
                    return true;
                }
            }
        }
        return false;
    }
}
