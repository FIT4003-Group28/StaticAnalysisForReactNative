package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: aljf  reason: default package */
/* loaded from: classes.dex */
public final class aljf implements mu {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public aljf(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.mu
    public final boolean a(View view) {
        this.b.E(this.a);
        return true;
    }
}
