package defpackage;
/* compiled from: PG */
/* renamed from: mfg  reason: default package */
/* loaded from: classes7.dex */
public class mfg implements mfb {
    @dzsi
    private final cqtd a;
    private final String b;
    private final boolean c;
    private final Runnable d;
    private final int e;
    private final boolean f;
    private final ddho g;

    public mfg(@dzsi cqtd cqtdVar, String str, boolean z, Runnable runnable, int i, boolean z2, ddho ddhoVar) {
        this.a = cqtdVar;
        this.b = str;
        this.c = z;
        this.d = runnable;
        this.e = i;
        this.f = z2;
        this.g = ddhoVar;
    }

    @Override // defpackage.mfb
    public Boolean a() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.mfb
    @dzsi
    public cqtd b() {
        return this.a;
    }

    @Override // defpackage.mfb
    public String c() {
        return this.b;
    }

    @Override // defpackage.mfb
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.mfb
    public cqkl e() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.mfb
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.mfb
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = this.g;
        b.i(this.e);
        return b.a();
    }
}
