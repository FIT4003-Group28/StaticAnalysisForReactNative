package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: akmv  reason: default package */
/* loaded from: classes.dex */
final class akmv implements View.OnLayoutChangeListener {
    final /* synthetic */ akmx a;

    public akmv(akmx akmxVar) {
        this.a = akmxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomSheetBehavior v = BottomSheetBehavior.v((View) this.a.ai.getParent());
        if (v != null) {
            v.E(3);
            v.r = true;
        }
        this.a.aj.removeOnLayoutChangeListener(this);
    }
}
