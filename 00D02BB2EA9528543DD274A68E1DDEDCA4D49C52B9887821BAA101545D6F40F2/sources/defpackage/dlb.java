package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.Surface;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dlb  reason: default package */
/* loaded from: classes6.dex */
public final class dlb implements bnte {
    final /* synthetic */ float a;
    final /* synthetic */ akqq b;
    final /* synthetic */ dld c;
    final /* synthetic */ alrh d;

    public dlb(dld dldVar, float f, alrh alrhVar, akqq akqqVar) {
        this.c = dldVar;
        this.a = f;
        this.d = alrhVar;
        this.b = akqqVar;
    }

    @Override // defpackage.bnte
    @dzsi
    public final ByteBuffer c(int i) {
        ByteBuffer byteBuffer = this.c.m;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.c.m = ByteBuffer.allocateDirect(i);
        }
        return this.c.m;
    }

    @Override // defpackage.bnte
    public final void f(@dzsi final Bitmap bitmap) {
        final dld dldVar = this.c;
        final float f = this.a;
        final alrh alrhVar = this.d;
        final akqq akqqVar = this.b;
        if (bitmap == null) {
            dldVar.c();
            return;
        }
        fd fdVar = dldVar.b;
        if (fdVar == null || !fdVar.U()) {
            dldVar.c();
            return;
        }
        ff J = fdVar.J();
        if (J == null) {
            dldVar.c();
        } else {
            J.runOnUiThread(new Runnable(dldVar, bitmap, f, alrhVar, akqqVar) { // from class: dkx
                private final dld a;
                private final Bitmap b;
                private final float c;
                private final akqq d;
                private final alrh e;

                {
                    this.a = dldVar;
                    this.b = bitmap;
                    this.c = f;
                    this.e = alrhVar;
                    this.d = akqqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dld dldVar2 = this.a;
                    Bitmap bitmap2 = this.b;
                    float f2 = this.c;
                    alrh alrhVar2 = this.e;
                    akqq akqqVar2 = this.d;
                    dae daeVar = dldVar2.q;
                    if (daeVar == null) {
                        dldVar2.c();
                        return;
                    }
                    boolean z = dldVar2.j;
                    int width = bitmap2.getWidth();
                    int height = bitmap2.getHeight();
                    Surface a = daeVar.a();
                    if (a != null && a.isValid()) {
                        Canvas lockHardwareCanvas = a.lockHardwareCanvas();
                        try {
                            Paint paint = new Paint(1);
                            paint.setColor(-16777216);
                            Path path = new Path();
                            path.addOval(new RectF(0.0f, 0.0f, 1000.0f, 1000.0f), Path.Direction.CW);
                            lockHardwareCanvas.drawPath(path, paint);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            Matrix matrix = new Matrix();
                            float f3 = width;
                            float f4 = height;
                            float max = Math.max(1000.0f / f3, 1000.0f / f4);
                            matrix.postScale(max, max);
                            matrix.postTranslate((1000.0f - (f3 * max)) / 2.0f, (1000.0f - (max * f4)) / 2.0f);
                            matrix.postRotate(f2, 500.0f, 500.0f);
                            lockHardwareCanvas.drawBitmap(bitmap2, matrix, paint);
                            if (z) {
                                TextPaint textPaint = new TextPaint();
                                textPaint.setAntiAlias(true);
                                textPaint.setTextSize(50.0f);
                                textPaint.setColor(-16777216);
                                lockHardwareCanvas.drawText("N", 500.0f, 50.0f, textPaint);
                                lockHardwareCanvas.rotate(90.0f, 500.0f, 500.0f);
                                lockHardwareCanvas.drawText("E", 500.0f, 50.0f, textPaint);
                                lockHardwareCanvas.rotate(90.0f, 500.0f, 500.0f);
                                lockHardwareCanvas.drawText("S", 500.0f, 50.0f, textPaint);
                                lockHardwareCanvas.rotate(90.0f, 500.0f, 500.0f);
                                lockHardwareCanvas.drawText("W", 500.0f, 50.0f, textPaint);
                            }
                        } finally {
                            a.unlockCanvasAndPost(lockHardwareCanvas);
                        }
                    }
                    dldVar2.z = f2;
                    dldVar2.A = alrhVar2;
                    if (alrhVar2 == null) {
                        return;
                    }
                    aksg c = alrhVar2.c();
                    float e = ((float) akqo.e(c.a, c.b)) * 0.5f;
                    boolean z2 = !akqqVar2.equals(dldVar2.r) || e != dldVar2.s;
                    dah dahVar = dldVar2.p;
                    if (dahVar == null || !z2) {
                        return;
                    }
                    dahVar.d(akqqVar2, e);
                    dldVar2.r = akqqVar2;
                    dldVar2.s = e;
                }
            });
        }
    }

    @Override // defpackage.bnte
    @dzsi
    public final Bitmap g(int i, int i2) {
        Bitmap bitmap = this.c.l;
        if (bitmap == null || bitmap.getWidth() != i || this.c.l.getHeight() != i2) {
            Bitmap bitmap2 = this.c.l;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.c.l.recycle();
            }
            this.c.l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        return this.c.l;
    }
}
