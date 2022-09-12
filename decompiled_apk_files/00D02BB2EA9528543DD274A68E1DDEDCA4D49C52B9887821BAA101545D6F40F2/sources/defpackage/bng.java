package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: bng  reason: default package */
/* loaded from: classes3.dex */
public final class bng {
    public static int[] a() {
        return new int[]{1, 2, 3};
    }

    public static Paint.Cap b(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }
}
