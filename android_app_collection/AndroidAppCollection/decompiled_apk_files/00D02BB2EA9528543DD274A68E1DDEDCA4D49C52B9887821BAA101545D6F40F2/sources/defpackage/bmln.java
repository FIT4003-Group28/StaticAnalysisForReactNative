package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bmln  reason: default package */
/* loaded from: classes3.dex */
public final class bmln extends bfdi {
    public bwqv a;
    public cqkj b;
    public bmmy c;
    private bwrs<ilo> d;
    @dzsi
    private ViewGroup e;
    @dzsi
    private cqkf<bmmm> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bmmm> cqkfVar = this.f;
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
        return bege.TICKETS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.d;
        dbsk.s(bwrsVar);
        return bwrsVar;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.e = viewGroup;
        cqkf<bmmm> c = this.b.c(new bmmh(), null);
        this.f = c;
        bmmy bmmyVar = this.c;
        bwrs<ilo> bwrsVar = this.d;
        bmmu a = bmmyVar.a.a();
        bmmy.a(a, 1);
        bmmy.a(bwrsVar, 2);
        c.e(new bmmx(a, bwrsVar));
        return c.c();
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.d = cctq.b(this.o, this.a);
    }
}
