package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cbf  reason: default package */
/* loaded from: classes2.dex */
public final class cbf extends cbd {
    private final Paint h;
    private final Rect i;
    private final Rect j;
    private byy k;
    private byy l;

    public cbf(bxn bxnVar, cbg cbgVar) {
        super(bxnVar, cbgVar);
        this.h = new bxz(3);
        this.i = new Rect();
        this.j = new Rect();
    }

    private final Bitmap p() {
        bzp bzpVar;
        Bitmap bitmap;
        byy byyVar = this.l;
        if (byyVar == null || (bitmap = (Bitmap) byyVar.e()) == null) {
            String str = this.c.f;
            bxn bxnVar = this.b;
            if (bxnVar.getCallback() == null) {
                bzpVar = null;
            } else {
                bzp bzpVar2 = bxnVar.g;
                if (bzpVar2 != null) {
                    Drawable.Callback callback = bxnVar.getCallback();
                    Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                    if ((context != null || bzpVar2.a != null) && !bzpVar2.a.equals(context)) {
                        bxnVar.g = null;
                    }
                }
                if (bxnVar.g == null) {
                    bxnVar.g = new bzp(bxnVar.getCallback(), bxnVar.h, bxnVar.a.b);
                }
                bzpVar = bxnVar.g;
            }
            if (bzpVar == null) {
                bwx bwxVar = bxnVar.a;
                bxo bxoVar = bwxVar == null ? null : (bxo) bwxVar.b.get(str);
                if (bxoVar != null) {
                    return bxoVar.e;
                }
                return null;
            }
            bxo bxoVar2 = (bxo) bzpVar.c.get(str);
            if (bxoVar2 == null) {
                return null;
            }
            Bitmap bitmap2 = bxoVar2.e;
            if (bitmap2 != null) {
                return bitmap2;
            }
            String str2 = bxoVar2.d;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
                try {
                    byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    bzpVar.a(str, decodeByteArray);
                    return decodeByteArray;
                } catch (IllegalArgumentException e) {
                    cda.b("data URL did not have correct base64 format.", e);
                    return null;
                }
            }
            try {
                if (TextUtils.isEmpty(bzpVar.b)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = bzpVar.a.getAssets();
                String valueOf = String.valueOf(bzpVar.b);
                try {
                    Bitmap e2 = cdh.e(BitmapFactory.decodeStream(assets.open(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf)), null, options), bxoVar2.a, bxoVar2.b);
                    bzpVar.a(str, e2);
                    return e2;
                } catch (IllegalArgumentException e3) {
                    cda.b("Unable to decode image.", e3);
                    return null;
                }
            } catch (IOException e4) {
                cda.b("Unable to open asset.", e4);
                return null;
            }
        }
        return bitmap;
    }

    @Override // defpackage.cbd, defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        super.a(obj, cdjVar);
        if (obj == bxs.E) {
            this.k = new bzn(cdjVar);
        } else if (obj != bxs.H) {
        } else {
            this.l = new bzn(cdjVar);
        }
    }

    @Override // defpackage.cbd, defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        Bitmap p = p();
        if (p != null) {
            rectF.set(0.0f, 0.0f, p.getWidth() * cdh.a(), p.getHeight() * cdh.a());
            this.a.mapRect(rectF);
        }
    }

    @Override // defpackage.cbd
    public final void i(Canvas canvas, Matrix matrix, int i) {
        Bitmap p = p();
        if (p == null || p.isRecycled()) {
            return;
        }
        float a = cdh.a();
        this.h.setAlpha(i);
        byy byyVar = this.k;
        if (byyVar != null) {
            this.h.setColorFilter((ColorFilter) byyVar.e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.i.set(0, 0, p.getWidth(), p.getHeight());
        this.j.set(0, 0, (int) (p.getWidth() * a), (int) (p.getHeight() * a));
        canvas.drawBitmap(p, this.i, this.j, this.h);
        canvas.restore();
    }
}
