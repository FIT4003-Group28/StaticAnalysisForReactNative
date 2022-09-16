package defpackage;

import android.content.Context;
import android.view.View;
import defpackage.cptj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cptj  reason: default package */
/* loaded from: classes5.dex */
public abstract class cptj<T, D, TC extends cptj<T, D, TC>> extends View implements cppu, cpta {
    public final cpty a;
    public cpsn b;
    public cptp<T, D> c;
    public cptu d;
    public boolean e;
    private cpny<T, D, ?> f;
    private final cppq g;

    /* JADX INFO: Access modifiers changed from: protected */
    public cptj(Context context) {
        super(context);
        this.b = cpsn.a;
        this.g = new cpti(this);
        this.e = false;
        cppw cppwVar = new cppw(-1, (byte) 2);
        cppwVar.d();
        setLayoutParams(cppwVar);
        this.a = new cpty(context);
        this.c = new cptv(context);
        this.d = new cptw();
    }

    @Override // defpackage.cppu
    public final void a(cpoj<T, D> cpojVar) {
        cpwl.c(cpojVar instanceof cpny, "Touch Card behavior can only be used on cartesian charts");
        if (this.f == cpojVar) {
            return;
        }
        this.f = (cpny) cpojVar;
        cpojVar.h(this);
        cpojVar.t(this.g);
        cpojVar.q(this);
        e(this.f);
    }

    @Override // defpackage.cppu
    public final void b(cpoj<T, D> cpojVar) {
        if (this.f != cpojVar) {
            return;
        }
        cpojVar.removeView(this);
        cpojVar.u(this.g);
        cpojVar.j(this);
        h().a();
        f(this.f);
        this.f = null;
    }

    @Override // defpackage.cpta
    public void c(cpoj<T, D> cpojVar) {
    }

    @Override // defpackage.cpta
    public void d() {
    }

    protected void e(cpny<T, D, ?> cpnyVar) {
    }

    protected void f(cpny<T, D, ?> cpnyVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [cpve] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void g(List<cpot> list, cptb<T, D> cptbVar) {
        double doubleValue;
        float f;
        if (!cptbVar.f() || list.isEmpty()) {
            h().a();
            return;
        }
        ArrayList a = cpwi.a();
        Iterator<cpot> it = list.iterator();
        double d = -1.7976931348623157E308d;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            cpot next = it.next();
            cpvi<T, D> cpviVar = next.a;
            cpsk<D> cpskVar = next.e;
            cpsk<Double> cpskVar2 = next.d;
            cpve d2 = cpviVar.d(cpvf.a);
            cpve e = cpviVar.e(cpvf.b, Double.valueOf((double) dcyn.a));
            cpve<T, D> a2 = next.a();
            int i = -1;
            for (T t : cpviVar.e) {
                Iterator<cpot> it2 = it;
                int i2 = i + 1;
                D a3 = a2.a(t, i2, cpviVar);
                float f4 = f2;
                Double d3 = (Double) d2.a(t, i2, cpviVar);
                Double d4 = (Double) e.a(t, i2, cpviVar);
                if (d4 == null) {
                    f = f3;
                    doubleValue = dcyn.a;
                } else {
                    doubleValue = d4.doubleValue();
                    f = f3;
                }
                Double valueOf = Double.valueOf(doubleValue);
                if (d3 == null || Double.isNaN(d3.doubleValue())) {
                    f3 = f;
                    f2 = f4;
                    a2 = a2;
                    e = e;
                    i = i2;
                    it = it2;
                } else {
                    Object obj = a2;
                    cpve cpveVar = e;
                    if (cptbVar.h(cpviVar, a3) == 1) {
                        a.add(new cpto(cpviVar.f, a3, d3, ((Integer) cpviVar.d(cpvf.e).a(t, i2, cpviVar)).intValue()));
                        float a4 = this.b.a(cpskVar, a3);
                        if (d < d3.doubleValue() + valueOf.doubleValue()) {
                            d = d3.doubleValue() + valueOf.doubleValue();
                            f2 = cpskVar2.r(d3, valueOf);
                            f3 = a4;
                            i = i2;
                            it = it2;
                            a2 = obj;
                            e = cpveVar;
                        } else {
                            f3 = a4;
                        }
                    } else {
                        f3 = f;
                    }
                    f2 = f4;
                    i = i2;
                    it = it2;
                    a2 = obj;
                    e = cpveVar;
                }
            }
        }
        if (a.isEmpty()) {
            h().a();
            return;
        }
        boolean z = this.f.a;
        float f5 = true != z ? f3 : f2;
        if (true == z) {
            f2 = f3;
        }
        View a5 = this.c.a(a);
        if (a5 == null) {
            h().a();
            return;
        }
        h().setContent(a5);
        a5.requestLayout();
        post(new cpth(this, f2, f5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cpts h();
}
