package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zup  reason: default package */
/* loaded from: classes7.dex */
public final class zup extends ValueAnimator {
    public final int a;
    public boolean b = false;
    final /* synthetic */ zut c;

    public zup(zut zutVar, int i, TimeInterpolator timeInterpolator) {
        this.c = zutVar;
        this.a = i;
        setIntValues(zutVar.e, i);
        setDuration(Math.min((int) (((Math.abs(i - zutVar.e) / zutVar.getHeight()) + 1.0f) * 300.0f), 2000));
        setInterpolator(timeInterpolator);
        addUpdateListener(new zuo(this));
        zutVar.z(this);
    }
}
