package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: atec  reason: default package */
/* loaded from: classes2.dex */
public final class atec {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public atec(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static atec a(Resources resources, int i, int i2, int i3, int i4, int i5) {
        return new atec(resources.getColor(i), resources.getColor(i2), resources.getColor(i3), i4, i5);
    }
}
