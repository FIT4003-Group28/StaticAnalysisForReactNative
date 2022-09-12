package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aegl  reason: default package */
/* loaded from: classes.dex */
public final class aegl {
    private static final dcqe c = dcqe.c("aegl");
    public final acyu a;
    public dbsg<aegg> b;
    private final aegj d;
    private final acyt e;
    private dcdc<aegg> f;
    private final aegk g;

    public aegl(acyu acyuVar, aegj aegjVar) {
        aegk aegkVar = new aegk(acyuVar.o().getContext());
        this.e = new aegi(this);
        this.f = dcdc.e();
        this.b = dbpy.a;
        this.a = acyuVar;
        this.d = aegjVar;
        this.g = aegkVar;
    }

    private final dbsg<aegg> d(final int i) {
        if (this.f.isEmpty()) {
            return dbpy.a;
        }
        return dbsg.i((aegg) Collections.min(this.f, new Comparator(this, i) { // from class: aegh
            private final aegl a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                aegl aeglVar = this.a;
                int i2 = this.b;
                return Math.abs(((aegg) obj).a(aeglVar.a) - i2) - Math.abs(((aegg) obj2).a(aeglVar.a) - i2);
            }
        }));
    }

    public final void a(@dzsi List<aegg> list) {
        dcdc<aegg> e = list == null ? dcdc.e() : dcdc.r(list);
        this.f = e;
        if (e.isEmpty()) {
            this.a.m(this.e);
        } else {
            this.a.l(this.e);
        }
        if (!this.b.a() || !this.f.contains(this.b.b())) {
            this.b = d(this.a.c());
        }
    }

    public final boolean b(float f) {
        int finalY;
        TimeInterpolator decelerateInterpolator;
        if (!this.f.isEmpty() && this.a.c() < this.a.w()) {
            aegk aegkVar = this.g;
            if (f == 0.0f) {
                finalY = 0;
            } else {
                Scroller scroller = new Scroller(aegkVar.a);
                scroller.fling(0, 0, 0, Math.round(f), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                finalY = scroller.getFinalY();
            }
            int i = -finalY;
            dbsg<aegg> d = d(this.a.c() + i);
            if (!d.a()) {
                bvoo.h("Unable to calculate target snap point.", new Object[0]);
                return false;
            }
            int a = d.b().a(this.a);
            int c2 = a - this.a.c();
            aegj aegjVar = this.d;
            if (f == 0.0f) {
                decelerateInterpolator = irf.a;
            } else {
                int abs = Math.abs(i);
                int abs2 = Math.abs(c2);
                float f2 = 1.0f;
                if (abs > abs2 && abs2 != 0) {
                    f2 = abs / abs2;
                }
                decelerateInterpolator = new DecelerateInterpolator(f2);
            }
            aegjVar.a(a, decelerateInterpolator);
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = d(this.a.c());
    }
}
