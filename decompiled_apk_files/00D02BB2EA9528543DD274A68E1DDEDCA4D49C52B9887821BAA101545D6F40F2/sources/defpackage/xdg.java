package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: xdg  reason: default package */
/* loaded from: classes7.dex */
public final class xdg implements xdi {
    private final Activity a;
    private final ail<xdf, Bitmap> b = new ail<>(30);
    private final Paint c;
    private final Paint d;

    public xdg(Activity activity) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint();
        this.a = activity;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // defpackage.xdi
    public final Bitmap a(@dzsi cqtd cqtdVar) {
        return e(cqtdVar, xde.SMALL);
    }

    @Override // defpackage.xdi
    public final Bitmap b(@dzsi cqtd cqtdVar) {
        return e(cqtdVar, xde.MEDIUM);
    }

    @Override // defpackage.xdi
    public final dmlo c() {
        return dmlo.TOP;
    }

    @Override // defpackage.xdi
    public final void d() {
        this.b.f();
    }

    private final Bitmap e(@dzsi cqtd cqtdVar, xde xdeVar) {
        int i;
        Bitmap b;
        xcu xcuVar = cqtdVar == null ? null : new xcu(xdeVar, cqtdVar);
        if (xcuVar == null || (b = this.b.b(xcuVar)) == null) {
            Drawable a = cqrt.f(xdeVar.c).a(this.a);
            int intrinsicWidth = a.getIntrinsicWidth();
            Bitmap c = bvlf.c(a, intrinsicWidth, a.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            if (xcuVar != null) {
                int NR = cqrp.d(xdeVar.d).NR(this.a);
                int i2 = intrinsicWidth - (NR + NR);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                dbsk.s(cqtdVar);
                Drawable a2 = cqtdVar.a(this.a);
                Rect rect = new Rect(0, 0, i2, i2);
                a2.setBounds(rect);
                a2.draw(canvas);
                Bitmap copy = createBitmap.copy(Bitmap.Config.ARGB_8888, false);
                Bitmap createBitmap2 = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                float f = i2 + 1;
                new Canvas(createBitmap2).drawOval(new RectF(-1.0f, -1.0f, f, f), this.d);
                canvas.drawBitmap(createBitmap2, (Rect) null, rect, this.c);
                if (!createBitmap.sameAs(copy)) {
                    createBitmap.eraseColor(0);
                    int round = ((int) (i2 / 2.0f)) - ((int) Math.round(Math.sqrt((i * i) / 2.0f)));
                    rect.inset(round, round);
                    a2.draw(canvas);
                }
                rect.offset(NR, NR);
                new Canvas(c).drawBitmap(createBitmap, (Rect) null, rect, this.d);
                Bitmap copy2 = c.copy(Bitmap.Config.ARGB_8888, false);
                this.b.c(xcuVar, copy2);
                return copy2;
            }
            return c.copy(Bitmap.Config.ARGB_8888, false);
        }
        return b;
    }
}
