package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqlw  reason: default package */
/* loaded from: classes5.dex */
public final class cqlw extends cqlr {
    private final int b;
    private final int c;

    private cqlw(Drawable drawable, int i, int i2) {
        super(drawable);
        this.b = i;
        this.c = i2;
    }

    public static Drawable a(Drawable drawable, int i, int i2) {
        return new cqlw(drawable, i, i2);
    }

    public static int b(int i, int i2, int i3) {
        return (i <= 0 || i2 <= 0) ? i2 : Math.round((i2 * i3) / i);
    }

    @Override // defpackage.cqlr, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // defpackage.cqlr, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }
}
