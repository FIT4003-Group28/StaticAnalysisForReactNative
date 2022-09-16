package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bnal  reason: default package */
/* loaded from: classes3.dex */
public final class bnal extends ges {
    private static final dcqe d = dcqe.c("bnal");
    public bwqv a;
    public cqkj b;
    public bnhl c;
    private bney e;
    private bwrs<ilo> f;
    private cqkf<bney> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bney> cqkfVar = this.g;
        dbsk.s(cqkfVar);
        cqkfVar.f();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bney> c = this.b.c(new bndp(), null);
        this.g = c;
        c.e(this.e);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (this.e == null) {
            try {
                bwrs<ilo> e = this.a.e(ilo.class, this.o, "VisitorUpdates.Placemark");
                dbsk.s(e);
                this.f = e;
                if (e.c() == null) {
                    return;
                }
                bnhl bnhlVar = this.c;
                bwrs<ilo> bwrsVar = this.f;
                bnhf a = bnhlVar.a.a();
                bnhl.a(a, 1);
                bnhi a2 = bnhlVar.b.a();
                bnhl.a(a2, 2);
                bhhf a3 = bnhlVar.c.a();
                bnhl.a(a3, 3);
                bnhc a4 = bnhlVar.d.a();
                bnhl.a(a4, 4);
                bnhl.a(bwrsVar, 5);
                this.e = new bnhk(a, a2, a3, a4, bwrsVar);
            } catch (IOException | ClassCastException | NullPointerException unused) {
                bvoo.h("PlacemarkRef is invalid.", new Object[0]);
                gn gnVar = this.A;
                dbsk.s(gnVar);
                gnVar.e();
            }
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.az;
    }
}
