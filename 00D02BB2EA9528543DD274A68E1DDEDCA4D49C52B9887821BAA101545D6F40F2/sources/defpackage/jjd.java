package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jjd  reason: default package */
/* loaded from: classes7.dex */
public final class jjd extends ValueAnimator {
    public final int a;
    final /* synthetic */ jjf b;

    public jjd(jjf jjfVar, int i, TimeInterpolator timeInterpolator) {
        this.b = jjfVar;
        this.a = i;
        setIntValues(jjfVar.a, i);
        setDuration(500L);
        setInterpolator(timeInterpolator);
        addUpdateListener(new jjb(this));
        addListener(new jjc(this));
    }
}
