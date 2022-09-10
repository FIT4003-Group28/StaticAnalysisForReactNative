package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkfq  reason: default package */
/* loaded from: classes3.dex */
public class bkfq extends hxf implements gfv {
    private static final dcqe f = dcqe.c("bkfq");
    @dzsi
    private cqkf<bkgn> ad;
    public cqkj b;
    public efg c;
    public bkgu d;
    public bvrb e;
    @dzsi
    private bkgt g;

    public static bkfq aR(ilo iloVar) {
        bkfq bkfqVar = new bkfq();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PLACEMARK_KEY", iloVar);
        bkfqVar.B(bundle);
        return bkfqVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((bkfr) btsx.b(bkfr.class, this)).cR(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bkgn> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = J().getString(R.string.BUSINESS_MESSAGING_QUOTE_ENTRYPOINT_LABEL);
        a.i = cqrt.f(2131232205);
        a.o = cjtd.a(dtxy.lz);
        a.f(new View.OnClickListener(this) { // from class: bkfp
            private final bkfq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bkfq bkfqVar = this.a;
                if (bkfqVar.aD) {
                    bkfqVar.J().onBackPressed();
                }
            }
        });
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bkgn> c = this.b.c(new bkgl(), null);
        this.ad = c;
        c.e(this.g);
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            ilo iloVar = (ilo) this.o.getSerializable("PLACEMARK_KEY");
            if (iloVar == null) {
                return;
            }
            bkgu bkguVar = this.d;
            bkgu.a(iloVar, 1);
            bkgu.a(this, 2);
            gga a = bkguVar.a.a();
            bkgu.a(a, 3);
            akfa a2 = bkguVar.b.a();
            bkgu.a(a2, 4);
            cchz a3 = bkguVar.c.a();
            bkgu.a(a3, 5);
            cqhn a4 = bkguVar.d.a();
            bkgu.a(a4, 6);
            Executor a5 = bkguVar.e.a();
            bkgu.a(a5, 7);
            dxio a6 = ((dxjh) bkguVar.f).a();
            bkgu.a(a6, 8);
            dxio a7 = ((dxjh) bkguVar.g).a();
            bkgu.a(a7, 9);
            btvo a8 = bkguVar.h.a();
            bkgu.a(a8, 10);
            cjqy a9 = bkguVar.i.a();
            bkgu.a(a9, 11);
            cjqq a10 = bkguVar.j.a();
            bkgu.a(a10, 12);
            this.g = new bkgt(iloVar, this, a, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        } catch (Exception e) {
            deki.b(e);
            bvoo.h("Failed to get placemark from Serializable Bundle: %s", e);
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.g(bc(), 1);
            cjxu.j(J(), this.e, Rp(R.string.UNKNOWN_ERROR));
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.c.a(egjVar.a());
    }
}
