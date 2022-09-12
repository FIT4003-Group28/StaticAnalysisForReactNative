package defpackage;
/* compiled from: PG */
/* renamed from: nha  reason: default package */
/* loaded from: classes7.dex */
final class nha implements crzp<Boolean> {
    final /* synthetic */ nhf a;

    public nha(nhf nhfVar) {
        this.a = nhfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        if (l == null || !l.booleanValue()) {
            return;
        }
        this.a.c.a();
    }
}
