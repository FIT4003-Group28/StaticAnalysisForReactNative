package defpackage;

import android.util.Property;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: allu  reason: default package */
/* loaded from: classes.dex */
final class allu extends Property {
    public allu(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = allw.a;
        return Float.valueOf(((allw) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        allw allwVar = (allw) obj;
        float floatValue = ((Float) obj2).floatValue();
        allwVar.h = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = allwVar.l;
        float f = floatValue * 1520.0f;
        fArr[0] = (-20.0f) + f;
        fArr[1] = f;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = allw.a[i2];
            float[] fArr2 = allwVar.l;
            fArr2[1] = fArr2[1] + (allwVar.e.getInterpolation(allw.c(i, i3, 667)) * 250.0f);
            int i4 = allw.b[i2];
            float[] fArr3 = allwVar.l;
            fArr3[0] = fArr3[0] + (allwVar.e.getInterpolation(allw.c(i, i4, 667)) * 250.0f);
        }
        float[] fArr4 = allwVar.l;
        float f2 = fArr4[0];
        fArr4[0] = (f2 + ((fArr4[1] - f2) * allwVar.i)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            float c = allw.c(i, allw.c[i5], 333);
            if (c >= 0.0f && c <= 1.0f) {
                int i6 = allwVar.g;
                int[] iArr = allwVar.f.c;
                int length = iArr.length;
                int i7 = (i5 + i6) % length;
                int x = amxp.x(iArr[i7], allwVar.k.i);
                int x2 = amxp.x(allwVar.f.c[(i7 + 1) % length], allwVar.k.i);
                float interpolation = allwVar.e.getInterpolation(c);
                int[] iArr2 = allwVar.m;
                Integer valueOf = Integer.valueOf(x);
                Integer valueOf2 = Integer.valueOf(x2);
                int intValue = valueOf.intValue();
                float f3 = ((intValue >> 24) & PrivateKeyType.INVALID) / 255.0f;
                int intValue2 = valueOf2.intValue();
                float pow = (float) Math.pow(((intValue >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((intValue >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((intValue & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                iArr2[0] = Integer.valueOf((Math.round((f3 + (((((intValue2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f3) * interpolation)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((((float) Math.pow(((intValue2 >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d)) - pow) * interpolation), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((intValue2 >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d)) - pow2) * interpolation), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (interpolation * (((float) Math.pow((intValue2 & PrivateKeyType.INVALID) / 255.0f, 2.2d)) - pow3)), 0.45454545454545453d)) * 255.0f)).intValue();
                break;
            }
            i5++;
        }
        allwVar.k.invalidateSelf();
    }
}
