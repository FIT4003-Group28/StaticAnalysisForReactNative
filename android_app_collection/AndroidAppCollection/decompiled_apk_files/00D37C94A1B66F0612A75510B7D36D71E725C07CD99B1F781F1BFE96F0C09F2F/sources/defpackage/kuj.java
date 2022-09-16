package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kuj  reason: default package */
/* loaded from: classes3.dex */
class kuj extends gbd implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void q() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        q();
        p();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        q();
        p();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.axoo
    /* renamed from: n */
    public final axoe lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axoe(this);
                }
            }
        }
        return this.b;
    }

    protected final void p() {
        if (!this.d) {
            this.d = true;
            kwm kwmVar = (kwm) this;
            eao eaoVar = (eao) lI();
            kwmVar.ar = axot.a(eaoVar.b.rN);
            kwmVar.av = (aacz) eaoVar.b.D.get();
            kwmVar.as = (fsx) eaoVar.c.iA.get();
            kwmVar.at = (gbh) eaoVar.c.aa.get();
            kwmVar.au = (gbq) eaoVar.c.l.get();
            kwmVar.a = axot.a(eaoVar.c.iO);
            kwmVar.b = axot.a(eaoVar.c.iR);
            kwmVar.c = (SearchRecentSuggestions) eaoVar.b.a.aX.get();
            kwmVar.d = (yni) eaoVar.b.y.get();
            dyo dyoVar = eaoVar.b;
            kwmVar.e = dyoVar.xZ;
            kwmVar.ae = (lbl) dyoVar.uB.get();
            kwmVar.af = (fsd) eaoVar.c.iy.get();
            aafo aafoVar = (aafo) eaoVar.c.H.get();
            kwmVar.ag = (iwa) eaoVar.c.ix.get();
            dyo dyoVar2 = eaoVar.b;
            azqb azqbVar = dyoVar2.gS;
            dwq dwqVar = eaoVar.c;
            kwmVar.ah = new kun(azqbVar, dwqVar.mM, dyoVar2.a.aY, eaoVar.aq, dwqVar.dE, dyoVar2.x, dyoVar2.je, dyoVar2.D, dyoVar2.K, eaoVar.ay, eaoVar.ar, eaoVar.az, dyoVar2.le);
            dyo dyoVar3 = eaoVar.b;
            azqb azqbVar2 = dyoVar3.mu;
            dwq dwqVar2 = eaoVar.c;
            azqb azqbVar3 = dwqVar2.as;
            azqb azqbVar4 = dwqVar2.ah;
            azqb azqbVar5 = dwqVar2.mN;
            azqb azqbVar6 = eaoVar.aA;
            azqb azqbVar7 = eaoVar.aB;
            azqb azqbVar8 = dyoVar3.an;
            azqb azqbVar9 = dyoVar3.a.bc;
            azqb azqbVar10 = dwqVar2.gu;
            azqb azqbVar11 = dwqVar2.gV;
            azqb azqbVar12 = dwqVar2.gX;
            azqb azqbVar13 = dyoVar3.oq;
            azqb azqbVar14 = dyoVar3.or;
            azqb azqbVar15 = dyoVar3.y;
            azqb azqbVar16 = dyoVar3.je;
            azqb azqbVar17 = dwqVar2.iy;
            azqb azqbVar18 = dyoVar3.uB;
            azqb azqbVar19 = dyoVar3.D;
            azqb azqbVar20 = dyoVar3.K;
            azqb b = axoz.b(dyoVar3.wH);
            dyo dyoVar4 = eaoVar.b;
            azqb azqbVar21 = dyoVar4.kC;
            azqb azqbVar22 = dyoVar4.cP;
            azqb azqbVar23 = dyoVar4.ef;
            azqb azqbVar24 = dyoVar4.yz;
            dxs dxsVar = dyoVar4.a;
            azqb azqbVar25 = dxsVar.bd;
            dwq dwqVar3 = eaoVar.c;
            kwmVar.ai = new kuv(azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, azqbVar17, azqbVar18, azqbVar19, azqbVar20, b, azqbVar21, azqbVar22, azqbVar23, azqbVar24, azqbVar25, dwqVar3.H, dyoVar4.hl, eaoVar.aC, dwqVar3.dE, dxsVar.ad, dwqVar3.fV, dxsVar.ak);
            kwmVar.aj = eaoVar.c.dE();
            kwmVar.ak = eaoVar.c.dG();
            kwmVar.al = (acvh) eaoVar.b.ef.get();
            kwmVar.am = (aadd) eaoVar.b.K.get();
            kwmVar.an = (afvn) eaoVar.b.au.get();
            kwmVar.ao = (fpg) eaoVar.c.ad.get();
            kwmVar.aM = (sdb) eaoVar.c.ee.get();
            kwmVar.aw = (lvl) eaoVar.c.iC.get();
            kwmVar.ax = (Executor) eaoVar.b.x.get();
            kwmVar.aK = (oir) eaoVar.c.F.get();
            kwmVar.aL = (lya) eaoVar.b.zt.get();
            dwq dwqVar4 = eaoVar.c;
            azqb azqbVar26 = dwqVar4.f;
            azqb azqbVar27 = dwqVar4.t;
            dyo dyoVar5 = eaoVar.b;
            kwmVar.ay = new iwe(azqbVar26, azqbVar27, dyoVar5.jw, dyoVar5.kj, dyoVar5.jC, dyoVar5.jT, dyoVar5.jB, dyoVar5.a.aw, dyoVar5.Ah, dyoVar5.jq, dyoVar5.iH);
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        q();
        return this.a;
    }
}
