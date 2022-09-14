package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: ghl  reason: default package */
/* loaded from: classes6.dex */
public final class ghl {
    public final dxio<akzh> a;
    public final akox b;
    public final gll c;
    public final Resources d;
    private final hwe g;
    private final iqr h;
    public int f = 1;
    public int e = 500;

    public ghl(dxio<akzh> dxioVar, akox akoxVar, hwe hweVar, gll gllVar, Resources resources, iqr iqrVar) {
        this.a = dxioVar;
        this.b = akoxVar;
        this.g = hweVar;
        this.c = gllVar;
        this.d = resources;
        this.h = iqrVar;
    }

    public static float h(Rect rect, Resources resources, akra akraVar, akra akraVar2, float f, akzh akzhVar, float[] fArr) {
        if (!akyx.o(akzhVar, akraVar, fArr)) {
            return f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = resources.getDisplayMetrics().density;
        int i = (int) (50.0f * f4);
        int i2 = (int) (f4 * 5.0f);
        if (!akyx.o(akzhVar, akraVar2, fArr)) {
            return f;
        }
        float f5 = fArr[0];
        float f6 = fArr[1];
        float abs = Math.abs(f5 - f2);
        float abs2 = Math.abs(f6 - f3);
        float width = abs / (rect.width() - (i + i));
        float height = abs2 / (rect.height() - (i2 + i2));
        float max = Math.max(width + width, height + height);
        if (max <= 0.0f) {
            max = 0.0f;
        }
        return f + ((float) ((-Math.log(max)) / Math.log(2.0d)));
    }

    @dzsi
    private final Point i(akqq akqqVar) {
        alrh ak = this.b.ak();
        if (ak == null) {
            return null;
        }
        return ak.b(akqqVar);
    }

    private final Rect j() {
        float f = this.d.getDisplayMetrics().density;
        float f2 = 5.0f * f;
        int i = (int) f2;
        return new Rect((int) (-f2), (int) (-(f * 25.0f)), i, i);
    }

    public final void a(akqq akqqVar, @dzsi Rect rect) {
        Point point;
        if (this.f != 2 || !f(akqqVar)) {
            akzh b = this.a.a().b();
            if (rect == null) {
                if (this.f == 2) {
                    rect = g();
                } else {
                    rect = this.c.d();
                }
            }
            Rect rect2 = rect;
            Point i = i(akqqVar);
            if (this.f == 2 && i != null) {
                Point point2 = new Point(i);
                if (i.x < rect2.left) {
                    point2.x = rect2.left;
                } else if (i.x > rect2.right) {
                    point2.x = rect2.right;
                }
                if (i.y < rect2.top) {
                    point2.y = rect2.top;
                } else if (i.y > rect2.bottom) {
                    point2.y = rect2.bottom;
                }
                point = point2;
            } else {
                point = new Point(rect2.centerX(), rect2.centerY());
            }
            alao.e(this.b, b, akqqVar, j(), rect2, point, b.p().k, this.e, null);
        }
    }

    public final void b(akqq akqqVar, akqq akqqVar2, @dzsi akzt akztVar) {
        if (this.f == 2 && f(akqqVar)) {
            if (f(akqqVar2)) {
                return;
            }
        }
        akzh b = this.a.a().b();
        float f = b.p().k;
        float h = h(this.c.e(), this.d, akra.f(akqqVar2), akra.f(akqqVar), f, b, new float[8]);
        akox akoxVar = this.b;
        Rect j = j();
        Rect d = this.c.d();
        int i = this.e;
        if (!alao.f(akoxVar, b, akqqVar, j, d, f, i, akztVar)) {
            akyc b2 = akyt.b(h);
            b2.b = i;
            akoxVar.q(b2, akztVar);
            akzh h2 = alao.h(akoxVar, b);
            int[] n = akyx.n(h2, akqg.a(akqqVar));
            if (n == null) {
                return;
            }
            Rect rect = new Rect(j);
            rect.offset(n[0], n[1]);
            if (d.contains(rect)) {
                return;
            }
            alao.g(akoxVar, h2, rect, d, i, akztVar);
        }
    }

    public final void c(ilo iloVar) {
        akqq aj = iloVar.aj();
        if (aj == null) {
            return;
        }
        a(aj, null);
    }

    public final void d(dhjx dhjxVar, akqq akqqVar) {
        if (this.f != 2 || !f(akqqVar)) {
            if (alao.j(this.b, this.a.a().b(), j(), this.c.d(), dhjxVar, akqqVar, this.e)) {
                return;
            }
            int i = this.f;
            this.f = 2;
            a(akqqVar, this.c.d());
            this.f = i;
        }
    }

    public final void e(ilo iloVar) {
        akqq aj = iloVar.aj();
        if (!iloVar.ap() || !iloVar.n) {
            this.h.b();
            if (aj == null || iloVar.bc()) {
                this.g.c();
                return;
            } else {
                this.g.a(iloVar.ai(), akra.f(aj));
                return;
            }
        }
        this.g.c();
        this.h.a(iloVar);
    }

    public final boolean f(akqq akqqVar) {
        Point i = i(akqqVar);
        if (i == null) {
            return false;
        }
        Rect g = g();
        return i.x > g.left && i.x < g.right && i.y < g.bottom && i.y > g.top;
    }

    protected final Rect g() {
        Rect e = this.c.e();
        e.bottom += jmj.c(this.d, 25);
        e.top += jmj.c(this.d, 5);
        return e;
    }
}
