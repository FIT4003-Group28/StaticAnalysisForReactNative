package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ajwb  reason: default package */
/* loaded from: classes.dex */
public abstract class ajwb extends ajxn implements View.OnClickListener, ajyw, akaf {
    private final ajzs I;

    /* renamed from: J  reason: collision with root package name */
    private final ajrc f59J;
    private final aypg K;
    private final List L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ajfz Q;
    private ajfz R;
    private final List a;
    private final Map b;
    private final ajyk c;
    private final akai d;
    public final ajrj e;
    public final ajrw f;
    public final List g;
    public final yni h;
    public final aadd i;
    public final ajvz j;
    public ajqm k;
    public ajqm l;
    public boolean m;
    public String n;
    public Runnable o;
    public final Object p;
    public boolean q;
    public ajzw r;
    public ajvw s;

    public ajwb(akam akamVar, ajrw ajrwVar, ajyx ajyxVar, aari aariVar, yni yniVar, ajyk ajykVar, yzj yzjVar, acti actiVar, akai akaiVar, ajzs ajzsVar, aadd aaddVar, aynx aynxVar, Queue queue) {
        super(akam.a(akamVar), aariVar, yniVar, yni.c(), yzjVar, actiVar, queue);
        this.n = "";
        this.p = new Object();
        this.f = ajrwVar;
        yniVar.getClass();
        this.h = yniVar;
        ajykVar.getClass();
        this.c = ajykVar;
        akaiVar.getClass();
        this.d = akaiVar;
        ajzsVar.getClass();
        this.I = ajzsVar;
        this.i = aaddVar;
        ajrj ajrjVar = new ajrj();
        this.e = ajrjVar;
        this.g = new ArrayList();
        this.a = new ArrayList();
        this.L = new ArrayList();
        this.b = new HashMap();
        ajvz ajvzVar = new ajvz(this, ajyxVar);
        this.j = ajvzVar;
        this.P = true;
        this.q = true;
        this.s = null;
        if (akamVar instanceof ajwa) {
            ajwa ajwaVar = (ajwa) akamVar;
            n(ajwaVar.a, ajwaVar.b);
            ajvzVar.c(ajwaVar.c);
            this.R = ajwaVar.d;
        }
        this.K = aynxVar.u(new ayqf() { // from class: ajvy
            @Override // defpackage.ayqf
            public final boolean a(Object obj) {
                return TextUtils.equals(((zab) obj).d(), ajwb.this.n);
            }
        }).Z(new ayqb() { // from class: ajvx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ajwb ajwbVar = ajwb.this;
                zab zabVar = (zab) obj;
                apzg b = zabVar.b();
                int a = zabVar.a();
                synchronized (ajwbVar.p) {
                    asvx asvxVar = ajwbVar.i.a().m;
                    if (asvxVar == null) {
                        asvxVar = asvx.a;
                    }
                    aski askiVar = asvxVar.c;
                    if (askiVar == null) {
                        askiVar = aski.a;
                    }
                    if (askiVar.l && b != null && a != 0) {
                        ajwbVar.s = new ajvw(ajwbVar, a);
                        ajwbVar.q = false;
                    } else {
                        ajwbVar.s = null;
                        ajwbVar.q = true;
                    }
                }
                ajwbVar.lx(zabVar.c(), zabVar.b());
            }
        });
        ajrwVar.h(ajrjVar);
        ajrc ajrcVar = new ajrc(actiVar);
        this.f59J = ajrcVar;
        ajrwVar.rZ(ajrcVar);
        ajrwVar.rZ(new ajrc(actiVar));
        ajrwVar.rZ(new akag(this));
        ajrwVar.g(ajvzVar);
        ajvzVar.d(this.F, null);
    }

    private final void ai() {
        for (ajyj ajyjVar : this.g) {
            ajyjVar.j();
        }
    }

    private final void m(Object obj, akam akamVar) {
        ajyj a = this.c.a(obj, akamVar, this);
        if (a != null) {
            this.g.add(a);
            this.a.add(obj);
            this.e.n(o(), a.lA());
            String lv = a instanceof ajxy ? ((ajxy) a).lv() : null;
            if (!TextUtils.isEmpty(lv)) {
                this.b.put(lv, a);
            }
            if (!(a instanceof ajxh)) {
                return;
            }
            ajxh ajxhVar = (ajxh) a;
            if (!ah(ajxhVar)) {
                return;
            }
            I(ajxhVar);
        }
    }

    private final void n(List list, List list2) {
        ajqm ajqmVar;
        if (!this.m && (ajqmVar = this.k) != null && this.e.i(ajqmVar) == -1) {
            this.e.o(this.k);
        }
        Iterator it = list2 != null ? list2.iterator() : null;
        for (Object obj : list) {
            m(obj, (it == null || !it.hasNext()) ? null : (akam) it.next());
        }
        this.j.b(null);
        ajqm ajqmVar2 = this.l;
        if (ajqmVar2 != null && this.e.i(ajqmVar2) == -1) {
            this.e.m(this.l);
        }
        this.m = true;
    }

    @Override // defpackage.ajxh
    public final void A() {
        super.A();
        this.Q = null;
        ajvz ajvzVar = this.j;
        ajyv ajyvVar = ajvzVar.b;
        if (ajyvVar != null) {
            ajvzVar.c(ajyvVar.a);
        }
        ajyx ajyxVar = ajvzVar.a;
        if (ajyxVar != null) {
            ajyxVar.clear();
        }
        ajvzVar.b = null;
    }

    public final void B(boolean z) {
        int i = 0;
        this.m = false;
        if (z) {
            if (this.k != null) {
                i = 1;
            }
            if (this.O) {
                i++;
            }
        }
        if (i > 0) {
            ajrj ajrjVar = this.e;
            int h = ajrjVar.h() - 1;
            ylr.c();
            if (!ajrjVar.a.isEmpty() && i <= h && h < ajrjVar.a.size()) {
                int g = ((ajri) ajrjVar.a.get(h)).g();
                int i2 = ((ajri) ajrjVar.a.get(i)).b;
                while (h >= i) {
                    ajrjVar.p(h);
                    h--;
                }
                ajrjVar.s();
                int i3 = g - i2;
                if (i3 > 0) {
                    ajrjVar.z(i2, i3);
                }
            }
        } else {
            this.e.t();
        }
        this.o = null;
        ajqm ajqmVar = this.l;
        if (ajqmVar != null) {
            this.e.m(ajqmVar);
        }
        ai();
        this.g.clear();
        this.a.clear();
        this.b.clear();
        this.n = "";
        I(null);
        A();
        for (akae akaeVar : this.L) {
            akaeVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        ajfz U = U(ajfy.NEXT);
        if (this.Q != U) {
            lD(ajfy.NEXT);
            this.Q = U;
        }
    }

    public final void D() {
        for (akae akaeVar : this.L) {
            akaeVar.e();
        }
    }

    public void E(Configuration configuration) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(aakw aakwVar, ajfy ajfyVar) {
        super.lz(aakwVar, ajfyVar);
        if (aakwVar == null) {
            return;
        }
        if (ajfyVar == ajfy.RELOAD) {
            T(aakwVar);
        } else {
            w(aakwVar);
        }
    }

    protected abstract void G(Bundle bundle);

    @Override // defpackage.akaf
    public final void H() {
        this.f.h(this.e);
    }

    protected final void I(ajxh ajxhVar) {
        ajxh ajxhVar2 = this.H;
        Object obj = null;
        if (ajxhVar2 != null) {
            ajxhVar2.D = null;
        }
        this.H = ajxhVar;
        ajxh ajxhVar3 = this.H;
        if (ajxhVar3 != null) {
            ajxhVar3.D = this.G;
        }
        if (ajxhVar != null) {
            obj = ajxhVar.W();
        }
        this.j.d(this.F, obj);
        ajxh ajxhVar4 = this.H;
        if (!(ajxhVar4 instanceof ajxl) || !ajxhVar4.af(ajfy.NEXT)) {
            return;
        }
        ((ajxl) ajxhVar4).K(false);
    }

    public final void J(ajqm ajqmVar) {
        ajqm ajqmVar2 = this.k;
        if (ajqmVar2 == ajqmVar) {
            return;
        }
        if (ajqmVar2 != null) {
            this.e.q(ajqmVar2);
        }
        this.k = ajqmVar;
        if (ajqmVar == null || !this.m) {
            return;
        }
        this.e.o(ajqmVar);
    }

    @Override // defpackage.akaf
    public final void K(aakw aakwVar) {
        M(aakwVar, null, null);
    }

    public final void L(aakw aakwVar, Bundle bundle) {
        M(aakwVar, null, bundle);
    }

    public final void M(aakw aakwVar, acuv acuvVar, Bundle bundle) {
        R(aakwVar, acuvVar, bundle);
        c();
    }

    public final void N(boolean z) {
        this.P = z;
        Q();
    }

    public final void O() {
        ajvz ajvzVar = this.j;
        if (ajvzVar.a == null) {
            return;
        }
        if (ajvzVar.b == null) {
            ajvzVar.b = ajvzVar.a(ajxe.a());
            ajvzVar.a.q(ajvzVar.b);
        }
        ajwb ajwbVar = ajvzVar.c;
        ajwbVar.e.n(ajwbVar.o(), ajvzVar.a);
    }

    protected abstract void P(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q() {
        if (lm()) {
            this.I.c(1);
        } else {
            this.I.c(3);
        }
    }

    public final boolean R(aakw aakwVar, acuv acuvVar, Bundle bundle) {
        this.f59J.b = acuvVar;
        boolean z = this.m;
        if (z) {
            this.f.h(ajqr.a);
        }
        h();
        w(aakwVar);
        if (z) {
            this.f.h(this.e);
        }
        G(bundle);
        return z;
    }

    @Override // defpackage.ajxh
    protected final ajvw S() {
        ajvw ajvwVar;
        synchronized (this.p) {
            ajvwVar = this.s;
        }
        return ajvwVar;
    }

    public void T(aakw aakwVar) {
        throw null;
    }

    @Override // defpackage.akaf
    public void c() {
        for (akae akaeVar : this.L) {
            akaeVar.a();
        }
        boolean z = this.M;
        if (!z || this.N) {
            this.M = true;
            if (!z) {
                i();
            }
            if (this.g.isEmpty() && af(ajfy.RELOAD)) {
                lD(ajfy.RELOAD);
                this.N = false;
            }
            if (!this.N) {
                return;
            }
            ll();
            this.N = false;
        }
    }

    protected void f(auqh auqhVar) {
    }

    public void h() {
        throw null;
    }

    protected abstract void i();

    @Override // defpackage.ajxh, defpackage.zdx
    public void j() {
        super.j();
        this.o = null;
        ai();
        this.j.e();
        azof.f((AtomicReference) this.K);
        for (akae akaeVar : this.L) {
            akaeVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(ajxe ajxeVar) {
        athe atheVar = this.i.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        return !atheVar.i || !ajxeVar.c() || ajxeVar.d();
    }

    public void l() {
        this.N = true;
    }

    @Override // defpackage.ajwq
    public final void li(aumx aumxVar, zdt zdtVar, ajxo ajxoVar, apzg apzgVar) {
        h();
        this.j.b(ajna.g(aumxVar));
        super.ab(ajna.g(aumxVar), apzgVar, zdtVar, new ajww(this, ajxoVar), ajxa.a());
    }

    @Override // defpackage.ajxh
    protected final void lj(cff cffVar, ajfz ajfzVar) {
        super.lj(cffVar, ajfzVar);
        this.R = ajfzVar;
    }

    @Override // defpackage.ajyw
    public final void lk() {
        ajfz ajfzVar = this.R;
        if (ajfzVar != null) {
            lr(ajfzVar);
            this.R = null;
        }
    }

    @Override // defpackage.akai
    public void ll() {
        if (af(ajfy.RELOAD)) {
            ad();
        } else if (this.d.lm()) {
            this.d.ll();
        } else {
            this.I.c(1);
        }
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return (this.P && af(ajfy.RELOAD)) || this.d.lm();
    }

    @Override // defpackage.ajzw
    public final boolean ln(String str, int i, Runnable runnable) {
        ajyj s = s(str);
        if (s == null || s.lA() == null || s.lA().isEmpty()) {
            ajzw ajzwVar = this.r;
            return ajzwVar != null && ajzwVar.ln(str, i, runnable);
        }
        int j = this.e.j(s.lA());
        if (j < 0) {
            return false;
        }
        this.o = runnable;
        P(j, i);
        return true;
    }

    @Override // defpackage.ajxh
    protected final boolean lo() {
        boolean z;
        synchronized (this.p) {
            z = this.q;
        }
        return z;
    }

    @Override // defpackage.ajzw
    public final /* synthetic */ void lp(String str) {
        ln(str, 0, null);
    }

    @Override // defpackage.ajwq
    public final void lx(aumx aumxVar, apzg apzgVar) {
        h();
        this.j.b(ajna.g(aumxVar));
        aa(ajna.g(aumxVar), apzgVar);
    }

    @Override // defpackage.ajxh
    protected final /* bridge */ /* synthetic */ Object np(auna aunaVar) {
        if (aunaVar == null || !aunaVar.qn(auqh.b)) {
            return null;
        }
        return new aakw((auqh) aunaVar.qm(auqh.b));
    }

    public final int o() {
        int i = this.e.i(this.j.a);
        return i != -1 ? i : this.e.i(this.l);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lD(ajfy.NEXT);
    }

    public Bundle p() {
        throw null;
    }

    @Override // defpackage.ajxh, defpackage.ajzh
    public akam pn() {
        ArrayList arrayList = new ArrayList(this.g.size());
        for (ajyj ajyjVar : this.g) {
            arrayList.add(ajyjVar.pn());
        }
        akam pn = super.pn();
        List list = this.a;
        ajyv ajyvVar = this.j.b;
        return new ajwa(pn, list, arrayList, ajyvVar != null ? ajyvVar.a : null, this.R);
    }

    public abstract View q();

    @Override // defpackage.akaf
    public final ajqm r() {
        return this.e;
    }

    @Override // defpackage.akaf
    public final ajyj s(String str) {
        return (ajyj) this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(Object obj) {
        this.O = true;
        v(obj);
    }

    @Override // defpackage.akaf
    public final void u(ajrt ajrtVar) {
        this.f.rZ(ajrtVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(Object obj) {
        m(obj, null);
    }

    public final void w(aakw aakwVar) {
        if (aakwVar == null) {
            return;
        }
        boolean z = !this.m;
        if (aakwVar.b == null) {
            aakwVar.b = (amuk) ((ayos) ayoi.Q(aakwVar.a.e).V(aaku.a).q(nqs.c).ay(yps.m)).U();
        }
        super.ls(aakwVar.b);
        Q();
        if (z) {
            this.O = false;
            f(aakwVar.a);
        }
        n(aakwVar.a(), null);
        for (akae akaeVar : this.L) {
            akaeVar.c(aakwVar, z);
        }
        this.n = aakwVar.a.l;
    }

    @Override // defpackage.akaf
    public final void x(akae akaeVar) {
        this.L.add(akaeVar);
    }

    @Override // defpackage.akaf
    public final void y(ampt amptVar) {
        this.f.h(new ajqv(this.e, amptVar));
    }

    public final void z() {
        B(true);
    }
}
