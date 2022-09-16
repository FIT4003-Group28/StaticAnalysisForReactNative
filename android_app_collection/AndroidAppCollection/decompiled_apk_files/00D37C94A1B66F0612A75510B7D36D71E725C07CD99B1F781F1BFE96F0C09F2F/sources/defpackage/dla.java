package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dla  reason: default package */
/* loaded from: classes3.dex */
public final class dla extends xo {
    final /* synthetic */ dlc d;

    public dla(dlc dlcVar) {
        this.d = dlcVar;
        q(false);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.b.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        dlj d = ((diz) this.d.b.get(i)).d();
        if (d.j()) {
            return this.d.F.c;
        }
        dkn dknVar = this.d.d;
        if (dknVar != null) {
            return ((akdf) dknVar).b.c(i);
        }
        return d.a();
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        dlc dlcVar = this.d;
        dlk dlkVar = dlcVar.F;
        if (i == dlkVar.c) {
            return new dkw(new dci(dlcVar.f), true);
        }
        dkn dknVar = dlcVar.d;
        if (dknVar != null) {
            return ((akdf) dknVar).b.f(viewGroup, i);
        }
        Context context = this.d.f.b;
        return new dkw(((diq) dlkVar.a.get(i)).a(), false);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        return ((diz) this.d.b.get(i)).a;
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        int i2;
        int i3;
        boolean z = true;
        boolean z2 = dce.b(null) && !this.d.A.isEmpty();
        diz dizVar = (diz) this.d.b.get(i);
        dlj d = dizVar.d();
        if (d.j()) {
            dci dciVar = (dci) yoVar.a;
            dciVar.H(this.d.j);
            int o = this.d.o(dizVar);
            int n = this.d.n(dizVar);
            int i4 = -1;
            if (!dizVar.r(o, n)) {
                dlc dlcVar = this.d;
                int i5 = dlcVar.u;
                if (i5 != -1 && (i3 = dlcVar.v) != -1) {
                    int i6 = i3 - i5;
                    if (i > i3) {
                        dlcVar.v(i, i6 + i, dlg.a);
                    } else if (i < i5) {
                        dlcVar.v(i - i6, i, dlg.b);
                    }
                }
                dizVar.i(this.d.f, o, n, new ddj());
            }
            int h = this.d.H.h();
            if (View.MeasureSpec.getMode(o) == 1073741824) {
                i2 = View.MeasureSpec.getSize(o);
            } else {
                i2 = h != 0 ? -1 : -2;
            }
            if (View.MeasureSpec.getMode(n) == 1073741824) {
                i4 = View.MeasureSpec.getSize(n);
            } else if (h != 0) {
                i4 = -2;
            }
            d.h();
            dciVar.setLayoutParams(new dlb(i2, i4, o, n));
            dciVar.G(dizVar.b());
            dciVar.post(new dkz(dciVar));
            dizVar.d().n();
            if (z2) {
                dlc dlcVar2 = this.d;
                boolean[] zArr = dlcVar2.B;
                boolean[] zArr2 = dlcVar2.C;
                boolean z3 = i == b();
                if (1 != h) {
                    z = false;
                }
                dciVar.B = new dcg(zArr, zArr2, z3, z);
            } else {
                dciVar.F();
            }
            akcx akcxVar = this.d.I;
            if (akcxVar != null) {
                Iterator it = akcxVar.a.d.iterator();
                while (it.hasNext()) {
                    ajrv ajrvVar = (ajrv) it.next();
                    if (ajrvVar instanceof geu) {
                        ((geu) ajrvVar).a.ai();
                    }
                }
            }
        } else {
            dkn dknVar = this.d.d;
            if (dknVar != null) {
                ((akdf) dknVar).b.o((ajrz) yoVar, i);
            } else {
                dkw dkwVar = (dkw) yoVar;
                dip c = d.c();
                int i7 = dkw.v;
                dkwVar.u = null;
                View view = dkwVar.a;
                c.a();
            }
        }
        boolean z4 = dfz.a;
    }

    @Override // defpackage.xo
    public final void p(yo yoVar) {
        if (yoVar instanceof dkw) {
            dkw dkwVar = (dkw) yoVar;
            int i = dkw.v;
            if (!dkwVar.t) {
                dip dipVar = dkwVar.u;
                return;
            }
            dci dciVar = (dci) yoVar.a;
            dciVar.K();
            dciVar.G(null);
            dciVar.H(null);
            dciVar.F();
            return;
        }
        ((akdf) this.d.d).b.p((ajrz) yoVar);
    }
}
