package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: dece  reason: default package */
/* loaded from: classes.dex */
public final class dece extends decf {
    public static float a(float... fArr) {
        dbsk.a(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    public static float b(float... fArr) {
        dbsk.a(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    public static float c(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(dbtx.b("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static float[] d(Collection<? extends Number> collection) {
        if (collection instanceof decd) {
            decd decdVar = (decd) collection;
            throw null;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            dbsk.s(obj);
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
