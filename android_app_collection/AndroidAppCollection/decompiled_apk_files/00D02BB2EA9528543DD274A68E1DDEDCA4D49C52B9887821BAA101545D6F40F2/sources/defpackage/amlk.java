package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: amlk  reason: default package */
/* loaded from: classes2.dex */
public final class amlk extends amlo {
    private static final dcqe a = dcqe.c("amlk");
    private final amku d;
    private final amkv e;
    private final EnumMap<dmlo, Bitmap> f;
    private final Resources g;

    public amlk(amku amkuVar, amkv amkvVar, Resources resources) {
        super(amkuVar.h, amkuVar.i);
        this.f = new EnumMap<>(dmlo.class);
        this.d = amkuVar;
        this.e = amkvVar;
        this.g = resources;
    }

    private final int e(float f) {
        return anaf.a(this.g.getDisplayMetrics().density, f);
    }

    @dzsi
    private final Bitmap f() {
        Bitmap bitmap;
        RectF rectF;
        RectF rectF2;
        float height;
        float min;
        float f;
        Bitmap bitmap2 = this.f.get(this.d.g);
        if (bitmap2 != null) {
            return bitmap2;
        }
        amku amkuVar = this.d;
        int i = (int) amkuVar.h;
        int i2 = (int) amkuVar.i;
        if (i <= 0 || i > 2048 || i2 <= 0 || i2 > 2048) {
            bvoo.h("Bitmap %d, %d creation failed", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            try {
                bitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
            }
        }
        if (bitmap2 == null) {
            return bitmap2;
        }
        bitmap2.setDensity(this.g.getDisplayMetrics().densityDpi);
        Canvas canvas = new Canvas(bitmap2);
        alxo alxoVar = this.d.a;
        if (alxoVar != null) {
            if (!alxoVar.c()) {
                bvoo.h("Styles for CalloutGeometries should have a TextBoxStyle.", new Object[0]);
            } else {
                alyd alydVar = this.d.a.r;
                float e = e(alydVar.b().c);
                RectF rectF3 = new RectF(e(alydVar.t()) + e, e(alydVar.u()) + e, (this.b - e(alydVar.v())) - e, (this.c - e(alydVar.w())) - e);
                dmlo dmloVar = this.d.g;
                float e2 = e(alydVar.k());
                float e3 = e(alydVar.i());
                dmlo dmloVar2 = dmlo.CENTER;
                switch (dmloVar.ordinal()) {
                    case 0:
                        rectF = new RectF(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom);
                        break;
                    case 1:
                        rectF2 = new RectF(rectF3.left, rectF3.top, rectF3.right - e3, rectF3.bottom);
                        rectF = rectF2;
                        break;
                    case 2:
                        rectF2 = new RectF(rectF3.left + e3, rectF3.top, rectF3.right, rectF3.bottom);
                        rectF = rectF2;
                        break;
                    case 3:
                        rectF2 = new RectF(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom - e3);
                        rectF = rectF2;
                        break;
                    case 4:
                        rectF = new RectF(rectF3.left, rectF3.top, rectF3.right - e2, rectF3.bottom - e2);
                        break;
                    case 5:
                        rectF = new RectF(rectF3.left + e2, rectF3.top, rectF3.right, rectF3.bottom - e2);
                        break;
                    case 6:
                        rectF2 = new RectF(rectF3.left, rectF3.top + e3, rectF3.right, rectF3.bottom);
                        rectF = rectF2;
                        break;
                    case 7:
                        rectF = new RectF(rectF3.left, rectF3.top + e2, rectF3.right - e2, rectF3.bottom);
                        break;
                    case 8:
                        rectF = new RectF(rectF3.left + e2, rectF3.top + e2, rectF3.right, rectF3.bottom);
                        break;
                    default:
                        bvoo.h("Anchor position is not supported.", new Object[0]);
                        rectF = null;
                        break;
                }
                if (rectF != null) {
                    float e4 = e(alydVar.j());
                    float e5 = e(alydVar.i());
                    if (alydVar.p() == 2) {
                        float e6 = e(alydVar.l());
                        height = e6 + e6;
                    } else {
                        height = alydVar.p() == 3 ? rectF.height() : 0.0f;
                    }
                    float min2 = Math.min(height, Math.min(rectF.height(), rectF.width()));
                    float f2 = min2 / 2.0f;
                    float min3 = Math.min(e4, Math.min(rectF3.height() - f2, rectF3.width() - f2));
                    if (alydVar.p() != 3 || (!dmloVar.equals(dmlo.LEFT) && !dmloVar.equals(dmlo.RIGHT))) {
                        if (alydVar.p() != 3 || ((!dmloVar.equals(dmlo.TOP) && !dmloVar.equals(dmlo.BOTTOM)) || rectF3.width() > 4.0f + min2)) {
                            min = Math.min(e5, Math.min((rectF3.height() - min2) / 2.0f, (rectF3.width() - min2) / 2.0f));
                            f = 0.0f;
                        } else {
                            min = Math.min(e5, rectF3.width() / 2.0f);
                            f = g(min2, min + min);
                        }
                    } else {
                        min = Math.min(e5, rectF3.height() / 2.0f);
                        f = g(min2, min + min);
                    }
                    Path path = new Path();
                    if (dmloVar.equals(dmlo.BOTTOM_RIGHT)) {
                        akse akseVar = new akse(rectF.left, rectF3.top + min3);
                        path.moveTo(akseVar.b, akseVar.c);
                        bitmap = bitmap2;
                        h(path, akseVar, new akse(rectF3.left, rectF3.top), new akse(rectF3.left + min3, rectF.top));
                    } else {
                        bitmap = bitmap2;
                        new akse(rectF.left, rectF3.top + f2);
                        i(path, new RectF(rectF.left, rectF.top, rectF.left + min2, rectF.top + min2), 180.0f);
                    }
                    if (dmloVar.equals(dmlo.BOTTOM)) {
                        float f3 = rectF.top + f;
                        h(path, new akse(rectF.centerX() - min, f3), new akse(rectF.centerX(), rectF3.top), new akse(rectF.centerX() + min, f3));
                    }
                    if (dmloVar.equals(dmlo.BOTTOM_LEFT)) {
                        h(path, new akse(rectF3.right - min3, rectF.top), new akse(rectF3.right, rectF3.top), new akse(rectF.right, rectF3.top + min3));
                    } else {
                        i(path, new RectF(rectF.right - min2, rectF.top, rectF.right, rectF.top + min2), 270.0f);
                    }
                    if (dmloVar.equals(dmlo.LEFT)) {
                        float f4 = rectF.right - f;
                        h(path, new akse(f4, rectF.centerY() - min), new akse(rectF3.right, rectF.centerY()), new akse(f4, rectF.centerY() + min));
                    }
                    if (dmloVar.equals(dmlo.TOP_LEFT)) {
                        h(path, new akse(rectF.right, rectF3.bottom - min3), new akse(rectF3.right, rectF3.bottom), new akse(rectF3.right - min3, rectF.bottom));
                    } else {
                        i(path, new RectF(rectF.right - min2, rectF.bottom - min2, rectF.right, rectF.bottom), 0.0f);
                    }
                    if (dmloVar.equals(dmlo.TOP)) {
                        float f5 = rectF.bottom - f;
                        h(path, new akse(rectF.centerX() + min, f5), new akse(rectF.centerX(), rectF3.bottom), new akse(rectF.centerX() - min, f5));
                    }
                    if (dmloVar.equals(dmlo.TOP_RIGHT)) {
                        h(path, new akse(rectF3.left + min3, rectF.bottom), new akse(rectF3.left, rectF3.bottom), new akse(rectF.left, rectF3.bottom - min3));
                    } else {
                        i(path, new RectF(rectF.left, rectF.bottom - min2, rectF.left + min2, rectF.bottom), 90.0f);
                    }
                    if (dmloVar.equals(dmlo.RIGHT)) {
                        float f6 = rectF.left + f;
                        h(path, new akse(f6, rectF.centerY() + min), new akse(rectF3.left, rectF.centerY()), new akse(f6, rectF.centerY() - min));
                    }
                    path.close();
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(alydVar.a());
                    if (canvas.isHardwareAccelerated()) {
                        bvoo.h("The canvas created to draw callout backgrounds was not expected to be hardware accelerated. Paint's setShadowLayer is only supported in the software rendering pipeline. The callout drop shadow will not be rendered.", new Object[0]);
                    } else {
                        paint.setShadowLayer(e(alydVar.f()), e(alydVar.c()), e(alydVar.d()), alydVar.e());
                    }
                    canvas.drawPath(path, paint);
                    if (alydVar.b().c != 0.0f) {
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setStyle(Paint.Style.STROKE);
                        paint2.setStrokeJoin(Paint.Join.ROUND);
                        paint2.setColor(alydVar.b().a);
                        paint2.setStrokeWidth(alydVar.b().c);
                        canvas.drawPath(path, paint2);
                    }
                }
            }
            bitmap = bitmap2;
        } else {
            bitmap = bitmap2;
            bvoo.h("Callout style type not supported.", new Object[0]);
        }
        Bitmap bitmap3 = bitmap;
        this.f.put((EnumMap<dmlo, Bitmap>) this.d.g, (dmlo) bitmap3);
        return bitmap3;
    }

    private static float g(float f, float f2) {
        float min = Math.min(f2, f);
        float f3 = f / 2.0f;
        return f3 - ((float) Math.sqrt(Math.pow(f3, 2.0d) - (Math.pow(min, 2.0d) / 4.0d)));
    }

    private static void h(Path path, akse akseVar, akse akseVar2, akse akseVar3) {
        path.lineTo(akseVar.b, akseVar.c);
        path.lineTo(akseVar2.b, akseVar2.c);
        path.lineTo(akseVar3.b, akseVar3.c);
    }

    private static void i(Path path, RectF rectF, float f) {
        path.arcTo(rectF, f, 90.0f);
    }

    @Override // defpackage.amlo
    @dzsi
    public final bnvf a() {
        bnve a2;
        Bitmap f = f();
        if (f == null || (a2 = this.e.a(f)) == null) {
            return null;
        }
        return new bnvf(dcdc.f(a2));
    }
}
