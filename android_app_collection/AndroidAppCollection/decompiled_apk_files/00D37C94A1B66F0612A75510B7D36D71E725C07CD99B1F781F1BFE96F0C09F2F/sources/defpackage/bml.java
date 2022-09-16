package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: PG */
/* renamed from: bml  reason: default package */
/* loaded from: classes2.dex */
public final class bml extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ SwipeRefreshLayout c;

    public bml(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        bmh bmhVar = this.c.h;
        int i = this.a;
        bmhVar.setAlpha((int) (i + ((this.b - i) * f)));
    }
}
