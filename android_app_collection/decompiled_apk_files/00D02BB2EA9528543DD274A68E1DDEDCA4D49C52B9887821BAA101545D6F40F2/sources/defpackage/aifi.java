package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aifi  reason: default package */
/* loaded from: classes2.dex */
final class aifi extends aifn {
    private float d;

    public aifi(long j, TimeInterpolator timeInterpolator) {
        super(j, timeInterpolator);
        this.d = -1.0f;
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        if (this.d < 0.0f) {
            float e = aifqVar.e();
            float e2 = aifqVar2.e();
            float f2 = e2 - e;
            float f3 = e - e2;
            if (f2 < 0.0f) {
                f2 += 360.0f;
            }
            if (f3 < 0.0f) {
                f3 += 360.0f;
            }
            if (f2 >= f3) {
                f2 = -f3;
            }
            this.d = f2;
        }
        float e3 = aifqVar.e() + (f * this.d);
        if (e3 < 0.0f) {
            e3 += 360.0f;
        } else if (e3 >= 360.0f) {
            e3 -= 360.0f;
        }
        aifpVar.d(e3);
    }
}
