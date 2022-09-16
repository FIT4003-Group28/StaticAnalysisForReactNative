package com.facebook.react.bridge;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: Arguments.java */
/* loaded from: classes.dex */
public class b {
    private static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return new Double(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return a(obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Map) {
            return a((Map<String, Object>) obj);
        }
        return obj instanceof Bundle ? a((Bundle) obj) : obj;
    }

    public static WritableNativeArray a(List list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list == null) {
            return writableNativeArray;
        }
        for (Object obj : list) {
            Object c2 = c(obj);
            if (c2 == null) {
                writableNativeArray.pushNull();
            } else if (c2 instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) c2).booleanValue());
            } else if (c2 instanceof Integer) {
                writableNativeArray.pushInt(((Integer) c2).intValue());
            } else if (c2 instanceof Double) {
                writableNativeArray.pushDouble(((Double) c2).doubleValue());
            } else if (c2 instanceof String) {
                writableNativeArray.pushString((String) c2);
            } else if (c2 instanceof WritableNativeArray) {
                writableNativeArray.a((WritableNativeArray) c2);
            } else if (c2 instanceof WritableNativeMap) {
                writableNativeArray.a((WritableNativeMap) c2);
            } else {
                throw new IllegalArgumentException("Could not convert " + c2.getClass());
            }
        }
        return writableNativeArray;
    }

    public static <T> WritableNativeArray a(final Object obj) {
        if (obj == null) {
            return new WritableNativeArray();
        }
        return a((List) new AbstractList() { // from class: com.facebook.react.bridge.b.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return Array.getLength(obj);
            }

            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                return Array.get(obj, i);
            }
        });
    }

    private static void a(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object c2 = c(obj);
        if (c2 == null) {
            writableNativeMap.putNull(str);
        } else if (c2 instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) c2).booleanValue());
        } else if (c2 instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) c2).intValue());
        } else if (c2 instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) c2).doubleValue());
        } else if (c2 instanceof String) {
            writableNativeMap.putString(str, (String) c2);
        } else if (c2 instanceof WritableNativeArray) {
            writableNativeMap.a(str, (WritableNativeArray) c2);
        } else if (c2 instanceof WritableNativeMap) {
            writableNativeMap.a(str, (WritableNativeMap) c2);
        } else {
            throw new IllegalArgumentException("Could not convert " + c2.getClass());
        }
    }

    public static WritableNativeMap a(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            a(writableNativeMap, entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    public static WritableNativeMap a(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            a(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static aq a() {
        return new WritableNativeArray();
    }

    public static ar b() {
        return new WritableNativeMap();
    }

    public static WritableNativeArray a(Object[] objArr) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (cls == Integer.class) {
                    writableNativeArray.pushDouble(((Integer) obj).doubleValue());
                } else if (cls == Double.class) {
                    writableNativeArray.pushDouble(((Double) obj).doubleValue());
                } else if (cls == Float.class) {
                    writableNativeArray.pushDouble(((Float) obj).doubleValue());
                } else if (cls == String.class) {
                    writableNativeArray.pushString(obj.toString());
                } else if (cls == WritableNativeMap.class) {
                    writableNativeArray.a((WritableNativeMap) obj);
                } else if (cls == WritableNativeArray.class) {
                    writableNativeArray.a((WritableNativeArray) obj);
                } else {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
            }
        }
        return writableNativeArray;
    }

    public static aq b(Object obj) {
        aq a2 = a();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                a2.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                a2.a(b(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                a2.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                a2.pushDouble(fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                a2.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                a2.pushBoolean(zArr[i]);
                i++;
            }
        } else {
            throw new IllegalArgumentException("Unknown array type " + obj.getClass());
        }
        return a2;
    }

    public static aq b(List list) {
        aq a2 = a();
        for (Object obj : list) {
            if (obj == null) {
                a2.pushNull();
            } else if (obj.getClass().isArray()) {
                a2.a(b(obj));
            } else if (obj instanceof Bundle) {
                a2.a(b((Bundle) obj));
            } else if (obj instanceof List) {
                a2.a(b((List) obj));
            } else if (obj instanceof String) {
                a2.pushString((String) obj);
            } else if (obj instanceof Integer) {
                a2.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Number) {
                a2.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                a2.pushBoolean(((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Unknown value type " + obj.getClass());
            }
        }
        return a2;
    }

    public static ar b(Bundle bundle) {
        ar b2 = b();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                b2.putNull(str);
            } else if (obj.getClass().isArray()) {
                b2.a(str, b(obj));
            } else if (obj instanceof String) {
                b2.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    b2.putInt(str, ((Integer) obj).intValue());
                } else {
                    b2.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                b2.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                b2.a(str, b((Bundle) obj));
            } else if (obj instanceof List) {
                b2.a(str, b((List) obj));
            } else {
                throw new IllegalArgumentException("Could not convert " + obj.getClass());
            }
        }
        return b2;
    }

    public static ArrayList a(am amVar) {
        if (amVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < amVar.size(); i++) {
            switch (amVar.getType(i)) {
                case Null:
                    arrayList.add(null);
                    break;
                case Boolean:
                    arrayList.add(Boolean.valueOf(amVar.getBoolean(i)));
                    break;
                case Number:
                    double d2 = amVar.getDouble(i);
                    if (d2 == Math.rint(d2)) {
                        arrayList.add(Integer.valueOf((int) d2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d2));
                        break;
                    }
                case String:
                    arrayList.add(amVar.getString(i));
                    break;
                case Map:
                    arrayList.add(a(amVar.c(i)));
                    break;
                case Array:
                    arrayList.add(a(amVar.d(i)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    public static Bundle a(an anVar) {
        if (anVar == null) {
            return null;
        }
        ReadableMapKeySetIterator a2 = anVar.a();
        Bundle bundle = new Bundle();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            switch (anVar.getType(nextKey)) {
                case Null:
                    bundle.putString(nextKey, null);
                    break;
                case Boolean:
                    bundle.putBoolean(nextKey, anVar.getBoolean(nextKey));
                    break;
                case Number:
                    bundle.putDouble(nextKey, anVar.getDouble(nextKey));
                    break;
                case String:
                    bundle.putString(nextKey, anVar.getString(nextKey));
                    break;
                case Map:
                    bundle.putBundle(nextKey, a(anVar.d(nextKey)));
                    break;
                case Array:
                    bundle.putSerializable(nextKey, a(anVar.e(nextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return bundle;
    }
}
