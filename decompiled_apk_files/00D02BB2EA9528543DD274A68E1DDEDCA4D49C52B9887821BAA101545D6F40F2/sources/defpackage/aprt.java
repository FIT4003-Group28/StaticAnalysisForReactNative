package defpackage;
/* compiled from: PG */
/* renamed from: aprt  reason: default package */
/* loaded from: classes2.dex */
final class aprt implements crzp<dbsg<Integer>> {
    final /* synthetic */ apru a;

    public aprt(apru apruVar) {
        this.a = apruVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dbsg<Integer>> crzmVar) {
        dbsg<Integer> l;
        if (apru.a || apru.b || (l = crzmVar.l()) == null || !l.a()) {
            return;
        }
        this.a.c.D(apuz.g());
        apru.a = true;
        this.a.i();
    }
}
