package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: czvw  reason: default package */
/* loaded from: classes5.dex */
public final class czvw implements pp {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public czvw(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.pp
    public final boolean a(View view) {
        this.b.y(this.a);
        return true;
    }
}
