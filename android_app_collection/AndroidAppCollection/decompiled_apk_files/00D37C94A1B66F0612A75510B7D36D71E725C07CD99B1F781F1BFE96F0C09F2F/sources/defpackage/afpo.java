package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: afpo  reason: default package */
/* loaded from: classes.dex */
final class afpo implements View.OnLayoutChangeListener {
    final /* synthetic */ afps a;

    public afpo(afps afpsVar) {
        this.a = afpsVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8) {
            afps afpsVar = this.a;
            int height = afpsVar.a.getHeight();
            afpsVar.b.getLineHeight();
            int i9 = height / 2;
            zgd.t(afpsVar.c, zgd.h(i9), ViewGroup.LayoutParams.class);
            afpsVar.d.D(i9);
            BottomSheetBehavior bottomSheetBehavior = afpsVar.d;
            if (bottomSheetBehavior.t == 5) {
                return;
            }
            bottomSheetBehavior.E(4);
        }
    }
}
