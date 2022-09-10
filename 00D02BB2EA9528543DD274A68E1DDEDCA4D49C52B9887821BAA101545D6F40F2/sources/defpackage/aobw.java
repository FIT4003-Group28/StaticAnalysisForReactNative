package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aobw  reason: default package */
/* loaded from: classes2.dex */
public final class aobw extends ges {
    public angp a;
    private cqkf<aoch> ad;
    public apjz b;
    public bwqv c;
    public efg d;
    public ansy e;
    private aoge f;
    private aock g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aoch> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<aoch> c = this.e.g().c(new aocg(), viewGroup);
        this.ad = c;
        c.e(this.g);
        return this.ad.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        dbsg<dork> i = this.g.i();
        if (i.a()) {
            this.a.f(this.f.g(), i.b());
            return false;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Serializable serializable;
        super.l(bundle);
        try {
            serializable = this.c.d(aoge.class, this.o, "day-details");
        } catch (IOException unused) {
            serializable = null;
        }
        aoge aogeVar = (aoge) serializable;
        dbsk.s(aogeVar);
        this.f = aogeVar;
        ff J = J();
        dvba dvbaVar = this.f.a().g;
        if (dvbaVar == null) {
            dvbaVar = dvba.e;
        }
        this.g = new aock(J, dvbaVar, this.b.b(this.f.g().m(), 32790));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.bl;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.at(null);
        egjVar.w(this.P);
        egjVar.A(egf.h());
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        if (!jmw.b(J())) {
            dvba dvbaVar = this.f.a().g;
            if (dvbaVar == null) {
                dvbaVar = dvba.e;
            }
            if (!dvbaVar.b.isEmpty()) {
                return;
            }
            ((InputMethodManager) J().getSystemService("input_method")).toggleSoftInput(2, 1);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jmw.d(J(), null);
        super.u();
    }
}
