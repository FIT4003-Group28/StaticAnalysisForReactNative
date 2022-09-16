package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihx  reason: default package */
/* loaded from: classes3.dex */
public final class ihx implements View.OnLayoutChangeListener {
    final /* synthetic */ ihz a;

    public ihx(ihz ihzVar) {
        this.a = ihzVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8) {
            ihz ihzVar = this.a;
            int height = ihzVar.a.getHeight();
            zgd.t(ihzVar.c, zgd.h((ihzVar.i == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER || ihzVar.k) ? height / 2 : height - (ihzVar.b.getLineHeight() * 4)), ViewGroup.LayoutParams.class);
            ihzVar.d.D(height / 2);
            BottomSheetBehavior bottomSheetBehavior = ihzVar.d;
            if (bottomSheetBehavior.t == 5) {
                return;
            }
            bottomSheetBehavior.E(4);
        }
    }
}
