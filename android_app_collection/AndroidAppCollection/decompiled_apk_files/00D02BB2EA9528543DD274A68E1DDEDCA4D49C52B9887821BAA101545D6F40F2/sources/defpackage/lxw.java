package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxw  reason: default package */
/* loaded from: classes7.dex */
public final class lxw implements crzp<btlu> {
    final /* synthetic */ lye a;

    public lxw(lye lyeVar) {
        this.a = lyeVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        lye lyeVar = this.a;
        btlt i = btlu.i(crzmVar.l());
        btlt i2 = btlu.i(lyeVar.l);
        if (lyeVar.e() && i2 == btlt.GOOGLE && (i == btlt.SIGNED_OUT || i == btlt.INCOGNITO)) {
            lyeVar.b();
        }
        this.a.l = crzmVar.l();
    }
}
