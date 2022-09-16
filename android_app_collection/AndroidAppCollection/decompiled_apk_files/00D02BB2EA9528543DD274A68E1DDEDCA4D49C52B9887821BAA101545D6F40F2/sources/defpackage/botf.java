package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: botf  reason: default package */
/* loaded from: classes3.dex */
public final class botf extends ges {
    botx a;
    public botm b;
    public cqkj c;
    public efg d;
    @dzsi
    private cqkf<botx> e;

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bomv) {
            bomv bomvVar = (bomv) obj;
            botx botxVar = this.a;
            dbsk.s(botxVar);
            bomn b = bomvVar.b();
            dbsk.s(b);
            botxVar.n(b.a);
            botx botxVar2 = this.a;
            dbsk.s(botxVar2);
            botxVar2.o(bomvVar.a());
            this.a.m();
            botx botxVar3 = this.a;
            dbsk.s(botxVar3);
            cqkx.p(botxVar3);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<botx> c = this.c.c(new botw(), null);
        this.e = c;
        dbsk.s(c);
        c.e(this.a);
        cqkf<botx> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        String string = bundle2.getString("building_name_key");
        String string2 = bundle2.getString("building_address_key");
        boolean z = bundle2.getBoolean("is_send_button_enabled_key");
        akqq j = akqq.j((dhjz) bvrs.f(bundle2, "building_latlng_key", (dssr) dhjz.e.cu(7)));
        int i = bundle2.getInt("entry_point_type_key");
        botm botmVar = this.b;
        dnqb b = dnqb.b(i);
        botm.a(this, 4);
        botm.a(this, 5);
        botm.a(b, 7);
        Resources a = botmVar.a.a();
        botm.a(a, 8);
        gga a2 = botmVar.b.a();
        botm.a(a2, 9);
        jmx a3 = botmVar.c.a();
        botm.a(a3, 10);
        btpc a4 = botmVar.d.a();
        botm.a(a4, 11);
        bnyo a5 = botmVar.e.a();
        botm.a(a5, 12);
        boxa a6 = botmVar.f.a();
        botm.a(a6, 13);
        cklf a7 = botmVar.g.a();
        botm.a(a7, 14);
        dxio a8 = ((dxjh) botmVar.h).a();
        botm.a(a8, 15);
        dzsj<afwr> dzsjVar = botmVar.i;
        akpm a9 = botmVar.j.a();
        botm.a(a9, 17);
        this.a = new botl(string, string2, j, this, this, z, b, a, a2, a3, a4, a5, a6, a7, a8, dzsjVar, a9);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("building_name_key", this.a.c());
        bundle.putString("building_address_key", this.a.j());
        bundle.putBoolean("is_send_button_enabled_key", this.a.h());
        akqq k = this.a.k();
        if (k != null) {
            bvrs.k(bundle, "building_latlng_key", k.i());
        }
        bundle.putInt("entry_point_type_key", this.a.l().ah);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<botx> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }
}
