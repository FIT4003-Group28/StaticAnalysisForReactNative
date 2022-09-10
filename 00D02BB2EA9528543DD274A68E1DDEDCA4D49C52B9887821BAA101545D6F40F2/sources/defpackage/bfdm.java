package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bfdm  reason: default package */
/* loaded from: classes3.dex */
public final class bfdm extends bfdi {
    private static final dcqe ag = dcqe.c("bfdm");
    public cqhn a;
    public bfbn ad;
    public bwrs<ilo> ae;
    @dzsi
    private ViewGroup ah;
    @dzsi
    private cqkf<bnie> ai;
    private bnjl aj;
    private bege ak;
    public dxio<dbpk> b;
    public bwqv c;
    public bnjm d;
    public Executor e;
    public bfbl f;
    public cqkj g;
    private final crzp<bfbm> al = new bfdk(this);
    public final dbpg<Void, Uri> af = new bfdl(this);

    @Override // defpackage.ges
    public final void Nv() {
        ((bfdn) btsx.b(bfdn.class, this)).cH(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        bnjl bnjlVar = this.aj;
        if (bnjlVar != null) {
            bnjlVar.d();
        }
        cqkf<bnie> cqkfVar = this.ai;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.ah;
            if (viewGroup != null) {
                viewGroup.removeView(this.ai.c());
            }
            this.ai = null;
        }
        this.ah = null;
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        if (this.ak == null) {
            this.ak = (bege) this.o.getSerializable("tab type");
        }
        return this.ak;
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        View view = this.P;
        if (!(view instanceof RecyclerView)) {
            return;
        }
        final RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.post(new Runnable(recyclerView) { // from class: bfdj
            private final RecyclerView a;

            {
                this.a = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.l(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.ae;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        behy behyVar;
        this.ah = viewGroup;
        cqkf<bnie> d = this.g.d(new bgan(), viewGroup, false);
        this.ai = d;
        if (this.aj == null) {
            fd fdVar = this.D;
            dbsk.a(fdVar instanceof bdyb);
            dbsk.s(fdVar);
            bmlh aT = ((bdyb) fdVar).aT();
            if (aT != null) {
                behyVar = aT.j();
            } else {
                bvoo.h("TabsViewModel is null", new Object[0]);
                behyVar = null;
            }
            if (behyVar == null) {
                return null;
            }
            bnjm bnjmVar = this.d;
            cqhn cqhnVar = this.a;
            bege aR = aR();
            Executor a = bnjmVar.a.a();
            bnjm.a(a, 1);
            bnjj a2 = bnjmVar.b.a();
            bnjm.a(a2, 2);
            bnjm.a(cqhnVar, 3);
            bnjm.a(aR, 4);
            bnjm.a(behyVar, 5);
            this.aj = new bnjl(a, a2, cqhnVar, aR, behyVar);
        }
        this.aj.c();
        d.e(this.aj);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (aR() == bege.OVERVIEW) {
            this.ad.a().c(this.al);
        }
        super.am();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (aR() == bege.OVERVIEW) {
            this.b.a().e(this.af);
            this.ad.a().a(this.al, this.e);
        }
        this.ae = cctq.b(this.o, this.c);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return aR() == bege.OVERVIEW ? dtxy.kC : aR() == bege.ABOUT ? dtxy.gQ : dtxy.a;
    }
}
