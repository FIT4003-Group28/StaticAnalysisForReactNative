package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
/* compiled from: PG */
/* renamed from: cmfw  reason: default package */
/* loaded from: classes5.dex */
public final class cmfw {
    public static final cmfw a;
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;

    static {
        cmfv cmfvVar = new cmfv();
        cmfvVar.a = "";
        a = cmfvVar.a();
    }

    public cmfw(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6) {
        if (charSequence == null) {
            cmmn.f(bitmap);
        } else {
            cmmn.a(bitmap == null);
        }
        this.b = charSequence;
        this.c = alignment;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
    }
}
