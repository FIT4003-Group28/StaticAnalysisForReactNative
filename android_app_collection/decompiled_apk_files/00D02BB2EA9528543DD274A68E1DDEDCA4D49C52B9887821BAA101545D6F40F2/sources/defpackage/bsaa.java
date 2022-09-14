package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsaa  reason: default package */
/* loaded from: classes4.dex */
public class bsaa extends czwf implements bsak, gfv {
    private static final dcqe ag = dcqe.c("bsaa");
    public cqkj ad;
    public bsam ae;
    public cklq af;
    private bsjm ah;
    private int ai;

    public static bsaa aJ(bsjm bsjmVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("refinements_model", bsjmVar);
        bundle.putInt("refinement_type", i);
        bsaa bsaaVar = new bsaa();
        bsaaVar.B(bundle);
        return bsaaVar;
    }

    @Override // defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        throw null;
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

    @Override // defpackage.ex, defpackage.fd
    public void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ggg
    public final List aO() {
        return dcdc.e();
    }

    public final void aP(gn gnVar, gfw gfwVar) {
        Nz(gfwVar);
        e(gnVar, "value-selector");
    }

    @Override // defpackage.bsak
    public final void aQ(bsjm bsjmVar, cjqm cjqmVar) {
        this.af.a(ckls.REFINEMENT_ITEM_CLICKED);
        aT(bsjn.e(bsjmVar, dtye.a, cjqmVar));
    }

    @Override // defpackage.bsak
    public final void aR() {
        aS();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aS() {
        if (J() == null) {
            return;
        }
        f();
    }

    @Override // defpackage.bsak
    public final void aT(@dzsi Object obj) {
        aS();
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

    @Override // defpackage.czwf, defpackage.ry, defpackage.ex
    public Dialog q(@dzsi Bundle bundle) {
        this.ah = (bsjm) this.o.getSerializable("refinements_model");
        this.ai = this.o.getInt("refinement_type");
        czwe czweVar = new czwe(J(), this.b);
        bsal a = this.ae.a(this.ah, this.ai, this);
        cqkf c = this.ad.c(new gur(), null);
        c.e(a);
        czweVar.setContentView(c.c());
        View findViewById = czweVar.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = -2;
            BottomSheetBehavior F = BottomSheetBehavior.F(findViewById);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            J().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            F.s(displayMetrics.heightPixels);
            F.y(3);
            F.m = true;
            F.v(false);
            od.m(findViewById, 2);
            F.w(new brzz(this));
        }
        return czweVar;
    }
}
