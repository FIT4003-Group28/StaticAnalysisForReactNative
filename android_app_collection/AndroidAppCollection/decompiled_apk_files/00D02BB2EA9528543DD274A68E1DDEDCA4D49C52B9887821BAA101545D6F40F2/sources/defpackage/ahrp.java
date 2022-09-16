package defpackage;

import android.hardware.GeomagneticField;
import android.hardware.SensorManager;
/* compiled from: PG */
/* renamed from: ahrp  reason: default package */
/* loaded from: classes.dex */
public final class ahrp extends ahro {
    public final float[] u = new float[4];
    public final ahrn v = new ahrn();
    public final ahrn w = new ahrn();

    public ahrp(float f, float f2, float f3, long j) {
        e(f, f2, f3, j);
    }

    @Override // defpackage.ahro
    public final void e(float f, float f2, float f3, long j) {
        float f4 = 45.0f;
        if (!Float.isNaN(f) && !Float.isNaN(f2) && !Float.isNaN(f3) && f3 >= 0.0f) {
            double fieldStrength = new GeomagneticField(f, f2, f3, j).getFieldStrength();
            Double.isNaN(fieldStrength);
            f4 = (float) (fieldStrength / 1000.0d);
            this.r = f4;
        }
        ahrt ahrtVar = this.q;
        if (ahrtVar == null) {
            this.q = new ahrt(f4);
            return;
        }
        ahrtVar.d = Float.NaN;
        ahrtVar.e = Float.NaN;
        ahrtVar.g = Float.NaN;
        ahrtVar.i = Float.NaN;
        ahrtVar.l = Float.NaN;
        ahrtVar.m = Float.NaN;
        ahrtVar.n.c();
        ahrtVar.o.c();
        ahrtVar.p.c();
        ahrtVar.c = f4;
        ahrtVar.q = true;
    }

    @Override // defpackage.ahro
    public final float f(int i, float[] fArr) {
        if (i == 0) {
            return ahrr.b(((float) Math.toDegrees(Math.atan2(fArr[0], fArr[3]))) - 90.0f, -180.0f, 180.0f);
        }
        float[] fArr2 = new float[9];
        int i2 = 130;
        int i3 = 129;
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 129;
            i3 = 130;
        } else if (i != 3) {
            i2 = 1;
            i3 = 2;
        } else {
            i3 = 1;
        }
        SensorManager.remapCoordinateSystem(fArr, i2, i3, fArr2);
        return ahrr.b(((float) Math.toDegrees(Math.atan2(fArr2[0], fArr2[3]))) - 90.0f, -180.0f, 180.0f);
    }
}
