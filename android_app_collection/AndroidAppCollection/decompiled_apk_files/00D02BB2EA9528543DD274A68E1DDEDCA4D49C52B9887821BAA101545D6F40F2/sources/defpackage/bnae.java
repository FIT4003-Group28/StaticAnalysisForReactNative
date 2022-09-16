package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bnae  reason: default package */
/* loaded from: classes3.dex */
public final class bnae extends ges {
    private static final dcqe g = dcqe.b();
    public bwqv a;
    public cqkj b;
    public bnfh c;
    public bnfg d;
    private final dzut<dztc> e = new bnad(this);
    private cqkf<bnek> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bnek> cqkfVar = this.f;
        if (cqkfVar == null) {
            dzvx.a("viewHierarchy");
        }
        cqkfVar.f();
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dzvx.c(layoutInflater, "inflater");
        cqkj cqkjVar = this.b;
        if (cqkjVar == null) {
            dzvx.a("viewHierarchyFactory");
        }
        cqkf<bnek> e = cqkjVar.e(new bnay());
        if (e != null) {
            this.f = e;
            bnfg bnfgVar = this.d;
            if (bnfgVar == null) {
                dzvx.a("viewModel");
            }
            e.e(bnfgVar);
            return e.c();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        int i = bundle2 != null ? bundle2.getInt("INITIAL_POST_INDEX_KEY") : -1;
        Bundle bundle3 = this.o;
        bwqv bwqvVar = this.a;
        if (bwqvVar == null) {
            dzvx.a("storage");
        }
        if (bundle3 == null) {
            Q().e();
            return;
        }
        try {
            bwrs e = bwqvVar.e(ilo.class, bundle3, "PLACEMARK_REF_KEY");
            if (e == null) {
                bvoo.h("Could not re-construct placemark reference.", new Object[0]);
                Q().e();
                return;
            }
            bnfh bnfhVar = this.c;
            if (bnfhVar == null) {
                dzvx.a("viewModelImplFactory");
            }
            gga a = bnfhVar.a.a();
            bnfh.a(a, 1);
            bwqv a2 = bnfhVar.b.a();
            bnfh.a(a2, 2);
            bnfb a3 = bnfhVar.c.a();
            bnfh.a(a3, 3);
            bnfe a4 = bnfhVar.d.a();
            bnfh.a(a4, 4);
            bgpu a5 = bnfhVar.e.a();
            bnfh.a(a5, 5);
            bhhf a6 = bnfhVar.f.a();
            bnfh.a(a6, 6);
            bnfh.a(e, 7);
            this.d = new bnfg(a, a2, a3, a4, a5, a6, e, i);
        } catch (IOException e2) {
            bvoo.i(e2);
            Q().e();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dzut<dztc>, dzut] */
    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        ViewTreeObserver viewTreeObserver;
        super.s();
        View view = this.P;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ?? r1 = this.e;
            bnac bnacVar = r1;
            if (r1 != 0) {
                bnacVar = new bnac(r1);
            }
            viewTreeObserver.addOnDrawListener(bnacVar);
        }
        bnfg bnfgVar = this.d;
        if (bnfgVar == null) {
            dzvx.a("viewModel");
        }
        bnfgVar.c().j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [dzut<dztc>, dzut] */
    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        ViewTreeObserver viewTreeObserver;
        bnfg bnfgVar = this.d;
        if (bnfgVar == null) {
            dzvx.a("viewModel");
        }
        bnfgVar.c().i();
        View view = this.P;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ?? r1 = this.e;
            bnac bnacVar = r1;
            if (r1 != 0) {
                bnacVar = new bnac(r1);
            }
            viewTreeObserver.removeOnDrawListener(bnacVar);
        }
        super.u();
    }
}
