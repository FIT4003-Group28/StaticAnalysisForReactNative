package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: czvv  reason: default package */
/* loaded from: classes5.dex */
public final class czvv extends amx {
    final /* synthetic */ BottomSheetBehavior a;

    public czvv(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.amx
    public final void a(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (!bottomSheetBehavior.n) {
                return;
            }
            bottomSheetBehavior.z(1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
        if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.a.j)) goto L55;
     */
    @Override // defpackage.amx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czvv.c(android.view.View, float, float):void");
    }

    @Override // defpackage.amx
    public final boolean f(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.o;
        if (i2 != 1 && !bottomSheetBehavior.v) {
            if (i2 == 3 && bottomSheetBehavior.u == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.t;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = this.a.s;
            return weakReference2 != 0 && weakReference2.get() == view;
        }
        return false;
    }

    @Override // defpackage.amx
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.amx
    public final int h(View view, int i) {
        int u = this.a.u();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return akn.b(i, u, bottomSheetBehavior.l ? bottomSheetBehavior.r : bottomSheetBehavior.j);
    }

    @Override // defpackage.amx
    public final int i() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.l ? bottomSheetBehavior.r : bottomSheetBehavior.j;
    }

    @Override // defpackage.amx
    public final void l(View view, int i, int i2) {
        this.a.E(i2);
    }
}
