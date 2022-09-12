package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bloa  reason: default package */
/* loaded from: classes3.dex */
public final class bloa extends bfdi implements bqld, begp {
    private static final dcqe ad = dcqe.c("bloa");
    public cqkj a;
    private boolean ai;
    private boolean ak;
    private blon al;
    private blmq am;
    @dzsi
    private ViewGroup an;
    @dzsi
    private cqkf<bllb> ao;
    @dzsi
    private bwrs<ilo> ap;
    public btrm b;
    public dzsj<blon> c;
    public bwqv d;
    public dxio<glj> e;
    public blkj f;
    public blmr g;
    private boolean ae = false;
    private dbsg<drdk> af = dbpy.a;
    private dbsg<String> ag = dbpy.a;
    private djuu ah = djuu.UNKNOWN_SORT_CRITERIA;
    private dbsg<String> aj = dbpy.a;

    public static bloa g(bwqv bwqvVar, bwrs<ilo> bwrsVar, boolean z, dbsg<drdk> dbsgVar, dbsg<String> dbsgVar2, dbsg<djuu> dbsgVar3, boolean z2, dbsg<String> dbsgVar4) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        if (dbsgVar.a()) {
            bwqvVar.c(bundle, "argTopicKey", bvrt.b(dbsgVar.b()));
        }
        bundle.putString("argFilterKey", dbsgVar2.f());
        bundle.putInt("argSortCriterionKey", dbsgVar3.c(djuu.UNKNOWN_SORT_CRITERIA).f);
        bundle.putBoolean("argFocusOnSearchBoxKey", z2);
        boolean z3 = true;
        if (!dbsgVar2.a() && !dbsgVar3.a() && !z2) {
            z3 = false;
        }
        bundle.putBoolean("argInSearchEditMode", z3);
        bundle.putBoolean("argScrollToUsersOwnReview", z);
        bundle.putString("argFirstPostIdKey", dbsgVar4.f());
        bloa bloaVar = new bloa();
        bloaVar.B(bundle);
        return bloaVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((blob) btsx.b(blob.class, this)).cU(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bllb> cqkfVar = this.ao;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.an;
            if (viewGroup != null) {
                viewGroup.removeView(this.ao.c());
            }
            this.ao = null;
        }
        this.an = null;
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.REVIEWS;
    }

    @Override // defpackage.bqld
    public final void aS(bqlf bqlfVar) {
        if (this.al == null) {
            return;
        }
        int d = bqlfVar.d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        }
        if (i != 0) {
            return;
        }
        this.al.q(bqlfVar.a());
        cqkx.p(this.al);
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        blon blonVar = this.al;
        if (blonVar != null) {
            blonVar.o();
        }
    }

    @Override // defpackage.begp
    public final void aU() {
        if (this.al == null) {
            return;
        }
        if (this.af.a()) {
            drdk b = this.af.b();
            this.af = dbpy.a;
            bksa c = this.al.c();
            if (c != null) {
                c.a(b, this.aj.f());
            }
        } else if (this.ae) {
            this.ae = false;
            this.al.n(this.ag.f(), this.ah, djck.i, this.aj.f());
            this.al.d().k(this.ai);
        } else {
            this.al.n(null, null, null, this.aj.f());
            this.al.d().l(false);
        }
        this.aj = dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.ap;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.an = viewGroup;
        cqkf<bllb> d = this.a.d(new bldm(), viewGroup, false);
        this.ao = d;
        d.e(this.al);
        blkj blkjVar = this.f;
        bwrs<ilo> bwrsVar = this.ap;
        int bm = blkjVar.a.getUgcParameters().bm();
        if (bm == 0) {
            throw null;
        }
        if (bm != 2 || !blkjVar.b(bwrsVar) || this.am == null) {
            return d.c();
        }
        ViewGroup e = gwu.e(d.c());
        this.a.c(new gvs(), e).e(this.am);
        return e;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        blon blonVar = this.al;
        if (blonVar != null) {
            blonVar.t(this.b);
        }
        super.am();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        final Bundle bundle2 = this.o;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        this.ae = bundle2.getBoolean("argInSearchEditMode");
        this.af = dbpy.a;
        this.ak = bundle2.getBoolean("argScrollToUsersOwnReview");
        try {
            bvrt bvrtVar = (bvrt) this.d.d(bvrt.class, bundle2, "argTopicKey");
            if (bvrtVar != null) {
                this.af = dbsg.i((drdk) bvrtVar.e((dssr) drdk.c.cu(7), drdk.c));
            }
        } catch (IOException unused) {
        }
        if (this.af.a()) {
            this.ae = false;
        }
        this.ag = dbsg.j(bundle2.getString("argFilterKey"));
        this.ai = bundle2.getBoolean("argFocusOnSearchBoxKey");
        this.ah = djuu.b(bundle2.getInt("argSortCriterionKey"));
        this.aj = dbsg.j(bundle2.getString("argFirstPostIdKey"));
        final fd fdVar = this.D;
        dbsg d = ((dbsg) new dbty(this, bundle2) { // from class: blny
            private final bloa a;
            private final Bundle b;

            {
                this.a = this;
                this.b = bundle2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bwrs bwrsVar;
                bloa bloaVar = this.a;
                try {
                    bwrsVar = bloaVar.d.e(ilo.class, this.b, "placemark");
                } catch (IOException e) {
                    bvoo.j(e);
                    bwrsVar = null;
                }
                return dbsg.j(bwrsVar);
            }
        }.a()).d((dbsg) new dbty(fdVar) { // from class: blnz
            private final fd a;

            {
                this.a = fdVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                fd fdVar2 = this.a;
                return dbsg.j(fdVar2 instanceof befy ? ((befy) fdVar2).bp() : null);
            }
        }.a());
        if (d.a()) {
            try {
                dbsk.s((ilo) bwrs.b((bwrs) d.b()));
            } catch (ClassCastException | NullPointerException unused2) {
                bvoo.h("Can't find valid placemarkRef", new Object[0]);
                d = dbpy.a;
            }
        }
        if (d.a()) {
            this.ap = (bwrs) d.b();
            blon a = this.c.a();
            this.al = a;
            a.q((bwrs) d.b());
            this.al.r(bloa.class);
            this.al.s(this.b);
            blmr blmrVar = this.g;
            bwrs bwrsVar = (bwrs) d.b();
            blmr.a(bwrsVar, 1);
            Context context = (Context) ((dxjd) blmrVar.a).a;
            blmr.a(context, 2);
            this.am = new blmq(bwrsVar, context, blmrVar.b);
            return;
        }
        this.ap = null;
        bvoo.h("No placemark storage in the bundle nor fragment.", new Object[0]);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        blon blonVar = this.al;
        if (blonVar != null) {
            blonVar.m();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.eb;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        blon blonVar;
        RecyclerView p;
        super.s();
        if (this.al == null) {
            return;
        }
        this.e.a().e(this.al.d().h());
        if (!this.ak || (p = (blonVar = this.al).p()) == null || blonVar.e().y() == null) {
            return;
        }
        blij blijVar = blonVar.g;
        Integer y = blonVar.e().y();
        dbsk.s(y);
        blijVar.b(p, y.intValue(), 0);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (this.al != null) {
            this.e.a().j(this.al.d().h());
        }
        super.u();
    }
}
