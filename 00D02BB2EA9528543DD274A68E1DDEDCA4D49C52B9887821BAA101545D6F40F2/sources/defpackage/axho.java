package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axho  reason: default package */
/* loaded from: classes3.dex */
public final class axho<V> implements crzp<btlu> {
    final /* synthetic */ axhq a;

    public axho(axhq axhqVar) {
        this.a = axhqVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (!this.a.d() || l == null || l.f != btlt.GOOGLE) {
            this.a.b.g(false);
        } else {
            axhq axhqVar = this.a;
            z<Boolean> zVar = axhqVar.b;
            bvjk bvjkVar = bvjk.gV;
            dbsk.l(axhqVar.d());
            zVar.g(Boolean.valueOf(axhqVar.c.o(bvjkVar, l, false)));
        }
        this.a.a = l;
    }
}
