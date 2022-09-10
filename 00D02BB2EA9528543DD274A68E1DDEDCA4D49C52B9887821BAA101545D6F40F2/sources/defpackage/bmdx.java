package defpackage;
/* compiled from: PG */
/* renamed from: bmdx  reason: default package */
/* loaded from: classes3.dex */
public final class bmdx implements bmea {
    private final brba a;
    @dzsi
    private final Runnable b;

    public bmdx(brba brbaVar, @dzsi Runnable runnable) {
        this.a = brbaVar;
        this.b = runnable;
    }

    @Override // defpackage.bmea
    public final void a(bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            return;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            return;
        }
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        this.a.J(c, begjVar);
    }
}
