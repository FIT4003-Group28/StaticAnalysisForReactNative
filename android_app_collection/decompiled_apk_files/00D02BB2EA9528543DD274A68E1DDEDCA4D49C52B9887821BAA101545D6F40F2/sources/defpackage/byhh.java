package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
/* compiled from: PG */
/* renamed from: byhh  reason: default package */
/* loaded from: classes4.dex */
final class byhh implements cqfc {
    final /* synthetic */ int a;

    public byhh(int i) {
        this.a = i;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        int i = this.a;
        int i2 = byhi.a;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.2f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(eho.a(0.33f, 0.0f, 0.66f, 1.0f));
        ofPropertyValuesHolder.setDuration(1320L);
        ofPropertyValuesHolder.setStartDelay(i);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
    }
}
