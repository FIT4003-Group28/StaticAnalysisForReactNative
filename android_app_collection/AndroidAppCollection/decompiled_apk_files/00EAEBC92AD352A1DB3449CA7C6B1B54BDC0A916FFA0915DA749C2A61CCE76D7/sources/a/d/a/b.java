package a.d.a;

import a.d.a.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
/* loaded from: classes.dex */
class b extends d {

    /* loaded from: classes.dex */
    class a implements h.a {
        a(b bVar) {
        }

        @Override // a.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    @Override // a.d.a.d, a.d.a.f
    public void a() {
        h.r = new a(this);
    }
}
