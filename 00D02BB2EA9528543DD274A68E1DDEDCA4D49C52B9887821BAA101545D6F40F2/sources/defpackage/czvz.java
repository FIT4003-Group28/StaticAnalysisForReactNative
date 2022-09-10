package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: czvz  reason: default package */
/* loaded from: classes5.dex */
public final class czvz implements Runnable {
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;

    public czvz(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.d = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amy amyVar = this.c.p;
        if (amyVar == null || !amyVar.l()) {
            this.c.z(this.b);
        } else {
            od.j(this.d, this);
        }
        this.a = false;
    }
}
