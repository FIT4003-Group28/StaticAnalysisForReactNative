package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zui  reason: default package */
/* loaded from: classes4.dex */
public final class zui implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ zuk b;

    public zui(zuk zukVar, View view) {
        this.b = zukVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() > 0) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ObjectAnimator duration = ObjectAnimator.ofInt(this.b.h, "scrollX", (this.a.getLeft() - (this.b.b / 2)) + (this.a.getWidth() / 2)).setDuration(225L);
            duration.setInterpolator(new app());
            duration.start();
        }
    }
}
