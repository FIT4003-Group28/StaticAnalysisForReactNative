package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bvtc  reason: default package */
/* loaded from: classes.dex */
public final class bvtc implements bvtg {
    private static final Pattern a = Pattern.compile("^(?:.*_)?(\\d+)\\.(\\d+)\\.(\\d+)(\\.\\d+)?");
    private final dbsg<bvtf> b;
    private final String c;
    private final int d = 2;

    public bvtc(int i, int i2, int i3, int i4, String str) {
        this.b = dbsg.i(new bvte(i2, i3, i4));
        this.c = str;
    }

    public static bvtg c(bvtd bvtdVar) {
        String b = bvtdVar.b();
        Matcher matcher = a.matcher("10.55.4");
        dbsk.p(matcher.matches(), "Wrong format of GMM_CLIENT_VERSION: %s. Expected the string contains at least three number parts <Major>.<minor>.<point>. We allow a slightly more general string so clients can use their Rapid candidates ids, where prefix should end with '_' and any additional number parts after <point> will be ignored, e.g. gmm_dev_10.1.2.4 -> 10.1.2", "10.55.4");
        return new bvtc(2, Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), b);
    }

    @Override // defpackage.bvtg
    public final dbsg<bvtf> a() {
        return this.b;
    }

    @Override // defpackage.bvtg
    public final String b() {
        String valueOf = String.valueOf(((dbsu) this.b).a);
        String a2 = bvtd.a();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(a2).length());
        sb.append(valueOf);
        sb.append(a2);
        return sb.toString();
    }

    @Override // defpackage.bvtg
    public final int d() {
        return 2;
    }
}
