package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: sfc  reason: default package */
/* loaded from: classes4.dex */
public final class sfc {
    public Paint a;
    public Paint b;
    private Paint c;

    public static final void b(scz sczVar) {
        sczVar.e = 3;
        sby sbyVar = new sby(-1, -2, (byte) 16, -10);
        sbyVar.c();
        sczVar.setLayoutParams(sbyVar);
    }

    public static final void c(scz sczVar) {
        sczVar.e = 4;
        sby sbyVar = new sby(-2, -1, (byte) 1, -10);
        sbyVar.c();
        sczVar.setLayoutParams(sbyVar);
    }

    public static final sej d() {
        return new sej(sei.a);
    }

    public static final float e(int i) {
        return i > 1 ? 0.7f : 0.65f;
    }

    public final Paint a() {
        if (this.c == null) {
            Paint paint = new Paint();
            this.c = paint;
            paint.setColor(Color.parseColor("#EFEFEF"));
            this.c.setStrokeWidth(scf.b(null, 1.0f));
        }
        return this.c;
    }
}
