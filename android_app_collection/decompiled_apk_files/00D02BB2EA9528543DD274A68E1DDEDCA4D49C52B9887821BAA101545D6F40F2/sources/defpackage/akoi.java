package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akoi  reason: default package */
/* loaded from: classes2.dex */
public class akoi extends bfkr {
    private static final bfke a;
    private static final dcqe b;
    private final cqss c;
    @dzsi
    private cqtd d;
    private dqja e;
    private final bmem f;
    private final bflb g;
    private final eiq h;

    static {
        bfkd g = bfke.g.g();
        g.c(dtxo.aI);
        g.d(dtxo.aJ);
        g.b(false);
        a = g.a();
        b = dcqe.c("akoi");
    }

    public akoi(Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar, eiq eiqVar) {
        super(null, null, dbsg.i(a), activity, cjqyVar, bhatVar, btvoVar, bbutVar, bflbVar, bwshVar, bvrbVar, cqhnVar, dxioVar, bvjjVar, bvpeVar, hucVar, bmdyVar);
        this.c = cqrt.c(R.color.qu_google_blue_700);
        this.d = null;
        this.e = dqja.g;
        this.f = new bmem(bwshVar, bbutVar);
        this.g = bflbVar;
        this.h = eiqVar;
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public cqss a() {
        return this.c;
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Boolean b() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public Boolean c() {
        boolean z = true;
        if (!b().booleanValue() && !i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfkr, defpackage.bfkk
    public cqtd d() {
        cqtd cqtdVar = this.d;
        dbsk.s(cqtdVar);
        return cqtdVar;
    }

    public void e(diwb diwbVar) {
        dive diveVar = diwbVar.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        dsrj<dwfl> dsrjVar = diveVar.a;
        dqja dqjaVar = diwbVar.M;
        if (dqjaVar == null) {
            dqjaVar = dqja.g;
        }
        this.e = dqjaVar;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        super.H(dittVar.f, diwbVar.c, dsrjVar);
        bmem bmemVar = this.f;
        dive diveVar2 = diwbVar.v;
        if (diveVar2 == null) {
            diveVar2 = dive.d;
        }
        bmemVar.a = diveVar2.c;
        if (dsrjVar.isEmpty()) {
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            dpwt b2 = dpwt.b(dittVar2.d);
            if (b2 == null) {
                b2 = dpwt.EVENT_CATEGORY_UNKNOWN;
            }
            cqtd cqtdVar = null;
            if (!akny.a(b2.K, dpwt.EVENT_CATEGORY_CRISIS.K)) {
                dive diveVar3 = diwbVar.v;
                if (diveVar3 == null) {
                    diveVar3 = dive.d;
                }
                if (!diveVar3.b) {
                    cqtdVar = iup.e(R.raw.experiences_backdrop_illustration);
                }
            }
            this.d = cqtdVar;
        }
    }

    @Override // defpackage.bfkr
    @dzsi
    protected final jbt f(jbp jbpVar, int i) {
        aklx i2;
        if (i != 0 || (i2 = aklx.i(this.e, this.h)) == null) {
            return null;
        }
        if (i2.b().equals(dqiv.BUTTERFLY)) {
            bvoo.h("Format.BUTTERFLY is no longer supported. Use Format.LOTTIE instead.", new Object[0]);
        }
        return new akoh(i2, jbpVar);
    }

    @Override // defpackage.bfkr
    protected final List<jbp> g(ilo iloVar, List<dwfl> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (dwfl dwflVar : list) {
            arrayList.add(this.g.a(dwflVar, i, iloVar, this.f, L(dwflVar), true, null));
            i++;
        }
        return arrayList;
    }

    @Override // defpackage.bfkr
    protected final bmea h() {
        return this.f;
    }
}
