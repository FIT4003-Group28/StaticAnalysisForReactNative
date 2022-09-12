package defpackage;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bnn  reason: default package */
/* loaded from: classes3.dex */
public final class bnn extends bnl {
    private final Paint g;
    private final Rect h;
    private final Rect i;
    private blc<ColorFilter, ColorFilter> j;

    public bnn(bjr bjrVar, bno bnoVar) {
        super(bjrVar, bnoVar);
        this.g = new bkg(3);
        this.h = new Rect();
        this.i = new Rect();
    }

    private final Bitmap o() {
        bjs bjsVar;
        String str = this.c.f;
        blt A = this.b.A();
        if (A == null || (bjsVar = A.d.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = bjsVar.e;
        if (bitmap != null) {
            return bitmap;
        }
        bil bilVar = A.c;
        if (bilVar == null) {
            String str2 = bjsVar.d;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
                try {
                    if (TextUtils.isEmpty(A.b)) {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                    AssetManager assets = A.a.getAssets();
                    String valueOf = String.valueOf(A.b);
                    Bitmap i = bps.i(BitmapFactory.decodeStream(assets.open(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf)), null, options), bjsVar.a, bjsVar.b);
                    A.a(str, i);
                    return i;
                } catch (IOException unused) {
                    bpo.b("Unable to open asset.");
                    return null;
                }
            }
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                A.a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException unused2) {
                bpo.b("data URL did not have correct base64 format.");
                return null;
            }
        }
        Bitmap a = bilVar.a(bjsVar);
        if (a == null) {
            return a;
        }
        A.a(str, a);
        return a;
    }

    @Override // defpackage.bnl, defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        Bitmap o = o();
        if (o != null) {
            rectF.set(0.0f, 0.0f, o.getWidth() * bps.g(), o.getHeight() * bps.g());
            this.a.mapRect(rectF);
        }
    }

    @Override // defpackage.bnl, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.B) {
            this.j = new blr(bpvVar);
        }
    }

    @Override // defpackage.bnl
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Bitmap o = o();
        if (o == null || o.isRecycled()) {
            return;
        }
        float g = bps.g();
        this.g.setAlpha(i);
        blc<ColorFilter, ColorFilter> blcVar = this.j;
        if (blcVar != null) {
            this.g.setColorFilter(blcVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.h.set(0, 0, o.getWidth(), o.getHeight());
        this.i.set(0, 0, (int) (o.getWidth() * g), (int) (o.getHeight() * g));
        canvas.drawBitmap(o, this.h, this.i, this.g);
        canvas.restore();
    }
}
