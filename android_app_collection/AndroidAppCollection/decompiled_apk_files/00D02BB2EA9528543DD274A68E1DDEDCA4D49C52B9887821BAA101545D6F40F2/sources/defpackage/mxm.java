package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: mxm  reason: default package */
/* loaded from: classes7.dex */
public class mxm implements mxj {
    private final String a;
    private final int b;
    private final mxl c;
    private final boolean d;
    private final cjtd e;

    public mxm(String str, int i, mxl mxlVar, boolean z, cjtd cjtdVar) {
        this.a = str;
        this.b = i;
        this.c = mxlVar;
        this.d = z;
        this.e = cjtdVar;
    }

    @Override // defpackage.mxj
    public String a() {
        return this.a;
    }

    @Override // defpackage.mxj
    public cqtd b() {
        return nqu.az(this.b + 1);
    }

    @Override // defpackage.mxj
    public CharSequence c() {
        return String.format(Locale.getDefault(), "%d", Integer.valueOf(this.b + 1));
    }

    @Override // defpackage.mxj
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.mxj
    public cqkl e() {
        this.c.a(this.b);
        return cqkl.a;
    }

    @Override // defpackage.mxj
    public cjtd f() {
        cjta c = cjtd.c(this.e);
        c.d = this.b == 0 ? dtxm.eJ : dtxm.eI;
        c.i(this.b);
        return c.a();
    }
}
