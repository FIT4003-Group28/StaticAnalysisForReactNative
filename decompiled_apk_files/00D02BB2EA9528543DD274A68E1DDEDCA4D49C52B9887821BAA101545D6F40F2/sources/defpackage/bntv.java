package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: bntv  reason: default package */
/* loaded from: classes.dex */
public final class bntv {
    @dzsi
    public Bitmap a;
    public final byte[] b;
    @dzsi
    public bnru c;
    @dzsi
    public final bnrd d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    @dzsi
    public final bnrt k;

    public bntv(Bitmap bitmap, boolean z) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (!bnta.a().a(z)) {
            bitmap = e(bitmap, bitmap.getConfig(), z);
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
            if (z) {
                width = i;
                height = i2;
            }
        } else {
            i = width;
            i2 = height;
        }
        this.a = bitmap;
        this.b = null;
        this.c = null;
        this.d = null;
        this.k = null;
        this.e = 0;
        this.f = width;
        this.g = height;
        this.h = i;
        this.i = i2;
        this.j = z;
    }

    public bntv(bnrd bnrdVar, int i, int i2, int i3, int i4, boolean z) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = bnrdVar;
        this.k = null;
        this.e = 0;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = z;
    }

    public bntv(bnrt bnrtVar, int i, int i2, boolean z) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.k = bnrtVar;
        this.e = 0;
        this.f = i;
        this.g = i2;
        this.h = i;
        this.i = i2;
        this.j = z;
    }

    public static Bitmap e(Bitmap bitmap, Bitmap.Config config, boolean z) {
        if (!g(bitmap.getWidth()) || !g(bitmap.getHeight())) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int f = f(width);
            int f2 = f(height);
            Bitmap createBitmap = Bitmap.createBitmap(f, f2, config);
            if (createBitmap == null) {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Could not allocate new bitmap of size ");
                sb.append(f);
                sb.append(" * ");
                sb.append(f2);
                throw new OutOfMemoryError(sb.toString());
            }
            createBitmap.setDensity(bitmap.getDensity());
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            if (z) {
                canvas.drawBitmap(bitmap, new Rect(0, 0, width, height), new Rect(0, 0, f, f2), paint);
                return createBitmap;
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            if (f > width) {
                canvas.drawBitmap(bitmap, new Rect(width - 1, 0, width, height), new Rect(width, 0, width + 1, height), paint);
            }
            if (f2 > height) {
                canvas.drawBitmap(bitmap, new Rect(0, height - 1, width, height), new Rect(0, height, width, height + 1), paint);
            }
            if (f > width && f2 > height) {
                canvas.drawBitmap(bitmap, new Rect(width - 1, height - 1, width, height), new Rect(width, height, width + 1, height + 1), paint);
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static int f(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 += i2;
        }
        return i2;
    }

    private static boolean g(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public final float a() {
        float f = this.h;
        return 1.0f / (f + f);
    }

    public final float b() {
        float f = this.i;
        return 1.0f / (f + f);
    }

    public final float c() {
        float f = this.h;
        float f2 = this.f;
        return ((f2 + f2) - 1.0f) * (1.0f / (f + f));
    }

    public final float d() {
        float f = this.i;
        float f2 = this.g;
        return ((f2 + f2) - 1.0f) * (1.0f / (f + f));
    }

    public bntv(byte[] bArr, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (!bnta.a().a(z)) {
            i4 = f(i2);
            i5 = f(i3);
            if (!g(i2) || !g(i3)) {
                byte[] bArr2 = new byte[i * i4 * i5];
                for (int i6 = 0; i6 < i3; i6++) {
                    System.arraycopy(bArr, i6 * i2 * i, bArr2, i6 * i4 * i, i2 * i);
                }
                bArr = bArr2;
            }
            if (z) {
                i2 = i4;
                i3 = i5;
            }
        } else {
            i4 = i2;
            i5 = i3;
        }
        this.a = null;
        this.b = bArr;
        this.c = null;
        this.d = null;
        this.k = null;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = z;
    }
}
