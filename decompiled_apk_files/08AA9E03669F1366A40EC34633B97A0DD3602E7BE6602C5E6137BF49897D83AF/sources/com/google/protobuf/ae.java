package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.r;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class ae {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(ac acVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(acVar, sb, 0);
        return sb.toString();
    }

    private static void a(ac acVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        Map.Entry<r.e, Object> next;
        boolean booleanValue;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : acVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - "List".length());
                Method method2 = (Method) hashMap.get("get" + replaceFirst);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(str2), r.a(method2, acVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - "Bytes".length()))) {
                    }
                }
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method3 = (Method) hashMap.get("get" + replaceFirst);
                Method method4 = (Method) hashMap.get("has" + replaceFirst);
                if (method3 != null) {
                    Object a2 = r.a(method3, acVar, new Object[0]);
                    if (method4 == null) {
                        booleanValue = !a(a2);
                    } else {
                        booleanValue = ((Boolean) r.a(method4, acVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        a(sb, i, a(str3), a2);
                    }
                }
            }
        }
        if (acVar instanceof r.c) {
            Iterator<Map.Entry<r.e, Object>> g = ((r.c) acVar).f4706c.g();
            while (g.hasNext()) {
                a(sb, i, "[" + next.getKey().f() + "]", g.next().getValue());
            }
        }
        r rVar = (r) acVar;
        if (rVar.f4699a != null) {
            rVar.f4699a.a(sb, i);
        }
    }

    private static boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return ((Float) obj).floatValue() == BitmapDescriptorFactory.HUE_RED;
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof f) {
                return obj.equals(f.f4423a);
            }
            return obj instanceof ac ? obj == ((ac) obj).E() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(aq.a((String) obj));
            sb.append('\"');
        } else if (obj instanceof f) {
            sb.append(": \"");
            sb.append(aq.a((f) obj));
            sb.append('\"');
        } else if (obj instanceof r) {
            sb.append(" {");
            a((r) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
