package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akto  reason: default package */
/* loaded from: classes.dex */
public final class akto implements uyj {
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final amuk f;

    static {
        Pattern compile = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)");
        a = compile;
        Pattern compile2 = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?");
        b = compile2;
        Pattern compile3 = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)");
        c = compile3;
        Pattern compile4 = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback");
        d = compile4;
        Pattern compile5 = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback");
        e = compile5;
        f = amuk.v(new aktm(compile, "rpc"), new aktm(compile3, "googleapis"), new aktm(compile2, "yt"), new aktn(compile4, "onesie-initplayback"), new aktn(compile5, "videoplayback"));
    }

    @Override // defpackage.uyj
    public final String a(String str) {
        amuk amukVar = f;
        int i = ((amxx) amukVar).c;
        int i2 = 0;
        while (i2 < i) {
            String a2 = ((aktm) amukVar.get(i2)).a(str);
            i2++;
            if (a2 != null) {
                return a2;
            }
        }
        return str;
    }
}
