package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cprl  reason: default package */
/* loaded from: classes5.dex */
public final class cprl extends cprf<Double, cpsg> {
    public cprj i;

    public cprl(Context context, AttributeSet attributeSet) {
        super(context, cpsm.a());
        j(new cpsg());
        this.e = new cprm();
        this.f = new cpri(true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @Override // defpackage.cprf
    protected final cpsf<Double> c() {
        cpsg cpsgVar = (cpsg) this.a;
        cprj cprjVar = this.i;
        if (cprjVar == null) {
            return cpsgVar.h();
        }
        cpsf<Double> h = cpsgVar.h();
        cpsgVar.f();
        h.b(cprjVar.a, cprjVar.b);
        return h;
    }

    @Override // defpackage.cprf
    protected final boolean e() {
        return this.i == null && ((cpsg) this.a).a();
    }

    @Override // defpackage.cprf
    protected final void h(List<cprt<Double>> list) {
        cpsg cpsgVar = (cpsg) this.a;
        if (this.i != null) {
            cpsgVar.g(c());
        } else if (!cpsgVar.a() || list.size() < 2) {
        } else {
            Iterator<cprt<Double>> it = list.iterator();
            double doubleValue = it.next().a.doubleValue();
            double d = doubleValue;
            while (it.hasNext()) {
                double doubleValue2 = it.next().a.doubleValue();
                if (doubleValue2 > d) {
                    d = doubleValue2;
                } else if (doubleValue2 < doubleValue) {
                    doubleValue = doubleValue2;
                }
            }
            cpsf<Double> h = ((cpsg) this.a).h();
            cpsgVar.g(new cpsf<>(Double.valueOf(Math.min(h.a.doubleValue(), doubleValue)), Double.valueOf(Math.max(h.b.doubleValue(), d))));
        }
    }

    public void setAutoAdjustViewportToNiceValues(boolean z) {
        ((cpsg) this.a).a.b = z;
    }

    public void setMaxViewportExtents(cpsf<Double> cpsfVar) {
        ((cpsg) this.a).b.a = cpsfVar;
    }

    @Override // defpackage.cprf
    public void setViewportConfig(float f, float f2) {
        ((cpsg) this.a).b(true);
        super.setViewportConfig(f, f2);
    }

    public void setViewportExtent(cpsf<Double> cpsfVar) {
        cpsg cpsgVar = (cpsg) this.a;
        cpsgVar.b(cpsfVar != null);
        cpsgVar.g(cpsfVar);
    }
}
