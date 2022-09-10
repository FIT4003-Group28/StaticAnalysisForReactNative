package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: nup  reason: default package */
/* loaded from: classes7.dex */
public abstract class nup implements cjyi, nxi {
    public final ArrayList<nun> a;
    public final List<cqjg> b;
    public final dzsj<qbt> c;
    @dzsi
    public dthb d;
    @dzsi
    public String e;
    public LinkedHashMap<String, dwfl> f;
    @dzsi
    public nxk g;
    @dzsi
    public final nxa h;
    public boolean i;
    private final btrm j;
    private final dzsj<nut> k;
    @dzsi
    private final nxd l;
    private final nuo m = new nuo(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public nup(btrm btrmVar, dzsj<nut> dzsjVar, dzsj<qbt> dzsjVar2, nxl nxlVar, @dzsi nxd nxdVar, @dzsi nxa nxaVar) {
        this.j = btrmVar;
        this.k = dzsjVar;
        this.c = dzsjVar2;
        dbsk.s(nxlVar);
        this.a = dchl.a();
        this.b = dchl.a();
        this.l = nxdVar;
        this.h = nxaVar;
        this.f = new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();

    public final void b(Bundle bundle) {
        bundle.putSerializable("arg_key_cardui_shown_cards", this.a);
        dthb dthbVar = this.d;
        if (dthbVar != null) {
            bundle.putByteArray("arg_key_cardui_card_action", dthbVar.bS());
        }
        String str = this.e;
        if (str != null) {
            bundle.putString("arg_key_cardui_card_id", str);
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        for (dwfl dwflVar : this.f.values()) {
            arrayList.add(bvrt.b(dwflVar));
        }
        bundle.putSerializable("arg_key_photos", arrayList);
        Serializable serializable = this.g;
        if (serializable != null) {
            bundle.putSerializable("arg_key_updater", serializable);
        }
    }

    public final void c(Bundle bundle) {
        e();
        if (bundle.containsKey("arg_key_cardui_shown_cards")) {
            d((List) bundle.getSerializable("arg_key_cardui_shown_cards"));
        }
        if (bundle.containsKey("arg_key_cardui_card_action")) {
            this.d = (dthb) bvrs.b(bundle.getByteArray("arg_key_cardui_card_action"), (dssr) dthb.F.cu(7));
        }
        if (bundle.containsKey("arg_key_cardui_card_id")) {
            this.e = bundle.getString("arg_key_cardui_card_id");
        }
        if (bundle.containsKey("arg_key_photos")) {
            List<bvrt> list = (List) bundle.getSerializable("arg_key_photos");
            this.f.clear();
            if (list != null) {
                for (bvrt bvrtVar : list) {
                    dwfl dwflVar = (dwfl) bvrtVar.e((dssr) dwfl.w.cu(7), dwfl.w);
                    this.f.put(dwflVar.d, dwflVar);
                }
            }
        }
        if (bundle.containsKey("arg_key_updater")) {
            this.g = (nxk) bundle.getSerializable("arg_key_updater");
        }
    }

    public final void d(List<nun> list) {
        for (nun nunVar : list) {
            i(nunVar);
        }
    }

    public void e() {
        throw null;
    }

    public final void f() {
        this.i = true;
        btrm btrmVar = this.j;
        nuo nuoVar = this.m;
        dceq a = dcet.a();
        a.b(bqje.class, new nuq(bqje.class, nuoVar, bvrj.UI_THREAD));
        btrmVar.g(nuoVar, a.a());
    }

    public final void g() {
        this.j.a(this.m);
        this.i = false;
    }

    @Override // defpackage.nxi
    public final void h(@dzsi dtid dtidVar) {
        int n = dcft.n(this.a, new num(dtidVar));
        if (n >= 0) {
            this.a.remove(n);
            this.b.remove(n);
            r(n);
        }
    }

    protected final void i(nun nunVar) {
        dsrj<dtkx> dsrjVar = nunVar.a().b;
        String str = nunVar.a;
        dvnp dvnpVar = nunVar.c;
        ArrayList a = dchl.a();
        dccx F = dcdc.F();
        for (int i = 0; i < dsrjVar.size(); i++) {
            dtkx dtkxVar = dsrjVar.get(i);
            if (!dtkxVar.d) {
                dcdc f = F.f();
                if (!f.isEmpty()) {
                    a.add(new cjys(f, str, dvnpVar));
                    F = dcdc.F();
                }
            }
            F.g(dtkxVar);
        }
        dcdc f2 = F.f();
        if (!f2.isEmpty()) {
            a.add(new cjys(f2, str, dvnpVar));
        }
        o(nunVar, a);
    }

    @Override // defpackage.cjyi
    public final void j(dthb dthbVar, nxc nxcVar) {
        String str;
        if (!this.i) {
            return;
        }
        this.d = dthbVar;
        dtid dtidVar = nxcVar.a;
        ArrayList<nun> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            nun nunVar = arrayList.get(i);
            i++;
            if (nunVar.a().equals(dtidVar)) {
                str = nunVar.b;
                break;
            }
        }
        this.e = str;
        this.k.a().f().d(this.l, dthbVar, nxcVar, this, this.h);
    }

    public final void k(List<dwfl> list) {
        for (dwfl dwflVar : list) {
            this.f.put(dwflVar.d, dwflVar);
        }
    }

    @Override // defpackage.nxi
    public final List<dwfl> l() {
        return dchl.c(this.f.values());
    }

    public final void m(String str, dqjh dqjhVar) {
        dwfl dwflVar = this.f.get(str);
        if (dwflVar == null) {
            return;
        }
        dqjc dqjcVar = dwflVar.s;
        if (dqjcVar == null) {
            dqjcVar = dqjc.d;
        }
        if (!dwflVar.d.equals(str)) {
            return;
        }
        dqjh b = dqjh.b(dqjcVar.c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (dqjhVar.equals(b)) {
            return;
        }
        dsqp dsqpVar = (dsqp) dqjcVar.cu(5);
        dsqpVar.bC(dqjcVar);
        dqjb dqjbVar = (dqjb) dsqpVar;
        if (dqjbVar.c) {
            dqjbVar.bF();
            dqjbVar.c = false;
        }
        dqjc dqjcVar2 = (dqjc) dqjbVar.b;
        dqjcVar2.c = dqjhVar.e;
        dqjcVar2.a |= 8;
        if ((dqjcVar.a & 1) != 0) {
            dqjh b2 = dqjh.b(dqjcVar.c);
            if (b2 == null) {
                b2 = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (b2.equals(dqjh.THUMBS_UP)) {
                int i = dqjcVar.b - 1;
                if (dqjbVar.c) {
                    dqjbVar.bF();
                    dqjbVar.c = false;
                }
                dqjc dqjcVar3 = (dqjc) dqjbVar.b;
                dqjcVar3.a |= 1;
                dqjcVar3.b = i;
            } else if (dqjhVar.equals(dqjh.THUMBS_UP)) {
                int i2 = dqjcVar.b + 1;
                if (dqjbVar.c) {
                    dqjbVar.bF();
                    dqjbVar.c = false;
                }
                dqjc dqjcVar4 = (dqjc) dqjbVar.b;
                dqjcVar4.a |= 1;
                dqjcVar4.b = i2;
            }
        }
        LinkedHashMap<String, dwfl> linkedHashMap = this.f;
        dsqp dsqpVar2 = (dsqp) dwflVar.cu(5);
        dsqpVar2.bC(dwflVar);
        dwfi dwfiVar = (dwfi) dsqpVar2;
        if (dwfiVar.c) {
            dwfiVar.bF();
            dwfiVar.c = false;
        }
        dwfl dwflVar2 = (dwfl) dwfiVar.b;
        dqjc bK = dqjbVar.bK();
        bK.getClass();
        dwflVar2.s = bK;
        dwflVar2.a |= 262144;
        linkedHashMap.put(str, dwfiVar.bK());
    }

    @Override // defpackage.nxi
    @dzsi
    public final nxk n() {
        return this.g;
    }

    public final nvf o(nun nunVar, List<cjys> list) {
        this.a.add(nunVar);
        this.b.add(cqjg.a());
        return q(nunVar, list);
    }

    public final void p(dtid dtidVar, String str) {
        i(new nun(dtidVar, str, null));
    }

    protected abstract nvf q(nun nunVar, List<cjys> list);

    protected abstract void r(int i);
}
