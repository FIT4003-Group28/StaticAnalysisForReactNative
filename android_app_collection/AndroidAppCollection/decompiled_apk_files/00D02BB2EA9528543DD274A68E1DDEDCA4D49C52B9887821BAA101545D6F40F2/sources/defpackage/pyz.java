package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pyz  reason: default package */
/* loaded from: classes7.dex */
public final class pyz extends ges {
    public cqkj a;
    public efg b;
    public pzc c;
    qaa d;
    @dzsi
    private cqkf<qaa> e;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.e = null;
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.e = this.a.c(new pzz(), viewGroup);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        List a;
        super.l(bundle);
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) this.o.getParcelable("agencyDetails");
        if (protoBufUtil$ParcelableProtoList == null) {
            a = Collections.emptyList();
        } else {
            a = protoBufUtil$ParcelableProtoList.a((dssr) pyx.c.cu(7));
        }
        List list = a;
        pzc pzcVar = this.c;
        gga a2 = pzcVar.a.a();
        pzc.a(a2, 1);
        gft gftVar = (gft) ((dxjd) pzcVar.b).a;
        pzc.a(gftVar, 2);
        pzh a3 = pzcVar.c.a();
        pzc.a(a3, 3);
        pyv a4 = pzcVar.d.a();
        pzc.a(a4, 4);
        pzc.a(list, 5);
        this.d = new pzb(a2, gftVar, a3, a4, list);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.bS;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        cqkf<qaa> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        egjVar.w(cqkfVar.c());
        egjVar.ag(null);
        efgVar.a(egjVar.a());
        cqkf<qaa> cqkfVar2 = this.e;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(this.d);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<qaa> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }
}
