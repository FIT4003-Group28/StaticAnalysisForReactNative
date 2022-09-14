package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: aws  reason: default package */
/* loaded from: classes3.dex */
final class aws extends Animation {
    final /* synthetic */ axb a;

    public aws(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.h(1.0f - f);
    }
}
