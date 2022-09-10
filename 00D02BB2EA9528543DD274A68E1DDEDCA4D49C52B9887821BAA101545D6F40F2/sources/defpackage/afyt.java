package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afyt  reason: default package */
/* loaded from: classes2.dex */
public final class afyt extends ges implements crzp<btlu> {
    public efg a;
    private ahcw ad;
    private String ae;
    public cqkj b;
    public akfa c;
    public dehq d;
    public ahcx e;
    private cqkf<agyz> f;
    private cqkf<agzf> g;

    public static afyt g(List<dlay> list, btlu btluVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("emailList", new ProtoBufUtil$ParcelableProtoList(list));
        bundle.putString("gmmAccountId", btlu.h(btluVar));
        afyt afytVar = new afyt();
        afytVar.B(bundle);
        return afytVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((afyu) btsx.b(afyu.class, this)).bT(this);
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        if (!this.ae.equals(btlu.h(crzmVar.l()))) {
            ahcw a = this.e.a(dcdc.e());
            this.ad = a;
            this.g.e(a);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.g.e(null);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<agzf> e = this.b.e(new aggj());
        this.g = e;
        e.e(this.ad);
        return this.g.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        List<dlay> e;
        super.l(bundle);
        Bundle bundle2 = this.o;
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle2.getParcelable("emailList");
        String string = bundle2.getString("gmmAccountId");
        dbsk.s(string);
        this.ae = string;
        ahcx ahcxVar = this.e;
        if (protoBufUtil$ParcelableProtoList != null) {
            e = protoBufUtil$ParcelableProtoList.a((dssr) dlay.e.cu(7));
        } else {
            e = dcdc.e();
        }
        this.ad = ahcxVar.a(e);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        crzm<btlu> C = this.c.C();
        On(C);
        C.a(this, this.d);
        cqkf<agyz> e = this.b.e(new agft());
        this.f = e;
        e.e(this.ad);
        this.aF = this.f.c();
        efg efgVar = this.a;
        egj egjVar = new egj(this);
        egjVar.G(this.f.c(), 5);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.c.C().c(this);
        super.u();
    }
}
