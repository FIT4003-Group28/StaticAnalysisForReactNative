package defpackage;

import android.view.View;
import j$.util.function.Function;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: nij  reason: default package */
/* loaded from: classes3.dex */
public final class nij implements fsu, zdx, agby {
    public final List a = new ArrayList();
    public final agbz b;
    private final akfb c;
    private final ajxz d;
    private final ajsk e;
    private final acti f;
    private final String g;
    private fsv h;

    public nij(akfb akfbVar, ajxz ajxzVar, agbz agbzVar, ajsk ajskVar, acti actiVar, String str) {
        this.c = akfbVar;
        this.d = ajxzVar;
        this.b = agbzVar;
        this.e = ajskVar;
        this.f = actiVar;
        this.g = str;
    }

    private final CharSequence p(String str, boolean z) {
        if (z) {
            try {
                return String.format(this.g, str);
            } catch (IllegalFormatException e) {
                zep.d("Tab's description cannot be generated due to a formatting error.", e);
            }
        }
        return str;
    }

    public final int a() {
        fsv fsvVar = this.h;
        if (fsvVar == null) {
            return -1;
        }
        return fsvVar.a();
    }

    @Override // defpackage.fsu
    public final void b(int i, boolean z) {
        if (i >= this.a.size() || i < 0) {
            return;
        }
        nii niiVar = (nii) this.a.get(i);
        niiVar.c.c();
        lsv lsvVar = niiVar.d;
        if (lsvVar != null) {
            lsvVar.o();
        }
        this.b.d(niiVar.a.c);
        if (z) {
            return;
        }
        avfo avfoVar = niiVar.a;
        if ((avfoVar.b & 524288) == 0) {
            return;
        }
        this.f.H(3, new acte(avfoVar.n.I()), null);
    }

    @Override // defpackage.fsu
    public final boolean d(int i) {
        if (i < 0 || i >= this.a.size()) {
            return true;
        }
        ((nii) this.a.get(i)).c.D();
        return true;
    }

    @Override // defpackage.fsu
    public final void e(float f) {
    }

    public final ajzq f() {
        return (ajzq) h(meg.o);
    }

    public final avfo g() {
        return (avfo) h(meg.n);
    }

    public final Object h(Function function) {
        int a = a();
        if (a < 0 || a >= this.a.size()) {
            return null;
        }
        return function.apply(this.a.get(a));
    }

    public final List i() {
        return amuk.o(this.a);
    }

    @Override // defpackage.zdx
    public final void j() {
        k();
        fsv fsvVar = this.h;
        if (fsvVar != null) {
            fsvVar.g(this);
        }
    }

    public final void k() {
        for (nii niiVar : this.a) {
            niiVar.c.j();
        }
        this.a.clear();
        fsv fsvVar = this.h;
        if (fsvVar != null) {
            fsvVar.f();
        }
    }

    @Override // defpackage.agby
    public final void l(String str) {
    }

    public final void m(fsv fsvVar, List list, int i) {
        View c;
        this.h = fsvVar;
        fsvVar.e(this);
        this.a.clear();
        this.a.addAll(list);
        for (nii niiVar : this.a) {
            fqp fqpVar = new fqp(niiVar.c.f60J);
            fss fssVar = new fss();
            fssVar.a = niiVar.b;
            if (fssVar.b == null) {
                fssVar.b = new LinkedList();
            }
            fssVar.b.add(fqpVar);
            avfo avfoVar = niiVar.a;
            avfp avfpVar = avfoVar.h;
            if (avfpVar == null) {
                avfpVar = avfp.a;
            }
            int aw = awwc.aw(avfpVar.b);
            boolean z = true;
            if ((aw == 0 || aw != 2) && !this.b.g(avfoVar.c)) {
                z = false;
            }
            if ((avfoVar.b & 32) != 0) {
                ajxz ajxzVar = this.d;
                arhs arhsVar = avfoVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                c = this.h.b(ajxzVar.a(b), z, p(avfoVar.e, z), fssVar.a());
            } else {
                fsv fsvVar2 = this.h;
                String str = avfoVar.e;
                c = fsvVar2.c(str, str, z, fssVar.a());
            }
            this.e.a(avfoVar, c);
            avfn avfnVar = avfoVar.m;
            if (avfnVar == null) {
                avfnVar = avfn.a;
            }
            if ((avfnVar.b & 2) != 0) {
                akfb akfbVar = this.c;
                avfn avfnVar2 = avfoVar.m;
                if (avfnVar2 == null) {
                    avfnVar2 = avfn.a;
                }
                argj argjVar = avfnVar2.c;
                if (argjVar == null) {
                    argjVar = argj.a;
                }
                akfbVar.b(argjVar, c, avfoVar, this.f);
            }
            if ((avfoVar.b & 524288) != 0) {
                this.f.u(new acte(avfoVar.n.I()), null);
            }
        }
        if (i != -1) {
            fsvVar.k(i);
        }
    }

    public final void n() {
        ajyw ajywVar;
        this.b.c(this, -1L);
        ajzq f = f();
        if (f == null) {
            return;
        }
        f.c();
        ajyv ajyvVar = f.j.b;
        if (ajyvVar == null || !(ajyvVar.a instanceof ajxd) || (ajywVar = ajyvVar.d) == null) {
            return;
        }
        ajywVar.lk();
    }

    @Override // defpackage.agby
    public final void o(String str, boolean z, int i) {
        int a = a();
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            nii niiVar = (nii) this.a.get(i2);
            if (str.equals(niiVar.a.c)) {
                if (str.equals("FEnotifications_inbox") && i > 0) {
                    niiVar.c.l();
                }
                if (i2 != a) {
                    if (!z) {
                        return;
                    }
                    zag.u(this.h.d(i2), true, 0, null);
                    return;
                }
            }
        }
    }

    @Override // defpackage.fsu
    public final void oB(int i) {
        ajzq f = f();
        if (f instanceof fsu) {
            ((fsu) f).oB(i);
        }
    }
}
