package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btxe  reason: default package */
/* loaded from: classes.dex */
public final class btxe implements btxj, crzp {
    final /* synthetic */ btxk a;
    private final dxio<akfa> b;

    public btxe(btxk btxkVar, dxio<akfa> dxioVar) {
        this.a = btxkVar;
        this.b = dxioVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        synchronized (this.a.e) {
            if (dbsd.a(this.a.g, l)) {
                return;
            }
            btxk btxkVar = this.a;
            btxkVar.g = l;
            btxkVar.g.t();
            this.a.a(0L, "account change");
        }
    }

    @Override // defpackage.btxj
    public final void b() {
        this.b.a().C().d(this, dege.a);
    }

    @Override // defpackage.btxj
    public final void c() {
        this.b.a().C().c(this);
    }
}
