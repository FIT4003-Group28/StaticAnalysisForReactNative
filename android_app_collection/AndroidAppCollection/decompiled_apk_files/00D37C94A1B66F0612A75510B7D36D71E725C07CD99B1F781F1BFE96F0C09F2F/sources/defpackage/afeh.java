package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afeh  reason: default package */
/* loaded from: classes.dex */
public final class afeh extends afcs {
    private static final afec l = new afeb(aetv.c);
    public final Handler b;
    public final List c;
    public final List d;
    public aetw e;
    public afec f;
    aeub g;
    public boolean h;
    public afte i;
    public afee j;
    public final afjz k;
    private boolean m;
    private boolean n;

    public afeh(afgg afggVar, afjz afjzVar) {
        super(afggVar);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = l;
        this.g = aeub.a;
        this.k = afjzVar;
    }

    private final void O(long j) {
        this.m = true;
        afnh afnhVar = null;
        this.b.removeCallbacksAndMessages(null);
        int i = 0;
        afgf afgfVar = (afgf) this.d.remove(0);
        afki afkiVar = afki.ABR;
        this.f.A(j);
        aetw aetwVar = this.e;
        String str = aetwVar != null ? aetwVar.d : null;
        String str2 = aetwVar != null ? aetwVar.b.c : null;
        afec afecVar = (afec) afgfVar.b.a();
        if (str != null) {
            this.j = new afee(this.f, afecVar, afgfVar, false, str, str2);
        }
        this.f = (afec) afgfVar.b.a();
        aetw aetwVar2 = new aetw(afgfVar.b);
        aetw aetwVar3 = this.e;
        if (aetwVar3 != null) {
            afnhVar = aetwVar3.b();
        }
        aetwVar2.f = afnhVar;
        aetw aetwVar4 = this.e;
        if (aetwVar4 != null) {
            i = aetwVar4.k;
        }
        aetwVar2.s(Integer.valueOf(i | 2));
        this.e = aetwVar2;
        this.g = aetwVar2.a;
        this.a.K(this.e);
        this.b.post(new afea(this));
    }

    public final void A() {
        while (!this.d.isEmpty()) {
            afgf afgfVar = (afgf) this.d.get(0);
            if (!super.J(afgfVar)) {
                break;
            }
            this.c.add(afgfVar);
            this.d.remove(afgfVar);
        }
        H(false);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void B(long j, auqn auqnVar) {
        this.n = false;
        super.B(j, auqnVar);
    }

    public final void E() {
        this.c.clear();
        this.d.clear();
        this.e = null;
        this.g = aeub.a;
        this.i = null;
        this.j = null;
        this.f = l;
        this.n = false;
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void F(boolean z) {
        E();
        super.F(z);
    }

    public final void H(boolean z) {
        if (this.m || !this.c.isEmpty() || this.d.isEmpty()) {
            return;
        }
        afgf afgfVar = (afgf) this.d.get(0);
        if (z) {
            if (this.e != null) {
                if (afmg.bb(afgfVar.b, 4)) {
                    this.n = true;
                    return;
                } else {
                    O(this.e.b.d);
                    return;
                }
            }
            this.f.g(new afkn("player.exception", g(), "nullStreamingData"));
            O(-1L);
        } else if (afgfVar.a == -1) {
        } else {
            long g = g();
            if (afgfVar.a <= g) {
                O(g);
            } else if (!this.h && (!I() || G())) {
            } else {
                this.h = false;
                this.b.postDelayed(new afea(this, 1), afgfVar.a - g);
            }
        }
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final boolean J(afgf afgfVar) {
        if (this.f == l) {
            return false;
        }
        afgf a = afgfVar.a(new afeg(this, afgfVar.b.a()));
        if (!this.d.isEmpty() || !super.J(a)) {
            this.d.add(a);
            H(false);
            return true;
        }
        this.c.add(a);
        return true;
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final afte K(aetw aetwVar) {
        this.c.clear();
        this.d.clear();
        this.n = false;
        this.f = new afeg(this, aetwVar.a());
        aetw aetwVar2 = new aetw(aetwVar);
        aetwVar2.g = this.f;
        this.e = aetwVar2;
        this.g = aetwVar.a;
        this.m = true;
        this.h = false;
        return this.a.K(this.e);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void M() {
        E();
        super.M();
    }

    @Override // defpackage.afcs, defpackage.afgg
    public final void p(afnh afnhVar) {
        aetw aetwVar = this.e;
        if (aetwVar != null) {
            aetwVar.f = afnhVar;
        }
        super.p(afnhVar);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void q() {
        super.q();
        this.c.clear();
        this.d.clear();
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void s() {
        aetw aetwVar = this.e;
        if (aetwVar != null) {
            aetwVar.f = null;
        }
        super.s();
    }

    public final void u(String str) {
        this.g.e("qpe", str);
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void w() {
        this.n = false;
        if (!this.c.isEmpty()) {
            super.w();
        } else if (this.d.isEmpty()) {
        } else {
            O(g());
        }
    }

    @Override // defpackage.afcs, defpackage.affb
    public final void x() {
        if (!this.n || !this.c.isEmpty() || this.d.isEmpty()) {
            super.x();
            return;
        }
        this.n = false;
        O(g());
    }
}
