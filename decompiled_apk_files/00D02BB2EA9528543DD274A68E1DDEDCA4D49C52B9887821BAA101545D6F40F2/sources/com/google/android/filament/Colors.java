package com.google.android.filament;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Colors {

    /* compiled from: PG */
    /* renamed from: com.google.android.filament.Colors$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$Conversion;
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$RgbaType;

        static {
            int[] iArr = new int[Conversion.values().length];
            $SwitchMap$com$google$android$filament$Colors$Conversion = iArr;
            try {
                iArr[Conversion.ACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$Conversion[Conversion.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RgbaType.values().length];
            $SwitchMap$com$google$android$filament$Colors$RgbaType = iArr2;
            try {
                iArr2[RgbaType.SRGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_SRGB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Conversion {
        ACCURATE,
        FAST
    }

    /* compiled from: PG */
    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LinearColor {
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum RgbType {
        SRGB,
        LINEAR
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum RgbaType {
        SRGB,
        LINEAR,
        PREMULTIPLIED_SRGB,
        PREMULTIPLIED_LINEAR
    }

    private Colors() {
    }

    public static float[] cct(float f) {
        float[] fArr = new float[3];
        nCct(f, fArr);
        return fArr;
    }

    public static float[] illuminantD(float f) {
        float[] fArr = new float[3];
        nIlluminantD(f, fArr);
        return fArr;
    }

    private static native void nCct(float f, float[] fArr);

    private static native void nIlluminantD(float f, float[] fArr);

    public static float[] toLinear(Conversion conversion, float[] fArr) {
        Conversion conversion2 = Conversion.ACCURATE;
        RgbaType rgbaType = RgbaType.SRGB;
        int ordinal = conversion.ordinal();
        int i = 0;
        if (ordinal == 0) {
            while (i < 3) {
                float f = fArr[i];
                fArr[i] = f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
                i++;
            }
        } else if (ordinal == 1) {
            while (i < 3) {
                fArr[i] = (float) Math.sqrt(fArr[i]);
                i++;
            }
        }
        return fArr;
    }

    public static float[] toLinear(RgbType rgbType, float f, float f2, float f3) {
        float[] fArr = {f, f2, f3};
        toLinear(rgbType, fArr);
        return fArr;
    }

    public static float[] toLinear(RgbType rgbType, float[] fArr) {
        if (rgbType == RgbType.LINEAR) {
            return fArr;
        }
        toLinear(Conversion.ACCURATE, fArr);
        return fArr;
    }

    public static float[] toLinear(RgbaType rgbaType, float f, float f2, float f3, float f4) {
        float[] fArr = {f, f2, f3, f4};
        toLinear(rgbaType, fArr);
        return fArr;
    }

    public static float[] toLinear(RgbaType rgbaType, float[] fArr) {
        Conversion conversion = Conversion.ACCURATE;
        RgbaType rgbaType2 = RgbaType.SRGB;
        int ordinal = rgbaType.ordinal();
        if (ordinal == 0) {
            toLinear(Conversion.ACCURATE, fArr);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                return fArr;
            }
            toLinear(Conversion.ACCURATE, fArr);
            return fArr;
        }
        float f = fArr[3];
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        return fArr;
    }
}
