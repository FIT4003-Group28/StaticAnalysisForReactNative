package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssl  reason: default package */
/* loaded from: classes6.dex */
public final class dssl {
    public static void a(dssj dssjVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : dssjVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, c(concat), dsqw.ce(method2, dssjVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, c(concat2), dsqw.ce(method3, dssjVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object ce = dsqw.ce(method4, dssjVar, new Object[0]);
                    if (method5 == null) {
                        if (ce instanceof Boolean) {
                            if (((Boolean) ce).booleanValue()) {
                                b(sb, i, c(concat3), ce);
                            }
                        } else if (ce instanceof Integer) {
                            if (((Integer) ce).intValue() != 0) {
                                b(sb, i, c(concat3), ce);
                            }
                        } else if (ce instanceof Float) {
                            if (((Float) ce).floatValue() != 0.0f) {
                                b(sb, i, c(concat3), ce);
                            }
                        } else if (ce instanceof Double) {
                            if (((Double) ce).doubleValue() != dcyn.a) {
                                b(sb, i, c(concat3), ce);
                            }
                        } else {
                            if (ce instanceof String) {
                                equals = ce.equals("");
                            } else if (ce instanceof dspd) {
                                equals = ce.equals(dspd.b);
                            } else if (ce instanceof dssj) {
                                if (ce != ((dssj) ce).Qw()) {
                                    b(sb, i, c(concat3), ce);
                                }
                            } else {
                                if ((ce instanceof Enum) && ((Enum) ce).ordinal() == 0) {
                                }
                                b(sb, i, c(concat3), ce);
                            }
                            if (!equals) {
                                b(sb, i, c(concat3), ce);
                            }
                        }
                    } else if (((Boolean) dsqw.ce(method5, dssjVar, new Object[0])).booleanValue()) {
                        b(sb, i, c(concat3), ce);
                    }
                }
            }
        }
        if (dssjVar instanceof dsqs) {
            Iterator<Map.Entry<dsqu, Object>> d = ((dsqs) dssjVar).V.d();
            while (d.hasNext()) {
                Map.Entry<dsqu, Object> next = d.next();
                int i2 = next.getKey().b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                b(sb, i, sb2.toString(), next.getValue());
            }
        }
        dsty dstyVar = ((dsqw) dssjVar).bD;
        if (dstyVar != null) {
            for (int i3 = 0; i3 < dstyVar.b; i3++) {
                b(sb, i, String.valueOf(dsut.b(dstyVar.c[i3])), dstyVar.d[i3]);
            }
        }
    }

    static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(dstt.a(dspd.B((String) obj)));
                sb.append('\"');
            } else if (obj instanceof dspd) {
                sb.append(": \"");
                sb.append(dstt.a((dspd) obj));
                sb.append('\"');
            } else if (obj instanceof dsqw) {
                sb.append(" {");
                a((dsqw) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                b(sb, i4, "key", entry2.getKey());
                b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
