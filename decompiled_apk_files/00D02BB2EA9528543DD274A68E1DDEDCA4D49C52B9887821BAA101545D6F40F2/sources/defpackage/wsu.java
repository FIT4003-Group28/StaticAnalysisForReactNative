package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: wsu  reason: default package */
/* loaded from: classes7.dex */
public final class wsu {
    public final akto a;
    public final Context b;
    public final SparseArray<aktg> c = new SparseArray<>();

    public wsu(akto aktoVar, Application application) {
        this.a = aktoVar;
        this.b = application;
    }

    public static Bitmap a(int i, float f, float f2, int i2) {
        Canvas canvas = new Canvas();
        Paint paint = new Paint();
        paint.setFlags(1);
        float f3 = i2;
        int ceil = (int) Math.ceil(f2 * f3);
        float f4 = f * f3;
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        float f5 = ceil / 2.0f;
        canvas.setBitmap(createBitmap);
        paint.setColor(i);
        canvas.drawCircle(f5, f5, f4, paint);
        paint.setColor(-1);
        canvas.drawCircle(f5, f5, f4 - (f3 * 1.5f), paint);
        return createBitmap;
    }
}
