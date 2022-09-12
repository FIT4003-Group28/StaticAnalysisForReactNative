package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aljg  reason: default package */
/* loaded from: classes2.dex */
public final class aljg {
    public final akse a = new akse();
    public float b;
    public float c;

    public aljg(MotionEvent motionEvent, VelocityTracker velocityTracker, EnumSet<aljb> enumSet, boolean z) {
        float f;
        velocityTracker.computeCurrentVelocity(1);
        int pointerCount = motionEvent.getPointerCount();
        akse[] akseVarArr = new akse[pointerCount];
        int pointerCount2 = motionEvent.getPointerCount();
        akse[] akseVarArr2 = new akse[pointerCount2];
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            akseVarArr2[i] = new akse(motionEvent.getX(i), motionEvent.getY(i));
            akse akseVar = new akse(velocityTracker.getXVelocity(pointerId), velocityTracker.getYVelocity(pointerId));
            akseVarArr[i] = akseVar;
            akse akseVar2 = this.a;
            akse.i(akseVar2, akseVar, akseVar2);
        }
        akse akseVar3 = this.a;
        akse.m(akseVar3, (float) TimeUnit.SECONDS.toMillis(1L), akseVar3);
        akse akseVar4 = this.a;
        float f2 = pointerCount;
        akseVar4.b /= f2;
        akseVar4.c /= f2;
        akse akseVar5 = akseVarArr2[0];
        float f3 = akseVar5.b;
        float f4 = akseVar5.c;
        int i2 = pointerCount2 - 1;
        akse akseVar6 = akseVarArr2[i2];
        float f5 = akseVar6.b;
        float f6 = akseVar6.c;
        akse akseVar7 = akseVarArr[0];
        float f7 = akseVar7.b + f3;
        float f8 = akseVar7.c + f4;
        akse akseVar8 = akseVarArr[i2];
        float f9 = akseVar8.b + f5;
        float f10 = akseVar8.c + f6;
        akse akseVar9 = new akse();
        akse.t(akseVarArr2[i2], akseVarArr2[0], akseVar9);
        akse akseVar10 = new akse();
        akse.t(new akse(f9, f10), new akse(f7, f8), akseVar10);
        float c = akseVar9.c();
        float d = bvop.d(c == 0.0f ? 1.0f : akseVar10.c() / c);
        this.b = d;
        this.b = d * ((float) TimeUnit.SECONDS.toMillis(1L));
        float degrees = (float) Math.toDegrees(alip.h(aliv.a(f3, f4, f5, f6), aliv.a(f7, f8, f9, f10)));
        this.c = degrees;
        this.c = degrees * ((float) TimeUnit.SECONDS.toMillis(1L));
        if (z) {
            akse akseVar11 = new akse(f7 - f3, f8 - f4);
            akse akseVar12 = new akse(f9 - f5, f10 - f6);
            this.c *= aljd.d(akse.b(akse.a, akseVar9, akseVar12) - akse.b(akse.a, akseVar9, akseVar11), akseVar9.a(akseVar12) - akseVar9.a(akseVar11));
        }
        if (!enumSet.contains(aljb.PAN)) {
            f = 0.0f;
            this.a.r(0.0f, 0.0f);
        } else {
            f = 0.0f;
        }
        if (!enumSet.contains(aljb.ZOOM)) {
            this.b = f;
        }
        if (!enumSet.contains(aljb.ROTATE)) {
            this.c = f;
        }
    }
}
