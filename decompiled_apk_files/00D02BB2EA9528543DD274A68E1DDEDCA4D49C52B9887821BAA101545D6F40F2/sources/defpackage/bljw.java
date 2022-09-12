package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bljw  reason: default package */
/* loaded from: classes3.dex */
public final class bljw {
    private static final Pattern a = Pattern.compile("[\\p{L}0-9]*");

    public static dcdc<dclz<Integer>> a(String str, String str2) {
        dccx F = dcdc.F();
        dcqe.b.v(dcqz.FULL);
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(str2);
        while (matcher.find()) {
            sb.append(matcher.group().toLowerCase(Locale.getDefault()));
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return F.f();
        }
        StringBuilder sb3 = new StringBuilder();
        int i = 0;
        while (i < sb2.length()) {
            if (i != 0) {
                sb3.append("[^\\p{L}0-9]*");
            }
            int codePointAt = sb2.codePointAt(i);
            sb3.append(Character.toChars(codePointAt));
            i += Character.charCount(codePointAt);
        }
        Matcher matcher2 = Pattern.compile(sb3.toString(), 2).matcher(str);
        while (matcher2.find()) {
            F.g(dclz.g(Integer.valueOf(matcher2.start()), Integer.valueOf(matcher2.end())));
        }
        return F.f();
    }
}
