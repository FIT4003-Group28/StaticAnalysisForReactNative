package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ameo  reason: default package */
/* loaded from: classes.dex */
final class ameo extends amfa {
    final /* synthetic */ String[] a;
    final /* synthetic */ String b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int[] f;
    final /* synthetic */ int[] g;
    final /* synthetic */ int[] h;
    final /* synthetic */ int[] i;
    final /* synthetic */ amfd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ameo(amfd amfdVar, amfu amfuVar, int i, int i2, cqat cqatVar, String[] strArr, String str, float f, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        super(amfuVar, i, i2, cqatVar);
        this.j = amfdVar;
        this.a = strArr;
        this.b = str;
        this.c = f;
        this.d = i3;
        this.e = i4;
        this.f = iArr;
        this.g = iArr2;
        this.h = iArr3;
        this.i = iArr4;
    }

    @Override // defpackage.amfa
    public final Bitmap b(Bitmap[] bitmapArr) {
        return this.j.m.a().c(new amfh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i), bitmapArr);
    }

    @Override // defpackage.amfa
    public final Bitmap[] c(Bitmap[] bitmapArr) {
        Bitmap[] bitmapArr2 = new Bitmap[bitmapArr.length];
        char c = 0;
        int i = 0;
        while (i < bitmapArr.length) {
            if (bitmapArr[i] != null) {
                String[] strArr = new String[1];
                strArr[c] = this.a[i];
                String str = this.b;
                float f = this.c;
                int i2 = this.d;
                int i3 = this.e;
                int[] iArr = new int[1];
                iArr[c] = this.f[i];
                int[] iArr2 = new int[1];
                iArr2[c] = this.g[i];
                int[] iArr3 = new int[1];
                iArr3[c] = this.h[i];
                int[] iArr4 = new int[1];
                iArr4[c] = this.i[i];
                Bitmap c2 = this.j.m.a().c(new amfh(strArr, str, f, i2, i3, iArr, iArr2, iArr3, iArr4), new Bitmap[]{bitmapArr[i]});
                if (c2 != null) {
                    bitmapArr2[i] = c2;
                }
            }
            i++;
            c = 0;
        }
        return bitmapArr2;
    }
}
