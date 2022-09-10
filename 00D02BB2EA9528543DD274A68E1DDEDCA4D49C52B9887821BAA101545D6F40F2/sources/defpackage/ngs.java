package defpackage;
/* compiled from: PG */
/* renamed from: ngs  reason: default package */
/* loaded from: classes7.dex */
public class ngs implements nga {
    private final CharSequence a;
    private final Runnable b;
    private final Runnable c;
    private final dcdc<nfz> d;
    @dzsi
    private final cjtd e;
    @dzsi
    private final cjtd f;

    public ngs(CharSequence charSequence, Runnable runnable, Runnable runnable2, dcdc<nfz> dcdcVar, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2) {
        this.a = charSequence;
        this.b = runnable;
        this.c = runnable2;
        this.d = dcdcVar;
        this.e = cjtdVar;
        this.f = cjtdVar2;
    }

    @Override // defpackage.nga
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.nga
    public cqkl c() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.nga
    public cqkl d() {
        this.b.run();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.nga
    @dzsi
    public cjtd e() {
        return this.e;
    }

    @Override // defpackage.nga
    @dzsi
    public cjtd f() {
        return this.f;
    }

    @Override // defpackage.nga
    /* renamed from: g */
    public dcdc<nfz> b() {
        return this.d;
    }
}
