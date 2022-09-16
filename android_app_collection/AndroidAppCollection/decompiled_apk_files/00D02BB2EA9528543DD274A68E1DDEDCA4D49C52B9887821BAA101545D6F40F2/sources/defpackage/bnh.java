package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: bnh  reason: default package */
/* loaded from: classes3.dex */
public final class bnh {
    public static int[] a() {
        return new int[]{1, 2, 3};
    }

    public static Paint.Join b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 2 ? Paint.Join.ROUND : Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
