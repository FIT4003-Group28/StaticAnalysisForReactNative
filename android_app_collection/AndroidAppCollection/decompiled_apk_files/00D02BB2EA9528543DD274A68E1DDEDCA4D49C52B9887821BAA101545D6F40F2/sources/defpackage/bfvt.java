package defpackage;
/* compiled from: PG */
/* renamed from: bfvt  reason: default package */
/* loaded from: classes3.dex */
final class bfvt implements crzp<Boolean> {
    final /* synthetic */ bfvv a;

    public bfvt(bfvv bfvvVar) {
        this.a = bfvvVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        bfvv bfvvVar = this.a;
        Boolean l = crzmVar.l();
        dbsk.s(l);
        bfvvVar.b = !l.booleanValue();
        cqkx.p(this.a);
    }
}
