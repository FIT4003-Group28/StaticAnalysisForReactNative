package defpackage;

import android.content.res.TypedArray;
/* compiled from: PG */
/* renamed from: cppo  reason: default package */
/* loaded from: classes5.dex */
public final class cppo {
    public cppx a;
    public cppx b;
    public cppx c;
    public cppx d;
    public cppx e;
    public cppx f;
    public cppx g;
    public cppx h;

    public static cppx a(TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        double d = dimension;
        if (d <= dcyn.a || d >= 1.0d) {
            return new cpqe(typedArray.getDimensionPixelSize(i, (int) f));
        }
        return new cpqd(dimension);
    }
}
