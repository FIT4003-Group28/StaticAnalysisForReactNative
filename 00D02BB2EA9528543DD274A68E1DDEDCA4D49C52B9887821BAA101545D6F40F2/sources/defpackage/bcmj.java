package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcmj  reason: default package */
/* loaded from: classes3.dex */
public class bcmj implements bclr {
    public final bvpe a;
    public final bckt b;
    private final bclc c;
    private final List<bclt> d;
    private final bcku e;
    @dzsi
    private final ilo f;
    @dzsi
    private View.OnAttachStateChangeListener g = null;

    public bcmj(List<bclt> list, bcku bckuVar, bckr bckrVar, @dzsi ilo iloVar, bvpe bvpeVar, bckt bcktVar, Activity activity, bcld bcldVar) {
        this.e = bckuVar;
        this.a = bvpeVar;
        this.b = bcktVar;
        this.c = bcldVar.a(bckrVar);
        dccx dccxVar = new dccx();
        for (bclt bcltVar : list) {
            jic c = bcltVar.c();
            if (c != null && c.a != null) {
                dccxVar.g(bcltVar);
            }
        }
        this.d = dccxVar.f();
        this.f = iloVar;
    }

    @Override // defpackage.izf
    public List<abpx> Pd() {
        return this.d;
    }

    @Override // defpackage.abpz
    public View.OnAttachStateChangeListener b() {
        if (this.g == null) {
            this.g = new bcmi(this);
        }
        return this.g;
    }

    @Override // defpackage.abpz
    public cjtd c() {
        return this.e.b(this.f);
    }

    @Override // defpackage.bclr
    public List<bclt> d() {
        return this.d;
    }

    @Override // defpackage.bclr
    public Boolean e() {
        boolean z = false;
        if (this.f == null) {
            return false;
        }
        if (this.d.size() > 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bclr
    public Integer f() {
        return this.c.a();
    }

    @Override // defpackage.bclr
    public Integer g() {
        bclc bclcVar = this.c;
        double d = bclcVar.b;
        double d2 = bclcVar.c;
        double c = bclcVar.c();
        Double.isNaN(d2);
        Double.isNaN(d);
        return Integer.valueOf((int) (d + (d2 * c)));
    }

    @Override // defpackage.bclr
    public Integer h() {
        return this.c.b();
    }

    @Override // defpackage.bclr
    public Integer i() {
        return Integer.valueOf(f().intValue() + g().intValue() + h().intValue());
    }

    @Override // defpackage.bclr
    public Integer j() {
        return Integer.valueOf(this.c.d);
    }

    @Override // defpackage.bclr
    public Integer k() {
        return Integer.valueOf(this.c.e);
    }

    @Override // defpackage.bclr
    public Boolean l() {
        return Boolean.valueOf(deav.c(this.c.c(), dcyn.a, 0.01d));
    }
}
