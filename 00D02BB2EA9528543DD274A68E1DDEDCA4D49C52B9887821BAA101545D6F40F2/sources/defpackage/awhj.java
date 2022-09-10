package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: awhj  reason: default package */
/* loaded from: classes3.dex */
public class awhj extends Shape {
    public final List<awed> a;
    private final awhh b;
    private final long c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final awhi g;
    private final float h;
    @dzsi
    private RectF i;

    public awhj(awhh awhhVar, long j, Context context, awhi awhiVar) {
        cqrp d = cqrp.d(dcyn.a);
        this.a = new ArrayList();
        this.i = null;
        this.b = awhhVar;
        this.c = j;
        this.g = awhiVar;
        float e = d.e(context);
        this.h = e;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(e);
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(context.getResources().getColor(R.color.primary_grey));
        paint.setAlpha(191);
        paint.setStyle(Paint.Style.FILL);
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setColor(ibm.x().b(context));
        paint2.setStrokeWidth(cqrp.d(5.0d).e(context));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(cornerPathEffect);
        Paint paint3 = new Paint();
        this.f = paint3;
        paint3.setColor(context.getResources().getColor(R.color.primary_grey));
        paint3.setAlpha(102);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setPathEffect(cornerPathEffect);
    }

    @dzsi
    public final akqs a(akpm akpmVar) {
        RectF rectF = this.i;
        akqs akqsVar = null;
        if (rectF != null && rectF.width() != 0.0f && rectF.height() != 0.0f) {
            Point point = new Point((int) rectF.right, (int) rectF.top);
            Point point2 = new Point((int) rectF.left, (int) rectF.bottom);
            alrh ak = akpmVar.ak();
            dbsk.s(ak);
            akqq a = ak.a(point);
            akqq a2 = ak.a(point2);
            if (a != null && a2 != null) {
                double d = a.a;
                double d2 = a2.a;
                if (d >= d2) {
                    akqsVar = new akqs(a2, a);
                } else {
                    akqsVar = new akqs(new akqq(d, a2.b), new akqq(d2, a.b));
                }
                double d3 = this.c;
                Double.isNaN(d3);
                double d4 = d3 * 0.99999d;
                double g = akqsVar.g() * 6371010.0d * 6371010.0d;
                if (g > d4) {
                    double d5 = d4 / g;
                    double g2 = akqo.g(akqsVar.a.b, akqsVar.b.b);
                    double sqrt = Math.sqrt(d5);
                    double g3 = akqsVar.g();
                    double radians = Math.toRadians(g2);
                    double sqrt2 = Math.sqrt(d5);
                    double cos = Math.cos(Math.toRadians(akqsVar.c().a));
                    double degrees = Math.toDegrees(Math.asin(((g3 / radians) * sqrt2) / (cos + cos)));
                    return new akqs(akqsVar.c(), degrees + degrees, g2 * sqrt);
                }
            }
        }
        return akqsVar;
    }

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Path path = new Path();
        float f = this.h;
        float f2 = -f;
        path.addRect(f2, f2, width + f, height + f, Path.Direction.CCW);
        RectF b = this.g.b(width, height, this.b.d, this.c);
        this.i = b;
        path.addRect(b, Path.Direction.CW);
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, this.d);
        for (awed awedVar : this.a) {
            awfc awfcVar = awedVar.a;
            if (awfcVar.g) {
                canvas.drawRect(b.left, b.top, b.right, b.bottom, awfcVar.e);
                int width2 = canvas.getWidth() / 2;
                float height2 = canvas.getHeight() / 2;
                canvas.drawCircle(awfcVar.j + width2, height2, Math.min(80.0f, canvas.getHeight() * 0.07f), awfcVar.d);
                canvas.save();
                canvas.translate(width2, height2 - (canvas.getHeight() * 0.16f));
                awfcVar.f.draw(canvas);
                canvas.restore();
            }
        }
        canvas.drawRect(b.left, b.top, b.right, b.bottom, this.e);
    }
}
