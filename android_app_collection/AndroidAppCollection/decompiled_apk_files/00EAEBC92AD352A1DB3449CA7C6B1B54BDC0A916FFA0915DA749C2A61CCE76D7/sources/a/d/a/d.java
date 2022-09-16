package a.d.a;

import a.d.a.h;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/* loaded from: classes.dex */
class d implements f {

    /* renamed from: a  reason: collision with root package name */
    final RectF f103a = new RectF();

    /* loaded from: classes.dex */
    class a implements h.a {
        a() {
        }

        @Override // a.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float width = (rectF.width() - f3) - 1.0f;
            float height = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                d.this.f103a.set(f5, f5, f4, f4);
                int save = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(d.this.f103a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f103a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f103a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f103a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f6 = rectF.top;
                canvas.drawRect((rectF.left + f4) - 1.0f, f6, (rectF.right - f4) + 1.0f, f6 + f4, paint);
                float f7 = rectF.bottom;
                canvas.drawRect((rectF.left + f4) - 1.0f, f7 - f4, (rectF.right - f4) + 1.0f, f7, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    private h j(e eVar) {
        return (h) eVar.d();
    }

    @Override // a.d.a.f
    public float a(e eVar) {
        return j(eVar).c();
    }

    @Override // a.d.a.f
    public void a() {
        h.r = new a();
    }

    @Override // a.d.a.f
    public void a(e eVar, float f2) {
        j(eVar).a(f2);
        i(eVar);
    }

    @Override // a.d.a.f
    public void a(e eVar, ColorStateList colorStateList) {
        j(eVar).a(colorStateList);
    }

    @Override // a.d.a.f
    public ColorStateList b(e eVar) {
        return j(eVar).a();
    }

    @Override // a.d.a.f
    public void b(e eVar, float f2) {
        j(eVar).c(f2);
    }

    @Override // a.d.a.f
    public float c(e eVar) {
        return j(eVar).f();
    }

    @Override // a.d.a.f
    public void c(e eVar, float f2) {
        j(eVar).b(f2);
        i(eVar);
    }

    @Override // a.d.a.f
    public float d(e eVar) {
        return j(eVar).b();
    }

    @Override // a.d.a.f
    public float e(e eVar) {
        return j(eVar).d();
    }

    @Override // a.d.a.f
    public float f(e eVar) {
        return j(eVar).e();
    }

    @Override // a.d.a.f
    public void g(e eVar) {
    }

    @Override // a.d.a.f
    public void h(e eVar) {
        j(eVar).a(eVar.b());
        i(eVar);
    }

    public void i(e eVar) {
        Rect rect = new Rect();
        j(eVar).a(rect);
        eVar.a((int) Math.ceil(f(eVar)), (int) Math.ceil(e(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
