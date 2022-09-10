package defpackage;
/* compiled from: PG */
/* renamed from: acim  reason: default package */
/* loaded from: classes2.dex */
public class acim implements jbf {
    private final ff a;
    private final Runnable b;
    private final int c;
    private final int d;
    @dzsi
    private final cqtd e;
    @dzsi
    private final ddho f;

    public acim(ff ffVar, Runnable runnable, int i, int i2, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar) {
        this.a = ffVar;
        this.b = runnable;
        this.c = i;
        this.d = i2;
        this.e = cqtdVar;
        this.f = ddhoVar;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return this.e;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(this.f);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return this.a.getString(this.d);
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a.getString(this.c);
    }
}
