package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: pty  reason: default package */
/* loaded from: classes4.dex */
final class pty {
    private static final Pattern a = Pattern.compile("\\s+");
    private static final amvn b = amvn.s("auto", "none");
    private static final amvn c = amvn.t("dot", "sesame", "circle");
    private static final amvn d = amvn.s("filled", "open");
    private static final amvn e = amvn.t("after", "before", "outside");

    private pty() {
    }

    public static pty a(String str) {
        if (str == null) {
            return null;
        }
        String g = akzj.g(str.trim());
        if (g.isEmpty()) {
            return null;
        }
        amvn q = amvn.q(TextUtils.split(g, a));
        String str2 = (String) arey.r(amyv.d(e, q), "outside");
        amys d2 = amyv.d(b, q);
        if (!d2.isEmpty()) {
            String str3 = (String) ((amyo) d2).iterator().next();
            return new pty();
        }
        amys d3 = amyv.d(d, q);
        amys d4 = amyv.d(c, q);
        if (d3.isEmpty() && d4.isEmpty()) {
            return new pty();
        }
        String str4 = (String) arey.r(d3, "filled");
        String str5 = (String) arey.r(d4, "circle");
        return new pty();
    }
}
