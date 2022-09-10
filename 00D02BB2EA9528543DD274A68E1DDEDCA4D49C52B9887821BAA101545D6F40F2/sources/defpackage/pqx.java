package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: pqx  reason: default package */
/* loaded from: classes7.dex */
public final class pqx extends gen {
    private static final dcqe ae = dcqe.c("pqx");
    @dzsi
    public bwqv a;
    @dzsi
    public bwrs<brln> ad;
    @dzsi
    public dxio<brba> b;
    @dzsi
    public dxio<begg> c;
    @dzsi
    public ckcw d;
    @dzsi
    public pqd e;
    @dzsi
    public dcdc<bqzb> g;

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        pqd pqdVar = this.e;
        dbsk.s(pqdVar);
        Dialog a = pqdVar.a(new pqw(this), dtxn.q);
        ckcw ckcwVar = this.d;
        dbsk.s(ckcwVar);
        ((ckhe) ckcwVar.a(ckjw.v)).e();
        return a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dbsk.s(this.a);
        try {
            this.g = (dcdc) this.a.d(dcdc.class, this.o, "dym_items");
            this.ad = this.a.e(brln.class, this.o, "dym_search_request_ref");
        } catch (IOException e) {
            bvoo.h("Failed to extract data from bundle %s", e);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.q;
    }
}
