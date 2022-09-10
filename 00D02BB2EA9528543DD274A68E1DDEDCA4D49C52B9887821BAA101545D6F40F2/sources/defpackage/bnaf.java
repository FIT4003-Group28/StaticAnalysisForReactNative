package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bnaf  reason: default package */
/* loaded from: classes3.dex */
public final class bnaf extends bfdi {
    public bwqv a;
    public cqkj b;
    public bnfn c;
    private bwrs<ilo> d;
    private ViewGroup e;
    private bnfm f;
    private cqkf<bnel> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bnel> cqkfVar = this.g;
        if (cqkfVar == null) {
            dzvx.a("viewHierarchy");
        }
        cqkfVar.f();
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            cqkf<bnel> cqkfVar2 = this.g;
            if (cqkfVar2 == null) {
                dzvx.a("viewHierarchy");
            }
            viewGroup.removeView(cqkfVar2.c());
        }
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.UPDATES;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.d;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dzvx.c(layoutInflater, "inflater");
        cqkj cqkjVar = this.b;
        if (cqkjVar == null) {
            dzvx.a("viewHierarchyFactory");
        }
        cqkf<bnel> e = cqkjVar.e(new bnbt());
        if (e != null) {
            this.e = viewGroup;
            this.g = e;
            bnfm bnfmVar = this.f;
            if (bnfmVar == null) {
                dzvx.a("viewModel");
            }
            e.e(bnfmVar);
            return e.c();
        }
        return null;
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        bwrs<ilo> bwrsVar;
        super.l(bundle);
        try {
            bwqv bwqvVar = this.a;
            if (bwqvVar == null) {
                dzvx.a("storage");
            }
            bwrsVar = bwqvVar.e(ilo.class, this.o, "PLACEMARK_REF_KEY");
        } catch (IOException e) {
            bvoo.i(e);
            bwrsVar = null;
        }
        this.d = bwrsVar;
        if (bwrsVar == null) {
            Q().e();
        }
        bnfn bnfnVar = this.c;
        if (bnfnVar == null) {
            dzvx.a("updatesSubTabsViewModelImplFactory");
        }
        bwrs<ilo> bwrsVar2 = this.d;
        gn R = R();
        bnfn.a(bwrsVar2, 1);
        bnfn.a(R, 2);
        Activity activity = (Activity) ((dxjd) bnfnVar.a).a;
        bnfn.a(activity, 3);
        cqhn a = bnfnVar.b.a();
        bnfn.a(a, 4);
        cjqy a2 = bnfnVar.c.a();
        bnfn.a(a2, 5);
        bwqv a3 = bnfnVar.d.a();
        bnfn.a(a3, 6);
        this.f = new bnfm(bwrsVar2, R, activity, a, a2, a3);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.a;
    }
}
