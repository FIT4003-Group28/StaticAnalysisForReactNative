package defpackage;
/* compiled from: PG */
/* renamed from: cvl  reason: default package */
/* loaded from: classes5.dex */
final class cvl implements amfq {
    final /* synthetic */ cvm a;
    private final int b;

    public cvl(cvm cvmVar, int i) {
        this.a = cvmVar;
        this.b = i;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        if (this.b != 2) {
            bvoo.h("Unsupported ad type. All ad types other than PLACESHEET_AD should use directHttp.", new Object[0]);
        }
        ((ckco) this.a.a.a().a(ckiy.c)).a(amfuVar.b());
        if (amfuVar.b() == 0 || amfuVar.b() == 1 || amfuVar.b() == 2) {
            return;
        }
        ((ckcn) this.a.a.a().a(ckiy.b)).a();
    }
}
