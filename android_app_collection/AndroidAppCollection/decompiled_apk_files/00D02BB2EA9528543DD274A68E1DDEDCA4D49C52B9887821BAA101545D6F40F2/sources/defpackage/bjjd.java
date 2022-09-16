package defpackage;

import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjjd  reason: default package */
/* loaded from: classes3.dex */
public class bjjd implements bjix, btzi {
    public String a;
    public boolean b;
    private final cjtd d;
    private final bvff e;
    private final bjhc f;
    private final cafi g;
    private final bjgh h;
    private final cayf i;
    private final bjjc j;
    private final btrm k;
    private final chhr l;
    private final chhs m;
    private final ilo n;
    private final djaa o;
    private boolean q;
    private final boolean s;
    private final View.OnFocusChangeListener p = new bjjb(this);
    private boolean r = false;
    public boolean c = false;

    public bjjd(bvff bvffVar, btrm btrmVar, chhr chhrVar, chht chhtVar, bjhc bjhcVar, cafi cafiVar, bjgi bjgiVar, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, bjjc bjjcVar, ilo iloVar, String str, boolean z, dqcj dqcjVar) {
        String string;
        this.k = btrmVar;
        this.l = chhrVar;
        this.m = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.e = bvffVar;
        this.f = bjhcVar;
        this.g = cafiVar;
        this.h = bjgiVar.b(iloVar);
        this.i = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        this.j = bjjcVar;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.m(iloVar);
        dizy bZ = djaa.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar = (djaa) bZ.b;
        djaaVar.b = 1;
        int i = djaaVar.a | 1;
        djaaVar.a = i;
        str.getClass();
        djaaVar.a = i | 2;
        djaaVar.c = str;
        String o = iloVar.ai().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar2 = (djaa) bZ.b;
        o.getClass();
        djaaVar2.a |= 4;
        djaaVar2.d = o;
        String cG = iloVar.cG();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar3 = (djaa) bZ.b;
        cG.getClass();
        djaaVar3.a |= 8;
        djaaVar3.e = cG;
        boolean d = bjhcVar.d(iloVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar4 = (djaa) bZ.b;
        djaaVar4.a |= 64;
        djaaVar4.h = d;
        djai djaiVar = iloVar.h().bd;
        dqcu dqcuVar = (djaiVar == null ? djai.g : djaiVar).f;
        dqcuVar = dqcuVar == null ? dqcu.c : dqcuVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djaa djaaVar5 = (djaa) bZ.b;
        dqcuVar.getClass();
        djaaVar5.f = dqcuVar;
        int i2 = djaaVar5.a | 16;
        djaaVar5.a = i2;
        djaaVar5.k = dqcjVar.e;
        djaaVar5.a = i2 | 2048;
        this.o = bZ.bK();
        this.n = iloVar;
        this.s = z;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.fO;
        this.d = c.a();
        this.a = ((fd) bjjcVar).o.getString("answer_text", "");
        this.q = !string.isEmpty();
    }

    private final void v(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        cqkx.p(this);
    }

    @Override // defpackage.btzi
    public void QY(final btzr<djaa> btzrVar, btzy btzyVar) {
        v(false);
        this.h.b(new Runnable(this, btzrVar) { // from class: bjja
            private final bjjd a;
            private final btzr b;

            {
                this.a = this;
                this.b = btzrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u((djaa) this.b.a);
            }
        });
    }

    @Override // defpackage.bjix
    public Integer c() {
        return Integer.valueOf(!this.a.isEmpty() ? R.string.PLACE_QA_EDIT_ANSWER_HINT_TEXT : R.string.PLACE_QA_INPUT_ANSWER_HINT_TEXT);
    }

    @Override // defpackage.bjix
    public jic d() {
        return this.f.b(this.n);
    }

    @Override // defpackage.bjix
    public cqkl e() {
        this.g.k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.bjix
    public Boolean f() {
        return Boolean.valueOf(this.f.d(this.n));
    }

    @Override // defpackage.bjix
    public cjtd g() {
        return this.d;
    }

    @Override // defpackage.bjix
    public Boolean h() {
        boolean z = false;
        if (!this.r && this.b && !this.a.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bjix
    public cqkl i() {
        if (!h().booleanValue()) {
            return cqkl.a;
        }
        djaa djaaVar = this.o;
        dsqp dsqpVar = (dsqp) djaaVar.cu(5);
        dsqpVar.bC(djaaVar);
        dizy dizyVar = (dizy) dsqpVar;
        String str = this.a;
        if (dizyVar.c) {
            dizyVar.bF();
            dizyVar.c = false;
        }
        djaa djaaVar2 = (djaa) dizyVar.b;
        djaa djaaVar3 = djaa.l;
        str.getClass();
        djaaVar2.a |= 32;
        djaaVar2.g = str;
        if (!this.q && !this.s) {
            djgw a = chiw.a();
            if (dizyVar.c) {
                dizyVar.bF();
                dizyVar.c = false;
            }
            djaa djaaVar4 = (djaa) dizyVar.b;
            a.getClass();
            djaaVar4.j = a;
            djaaVar4.a |= 512;
        }
        u(dizyVar.bK());
        return cqkl.a;
    }

    @Override // defpackage.bjix
    public cqgl j() {
        return new cqgl(this) { // from class: bjiy
            private final bjjd a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bjjd bjjdVar = this.a;
                if (!bjjdVar.b) {
                    return;
                }
                boolean booleanValue = bjjdVar.h().booleanValue();
                boolean booleanValue2 = bjjdVar.k().booleanValue();
                bjjdVar.a = charSequence.toString();
                if (booleanValue == bjjdVar.h().booleanValue() && booleanValue2 == bjjdVar.k().booleanValue()) {
                    return;
                }
                cqkx.p(bjjdVar);
            }
        };
    }

    @Override // defpackage.bjix
    public Boolean k() {
        return Boolean.valueOf(this.a.length() >= 1000);
    }

    @Override // defpackage.bjix
    public String l() {
        return this.b ? this.a : "";
    }

    @Override // defpackage.bjix
    public View.OnFocusChangeListener m() {
        return this.p;
    }

    @Override // defpackage.bjix
    public Integer n() {
        return Integer.valueOf(l().length());
    }

    @Override // defpackage.bjix
    public Boolean o() {
        return Boolean.valueOf(!this.f.a());
    }

    @Override // defpackage.bjix
    public cqkl p() {
        this.f.c(new Runnable(this) { // from class: bjiz
            private final bjjd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c = true;
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bjix
    public Boolean q() {
        return true;
    }

    @Override // defpackage.btzi
    /* renamed from: r */
    public void QZ(btzr<djaa> btzrVar, djae djaeVar) {
        djgl d;
        v(false);
        int a = djad.a(djaeVar.b);
        if (a != 0 && a == 2) {
            int i = true != this.q ? 1 : 2;
            this.q = true;
            this.k.b(new bjfg());
            this.k.b(new bjfa(i, 2));
            if (i != 1 || this.s) {
                return;
            }
            if ((djaeVar.a & 8) != 0) {
                d = djaeVar.d;
                if (d == null) {
                    d = djgl.g;
                }
            } else {
                d = this.m.d();
            }
            this.l.a(d, dtxy.fQ, dtxy.fR);
            return;
        }
        QY(btzrVar, btzy.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(String str) {
        this.a = str;
        this.q = !str.isEmpty();
        cqkx.p(this);
    }

    public final void t(boolean z) {
        if (z || this.c) {
            this.j.a();
            this.c = false;
            return;
        }
        this.j.b();
    }

    public final void u(djaa djaaVar) {
        this.e.a(djaaVar, this, bvrj.UI_THREAD);
        v(true);
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.i;
    }
}
