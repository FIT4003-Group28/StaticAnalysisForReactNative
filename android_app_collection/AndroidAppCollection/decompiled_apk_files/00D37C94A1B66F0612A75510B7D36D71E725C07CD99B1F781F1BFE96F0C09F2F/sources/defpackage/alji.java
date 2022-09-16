package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: alji  reason: default package */
/* loaded from: classes.dex */
public final class alji implements Runnable {
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;

    public alji(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.d = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amk amkVar = this.c.u;
        if (amkVar == null || !amkVar.n()) {
            this.c.F(this.b);
        } else {
            lj.H(this.d, this);
        }
        this.a = false;
    }
}
