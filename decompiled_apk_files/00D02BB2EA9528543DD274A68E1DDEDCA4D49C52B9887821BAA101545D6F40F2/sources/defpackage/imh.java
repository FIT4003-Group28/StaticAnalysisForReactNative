package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: imh  reason: default package */
/* loaded from: classes6.dex */
public final class imh extends cwdd {
    private final cvzg<cwfm> c;
    private final dxio<akfa> d;
    private final bvjj e;
    private final cvzf<cwfm> f = new img(this);

    public imh(cvzg<cwfm> cvzgVar, dxio<akfa> dxioVar, bvjj bvjjVar) {
        this.c = cvzgVar;
        this.d = dxioVar;
        this.e = bvjjVar;
    }

    public final boolean a() {
        return this.e.t(bvjk.jp, this.d.a().j(), 0) > 0;
    }

    @Override // defpackage.cwdd
    public final void b() {
        czhz.b();
        this.c.h(this.f);
        d(a());
    }

    @Override // defpackage.cwdd
    public final void c() {
        czhz.b();
        this.c.j(this.f);
    }
}
