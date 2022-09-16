package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: aljb  reason: default package */
/* loaded from: classes.dex */
public final class aljb implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomSheetBehavior c;

    public aljb(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.G(this.a, this.b);
    }
}
