package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqly  reason: default package */
/* loaded from: classes4.dex */
public final class bqly implements bqji {
    public static final dcqe a = dcqe.c("bqly");
    public final gga b;
    public final btrm c;
    public final bwqv d;
    public final cjxd e;
    public final dzsj<begg> f;
    private final dxio<akfc> g;
    private final dxio<bqlc> h;
    private final auhi i;
    private final bvjj j;
    private final bvrb k;
    private final dxio<bkpi> l;
    private final btvo m;
    private final cdnv n;

    public bqly(gga ggaVar, btrm btrmVar, bwqv bwqvVar, cjxd cjxdVar, dxio<akfc> dxioVar, dxio<bqlc> dxioVar2, auhi auhiVar, bvjj bvjjVar, bvrb bvrbVar, dxio<bkpi> dxioVar3, dzsj<begg> dzsjVar, btvo btvoVar, cdnv cdnvVar) {
        this.b = ggaVar;
        this.c = btrmVar;
        this.d = bwqvVar;
        this.e = cjxdVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = auhiVar;
        this.j = bvjjVar;
        this.k = bvrbVar;
        this.l = dxioVar3;
        this.f = dzsjVar;
        this.m = btvoVar;
        this.n = cdnvVar;
    }

    @Override // defpackage.bqji
    public final void a() {
        gga ggaVar = this.b;
        bwqv bwqvVar = this.d;
        Resources resources = ggaVar.getResources();
        bqma bqmaVar = new bqma();
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.EVENTS_UGC);
        bxkoVar.g(resources.getString(R.string.SEARCH_FOR_REVIEW_SUGGESTIONS_HINT));
        bxkoVar.q(false);
        bxkoVar.s(false);
        bxkoVar.j = false;
        bxkoVar.V();
        bxkoVar.z(301989889);
        bxkoVar.f = true;
        bqmaVar.bu(bwqvVar, bxkoVar, null);
        ggaVar.D(bqmaVar);
    }

    @Override // defpackage.bqji
    public final void b(bwrs<ilo> bwrsVar, bqjh bqjhVar) {
        this.g.a().a(akeu.j(new bqlv(this, bwrsVar, bqjhVar)).b());
    }

    @Override // defpackage.bqji
    public final void c(bqla bqlaVar, bwrs<ilo> bwrsVar, @dzsi bqlb bqlbVar) {
        this.h.a().b(bqlaVar, bwrsVar, bqlbVar);
    }

    @Override // defpackage.bqji
    public final void d(String str, dqgr dqgrVar, dnqh dnqhVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        this.l.a().h();
        this.h.a().c(str, dqgrVar, dnqhVar, bwrsVar, bqlbVar);
    }

    @Override // defpackage.bqji
    public final void e(String str, cdja cdjaVar, dnqh dnqhVar, bwrs<ilo> bwrsVar, bqlb bqlbVar) {
        dqgr dqgrVar = dqgr.UNKNOWN_REVIEW_STATE;
        cdja cdjaVar2 = cdja.UNKNOWN;
        int ordinal = cdjaVar.ordinal();
        if (ordinal == 1) {
            dqgrVar = dqgr.PUBLISHED;
        } else if (ordinal == 2) {
            dqgrVar = dqgr.DRAFT;
        }
        this.l.a().h();
        this.h.a().c(str, dqgrVar, dnqhVar, bwrsVar, bqlbVar);
    }

    public final void f(bwrs<ilo> bwrsVar, bqjh bqjhVar) {
        ges q;
        String c;
        if (!bqjhVar.a()) {
            dbsk.s(bwrsVar);
            ilo c2 = bwrsVar.c();
            dbsk.s(c2);
            int bo = this.m.getUgcParameters().bo();
            if (bo == 0) {
                throw null;
            }
            if (bo == 1 || c2.u) {
                q = bqxf.q(bqxf.aV(this.d, bwrsVar, bqjhVar, dbpy.a));
            } else {
                bwqv bwqvVar = this.d;
                dnqh j = bqjhVar.j();
                cdpd h = this.n.a(bqjhVar);
                Bundle bundle = new Bundle();
                bvrs.l(bundle, h);
                bvrs.l(bundle, j);
                bwqvVar.c(bundle, "PLACEMARK_REF", bwrsVar);
                q = new cdlu();
                q.B(bundle);
            }
            g(q, bqjhVar);
            return;
        }
        ilo c3 = bwrsVar.c();
        dbsk.s(c3);
        if (bqjhVar.c() == null) {
            c = c3.bq().r;
        } else {
            c = bqjhVar.c();
        }
        bqku c4 = bqla.c();
        bqkw k = bqkx.k();
        k.c(c3.ai());
        k.d(dqgr.PUBLISHED);
        k.f(bqjhVar.b());
        k.e(c);
        c4.b(k.h());
        bqky h2 = bqkz.h();
        h2.g(bqjhVar.h());
        h2.d(bqjhVar.j());
        h2.f(bqjhVar.k());
        c4.c(h2.a());
        this.h.a().a(this.b, c4.d(), bwrsVar, new bqlx(this, bwrsVar, bqjhVar));
    }

    public final void g(ges gesVar, bqjh bqjhVar) {
        this.b.D(gesVar);
        if (bqjhVar.m() != null) {
            avac.bp(this.b, Integer.valueOf(bqjhVar.m().dm), this.j, this.k, this.i);
        }
    }
}
