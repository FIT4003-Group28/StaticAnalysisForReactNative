package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: PG */
/* renamed from: awr  reason: default package */
/* loaded from: classes3.dex */
final class awr extends Animation {
    final /* synthetic */ axb a;

    public awr(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.h(f);
    }
}
