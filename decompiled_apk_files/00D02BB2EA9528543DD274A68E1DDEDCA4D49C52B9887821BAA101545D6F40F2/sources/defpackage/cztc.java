package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: cztc  reason: default package */
/* loaded from: classes5.dex */
public final class cztc implements czsy {
    private static final cxog<Paint> a = new cxog<>();
    private static final Rect b = new Rect();
    private final int c = -1;
    private CharSequence d;
    private int e;
    private final cztg f;

    public cztc(cztg cztgVar) {
        this.f = cztgVar;
        this.d = cztgVar.b(null);
        this.e = cztgVar.a(null);
    }

    public static final /* synthetic */ Paint d() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        return paint;
    }

    @Override // defpackage.czsy
    public final void a(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float min = Math.min(height, width);
        cxog<Paint> cxogVar = a;
        Paint a2 = cxogVar.a();
        synchronized (cxogVar) {
            a2.setColor(this.e);
            float f = width / 2;
            float f2 = height / 2;
            canvas.drawCircle(f, f2, min / 2.0f, a2);
            if (this.d != null) {
                a2.setColor(-1);
                a2.setTextSize(min * 0.47f);
                String charSequence = this.d.toString();
                int length = this.d.length();
                Rect rect = b;
                a2.getTextBounds(charSequence, 0, length, rect);
                CharSequence charSequence2 = this.d;
                canvas.drawText(charSequence2, 0, charSequence2.length(), f, f2 - rect.exactCenterY(), a2);
            }
        }
    }

    @Override // defpackage.czsy
    public final void b(@dzsi String str) {
        this.e = this.f.a(str);
    }

    @Override // defpackage.czsy
    public final void c(@dzsi cztb cztbVar) {
        this.d = this.f.b(cztbVar);
    }
}
