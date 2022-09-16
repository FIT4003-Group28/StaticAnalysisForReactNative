package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: zym  reason: default package */
/* loaded from: classes4.dex */
public final class zym {
    public final zyl a = new zyl();
    public final StringBuilder b = new StringBuilder();
    public final Paint c;
    public int d;
    public int e;
    public final aakx f;
    private final Path g;

    public zym() {
        Paint paint = new Paint();
        this.c = paint;
        this.g = new Path();
        this.f = new aakx();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public static float a(EditText editText) {
        return editText.getTextSize() * 0.2f;
    }

    private static float c(EditText editText, int i) {
        return editText.getLayout().getLineBottom(i) + editText.getPaddingTop();
    }

    private static float d(EditText editText, int i) {
        return editText.getLayout().getLineTop(i) + editText.getPaddingTop();
    }

    public final Path b(EditText editText, int i, int i2) {
        this.g.reset();
        ampq a = this.a.a(i);
        if (a.h()) {
            this.g.moveTo(((zyk) a.c()).b, d(editText, i));
        }
        for (int i3 = i; i3 <= i2; i3++) {
            ampq a2 = this.a.a(i3);
            if (a2.h()) {
                this.g.lineTo(((zyk) a2.c()).c, d(editText, i3));
                this.g.lineTo(((zyk) a2.c()).c, c(editText, i3));
            }
        }
        while (i2 >= i) {
            ampq a3 = this.a.a(i2);
            if (a3.h()) {
                this.g.lineTo(((zyk) a3.c()).b, c(editText, i2));
                this.g.lineTo(((zyk) a3.c()).b, d(editText, i2));
            }
            i2--;
        }
        this.g.close();
        return this.g;
    }
}
