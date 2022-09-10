package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmip  reason: default package */
/* loaded from: classes5.dex */
public final class cmip {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static cmij a(cmnk cmnkVar, List<cmii> list) {
        String C = cmnkVar.C();
        if (C == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(C);
        if (matcher.matches()) {
            return e(null, matcher, cmnkVar, list);
        }
        String C2 = cmnkVar.C();
        if (C2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(C2);
        if (!matcher2.matches()) {
            return null;
        }
        return e(C.trim(), matcher2, cmnkVar, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cmfv b(String str) {
        cmio cmioVar = new cmio();
        f(str, cmioVar);
        return cmioVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cmfw c(CharSequence charSequence) {
        cmio cmioVar = new cmio();
        cmioVar.c = charSequence;
        return cmioVar.a().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString d(java.lang.String r17, java.lang.String r18, java.util.List<defpackage.cmii> r19) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmip.d(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    private static cmij e(String str, Matcher matcher, cmnk cmnkVar, List<cmii> list) {
        cmio cmioVar = new cmio();
        try {
            String group = matcher.group(1);
            cmmn.f(group);
            cmioVar.a = cmir.b(group);
            String group2 = matcher.group(2);
            cmmn.f(group2);
            cmioVar.b = cmir.b(group2);
            String group3 = matcher.group(3);
            cmmn.f(group3);
            f(group3, cmioVar);
            StringBuilder sb = new StringBuilder();
            String C = cmnkVar.C();
            while (!TextUtils.isEmpty(C)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(C.trim());
                C = cmnkVar.C();
            }
            cmioVar.c = d(str, sb.toString(), list);
            return new cmij(cmioVar.a().a(), cmioVar.a, cmioVar.b);
        } catch (NumberFormatException unused) {
            if (String.valueOf(matcher.group()).length() != 0) {
                return null;
            }
            new String("Skipping cue with bad header: ");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void f(String str, cmio cmioVar) {
        char c2;
        char c3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            cmmn.f(group);
            int i2 = 2;
            String group2 = matcher.group(2);
            cmmn.f(group2);
            try {
                char c4 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c4 == 0) {
                            i2 = 0;
                        } else if (c4 == 1 || c4 == 2) {
                            i2 = 1;
                        } else if (c4 != 3) {
                            if (String.valueOf(substring).length() == 0) {
                                new String("Invalid anchor value: ");
                            }
                            i2 = Integer.MIN_VALUE;
                        }
                        cmioVar.g = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        cmioVar.e = cmir.c(group2);
                        cmioVar.f = 0;
                    } else {
                        cmioVar.e = Integer.parseInt(group2);
                        cmioVar.f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2 && c2 != 3) {
                                if (c2 == 4) {
                                    i = 3;
                                } else if (c2 == 5) {
                                    i = 5;
                                } else if (group2.length() == 0) {
                                    new String("Invalid alignment value: ");
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    cmioVar.d = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    char c5 = 65535;
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c5 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c5 == 0 || c5 == 1) {
                            i = 0;
                        } else if (c5 != 2 && c5 != 3) {
                            if (c5 == 4 || c5 == 5) {
                                i = 2;
                            } else {
                                if (String.valueOf(substring2).length() == 0) {
                                    new String("Invalid anchor value: ");
                                }
                                i = Integer.MIN_VALUE;
                            }
                        }
                        cmioVar.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    cmioVar.h = cmir.c(group2);
                } else if ("size".equals(group)) {
                    cmioVar.j = cmir.c(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c3 = 0;
                        }
                        c3 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c3 = 1;
                        }
                        c3 = 65535;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (group2.length() == 0) {
                                new String("Invalid 'vertical' value: ");
                            }
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    cmioVar.k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    sb.toString();
                }
            } catch (NumberFormatException unused) {
                if (String.valueOf(matcher.group()).length() == 0) {
                    new String("Skipping bad cue setting: ");
                }
            }
        }
    }

    private static void g(String str, cmim cmimVar, List<cmil> list, SpannableStringBuilder spannableStringBuilder, List<cmii> list2) {
        char c2;
        int i = cmimVar.b;
        int length = spannableStringBuilder.length();
        String str2 = cmimVar.a;
        int hashCode = str2.hashCode();
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 5;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 6;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                i(list2, str, cmimVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, cmil.a);
                int i2 = cmimVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if ("rt".equals(((cmil) arrayList.get(i4)).b.a)) {
                        cmil cmilVar = (cmil) arrayList.get(i4);
                        i(list2, str, cmilVar.b);
                        int i5 = cmilVar.b.b - i3;
                        int i6 = cmilVar.c - i3;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new cmhj(), i2, i5, 33);
                        i3 += subSequence.length();
                        i2 = i5;
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : cmimVar.d) {
                    Map<String, Integer> map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i, length, 33);
                    } else {
                        Map<String, Integer> map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List<cmin> h = h(list2, str, cmimVar);
        for (int i7 = 0; i7 < h.size(); i7++) {
            cmii cmiiVar = h.get(i7).b;
            if (cmiiVar != null) {
                if (cmiiVar.a() != -1) {
                    cmhk.a(spannableStringBuilder, new StyleSpan(cmiiVar.a()), i, length);
                }
                if (cmiiVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (cmiiVar.g) {
                    cmhk.a(spannableStringBuilder, new ForegroundColorSpan(cmiiVar.f), i, length);
                }
                if (cmiiVar.i) {
                    cmhk.a(spannableStringBuilder, new BackgroundColorSpan(cmiiVar.h), i, length);
                }
                String str4 = cmiiVar.e;
                if (str4 != null) {
                    cmhk.a(spannableStringBuilder, new TypefaceSpan(str4), i, length);
                }
                if (cmiiVar.n) {
                    spannableStringBuilder.setSpan(new cmhi(), i, length, 33);
                }
            }
        }
    }

    private static List<cmin> h(List<cmii> list, String str, cmim cmimVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            cmii cmiiVar = list.get(i);
            String str2 = cmimVar.a;
            Set<String> set = cmimVar.d;
            String str3 = cmimVar.c;
            if (cmiiVar.a.isEmpty() && cmiiVar.b.isEmpty() && cmiiVar.c.isEmpty() && cmiiVar.d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int b2 = cmii.b(cmii.b(cmii.b(0, cmiiVar.a, str, 1073741824), cmiiVar.b, str2, 2), cmiiVar.d, str3, 4);
                if (b2 != -1 && set.containsAll(cmiiVar.c)) {
                    size = b2 + (cmiiVar.c.size() * 4);
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new cmin(size, cmiiVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void i(List<cmii> list, String str, cmim cmimVar) {
        List<cmin> h = h(list, str, cmimVar);
        for (int i = 0; i < h.size() && h.get(i).b.m == -1; i++) {
        }
    }
}
