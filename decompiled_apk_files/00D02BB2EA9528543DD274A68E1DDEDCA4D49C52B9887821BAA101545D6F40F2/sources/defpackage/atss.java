package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import defpackage.crqw;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atss  reason: default package */
/* loaded from: classes2.dex */
public class atss<T extends crqw> implements atxz {
    @dzsi
    private atxw A;
    @dzsi
    private atxw B;
    @dzsi
    private crec C;
    private boolean D;
    private boolean F;
    private final izn G;
    @dzsi
    private List<jbi> b;
    @dzsi
    private cqtd c;
    protected final T e;
    public final Context f;
    protected final btrm g;
    protected final btvo h;
    protected final cref i;
    protected final Resources j;
    protected final cjqy k;
    protected final cjqq l;
    protected final atsr m;
    protected final boolean n;
    @dzsi
    public CharSequence p;
    @dzsi
    public CharSequence q;
    public boolean r;
    @dzsi
    public CharSequence s;
    @dzsi
    public CharSequence t;
    @dzsi
    public atxy u;
    @dzsi
    public cjtd v;
    public iwr w;
    public long x;
    public boolean y;
    public boolean o = false;
    private List<jbi> Jb = dcdc.e();
    private final List<atxw> d = dchl.a();
    private int E = -1;
    protected final cree z = new atsp(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public atss(T t, Context context, btrm btrmVar, btvo btvoVar, cref crefVar, Resources resources, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, long j) {
        atsq atsqVar = new atsq(this);
        this.G = atsqVar;
        dbsk.t(t, "promptState");
        this.e = t;
        dbsk.t(context, "context");
        this.f = context;
        dbsk.t(btrmVar, "eventBus");
        this.g = btrmVar;
        dbsk.t(btvoVar, "clientParameters");
        this.h = btvoVar;
        dbsk.t(crefVar, "alertController");
        this.i = crefVar;
        dbsk.t(resources, "resources");
        this.j = resources;
        dbsk.t(cqatVar, "clock");
        dbsk.t(cjqyVar, "reporter");
        this.k = cjqyVar;
        dbsk.t(cjqqVar, "pageLoggingContextManager");
        this.l = cjqqVar;
        dbsk.t(atsrVar, "styleConfig");
        this.m = atsrVar;
        this.n = z;
        this.x = j;
        this.w = new iwr(atsqVar, dehqVar, executor);
    }

    protected static final List<jbi> am(CharSequence... charSequenceArr) {
        dccx F = dcdc.F();
        for (CharSequence charSequence : charSequenceArr) {
            if (!TextUtils.isEmpty(charSequence)) {
                F.g(new iyb(charSequence));
            }
        }
        return F.f();
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence A() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(CharSequence... charSequenceArr) {
        this.Jb = am(charSequenceArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(CharSequence... charSequenceArr) {
        this.b = am(charSequenceArr);
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence D() {
        return this.t;
    }

    @Override // defpackage.atxz
    public Boolean E() {
        return false;
    }

    @Override // defpackage.atxz
    @dzsi
    public cqtd F() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H(@dzsi cqtd cqtdVar) {
        this.c = cqtdVar;
        cqkx.p(this);
    }

    @Override // defpackage.atxz
    public List<atxw> I() {
        return this.d;
    }

    @Override // defpackage.atxz
    public Boolean J(int i) {
        return Boolean.valueOf(this.d.size() > i);
    }

    @Override // defpackage.atxz
    @dzsi
    public atxw K(int i) {
        if (J(i).booleanValue()) {
            return this.d.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(atxw atxwVar) {
        this.d.add(atxwVar);
        boolean z = true;
        if (atxwVar instanceof atxy) {
            dbsk.m(this.u == null, "Only one button can have a timeout!");
            this.u = (atxy) atxwVar;
        }
        if (atxwVar.p().booleanValue()) {
            if (this.A != null) {
                z = false;
            }
            dbsk.m(z, "Only one button can show a confirmation dialog!");
            this.A = atxwVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(atxw atxwVar) {
        dbsk.m(this.B == null, "Only one button can be the dismiss button!");
        L(atxwVar);
        this.B = atxwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void N() {
        this.d.clear();
        this.u = null;
        this.B = null;
        this.A = null;
    }

    @Override // defpackage.atxz
    @dzsi
    public atxw O() {
        return this.A;
    }

    @Override // defpackage.atxz
    public void Oa() {
        if (!c().booleanValue()) {
            q();
        }
    }

    @Override // defpackage.atxz
    public void Ob() {
        this.o = true;
        this.w.e();
    }

    @Override // defpackage.atxz
    @dzsi
    public atxy P() {
        return this.u;
    }

    @Override // defpackage.atxz
    @dzsi
    public cjtd Q() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final atsm R(boolean z) {
        atsm atsmVar = new atsm(this, this.k);
        atsmVar.k = this.n;
        atsmVar.m = z;
        iwr iwrVar = null;
        if (z && !cpv.a.e(this.f)) {
            iwrVar = this.w;
        }
        atsmVar.n = iwrVar;
        return atsmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final atsm S(boolean z) {
        atsm R = R(z);
        R.c = atso.c;
        R.f = atxv.DISMISS;
        return R;
    }

    @Override // defpackage.atxz
    @dzsi
    public atxw T() {
        return this.B;
    }

    @Override // defpackage.atxz
    public atxx U() {
        return atxx.DEFAULT;
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence V() {
        return null;
    }

    @Override // defpackage.atxz
    public boolean W() {
        return false;
    }

    @Override // defpackage.atxz
    public boolean X() {
        return false;
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence Y() {
        bvsi bvsiVar = new bvsi(this.j);
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            bvsiVar.c(charSequence);
        }
        CharSequence charSequence2 = this.q;
        if (charSequence2 != null) {
            bvsiVar.c(charSequence2);
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.atxz
    public Integer Z() {
        return 0;
    }

    @Override // defpackage.atxz
    public Integer aa() {
        return 0;
    }

    @Override // defpackage.atxz
    public Integer ab() {
        return 0;
    }

    @Override // defpackage.atxz
    public void ac() {
        this.D = true;
    }

    public boolean ad() {
        return this.D;
    }

    @Override // defpackage.atxz
    public Boolean ae() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.atxz
    public boolean af() {
        return false;
    }

    @Override // defpackage.atxz
    public Boolean ag() {
        return false;
    }

    @Override // defpackage.atxz
    public void ah(int i) {
        this.E = i;
    }

    @Override // defpackage.atxz
    public Integer ai() {
        return Integer.valueOf(this.E);
    }

    @Override // defpackage.atxz
    public void aj(boolean z) {
        this.F = true;
    }

    @Override // defpackage.atxz
    public Boolean ak() {
        return Boolean.valueOf(this.F);
    }

    public cqtd al() {
        return asab.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void an() {
        this.x = 5000L;
    }

    @Override // defpackage.atxz
    public Boolean c() {
        return false;
    }

    @Override // defpackage.atxz
    public T n() {
        return this.e;
    }

    @Override // defpackage.atxz
    public void o() {
        atxw atxwVar = this.B;
        if (atxwVar != null) {
            atxwVar.c();
        } else {
            p();
        }
    }

    public final void p() {
        crec crecVar = this.C;
        if (crecVar != null) {
            this.i.u(crecVar);
        }
        this.g.b(new crhy(this.e, false));
    }

    public final void q() {
        if (!this.e.e()) {
            this.e.h();
            crfj u = u();
            if (u != null) {
                this.C = this.i.b(u, crej.TRAFFIC_REPORT, this.z);
                return;
            }
        }
        this.y = true;
        this.w.d(this.x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r() {
        return this.w.h();
    }

    public final void t() {
        this.w.g();
    }

    @dzsi
    protected crfj u() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence x() {
        return this.p;
    }

    @Override // defpackage.atxz
    @dzsi
    public CharSequence y() {
        return this.q;
    }

    @Override // defpackage.atxz
    public List<jbi> z() {
        List<jbi> list = this.b;
        return (list == null || !btpf.d(this.j.getConfiguration()).f) ? this.Jb : list;
    }
}
