package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgww  reason: default package */
/* loaded from: classes4.dex */
public class cgww extends chal implements cgva {
    protected final Activity a;
    final String b;
    final dnvr c;
    @dzsi
    final dnvp d;
    protected dosq e;
    @dzsi
    protected cgwu f;
    @dzsi
    protected cgwu g;
    public final ges h;
    private final btvo s;
    @dzsi
    private doso t;

    public cgww(Activity activity, cgsk cgskVar, bwrs<ilo> bwrsVar, List<dwrg> list, dwql dwqlVar, chak chakVar, btvo btvoVar, ges gesVar, cgum cgumVar) {
        super(cgskVar, bwrsVar, list, dwqlVar, chakVar, cgumVar);
        dnjp dnjpVar;
        this.e = dosq.VOTE_UNKNOWN;
        this.f = null;
        this.g = null;
        this.a = activity;
        dwqf dwqfVar = cgskVar.a().c;
        doqw doqwVar = (dwqfVar == null ? dwqf.g : dwqfVar).b;
        doqwVar = doqwVar == null ? doqw.c : doqwVar;
        if (doqwVar.a == 6) {
            dnjpVar = (dnjp) doqwVar.b;
        } else {
            dnjpVar = dnjp.b;
        }
        dnvs dnvsVar = dnjpVar.a;
        dnvsVar = dnvsVar == null ? dnvs.d : dnvsVar;
        dbsk.z(0, dnvsVar.b.size());
        this.b = dnvsVar.a;
        this.c = dnvsVar.b.get(0);
        dnvp dnvpVar = dnvsVar.c;
        this.d = dnvpVar == null ? dnvp.c : dnvpVar;
        this.h = gesVar;
        this.s = btvoVar;
    }

    private final boolean am() {
        int a = dwsv.a(this.s.getUgcTasksParameters().e);
        if (a == 0) {
            a = 2;
        }
        return a == 3 || a == 4;
    }

    private final void an(dosq dosqVar) {
        this.e = dosqVar;
        this.t = null;
        u(cgwf.EDIT_COMPLETED);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public void A(ilo iloVar) {
        dnvp dnvpVar;
        if (!iloVar.f) {
            return;
        }
        if (am() && (((dnvpVar = this.d) == null || !dnvpVar.a) && (dnvpVar == null || !dnvpVar.b))) {
            ac(iloVar);
        }
        ae();
    }

    @Override // defpackage.cgwg
    public void B() {
        this.e = dosq.VOTE_UNKNOWN;
        cqkx.p(this);
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean C() {
        return Boolean.valueOf(this.e != dosq.VOTE_UNKNOWN);
    }

    @Override // defpackage.cgwg
    @dzsi
    public Serializable D() {
        return null;
    }

    @Override // defpackage.cgwg
    public void E(Object obj) {
    }

    @Override // defpackage.cgwg
    public void K() {
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean O() {
        return true;
    }

    @Override // defpackage.cgwk
    public cjtd RA() {
        cjta b = cjtd.b();
        b.d = dtyd.aG;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.cgva
    public Boolean a() {
        return Boolean.FALSE;
    }

    public void ac(ilo iloVar) {
    }

    @dzsi
    public dnfe ad() {
        return null;
    }

    public void ae() {
    }

    protected dosq af() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag() {
        return am() && this.g != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String ah() {
        Activity activity;
        if (!ag() || (activity = this.a) == null) {
            return null;
        }
        return activity.getString(R.string.FACTUAL_MODERATION_SUGGESTED_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final String ai() {
        Activity activity = this.a;
        if (activity != null) {
            return activity.getString(R.string.FACTUAL_MODERATION_CURRENT_VALUE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final dnfe aj() {
        cgwu cgwuVar = this.g;
        if (cgwuVar == null) {
            return null;
        }
        String charSequence = cgwuVar.b().toString();
        dneu bZ = dnfe.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ.b;
        charSequence.getClass();
        dnfeVar.a |= 2;
        dnfeVar.c = charSequence;
        return bZ.bK();
    }

    public void ak(cgfa cgfaVar) {
        this.e = dosq.VOTE_INCORRECT;
        this.t = cgfaVar.a;
        this.j = cgwf.EDIT_COMPLETED;
        this.l.L(this);
    }

    public CharSequence b() {
        return "";
    }

    @Override // defpackage.cgva
    @dzsi
    public cguz c() {
        return this.f;
    }

    @Override // defpackage.cgva
    @dzsi
    public cguz d() {
        return this.g;
    }

    public CharSequence e() {
        return "";
    }

    @Override // defpackage.cgva
    @dzsi
    public List<jbf> f() {
        return null;
    }

    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.cgva
    public dosk h() {
        doac bZ = doad.d.bZ();
        cgul cgulVar = this.o;
        int b = (int) (cgulVar.a.b() - cgulVar.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doad doadVar = (doad) bZ.b;
        doadVar.a |= 1;
        doadVar.c = b;
        Iterator<doab> it = this.p.iterator();
        while (it.hasNext()) {
            doab next = it.next();
            dnzy bZ2 = dnzz.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnzz dnzzVar = (dnzz) bZ2.b;
            dnzzVar.b = next.f;
            dnzzVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            doad doadVar2 = (doad) bZ.b;
            dnzz bK = bZ2.bK();
            bK.getClass();
            dsrj<dnzz> dsrjVar = doadVar2.b;
            if (!dsrjVar.a()) {
                doadVar2.b = dsqw.cl(dsrjVar);
            }
            doadVar2.b.add(bK);
        }
        dosj bZ3 = dosk.i.bZ();
        String str = this.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dosk doskVar = (dosk) bZ3.b;
        str.getClass();
        doskVar.a |= 1;
        doskVar.b = str;
        dqgh b2 = dqgh.b(this.c.b);
        if (b2 == null) {
            b2 = dqgh.UNDEFINED;
        }
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dosk doskVar2 = (dosk) bZ3.b;
        doskVar2.c = b2.af;
        doskVar2.a |= 2;
        dosq af = af();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dosk doskVar3 = (dosk) bZ3.b;
        doskVar3.d = af.e;
        doskVar3.a |= 4;
        dosh bZ4 = dosi.a.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dosi.b((dosi) bZ4.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dosk doskVar4 = (dosk) bZ3.b;
        dosi bK2 = bZ4.bK();
        bK2.getClass();
        doskVar4.g = bK2;
        doskVar4.a |= 32;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dosk doskVar5 = (dosk) bZ3.b;
        doad bK3 = bZ.bK();
        bK3.getClass();
        doskVar5.h = bK3;
        doskVar5.a |= 64;
        doso dosoVar = this.t;
        if (dosoVar != null) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dosk doskVar6 = (dosk) bZ3.b;
            doskVar6.f = dosoVar.i;
            doskVar6.a |= 16;
        }
        dnfe ad = ad();
        if (ad != null) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dosk doskVar7 = (dosk) bZ3.b;
            ad.getClass();
            doskVar7.e = ad;
            doskVar7.a |= 8;
        }
        return bZ3.bK();
    }

    @Override // defpackage.cgva
    public CharSequence i() {
        dosq dosqVar = dosq.VOTE_UNKNOWN;
        int ordinal = this.e.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.a.getString(R.string.FACTUAL_MODERATION_VOTE_YES);
            }
            return ordinal != 3 ? "" : this.a.getString(R.string.FACTUAL_MODERATION_VOTE_NOT_SURE);
        }
        return this.a.getString(R.string.FACTUAL_MODERATION_VOTE_NO);
    }

    @Override // defpackage.cgva
    public Boolean j() {
        return Boolean.valueOf(this.s.getUgcTasksParameters().f);
    }

    @Override // defpackage.cgva
    public jht k() {
        jhu h = jhv.h();
        jhm a = jhm.a();
        a.l = R.string.UGC_TASKS_REPORT_TEXT;
        a.a = this.a.getText(R.string.UGC_TASKS_REPORT_TEXT);
        a.d(new View.OnClickListener(this) { // from class: cgwv
            private final cgww a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cgww cgwwVar = this.a;
                cgwwVar.h.aZ(new cgfc());
            }
        });
        h.d(a.c());
        return h.b();
    }

    @Override // defpackage.cgwk
    public Boolean l() {
        return Boolean.valueOf(this.e == dosq.VOTE_CORRECT);
    }

    @Override // defpackage.cgwk
    public Boolean m() {
        return Boolean.valueOf(this.e == dosq.VOTE_INCORRECT);
    }

    @Override // defpackage.cgwk
    public Boolean n() {
        return Boolean.valueOf(this.e == dosq.VOTE_ABSTAIN);
    }

    @Override // defpackage.cgwk
    public cqkl o() {
        an(dosq.VOTE_CORRECT);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl p() {
        an(dosq.VOTE_INCORRECT);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cqkl q() {
        an(dosq.VOTE_ABSTAIN);
        return cqkl.a;
    }

    @Override // defpackage.cgwk
    public cjtd r() {
        cjta b = cjtd.b();
        b.d = dtyd.aH;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.cgwk
    public cjtd s() {
        cjta b = cjtd.b();
        b.d = dtyd.aF;
        b.g(this.m);
        return b.a();
    }

    @Override // defpackage.chal, defpackage.cgwg
    public void u(cgwf cgwfVar) {
        super.u(cgwfVar);
        if (cgwfVar != cgwf.POSTED || this.t == null) {
            return;
        }
        Toast.makeText(this.a, (int) R.string.THANK_YOU_FOR_IMPROVING_GOOGLE_MAPS, 0).show();
    }

    @Override // defpackage.chal, defpackage.cgwg
    public Boolean w() {
        boolean booleanValue = super.w().booleanValue();
        ilo c = this.k.c();
        boolean z = false;
        if (c != null && c.f && booleanValue) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwg
    public void y(cqiv cqivVar) {
        cqivVar.a(new cgno(), this);
    }
}
