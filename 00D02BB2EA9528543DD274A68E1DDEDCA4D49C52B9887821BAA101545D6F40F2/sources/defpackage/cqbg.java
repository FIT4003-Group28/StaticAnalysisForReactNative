package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: cqbg  reason: default package */
/* loaded from: classes5.dex */
public class cqbg extends czwf {
    public static void aL(View view, Dialog dialog) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            double d = displayMetrics.heightPixels;
            Double.isNaN(d);
            int i = (int) (d * 0.6d);
            int i2 = displayMetrics.heightPixels;
            BottomSheetBehavior F = BottomSheetBehavior.F((View) view.getParent());
            int height = view.getHeight();
            double d2 = i2;
            Double.isNaN(d2);
            if (height > ((int) (d2 * 0.7d))) {
                F.s(i);
                ((cqbn) view).a(true);
            } else {
                F.s(view.getHeight());
                ((cqbn) view).a(false);
            }
        }
        if (view == null || dialog == null) {
            return;
        }
        DisplayMetrics displayMetrics2 = view.getContext().getResources().getDisplayMetrics();
        int applyDimension = (int) TypedValue.applyDimension(1, 552.0f, displayMetrics2);
        int i3 = displayMetrics2.widthPixels;
        dialog.getWindow().setLayout(i3 >= applyDimension ? applyDimension : -1, -1);
        if (i3 < applyDimension) {
            return;
        }
        dialog.getWindow().setNavigationBarColor(-16777216);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aK() {
        throw null;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        Context H = H();
        dbsk.m(H instanceof ff, "Context of SingleSettingMaterialView is not an instance of FragmentActivity");
        return new cqbn(H);
    }

    @Override // defpackage.fd
    public void ah(View view, Bundle bundle) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: cqbd
            private final cqbg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                cqbg.aL(view2, this.a.d);
            }
        });
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        aL(this.P, this.d);
    }

    @Override // defpackage.czwf, defpackage.ry, defpackage.ex
    public final Dialog q(Bundle bundle) {
        cqbf cqbfVar = new cqbf(this, H());
        cqbfVar.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: cqbe
            private final cqbg a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cqbg cqbgVar = this.a;
                cqbg.aL(cqbgVar.P, cqbgVar.d);
            }
        });
        return cqbfVar;
    }
}
