package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.io.IOException;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bwel  reason: default package */
/* loaded from: classes4.dex */
public final class bwel extends geb implements jkh {
    public dxio<akfa> ad;
    public cqkj ae;
    public bwqv af;
    public cjqy ag;
    public dxio<afha> ah;
    public cqkf<bwht> ai;
    public bulc aj;
    private LinearLayout ak;
    private bweo al;
    @dzsi
    private String am;
    bwib c;
    public bwfs[] d;
    @dzsi
    cjtd e;
    public bwic g;

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((bwem) btsx.b(bwem.class, this)).dp(this);
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        this.c.g(jjnVar, f);
        this.ak.getChildAt(0).setTranslationY(this.c.h().intValue());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        ((geb) this).b.G(this);
    }

    @Override // defpackage.geb, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        ((geb) this).b.F(this);
        return ag;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dbsk.l(bundle2.containsKey("shareContent"));
        try {
            this.d = (bwfs[]) this.af.d(bwfs[].class, bundle2, "callbacks");
            bweo bweoVar = (bweo) this.af.d(bweo.class, bundle2, "shareContent");
            dbsk.s(bweoVar);
            this.al = bweoVar;
            this.e = (cjtd) this.af.d(cjtd.class, bundle2, "itemUe3Params");
            this.am = bundle2.getString("title");
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            this.c = w(ggaVar);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.dn;
    }

    @Override // defpackage.geb
    protected final View q(Bundle bundle) {
        this.ak = new LinearLayout(J());
        cqkf<bwht> a = this.ae.a(new bwgg(), this.ak);
        this.ai = a;
        a.e(this.c);
        return this.ak;
    }

    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        bwen bwenVar;
        String b;
        super.s();
        gga ggaVar = this.aE;
        if (this.al.m() || ggaVar == null) {
            return;
        }
        Iterator<T> it = this.al.b.iterator();
        if (!it.hasNext() || (b = (bwenVar = (bwen) it.next()).b()) == null) {
            return;
        }
        dvsz bZ = dvta.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvta dvtaVar = (dvta) bZ.b;
        b.getClass();
        dvtaVar.a |= 1;
        dvtaVar.b = b;
        this.aj.a(bZ.bK(), new bwek(this, bwenVar), bvrj.UI_THREAD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [bwfs[], java.io.Serializable] */
    @Override // defpackage.geb, defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.af.c(bundle, "callbacks", this.d);
        this.af.c(bundle, "shareContent", this.al);
        this.af.c(bundle, "itemUe3Params", this.e);
        bundle.putString("title", this.am);
    }

    public final bwib w(gga ggaVar) {
        bwic bwicVar = this.g;
        btlu j = this.ad.a().j();
        Intent a = bwep.a(this.al, ggaVar);
        bweo bweoVar = this.al;
        String str = this.am;
        cjtd cjtdVar = this.e;
        dbsk.s(cjtdVar);
        return bwicVar.a(j, a, bweoVar, str, cjtdVar, cqrp.d(dcyn.a), new bvro(this) { // from class: bwei
            private final bwel a;

            {
                this.a = this;
            }

            @Override // defpackage.bvro
            public final void a(Object obj, Object obj2) {
                bwel bwelVar = this.a;
                cjql cjqlVar = (cjql) obj;
                Intent intent = (Intent) obj2;
                deha.q(bwelVar.ah.a().i(bwelVar, intent, 4), new bwej(bwelVar, intent), dege.a);
                bwelVar.aT();
            }
        });
    }
}
