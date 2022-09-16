package defpackage;

import android.animation.ObjectAnimator;
import android.os.Build;
/* compiled from: PG */
/* renamed from: kmj  reason: default package */
/* loaded from: classes3.dex */
final class kmj implements aigm {
    final /* synthetic */ kmk a;

    public kmj(kmk kmkVar) {
        this.a = kmkVar;
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        if (this.a.f) {
            float d = 1.0f - akf.d(f);
            aihj d2 = this.a.d();
            if (Build.VERSION.SDK_INT >= 22) {
                d2.c.setCurrentFraction(d);
                return;
            }
            ObjectAnimator objectAnimator = d2.c;
            objectAnimator.setCurrentPlayTime(d * ((float) objectAnimator.getDuration()));
        }
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
    }
}
