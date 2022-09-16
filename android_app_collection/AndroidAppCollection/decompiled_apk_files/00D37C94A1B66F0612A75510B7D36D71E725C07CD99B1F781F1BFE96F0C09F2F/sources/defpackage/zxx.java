package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: zxx  reason: default package */
/* loaded from: classes4.dex */
final class zxx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ zxz b;

    public zxx(zxz zxzVar, View view) {
        this.b = zxzVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredHeight = this.a.getMeasuredHeight();
        zxz zxzVar = this.b;
        float f = zxzVar.au;
        int i = (int) (zxzVar.ar * f);
        int i2 = (int) (f * zxzVar.as);
        BottomSheetBehavior a = ((aljo) zxzVar.d).a();
        zxz zxzVar2 = this.b;
        float f2 = zxzVar2.as;
        if (f2 > 0.0f && f2 < 1.0f && measuredHeight > i2) {
            a.B(f2);
            a.E(6);
            a.D(i2);
        } else {
            float f3 = zxzVar2.ar;
            if (f3 > 0.0f && f3 < 1.0f && measuredHeight < i) {
                a.B(f3);
                a.E(6);
                a.D(i);
            }
        }
        this.a.setVisibility(0);
    }
}
