package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: acdp  reason: default package */
/* loaded from: classes2.dex */
final class acdp extends ccr {
    private final Application b;
    private final dbty<Bitmap> c;

    public acdp(Application application, dbty<Bitmap> dbtyVar) {
        this.b = application;
        this.c = dbtyVar;
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        messageDigest.update("com.google.android.apps.gmm.explore.visual.map.VisualExploreLabelCreator.ClusterBitmapTransformer".getBytes());
    }

    @Override // defpackage.ccr
    protected final Bitmap c(bxn bxnVar, Bitmap bitmap, int i, int i2) {
        Bitmap a = this.c.a();
        Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(a, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), (Paint) null);
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(acdq.a.e(this.b), acdq.b.e(this.b), createBitmap.getWidth() - acdq.a.e(this.b), createBitmap.getHeight() - acdq.b.e(this.b)), new Paint(3));
        return createBitmap;
    }

    @Override // defpackage.btw
    public final boolean equals(@dzsi Object obj) {
        return obj instanceof acdp;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        return 196285244;
    }
}
