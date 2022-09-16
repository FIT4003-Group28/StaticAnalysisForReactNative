package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bkav  reason: default package */
/* loaded from: classes3.dex */
public final class bkav extends bfdi {
    public bwqv a;
    public cqkj b;
    public bkec c;
    private bwrs<ilo> d;
    @dzsi
    private ViewGroup e;
    @dzsi
    private cqkf<bkdi> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bkdi> cqkfVar = this.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.e;
            if (viewGroup != null) {
                viewGroup.removeView(this.f.c());
            }
            this.f = null;
        }
        this.e = null;
        super.Qe();
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.PRODUCTS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.d;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.e = viewGroup;
        cqkf<bkdi> c = this.b.c(new bkci(), null);
        this.f = c;
        bkec bkecVar = this.c;
        ilo c2 = this.d.c();
        dbsk.s(c2);
        drdq drdqVar = c2.bf().y;
        if (drdqVar == null) {
            drdqVar = drdq.c;
        }
        dgjg dgjgVar = drdqVar.b;
        if (dgjgVar == null) {
            dgjgVar = dgjg.d;
        }
        bkec.a(dgjgVar, 1);
        bkdy a = bkecVar.a.a();
        bkec.a(a, 2);
        c.e(new bkeb(dgjgVar, a));
        return c.c();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.d = cctq.b(this.o, this.a);
    }
}
