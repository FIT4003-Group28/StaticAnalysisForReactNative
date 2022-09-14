package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: artq  reason: default package */
/* loaded from: classes2.dex */
public final class artq implements cqfc {
    final /* synthetic */ int a;

    public artq(int i) {
        this.a = i;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        int i = this.a;
        cqrp cqrpVar = artw.a;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.4f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(irf.c);
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setStartDelay(i);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
    }
}
