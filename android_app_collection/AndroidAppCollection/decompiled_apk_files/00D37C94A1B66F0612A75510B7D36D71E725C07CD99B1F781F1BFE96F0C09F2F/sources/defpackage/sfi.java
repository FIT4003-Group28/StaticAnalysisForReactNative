package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sfi  reason: default package */
/* loaded from: classes4.dex */
public abstract class sfi extends View implements sbw, sez {
    public final sfr a;
    public sab b;
    public sfk c;
    public boolean d;
    public sfo e;
    private final ses f;
    private final sbs g;

    /* JADX INFO: Access modifiers changed from: protected */
    public sfi(Context context) {
        super(context);
        this.f = ses.a;
        this.g = new sfh(this);
        this.d = false;
        sby sbyVar = new sby();
        sbyVar.d();
        setLayoutParams(sbyVar);
        this.a = new sfr(context);
        this.c = new sfn(context);
        this.e = new sfo();
    }

    @Override // defpackage.sez
    public void a(sai saiVar) {
        throw null;
    }

    @Override // defpackage.sbw
    public final void b(sai saiVar) {
        sho.a(saiVar instanceof sab, "Touch Card behavior can only be used on cartesian charts");
        if (this.b == saiVar) {
            return;
        }
        this.b = (sab) saiVar;
        saiVar.m(this);
        saiVar.y(this.g);
        saiVar.v(this);
    }

    @Override // defpackage.sbw
    public final void c(sai saiVar) {
        if (this.b != saiVar) {
            return;
        }
        saiVar.removeView(this);
        saiVar.z(this.g);
        saiVar.o(this);
        f().b();
        this.b = null;
    }

    @Override // defpackage.sez
    public void d(sai saiVar) {
    }

    public final void e(List list, sfa sfaVar) {
        double doubleValue;
        float f;
        if (!sfaVar.e() || list.isEmpty()) {
            f().b();
            return;
        }
        ArrayList d = sbv.d();
        Iterator it = list.iterator();
        double d2 = -1.7976931348623157E308d;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            sat satVar = (sat) it.next();
            sgt sgtVar = satVar.a;
            sep sepVar = satVar.d;
            sep sepVar2 = satVar.c;
            sgp c = sgtVar.c(sgq.a);
            sgp d3 = sgtVar.d(sgq.b, Double.valueOf(0.0d));
            sgp c2 = satVar.c();
            int i = -1;
            for (Object obj : sgtVar.a) {
                Iterator it2 = it;
                int i2 = i + 1;
                Object a = c2.a(obj, i2, sgtVar);
                float f4 = f2;
                Double d4 = (Double) c.a(obj, i2, sgtVar);
                Double d5 = (Double) d3.a(obj, i2, sgtVar);
                if (d5 == null) {
                    f = f3;
                    doubleValue = 0.0d;
                } else {
                    doubleValue = d5.doubleValue();
                    f = f3;
                }
                Double valueOf = Double.valueOf(doubleValue);
                if (d4 == null || Double.isNaN(d4.doubleValue())) {
                    f3 = f;
                    f2 = f4;
                    c2 = c2;
                    d3 = d3;
                    i = i2;
                    it = it2;
                } else {
                    sgp sgpVar = c2;
                    sgp sgpVar2 = d3;
                    if (sfaVar.f(sgtVar, a) == 1) {
                        d.add(new sfj(sgtVar.b, i2, a, d4, ((Integer) sgtVar.c(sgq.e).a(obj, i2, sgtVar)).intValue()));
                        float a2 = this.f.a(sepVar, a);
                        if (d2 < d4.doubleValue() + valueOf.doubleValue()) {
                            d2 = d4.doubleValue() + valueOf.doubleValue();
                            f2 = sepVar2.b(d4, valueOf);
                            f3 = a2;
                            i = i2;
                            it = it2;
                            c2 = sgpVar;
                            d3 = sgpVar2;
                        } else {
                            f3 = a2;
                        }
                    } else {
                        f3 = f;
                    }
                    f2 = f4;
                    i = i2;
                    it = it2;
                    c2 = sgpVar;
                    d3 = sgpVar2;
                }
            }
        }
        if (d.isEmpty()) {
            f().b();
            return;
        }
        boolean z = this.b.c;
        float f5 = true != z ? f3 : f2;
        if (true == z) {
            f2 = f3;
        }
        View a3 = this.c.a(d);
        sfu f6 = f();
        f6.b.removeAllViews();
        f6.b.addView(a3);
        a3.requestLayout();
        post(new sfg(this, f2, f5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract sfu f();
}
