package defpackage;

import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
/* compiled from: PG */
/* renamed from: xdb  reason: default package */
/* loaded from: classes7.dex */
final class xdb implements akth {
    private long a = -1;
    private final OvershootInterpolator b = new OvershootInterpolator();

    @Override // defpackage.akth
    public final akwf a(akti aktiVar) {
        if (this.a == -1) {
            this.a = AnimationUtils.currentAnimationTimeMillis();
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - this.a)) / 300.0f;
        akwa bZ = akwf.h.bZ();
        if (currentAnimationTimeMillis > 1.0f) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            akwf akwfVar = (akwf) bZ.b;
            akwfVar.a |= 2;
            akwfVar.c = 1.0f;
            aktiVar.a(bZ.bK());
            aktiVar.d();
        } else {
            float interpolation = this.b.getInterpolation(currentAnimationTimeMillis) + 0.0f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            akwf akwfVar2 = (akwf) bZ.b;
            akwfVar2.a |= 2;
            akwfVar2.c = interpolation;
        }
        return bZ.bK();
    }
}
