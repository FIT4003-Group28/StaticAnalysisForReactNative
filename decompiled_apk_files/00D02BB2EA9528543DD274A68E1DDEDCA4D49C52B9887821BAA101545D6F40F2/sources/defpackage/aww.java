package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: aww  reason: default package */
/* loaded from: classes3.dex */
final class aww extends Animation {
    final /* synthetic */ axb a;

    public aww(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.k(f);
    }
}
