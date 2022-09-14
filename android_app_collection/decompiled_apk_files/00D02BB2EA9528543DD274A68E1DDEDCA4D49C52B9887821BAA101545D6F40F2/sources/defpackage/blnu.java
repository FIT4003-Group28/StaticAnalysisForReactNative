package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
@Deprecated
/* renamed from: blnu  reason: default package */
/* loaded from: classes3.dex */
public final class blnu extends hxf implements bqld {
    private static final dcqe g = dcqe.c("blnu");
    private boolean ah;
    private blon aj;
    @dzsi
    private cqkf<bllb> ak;
    public bwqv b;
    public efg c;
    public cqkj d;
    public btrm e;
    public dzsj<blon> f;
    private boolean ad = false;
    private dbsg<drdk> ae = dbpy.a;
    private dbsg<String> af = dbpy.a;
    private djuu ag = djuu.UNKNOWN_SORT_CRITERIA;
    private dbsg<String> ai = dbpy.a;

    @Deprecated
    public static blnu aR(bwqv bwqvVar, bwrs<ilo> bwrsVar, dbsg<drdk> dbsgVar, dbsg<String> dbsgVar2, dbsg<djuu> dbsgVar3, boolean z, dbsg<String> dbsgVar4) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        if (dbsgVar.a()) {
            bwqvVar.c(bundle, "argTopicKey", bvrt.b(dbsgVar.b()));
        }
        bundle.putString("argFilterKey", dbsgVar2.f());
        bundle.putBoolean("argFocusOnSearchBoxKey", z);
        bundle.putInt("argSortCriterionKey", dbsgVar3.c(djuu.UNKNOWN_SORT_CRITERIA).f);
        boolean z2 = true;
        if (!dbsgVar2.a() && !dbsgVar3.a() && !z) {
            z2 = false;
        }
        bundle.putBoolean("argInSearchEditModeKey", z2);
        bundle.putString("argFirstPostIdKey", dbsgVar4.f());
        blnu blnuVar = new blnu();
        blnuVar.B(bundle);
        blnuVar.aJ();
        return blnuVar;
    }

    private final dbsg<bwrs<ilo>> aT() {
        try {
            return dbsg.j(this.b.e(ilo.class, this.o, "placemark"));
        } catch (IOException e) {
            bvoo.h("Corrupt storage data: %s", e);
            return dbpy.a;
        }
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((blnv) btsx.b(blnv.class, this)).cT(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bllb> cqkfVar = this.ak;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ak = null;
        }
    }

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        int d = bqlfVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 0) {
                return;
            }
            dbsk.s(this.aj);
            this.aj.q(bqlfVar.a());
            cqkx.p(this.aj);
            return;
        }
        throw null;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        dbsg<bwrs<ilo>> aT = aT();
        return jib.g(J(), (String) dbsg.j(aT.a() ? aT.b().c() : null).h(new dbrn(this) { // from class: blns
            private final fd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.Rq(R.string.REVIEWS_ABOUT_PLACE, ((ilo) obj).q());
            }
        }).e(new dbty(this) { // from class: blnt
            private final fd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.Rp(R.string.ALL_REVIEWS);
            }
        }));
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bllb> c = this.d.c(new bldm(), null);
        this.ak = c;
        c.e(this.aj);
        return this.ak.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.ad = bundle2.getBoolean("argInSearchEditModeKey");
        this.ae = dbpy.a;
        try {
            bvrt bvrtVar = (bvrt) this.b.d(bvrt.class, bundle2, "argTopicKey");
            if (bvrtVar != null) {
                this.ae = dbsg.i((drdk) bvrtVar.e((dssr) drdk.c.cu(7), drdk.c));
            }
        } catch (IOException unused) {
        }
        if (this.ae.a()) {
            this.ad = false;
        }
        this.af = dbsg.j(bundle2.getString("argFilterKey"));
        this.ah = bundle2.getBoolean("argFocusOnSearchBoxKey");
        this.ag = djuu.b(bundle2.getInt("argSortCriterionKey"));
        this.ai = dbsg.j(bundle2.getString("argFirstPostIdKey"));
        blon a = this.f.a();
        this.aj = a;
        a.q(aT().b());
        this.aj.r(blnu.class);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        blon blonVar = this.aj;
        if (blonVar != null) {
            blonVar.m();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.eb;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        View view = this.P;
        if (view == null) {
            return;
        }
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.w(view);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        this.aj.s(this.e);
        if (this.ae.a()) {
            drdk b = this.ae.b();
            this.ae = dbpy.a;
            bksa c = this.aj.c();
            if (c != null) {
                c.a(b, this.ai.f());
            }
        } else if (this.ad) {
            this.ad = false;
            this.aj.n(this.af.f(), this.ag, djck.i, this.ai.f());
            this.aj.d().k(this.ah);
        } else {
            this.aj.n(null, null, null, this.ai.f());
        }
        this.ai = dbpy.a;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.aj.t(this.e);
        super.u();
    }
}
