package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: qgy  reason: default package */
/* loaded from: classes7.dex */
public final class qgy implements akth {
    private long a = -1;
    private final TimeInterpolator b;
    private final bvnx c;

    public qgy(bvnx bvnxVar, TimeInterpolator timeInterpolator) {
        this.c = bvnxVar;
        this.b = timeInterpolator;
    }

    @Override // defpackage.akth
    public final akwf a(akti aktiVar) {
        if (this.a == -1) {
            this.a = this.c.a();
        }
        float a = ((float) (this.c.a() - this.a)) / 300.0f;
        akwa bZ = akwf.h.bZ();
        if (a > 1.0f) {
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
            float interpolation = this.b.getInterpolation(a) + 0.0f;
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
