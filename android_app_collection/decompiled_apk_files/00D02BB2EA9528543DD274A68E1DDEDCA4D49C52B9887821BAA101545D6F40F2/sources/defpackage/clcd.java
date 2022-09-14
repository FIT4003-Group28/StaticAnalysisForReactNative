package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.viewer.client.Dimensions;
/* compiled from: PG */
/* renamed from: clcd  reason: default package */
/* loaded from: classes5.dex */
public final class clcd extends View {
    public static final Point a = new Point();
    private static final Matrix d = new Matrix();
    final clbs b;
    public Bitmap c;
    private final Dimensions e;
    private final Rect f;

    public clcd(Context context, clbs clbsVar) {
        super(context);
        Dimensions dimensions;
        if (clbsVar.a >= clbsVar.c.b() - 1 || clbsVar.b >= clbsVar.c.e - 1) {
            Point c = clbsVar.c();
            dimensions = new Dimensions(Math.min(clbu.a.a, clbsVar.c.d.a - c.x), Math.min(clbu.a.b, clbsVar.c.d.b - c.y));
        } else {
            dimensions = clbu.a;
        }
        this.e = dimensions;
        this.f = new Rect(0, 0, dimensions.a, dimensions.b);
        this.b = clbsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        clbs clbsVar = this.b;
        return clbsVar != null ? clbsVar.toString() : "TileView - empty";
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, d, null);
        } else {
            clcb clcbVar = (clcb) getParent();
            Point c = this.b.c();
            Rect rect = this.f;
            if (clcbVar.e != null && !clba.d) {
                Rect rect2 = new Rect(rect);
                rect2.offset(c.x, c.y);
                float width = clcbVar.e.getWidth() / clcbVar.h;
                clbm.b(rect2, width, width);
                canvas.drawBitmap(clcbVar.e, rect2, rect, (Paint) null);
            }
        }
        if (clba.a) {
            Dimensions dimensions = this.e;
            int i = dimensions.a;
            int i2 = dimensions.b;
            Rect rect3 = new Rect(0, 0, i, i2);
            rect3.inset(20, 20);
            canvas.drawText(a(), i / 2, (i2 / 2) - 10, clcb.a);
            canvas.drawRect(rect3, clcb.a);
            float f = i;
            float f2 = i2;
            canvas.drawLine(0.0f, 0.0f, f, f2, clcb.a);
            canvas.drawLine(0.0f, f2, f, 0.0f, clcb.a);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
