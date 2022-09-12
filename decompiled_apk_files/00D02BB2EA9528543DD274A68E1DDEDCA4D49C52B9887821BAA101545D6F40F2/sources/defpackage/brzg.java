package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: brzg  reason: default package */
/* loaded from: classes4.dex */
public final class brzg extends gen implements brzs {
    public cqkj a;
    public ckcw b;
    public brzu c;
    public cklq d;
    public brzt e;

    public static brzg g(bsjm bsjmVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search-refinements-model", bsjmVar);
        brzg brzgVar = new brzg();
        brzgVar.B(bundle);
        return brzgVar;
    }

    private final void q() {
        brzu brzuVar = this.c;
        brzk a = brzuVar.a.a();
        brzu.a(a, 1);
        bsih a2 = brzuVar.b.a();
        brzu.a(a2, 2);
        dzsj<bsim> dzsjVar = brzuVar.g;
        dzsj<bsiq> dzsjVar2 = brzuVar.h;
        dzsj<bsjf> dzsjVar3 = brzuVar.i;
        dzsj<bsif> dzsjVar4 = brzuVar.j;
        dzsj<bsjg> dzsjVar5 = brzuVar.k;
        dzsj<bshe> dzsjVar6 = brzuVar.l;
        dzsj<bsip> dzsjVar7 = brzuVar.m;
        dzsj<bsiy> dzsjVar8 = brzuVar.n;
        dzsj<bshp> dzsjVar9 = brzuVar.o;
        dzsj<bshc> dzsjVar10 = brzuVar.p;
        btvo a3 = brzuVar.q.a();
        brzu.a(a3, 17);
        gga a4 = brzuVar.r.a();
        brzu.a(a4, 18);
        cjmt a5 = brzuVar.s.a();
        brzu.a(a5, 19);
        eff a6 = brzuVar.t.a();
        brzu.a(a6, 20);
        brzu.a(this, 21);
        this.e = new brzt(a, a2, brzuVar.c, brzuVar.d, brzuVar.e, brzuVar.f.a(), dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, dzsjVar7, dzsjVar8, dzsjVar9, dzsjVar10, a3, a4, a5, a6, this);
        bsjm bsjmVar = (bsjm) this.o.getSerializable("search-refinements-model");
        if (bsjmVar != null) {
            this.e.f(bsjmVar);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        q();
        cqkf c = this.a.c(new brzp(), viewGroup);
        c.e(this.e);
        View c2 = c.c();
        dbsk.s(c2);
        NestedScrollView nestedScrollView = (NestedScrollView) cqkx.e(c2, brzp.a, NestedScrollView.class);
        if (nestedScrollView != null) {
            nestedScrollView.setOnScrollChangeListener(new brzf(this));
        }
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        q();
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        bsig bsigVar;
        brzt brztVar = this.e;
        if (brztVar == null || (bsigVar = brztVar.a) == null) {
            return;
        }
        bsigVar.e();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxp.n;
    }
}
