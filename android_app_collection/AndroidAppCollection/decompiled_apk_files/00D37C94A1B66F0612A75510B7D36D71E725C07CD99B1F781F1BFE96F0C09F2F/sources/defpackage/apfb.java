package defpackage;

import j$.time.Instant;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: apfb  reason: default package */
/* loaded from: classes.dex */
public final class apfb {
    public static int a(int i) {
        if (i != 0) {
            if (i == 100) {
                return 101;
            }
            if (i == 102) {
                return 103;
            }
            if (i == 104) {
                return 105;
            }
            return i != 105 ? 0 : 106;
        }
        return 1;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int f(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static aorw g(Instant instant) {
        return aosw.e(instant.getEpochSecond(), instant.getNano());
    }

    static final void h(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                h(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                h(sb, i, str, entry);
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
                sb.append(apdw.e(aoob.z((String) obj)));
                sb.append('\"');
            } else if (obj instanceof aoob) {
                sb.append(": \"");
                sb.append(apdw.e((aoob) obj));
                sb.append('\"');
            } else if (obj instanceof aopi) {
                sb.append(" {");
                i((aopi) obj, sb, i + 2);
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
                h(sb, i4, "key", entry2.getKey());
                h(sb, i4, "value", entry2.getValue());
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

    public static void i(aoqu aoquVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : aoquVar.getClass().getDeclaredMethods()) {
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
                    h(sb, i, j(concat), aopi.invokeOrDie(method2, aoquVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    h(sb, i, j(concat2), aopi.invokeOrDie(method3, aoquVar, new Object[0]));
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
                    Object invokeOrDie = aopi.invokeOrDie(method4, aoquVar, new Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            if (((Boolean) invokeOrDie).booleanValue()) {
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() != 0) {
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof Float) {
                            if (((Float) invokeOrDie).floatValue() != 0.0f) {
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof Double) {
                            if (((Double) invokeOrDie).doubleValue() != 0.0d) {
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                        } else {
                            if (invokeOrDie instanceof String) {
                                equals = invokeOrDie.equals("");
                            } else if (invokeOrDie instanceof aoob) {
                                equals = invokeOrDie.equals(aoob.b);
                            } else if (invokeOrDie instanceof aoqu) {
                                if (invokeOrDie != ((aoqu) invokeOrDie).mo50getDefaultInstanceForType()) {
                                    h(sb, i, j(concat3), invokeOrDie);
                                }
                            } else {
                                if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                                }
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                            if (!equals) {
                                h(sb, i, j(concat3), invokeOrDie);
                            }
                        }
                    } else if (((Boolean) aopi.invokeOrDie(method5, aoquVar, new Object[0])).booleanValue()) {
                        h(sb, i, j(concat3), invokeOrDie);
                    }
                }
            }
        }
        if (aoquVar instanceof aopd) {
            Iterator e = ((aopd) aoquVar).l.e();
            while (e.hasNext()) {
                Map.Entry entry = (Map.Entry) e.next();
                int i2 = ((aopf) entry.getKey()).b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                h(sb, i, sb2.toString(), entry.getValue());
            }
        }
        aory aoryVar = ((aopi) aoquVar).unknownFields;
        if (aoryVar != null) {
            for (int i3 = 0; i3 < aoryVar.b; i3++) {
                h(sb, i, String.valueOf(aosl.a(aoryVar.c[i3])), aoryVar.d[i3]);
            }
        }
    }

    private static final String j(String str) {
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
