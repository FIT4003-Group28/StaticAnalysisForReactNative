package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: czje  reason: default package */
/* loaded from: classes5.dex */
public final class czje {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static dcdc<String> a(Uri uri) {
        dcdc e;
        dccx F = dcdc.F();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            e = dcdc.e();
        } else {
            e = dcdc.q(dbtm.c("+").e().g(encodedFragment.substring(10)));
        }
        int size = e.size();
        for (int i = 0; i < size; i++) {
            String str = (String) e.get(i);
            Matcher matcher = a.matcher(str);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid fragment spec: ".concat(valueOf) : new String("Invalid fragment spec: "));
            }
            F.g(matcher.group(1));
        }
        return F.f();
    }

    @dzsi
    public static String b(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        String valueOf = String.valueOf(dbrz.e("+").g(list));
        return valueOf.length() != 0 ? "transform=".concat(valueOf) : new String("transform=");
    }
}
