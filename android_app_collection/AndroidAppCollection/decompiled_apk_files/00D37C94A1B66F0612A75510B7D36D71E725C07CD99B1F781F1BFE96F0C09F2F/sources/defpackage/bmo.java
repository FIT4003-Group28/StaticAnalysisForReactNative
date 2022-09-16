package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: PG */
/* renamed from: bmo  reason: default package */
/* loaded from: classes2.dex */
public final class bmo extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public bmo(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.g(f);
    }
}
