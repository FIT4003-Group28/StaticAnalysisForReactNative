package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awx  reason: default package */
/* loaded from: classes3.dex */
public final class awx extends Animation {
    final /* synthetic */ axb a;

    public awx(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        axb axbVar = this.a;
        float f2 = axbVar.g;
        axbVar.h(f2 + ((-f2) * f));
        this.a.k(f);
    }
}
