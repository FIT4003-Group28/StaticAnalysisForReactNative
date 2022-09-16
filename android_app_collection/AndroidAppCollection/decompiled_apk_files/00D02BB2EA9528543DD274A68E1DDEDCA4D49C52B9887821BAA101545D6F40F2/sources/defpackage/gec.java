package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: gec  reason: default package */
/* loaded from: classes6.dex */
public class gec extends czwf implements gfv {
    private static final dcqe ad = dcqe.c("gec");

    @Override // defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        fd G = G();
        gfw gfwVar = null;
        if (G != null) {
            if (G instanceof gfw) {
                gfwVar = (gfw) G;
            } else {
                bvoo.h("dispatchResult: Expected GmmActivityFragmentResultListener but instead found %s", G.getClass());
            }
        }
        if (gfwVar != null) {
            gfwVar.Qn(obj);
        }
    }

    @Override // defpackage.ggg
    public final gfu Nx() {
        return gfu.DIALOG_FRAGMENT;
    }

    @Override // defpackage.gfr
    public final fd Ny() {
        return this;
    }

    @Override // defpackage.gfv
    public final void Nz(@dzsi gfw gfwVar) {
        if (gfwVar == null) {
            F(null, 0);
        } else if (gfwVar instanceof fd) {
            F((fd) gfwVar, 0);
        } else {
            bvoo.h("%s must extend Fragment. It's the only way to preserve the listener if the activity is recreated.", gfwVar.getClass());
        }
    }

    public final void aJ(gn gnVar, gfw gfwVar) {
        Nz(gfwVar);
        e(gnVar, "dialog");
    }

    @Override // defpackage.ggg
    public final List aO() {
        return dcdc.e();
    }
}
