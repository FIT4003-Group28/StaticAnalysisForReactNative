package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aotq  reason: default package */
/* loaded from: classes2.dex */
public final class aotq implements View.OnLayoutChangeListener {
    final /* synthetic */ aotw a;

    public aotq(aotw aotwVar) {
        this.a = aotwVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        Rect e = this.a.d.a().e();
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = this.a.h.getHeight() - e.centerY();
        layoutParams.addRule(12, -1);
        this.a.i.setLayoutParams(layoutParams);
        cjxu.a(this.a.i, e.centerX());
        this.a.h.removeOnLayoutChangeListener(this);
    }
}
