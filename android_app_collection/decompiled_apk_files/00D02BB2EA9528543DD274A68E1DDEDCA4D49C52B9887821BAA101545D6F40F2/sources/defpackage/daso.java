package defpackage;

import com.google.android.filament.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: daso  reason: default package */
/* loaded from: classes5.dex */
public final class daso {
    static final Map<Character, dasn> a = new HashMap();

    static {
        dasn.values();
    }

    public static String a(String str, String str2, Object obj) {
        String valueOf;
        String valueOf2;
        if (str2.startsWith("/")) {
            darw darwVar = new darw(str);
            darwVar.a = darw.f(null);
            valueOf = String.valueOf(darwVar.c());
            valueOf2 = String.valueOf(str2);
            if (valueOf2.length() == 0) {
                str2 = new String(valueOf);
            }
            str2 = valueOf.concat(valueOf2);
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            valueOf = String.valueOf(str);
            valueOf2 = String.valueOf(str2);
            if (valueOf2.length() == 0) {
                str2 = new String(valueOf);
            }
            str2 = valueOf.concat(valueOf2);
        }
        Map<String, Object> b = b(obj);
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int indexOf = str2.indexOf(R.styleable.AppCompatTheme_windowFixedWidthMinor, i2);
            if (indexOf != -1) {
                sb.append(str2.substring(i2, indexOf));
                int indexOf2 = str2.indexOf(R.styleable.AppCompatTheme_windowMinWidthMinor, indexOf + 2);
                int i3 = indexOf2 + 1;
                String substring = str2.substring(indexOf + 1, indexOf2);
                dasn dasnVar = a.get(Character.valueOf(substring.charAt(0)));
                if (dasnVar == null) {
                    dasnVar = dasn.SIMPLE;
                }
                ListIterator<String> listIterator = dbtm.a(',').i(substring).listIterator();
                boolean z = true;
                while (listIterator.hasNext()) {
                    String next = listIterator.next();
                    boolean endsWith = next.endsWith("*");
                    int i4 = (listIterator.nextIndex() != 1 || dasnVar.i == null) ? 0 : 1;
                    int length2 = next.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = next.substring(i4, length2);
                    Object remove = b.remove(substring2);
                    if (remove != null) {
                        if (z) {
                            sb.append(dasnVar.j);
                        } else {
                            sb.append(dasnVar.k);
                        }
                        if (remove instanceof Iterator) {
                            remove = c(substring2, (Iterator) remove, endsWith, dasnVar);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            remove = c(substring2, dava.l(remove).iterator(), endsWith, dasnVar);
                        } else if (remove.getClass().isEnum()) {
                            if (dauh.a((Enum) remove).c != null) {
                                if (dasnVar.l) {
                                    remove = String.format("%s=%s", substring2, remove);
                                }
                                remove = davc.c(remove.toString());
                            }
                        } else if (!daub.g(remove)) {
                            Map<String, Object> b2 = b(remove);
                            if (b2.isEmpty()) {
                                remove = "";
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                String str3 = "=";
                                String str4 = ",";
                                if (endsWith) {
                                    str4 = dasnVar.k;
                                } else {
                                    if (dasnVar.l) {
                                        sb2.append(davc.c(substring2));
                                        sb2.append(str3);
                                    }
                                    str3 = str4;
                                }
                                Iterator<Map.Entry<String, Object>> it = b2.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry<String, Object> next2 = it.next();
                                    String a2 = dasnVar.a(next2.getKey());
                                    String a3 = dasnVar.a(next2.getValue().toString());
                                    sb2.append(a2);
                                    sb2.append(str3);
                                    sb2.append(a3);
                                    if (it.hasNext()) {
                                        sb2.append(str4);
                                    }
                                }
                                remove = sb2.toString();
                            }
                        } else {
                            if (dasnVar.l) {
                                remove = String.format("%s=%s", substring2, remove);
                            }
                            if (dasnVar.m) {
                                remove = davc.a.a(remove.toString());
                            } else {
                                remove = davc.c(remove.toString());
                            }
                        }
                        sb.append(remove);
                        z = false;
                    }
                }
                i2 = i3;
            } else {
                if (i2 != 0) {
                    i = i2;
                }
                sb.append(str2.substring(i));
            }
        }
        darw.g(b.entrySet(), sb);
        return sb.toString();
    }

    private static Map<String, Object> b(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : daub.c(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !daub.b(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    private static String c(String str, Iterator<?> it, boolean z, dasn dasnVar) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = dasnVar.k;
        } else {
            if (dasnVar.l) {
                sb.append(davc.c(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && dasnVar.l) {
                sb.append(davc.c(str));
                sb.append("=");
            }
            sb.append(dasnVar.a(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
