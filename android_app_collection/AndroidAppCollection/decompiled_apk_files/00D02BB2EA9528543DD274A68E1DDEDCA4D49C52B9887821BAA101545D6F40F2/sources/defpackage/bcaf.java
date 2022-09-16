package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcaf  reason: default package */
/* loaded from: classes3.dex */
public final class bcaf {
    public final List<ObjectAnimator> a = new ArrayList();
    public final AnimatorSet b = new AnimatorSet();
    final /* synthetic */ bcag c;

    public bcaf(bcag bcagVar) {
        this.c = bcagVar;
    }

    public final void a(String str, float f) {
        this.a.add(ObjectAnimator.ofFloat(this.c.a, str, f));
    }

    public final void b(long j) {
        this.b.setDuration(j);
    }

    public final void c(Interpolator interpolator) {
        this.b.setInterpolator(interpolator);
    }
}
