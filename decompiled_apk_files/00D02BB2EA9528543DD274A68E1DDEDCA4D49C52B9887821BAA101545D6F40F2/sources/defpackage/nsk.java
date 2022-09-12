package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: nsk  reason: default package */
/* loaded from: classes7.dex */
final class nsk implements Runnable {
    final /* synthetic */ nsm a;

    public nsk(nsm nsmVar) {
        this.a = nsmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        nsm nsmVar = this.a;
        View view = nsmVar.a;
        if (view == null) {
            if (!nsmVar.isLaidOut()) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23) {
                background.setHotspotBounds(0, 0, this.a.getWidth(), this.a.getHeight());
            } else {
                background.setHotspot(this.a.getWidth() / 2.0f, this.a.getHeight() / 2.0f);
            }
        } else if (!view.isLaidOut()) {
        } else {
            float left = (this.a.a.getLeft() + this.a.a.getRight()) / 2.0f;
            float top = (this.a.a.getTop() + this.a.a.getBottom()) / 2.0f;
            if (Build.VERSION.SDK_INT < 23) {
                float max = Math.max(left, this.a.getWidth() - left);
                float max2 = Math.max(top, this.a.getHeight() - top);
                background.setHotspotBounds(Math.round(left - max), Math.round(top - max2), Math.round(left + max), Math.round(top + max2));
                return;
            }
            background.setHotspot(left, top);
        }
    }
}
