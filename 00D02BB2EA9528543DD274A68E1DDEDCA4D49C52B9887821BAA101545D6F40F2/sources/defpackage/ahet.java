package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahet  reason: default package */
/* loaded from: classes2.dex */
public class ahet extends agxc implements agzq {
    public static final /* synthetic */ int a = 0;
    private final gga b;
    private final dxio<bkpi> c;
    private final axne d;
    private final bwrs<ilo> e;
    private final cdjd f;
    private final ixe g;
    private final axog h;
    private final bvip i;
    private final cecz j;
    private final agxe k;
    private final dlcc l;

    public ahet(gga ggaVar, dxio<bkpi> dxioVar, axjh axjhVar, ixf ixfVar, axoi axoiVar, bviq bviqVar, ceda cedaVar, dlcc dlccVar, int i, agxe agxeVar) {
        String str;
        axoh axohVar;
        this.b = ggaVar;
        this.c = dxioVar;
        this.l = dlccVar;
        dqau r = axjhVar.r(dlccVar.c);
        String str2 = dlccVar.c;
        if (r != null) {
            dqkn dqknVar = r.b;
            str = (dqknVar == null ? dqkn.e : dqknVar).b;
        } else {
            dlcb dlcbVar = dlccVar.d;
            docg docgVar = (dlcbVar == null ? dlcb.e : dlcbVar).c;
            dnpq dnpqVar = (docgVar == null ? docg.M : docgVar).m;
            str = (dnpqVar == null ? dnpq.g : dnpqVar).d;
        }
        this.d = axjhVar.o(str2, str, dfqc.STREAM_CONTENT_CARD);
        ily ilyVar = new ily();
        dlcb dlcbVar2 = dlccVar.d;
        dlcx dlcxVar = (dlcbVar2 == null ? dlcb.e : dlcbVar2).b;
        dvyw dvywVar = (dlcxVar == null ? dlcx.e : dlcxVar).c;
        ilyVar.E(dvywVar == null ? dvyw.bv : dvywVar);
        bwrs<ilo> a2 = bwrs.a(ilyVar.d());
        this.e = a2;
        dlcb dlcbVar3 = dlccVar.d;
        docg docgVar2 = (dlcbVar3 == null ? dlcb.e : dlcbVar3).c;
        cdrr r2 = cdrr.r(docgVar2 == null ? docg.M : docgVar2, cdja.PUBLISHED);
        this.f = r2;
        this.g = ixfVar.b(a2, r2, cdjk.LOCAL_STREAM, false);
        if (r == null) {
            dxio a3 = ((dxjh) axoiVar.a).a();
            axoi.b(a3, 1);
            axoi.b(dlccVar, 2);
            axohVar = new axoh(a3, dlccVar);
        } else {
            axohVar = axoiVar.a(r);
        }
        this.h = axohVar;
        ilo c = a2.c();
        dbsk.s(c);
        final String string = ggaVar.getString(R.string.LOCALSTREAM_PEOPLE_FOLLOW_POST_REVIEW_IMAGE_TALKBACK_MESSAGE, new Object[]{c.n()});
        bvim g = bvin.g();
        g.g(agxeVar.b(dtxu.bA));
        bvin a4 = g.a();
        dlcb dlcbVar4 = dlccVar.d;
        this.i = bviqVar.a(dcbg.b((dlcbVar4 == null ? dlcb.e : dlcbVar4).d).s(new dbrn(string) { // from class: aheq
            private final String a;

            {
                this.a = string;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                int i2 = ahet.a;
                return agxk.n(this.a, (dwfl) obj);
            }
        }).z(), i, new bvio(TimeUnit.SECONDS.toMillis(3L)), aher.a, a4);
        cecz a5 = cedaVar.a(agxeVar.b(dtxu.ct), new ahes(), false);
        this.j = a5;
        a5.v(r2, "", "", dbpy.a, false, false);
        this.k = agxeVar;
    }

    @Override // defpackage.agzq
    public oxt a() {
        return this.j;
    }

    @Override // defpackage.agzq
    public izm b() {
        return this.g;
    }

    @Override // defpackage.agzq
    public cqkl c(View view) {
        return this.k.f(view);
    }

    @Override // defpackage.agzq
    public CharSequence h() {
        gga ggaVar = this.b;
        ilo c = this.e.c();
        dbsk.s(c);
        return ggaVar.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_FOR_PEOPLE_FOLLOW_CONTENT_CARD, new Object[]{this.h.a(), c.n()});
    }

    @Override // defpackage.agzq
    public axog i() {
        return this.h;
    }

    @Override // defpackage.agzq
    @dzsi
    public axne j() {
        if (this.d.l().booleanValue()) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.agzq
    public bvhu k() {
        return this.i;
    }

    @Override // defpackage.agzq
    public cqkl l() {
        this.c.a().e(this.e, this.f, bkpg.f(cdjk.LOCAL_STREAM));
        return cqkl.a;
    }

    @Override // defpackage.agzq
    public cjtd m(ddho ddhoVar) {
        return this.k.b(ddhoVar);
    }

    public void n() {
        this.i.n();
    }

    public void o() {
        this.i.o();
    }

    public int p() {
        return this.i.k().intValue();
    }

    public dlcc q() {
        dlcb dlcbVar = this.l.d;
        if (dlcbVar == null) {
            dlcbVar = dlcb.e;
        }
        docg docgVar = dlcbVar.c;
        if (docgVar == null) {
            docgVar = docg.M;
        }
        dqjc l = this.g.l();
        dlcc dlccVar = this.l;
        dsqp dsqpVar = (dsqp) dlccVar.cu(5);
        dsqpVar.bC(dlccVar);
        dlbz dlbzVar = (dlbz) dsqpVar;
        dsqp dsqpVar2 = (dsqp) dlcbVar.cu(5);
        dsqpVar2.bC(dlcbVar);
        dlca dlcaVar = (dlca) dsqpVar2;
        dsqp dsqpVar3 = (dsqp) docgVar.cu(5);
        dsqpVar3.bC(docgVar);
        docc doccVar = (docc) dsqpVar3;
        int i = l.b;
        if (doccVar.c) {
            doccVar.bF();
            doccVar.c = false;
        }
        docg docgVar2 = (docg) doccVar.b;
        docgVar2.a |= 4194304;
        docgVar2.D = i;
        dqjh b = dqjh.b(l.c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (doccVar.c) {
            doccVar.bF();
            doccVar.c = false;
        }
        docg docgVar3 = (docg) doccVar.b;
        docgVar3.C = b.e;
        docgVar3.a |= 2097152;
        if (dlcaVar.c) {
            dlcaVar.bF();
            dlcaVar.c = false;
        }
        dlcb dlcbVar2 = (dlcb) dlcaVar.b;
        docg bK = doccVar.bK();
        bK.getClass();
        dlcbVar2.c = bK;
        dlcbVar2.a |= 2;
        if (dlbzVar.c) {
            dlbzVar.bF();
            dlbzVar.c = false;
        }
        dlcc dlccVar2 = (dlcc) dlbzVar.b;
        dlcb bK2 = dlcaVar.bK();
        bK2.getClass();
        dlccVar2.d = bK2;
        dlccVar2.a |= 4;
        return dlbzVar.bK();
    }
}
