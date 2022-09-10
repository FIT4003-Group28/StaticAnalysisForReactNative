package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rg  reason: default package */
/* loaded from: classes.dex */
public final class rg implements yp {
    final /* synthetic */ rv a;

    public rg(rv rvVar) {
        this.a = rvVar;
    }

    @Override // defpackage.yp
    public final void a() {
        rv rvVar = this.a;
        yq yqVar = rvVar.l;
        if (yqVar != null) {
            yqVar.o();
        }
        if (rvVar.o != null) {
            rvVar.h.getDecorView().removeCallbacks(rvVar.p);
            if (rvVar.o.isShowing()) {
                try {
                    rvVar.o.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            rvVar.o = null;
        }
        rvVar.B();
        vf vfVar = rvVar.N(0).h;
        if (vfVar != null) {
            vfVar.close();
        }
    }
}
