package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aefs  reason: default package */
/* loaded from: classes.dex */
public final class aefs extends ValueAnimator {
    public final int a;
    public boolean b = false;
    final /* synthetic */ aefv c;

    public aefs(aefv aefvVar, int i, TimeInterpolator timeInterpolator) {
        this.c = aefvVar;
        this.a = i;
        setIntValues(aefvVar.c, i);
        setDuration(Math.min((int) (((Math.abs(i - aefvVar.c) / aefvVar.getHeight()) + 1.0f) * 300.0f), 2000));
        setInterpolator(timeInterpolator);
        addUpdateListener(new aefr(this));
        aefvVar.r(this);
    }
}
