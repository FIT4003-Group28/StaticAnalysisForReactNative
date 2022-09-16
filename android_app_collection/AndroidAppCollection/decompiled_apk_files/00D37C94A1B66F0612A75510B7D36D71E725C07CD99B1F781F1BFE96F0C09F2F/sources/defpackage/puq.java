package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: puq  reason: default package */
/* loaded from: classes4.dex */
public final class puq {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, (int) PrivateKeyType.INVALID, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, (int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID)));
        hashMap.put("red", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, 0, (int) PrivateKeyType.INVALID)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, (int) PrivateKeyType.INVALID)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, (int) PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, (int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, (int) PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb((int) PrivateKeyType.INVALID, 0, (int) PrivateKeyType.INVALID)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, (int) PrivateKeyType.INVALID)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puq.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static psf b(String str) {
        pup pupVar = new pup();
        h(str, pupVar);
        return pupVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static psg c(CharSequence charSequence) {
        pup pupVar = new pup();
        pupVar.c = charSequence;
        return pupVar.a().a();
    }

    public static pul d(pwu pwuVar, List list) {
        String s = pwuVar.s();
        if (s == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            return e(null, matcher, pwuVar, list);
        }
        String s2 = pwuVar.s();
        if (s2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(s2);
        if (!matcher2.matches()) {
            return null;
        }
        return e(s.trim(), matcher2, pwuVar, list);
    }

    private static pul e(String str, Matcher matcher, pwu pwuVar, List list) {
        pup pupVar = new pup();
        try {
            String group = matcher.group(1);
            ptx.a(group);
            pupVar.a = pus.b(group);
            String group2 = matcher.group(2);
            ptx.a(group2);
            pupVar.b = pus.b(group2);
            String group3 = matcher.group(3);
            ptx.a(group3);
            h(group3, pupVar);
            StringBuilder sb = new StringBuilder();
            String s = pwuVar.s();
            while (!TextUtils.isEmpty(s)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(s.trim());
                s = pwuVar.s();
            }
            pupVar.c = a(str, sb.toString(), list);
            return new pul(pupVar.a().a(), pupVar.a, pupVar.b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    private static List f(List list, String str, pun punVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            puk pukVar = (puk) list.get(i);
            String str2 = punVar.a;
            Set set = punVar.d;
            String str3 = punVar.c;
            if (!pukVar.a.isEmpty() || !pukVar.b.isEmpty() || !pukVar.c.isEmpty() || !pukVar.d.isEmpty()) {
                int b2 = puk.b(puk.b(puk.b(0, pukVar.a, str, 1073741824), pukVar.b, str2, 2), pukVar.d, str3, 4);
                if (b2 != -1 && set.containsAll(pukVar.c)) {
                    size = b2 + (pukVar.c.size() * 4);
                }
                size = 0;
            } else {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new puo(size, pukVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void g(String str, pun punVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i = punVar.b;
        int length = spannableStringBuilder.length();
        String str2 = punVar.a;
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
                i(list2, str, punVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, pum.a);
                int i2 = punVar.b;
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if ("rt".equals(((pum) arrayList.get(i4)).b.a)) {
                        pum pumVar = (pum) arrayList.get(i4);
                        i(list2, str, pumVar.b);
                        int i5 = pumVar.b.b - i3;
                        int i6 = pumVar.c - i3;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new pnq(), i2, i5, 33);
                        i3 += subSequence.length();
                        i2 = i5;
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : punVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
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
        List f = f(list2, str, punVar);
        for (int i7 = 0; i7 < f.size(); i7++) {
            puk pukVar = ((puo) f.get(i7)).b;
            if (pukVar != null) {
                if (pukVar.a() != -1) {
                    pnq.d(spannableStringBuilder, new StyleSpan(pukVar.a()), i, length);
                }
                if (pukVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (pukVar.g) {
                    pnq.d(spannableStringBuilder, new ForegroundColorSpan(pukVar.f), i, length);
                }
                if (pukVar.i) {
                    pnq.d(spannableStringBuilder, new BackgroundColorSpan(pukVar.h), i, length);
                }
                String str4 = pukVar.e;
                if (str4 != null) {
                    pnq.d(spannableStringBuilder, new TypefaceSpan(str4), i, length);
                }
                int i8 = pukVar.m;
                if (i8 == 1) {
                    pnq.d(spannableStringBuilder, new AbsoluteSizeSpan((int) pukVar.n, true), i, length);
                } else if (i8 == 2) {
                    pnq.d(spannableStringBuilder, new RelativeSizeSpan(pukVar.n), i, length);
                } else if (i8 == 3) {
                    pnq.d(spannableStringBuilder, new RelativeSizeSpan(pukVar.n / 100.0f), i, length);
                }
                if (pukVar.p) {
                    spannableStringBuilder.setSpan(new poa(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void h(String str, pup pupVar) {
        char c2;
        char c3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            ptx.a(group);
            int i2 = 2;
            String group2 = matcher.group(2);
            ptx.a(group2);
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
                            String valueOf = String.valueOf(substring);
                            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Invalid anchor value: ".concat(valueOf) : new String("Invalid anchor value: "));
                            i2 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                        }
                        pupVar.g = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        pupVar.e = pus.a(group2);
                        pupVar.f = 0;
                    } else {
                        pupVar.e = Integer.parseInt(group2);
                        pupVar.f = 1;
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
                                } else if (c2 != 5) {
                                    Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid alignment value: ".concat(group2) : new String("Invalid alignment value: "));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    pupVar.d = i;
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
                                String valueOf2 = String.valueOf(substring2);
                                Log.w("WebvttCueParser", valueOf2.length() != 0 ? "Invalid anchor value: ".concat(valueOf2) : new String("Invalid anchor value: "));
                                i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                            }
                        }
                        pupVar.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    pupVar.h = pus.a(group2);
                } else if ("size".equals(group)) {
                    pupVar.j = pus.a(group2);
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
                            Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid 'vertical' value: ".concat(group2) : new String("Invalid 'vertical' value: "));
                            i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                        } else {
                            i = 2;
                        }
                    }
                    pupVar.k = i;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf3 = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", valueOf3.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf3) : new String("Skipping bad cue setting: "));
            }
        }
    }

    private static void i(List list, String str, pun punVar) {
        List f = f(list, str, punVar);
        for (int i = 0; i < f.size() && ((puo) f.get(i)).b.o == -1; i++) {
        }
    }
}
