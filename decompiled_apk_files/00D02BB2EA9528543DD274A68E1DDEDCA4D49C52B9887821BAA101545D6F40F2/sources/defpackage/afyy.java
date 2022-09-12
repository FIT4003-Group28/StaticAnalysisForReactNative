package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.View;
import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: afyy  reason: default package */
/* loaded from: classes2.dex */
public final class afyy extends itb implements afzv {
    public final btvo b;
    public final cqat c;
    public final agwa d;
    public final afzs e;
    public final agal f;
    public final agbr g;
    @dzsi
    public btlu h;
    private final gfq j;
    private final btrm k;
    private final gga o;
    private final bwqv p;
    private final dxio<akfa> q;
    private final dehq r;
    private final agaw s;
    private final dxio<aedv> t;
    private final afyw u = new afyw(this);
    private final afyx v = new afyx(this);
    private final ail<Integer, Fragment$SavedState> w = new ail<>(1);
    private static final AtomicInteger i = new AtomicInteger(1);
    public static long a = Long.MIN_VALUE;

    public afyy(btvo btvoVar, cqat cqatVar, agwa agwaVar, gfq gfqVar, btrm btrmVar, gga ggaVar, bwqv bwqvVar, dxio<akfa> dxioVar, dehq dehqVar, afzs afzsVar, agal agalVar, agaw agawVar, agbr agbrVar, dxio<aedv> dxioVar2) {
        this.b = btvoVar;
        this.c = cqatVar;
        this.d = agwaVar;
        this.j = gfqVar;
        this.k = btrmVar;
        this.o = ggaVar;
        this.p = bwqvVar;
        this.q = dxioVar;
        this.r = dehqVar;
        this.e = afzsVar;
        this.f = agalVar;
        this.s = agawVar;
        this.g = agbrVar;
        this.t = dxioVar2;
    }

    private final afzm s(@dzsi dspd dspdVar, @dzsi Fragment$SavedState fragment$SavedState) {
        bwqv bwqvVar = this.p;
        btlu j = this.q.a().j();
        agxq bZ = agxr.i.bZ();
        agyi bZ2 = agyj.d.bZ();
        if (dspdVar != null) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            agyj agyjVar = (agyj) bZ2.b;
            dspdVar.getClass();
            agyjVar.a |= 2;
            agyjVar.c = dspdVar;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        agxr agxrVar = (agxr) bZ.b;
        agyj bK = bZ2.bK();
        bK.getClass();
        agxrVar.b = bK;
        agxrVar.a |= 1;
        String h = btlu.h(j);
        if (h != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            agxr agxrVar2 = (agxr) bZ.b;
            h.getClass();
            agxrVar2.a |= 8;
            agxrVar2.e = h;
        }
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "s", bvrt.b(bZ.bK()));
        afzm afzmVar = new afzm();
        afzmVar.B(bundle);
        afzmVar.E(fragment$SavedState);
        this.t.a().r(afzmVar, dktk.FEED);
        return afzmVar;
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        if (!this.e.a()) {
            return;
        }
        this.q.a().C().d(this.v, this.r);
        this.d.d();
        btrm btrmVar = this.k;
        afyw afywVar = this.u;
        dceq a2 = dcet.a();
        a2.b(agwo.class, new afyz(agwo.class, afywVar, bvrj.UI_THREAD));
        btrmVar.g(afywVar, a2.a());
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        if (!this.e.a()) {
            return;
        }
        this.k.a(this.u);
        this.d.e();
        this.q.a().C().c(this.v);
    }

    public final void e(@dzsi dspd dspdVar) {
        dira diraVar = (dira) dirb.l.bZ();
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        int i2 = dnqhVar.a | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dnqhVar.a = i2;
        dnqhVar.a = i2 | 2048;
        dnqhVar.j = true;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar = (dirb) diraVar.b;
        dnqh bK = bZ.bK();
        bK.getClass();
        dirbVar.b = bK;
        dirbVar.a |= 1;
        int i3 = this.b.getLocalStreamParameters().d().c;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar2 = (dirb) diraVar.b;
        int i4 = dirbVar2.a | 256;
        dirbVar2.a = i4;
        dirbVar2.i = i3;
        if (dspdVar != null) {
            dspdVar.getClass();
            dirbVar2.a = i4 | 128;
            dirbVar2.g = dspdVar;
        }
        this.f.b(diraVar);
        btlu j = this.q.a().j();
        this.f.a((dirb) diraVar.bK(), j, agak.b(this.s.e(j)), null);
    }

    @Override // defpackage.afzv
    public final void f(List<dlay> list, btlu btluVar) {
        this.o.D(afyt.g(list, btluVar));
    }

    @Override // defpackage.afzv
    public final void i(List<drjd> list, btlu btluVar) {
        if (!btluVar.l()) {
            return;
        }
        this.o.D(afyt.g(dcbg.b(list).s(afyv.a).z(), btluVar));
    }

    @Override // defpackage.afzv
    public final void j(dkzq dkzqVar) {
        if (this.e.a()) {
            gga ggaVar = this.o;
            Bundle bundle = new Bundle();
            bundle.putSerializable("areaFeedbackType", dkzqVar);
            afyl afylVar = new afyl();
            afylVar.B(bundle);
            ggaVar.D(afylVar);
        }
    }

    @Override // defpackage.afzv
    public final void k() {
        if (!this.e.a()) {
            return;
        }
        this.o.D(new afyq());
    }

    @Override // defpackage.afzv
    public final void l(dspd dspdVar) {
        if (!this.e.a()) {
            return;
        }
        e(dspdVar);
    }

    @Override // defpackage.afzv
    public final void m() {
        s(null, null);
    }

    @Override // defpackage.afzv
    public final void n(dspd dspdVar) {
        s(dspdVar, null);
    }

    @Override // defpackage.afzv
    public final void o(List<String> list) {
        ahin ahinVar = s(null, null).au;
        if (ahinVar != null) {
            ahinVar.N(list);
        }
    }

    @Override // defpackage.afzv
    public final void p(int i2) {
        if (this.j.e(afzm.class)) {
            return;
        }
        s(null, this.w.e(Integer.valueOf(i2)));
    }

    @Override // defpackage.afzv
    public final int q(@dzsi fd fdVar) {
        if (fdVar instanceof afzm) {
            agyj agyjVar = ((agxr) ((afzm) fdVar).ar.b).b;
            if (agyjVar == null) {
                agyjVar = agyj.d;
            }
            if ((agyjVar.a & 2) != 0) {
                return -1;
            }
            int andIncrement = i.getAndIncrement();
            ail<Integer, Fragment$SavedState> ailVar = this.w;
            Integer valueOf = Integer.valueOf(andIncrement);
            gn gnVar = fdVar.A;
            dbsk.s(gnVar);
            ailVar.c(valueOf, gnVar.r(fdVar));
            return andIncrement;
        }
        return -1;
    }

    @Override // defpackage.afzv
    public final void r(dspd dspdVar) {
        afzm afzmVar;
        ahin ahinVar;
        ahhv ahhvVar;
        fd K = this.o.K();
        if (!(K instanceof afzm) || (ahinVar = (afzmVar = (afzm) K).au) == null) {
            return;
        }
        Iterator<ahhv> it = ahinVar.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                ahhvVar = null;
                break;
            }
            ahhvVar = it.next();
            if (ahhvVar.t().d.equals(dspdVar)) {
                break;
            }
        }
        if (ahhvVar == null) {
            return;
        }
        View findViewById = afzmVar.b.findViewById(16908290);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new afze(afzmVar, findViewById, ahhvVar));
        findViewById.requestLayout();
    }
}
