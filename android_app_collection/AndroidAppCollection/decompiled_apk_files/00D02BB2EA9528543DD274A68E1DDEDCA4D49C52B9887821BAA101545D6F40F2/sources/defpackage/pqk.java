package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: pqk  reason: default package */
/* loaded from: classes7.dex */
public final class pqk extends gen {
    private static final dcqe g = dcqe.c("pqk");
    @dzsi
    public bwqv a;
    @dzsi
    public pqd b;
    @dzsi
    public cjqy c;
    @dzsi
    public dcdc<amvh> d;
    public int e;

    @Override // defpackage.ges, defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        if (obj == null) {
            obj = prb.d(this.e, amvh.a, cjqm.a);
        }
        super.Nw(obj);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        pqd pqdVar = this.b;
        dbsk.s(pqdVar);
        dccx F = dcdc.F();
        dbsk.s(this.d);
        dcdc<amvh> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(new pqi(dcdcVar.get(i)));
        }
        return pqdVar.a(new pqj(this, F.f()), dtxn.p);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        this.e = bundle2.getInt("waypoint_index");
        try {
            bwqv bwqvVar = this.a;
            dbsk.s(bwqvVar);
            this.d = (dcdc) bwqvVar.d(dcdc.class, bundle2, "dym_items");
        } catch (IOException e) {
            bvoo.h("Failed to extract data from bundle %s", e);
            this.d = dcdc.e();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.p;
    }
}
