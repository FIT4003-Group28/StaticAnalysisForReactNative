package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpyj  reason: default package */
/* loaded from: classes4.dex */
public final class bpyj {
    private static final dcqe f = dcqe.c("bpyj");
    public final akox a;
    @dzsi
    public Pair<akuh, Bitmap> b;
    @dzsi
    public Pair<akuh, Bitmap> c;
    @dzsi
    public Pair<akuh, Bitmap> d;
    @dzsi
    public Pair<akuh, Bitmap> e;
    private final Activity g;
    private final akxa h;

    public bpyj(Activity activity, akox akoxVar) {
        this.g = activity;
        this.a = akoxVar;
        this.h = akoxVar.aj().aj();
    }

    public final akta a(akqq akqqVar, Pair<akuh, Bitmap> pair, int i, int i2) {
        return this.h.b(akqqVar.a, akqqVar.b, i, ((Bitmap) pair.second).getWidth(), true, (akuh) pair.first, true, false, 2, i2);
    }

    public final Pair<akuh, Bitmap> b() {
        if (this.b == null) {
            this.b = c(2131232485, 3, R.color.mod_daynight_grey500, R.color.white_semi_transparent);
        }
        return this.b;
    }

    public final Pair<akuh, Bitmap> c(int i, int i2, int i3, int i4) {
        Resources resources = this.g.getResources();
        Drawable drawable = resources.getDrawable(i);
        if (drawable.getIntrinsicWidth() != drawable.getIntrinsicHeight()) {
            bvoo.h("Trying to tint a non square icon.", new Object[0]);
        }
        drawable.setColorFilter(new PorterDuffColorFilter(resources.getColor(i3), PorterDuff.Mode.SRC_IN));
        int ceil = (int) Math.ceil(drawable.getIntrinsicWidth());
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        Resources resources2 = this.g.getResources();
        int ceil2 = (int) Math.ceil(resources2.getDisplayMetrics().density * i2);
        float width = createBitmap.getWidth() + ceil2 + ceil2;
        int ceil3 = (int) Math.ceil(width);
        Bitmap createBitmap2 = Bitmap.createBitmap(ceil3, ceil3, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        float f2 = width / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(resources2.getColor(i4));
        canvas2.drawCircle(f2, f2, f2, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(resources2.getColor(R.color.mod_daynight_blue600));
        float f3 = resources2.getDisplayMetrics().density;
        paint2.setStrokeWidth((float) Math.ceil(f3 + f3));
        canvas2.drawCircle(f2, f2, f2, paint2);
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        int i5 = ceil3 - ceil2;
        canvas2.drawBitmap(createBitmap, (Rect) null, new Rect(ceil2, ceil2, i5, i5), paint3);
        return Pair.create(this.a.aj().aF().e().m(bnrh.a(createBitmap2), bntp.POLYLINE_MEASLES.c()), createBitmap2);
    }
}
