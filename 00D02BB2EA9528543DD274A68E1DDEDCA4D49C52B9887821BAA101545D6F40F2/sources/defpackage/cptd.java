package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: cptd  reason: default package */
/* loaded from: classes5.dex */
public final class cptd implements cptg {
    public Paint a;
    public Paint b;
    private Paint c;

    public static final void c(cprf<?, ?> cprfVar) {
        cprfVar.h = 3;
        cppw cppwVar = new cppw(-1, -2, (byte) 16, -10);
        cppwVar.c();
        cprfVar.setLayoutParams(cppwVar);
    }

    public static final void d(cprf<?, ?> cprfVar) {
        cprfVar.h = 4;
        cppw cppwVar = new cppw(-2, -1, (byte) 1, -10);
        cppwVar.c();
        cprfVar.setLayoutParams(cppwVar);
    }

    @Override // defpackage.cptg
    public final float a(int i) {
        return i > 1 ? 0.7f : 0.65f;
    }

    @Override // defpackage.cptg
    public final Paint b() {
        if (this.c == null) {
            Paint paint = new Paint();
            this.c = paint;
            paint.setColor(Color.parseColor("#EFEFEF"));
            this.c.setStrokeWidth(cpqk.a(null, 1.0f));
        }
        return this.c;
    }
}
