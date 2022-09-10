package defpackage;
/* compiled from: PG */
/* renamed from: dphr  reason: default package */
/* loaded from: classes6.dex */
public final class dphr extends dsqr<dpie, dphr> implements dsqt {
    public dphr() {
        super(dpie.C);
    }

    public final dpbp a(int i) {
        return ((dpie) this.b).e.get(i);
    }

    public final void b(dpbm dpbmVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpie dpieVar = (dpie) this.b;
        dpbp bK = dpbmVar.bK();
        dpie dpieVar2 = dpie.C;
        bK.getClass();
        dpieVar.b();
        dpieVar.e.add(bK);
    }

    public final void c(int i, dpbm dpbmVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dpie dpieVar = (dpie) this.b;
        dpbp bK = dpbmVar.bK();
        dpie dpieVar2 = dpie.C;
        bK.getClass();
        dpieVar.b();
        dpieVar.e.set(i, bK);
    }
}
