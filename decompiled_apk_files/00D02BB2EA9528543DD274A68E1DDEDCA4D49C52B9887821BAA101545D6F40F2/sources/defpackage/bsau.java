package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: bsau  reason: default package */
/* loaded from: classes4.dex */
public final class bsau extends czwf {
    public jaa ad;
    public cqkj ae;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void aJ() {
        if (J() == null) {
            return;
        }
        f();
    }

    @Override // defpackage.czwf, defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        czwe czweVar = new czwe(J(), this.b);
        cqkf c = this.ae.c(new bsaz(), null);
        c.e(this.ad);
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
            F.w(new bsat(this));
        }
        return czweVar;
    }
}
