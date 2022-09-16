package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: PG */
/* renamed from: bmn  reason: default package */
/* loaded from: classes2.dex */
public final class bmn extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public bmn(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int i = swipeRefreshLayout.g;
        int abs = Math.abs(swipeRefreshLayout.f);
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        int i2 = swipeRefreshLayout2.e;
        this.a.m((i2 + ((int) (((i - abs) - i2) * f))) - swipeRefreshLayout2.d.getTop());
        this.a.h.c(1.0f - f);
    }
}
