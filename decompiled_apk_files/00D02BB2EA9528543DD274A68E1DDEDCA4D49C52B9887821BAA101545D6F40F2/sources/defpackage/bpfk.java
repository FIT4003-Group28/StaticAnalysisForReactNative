package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpfk  reason: default package */
/* loaded from: classes3.dex */
public final class bpfk extends bpdz<bpwk> {
    private static final dcqe as = dcqe.c("bpfk");
    public bokk al;
    boxj am;
    public akqi an;
    public boxg ao;
    public boxa ap;
    public cqhn aq;
    public bpfr ar;
    private bpfq at;
    private bpic au;

    public static bpfk aT(bwrs<bvrt<bpuk>> bwrsVar, dbsg<drkz> dbsgVar, bwqv bwqvVar, dnqe dnqeVar) {
        bpfk bpfkVar = new bpfk();
        Bundle w = w(bwqvVar, bwrsVar, dnqeVar);
        bvrs.k(w, "NOTE_PROTO_KEY", new bokk("", false).b().bK());
        aU(w, dbsgVar);
        bpfkVar.B(w);
        return bpfkVar;
    }

    private static void aU(Bundle bundle, dbsg<drkz> dbsgVar) {
        akqi akqiVar = akqi.a;
        if (dbsgVar.a()) {
            dpsn dpsnVar = dbsgVar.b().b;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            akqiVar = akqi.j(dpsnVar);
        }
        bvrs.k(bundle, "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", akqiVar.i());
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void Qe() {
        this.e.c();
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof boxy) {
            this.au.e(((boxy) obj).a());
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = obj == null ? "null" : obj.getClass().getName();
        bvoo.h("Received fragment result of an unsupported type: %s", objArr);
    }

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return this.am.c() == null ? dbpy.a : dbsg.i(akqi.b(this.am.c().b));
    }

    @Override // defpackage.bpdz, defpackage.bpvb
    public final void aR() {
        dvzn dvznVar;
        boolean booleanValue = this.at.d().booleanValue();
        if (this.ai.a.get(0).h.size() != 0) {
            dvznVar = this.ai.a.get(0).h.get(0);
        } else {
            dvznVar = dvzn.e;
        }
        bpvc bpvcVar = this.e;
        akrk h = akrk.h(dvznVar);
        dodb c = this.am.c();
        int size = this.ai.a.size();
        if (!booleanValue || h.l() == 0 || c != null || size != 1) {
            bpvcVar.c();
        } else {
            akqq S = h.m(0).S();
            akqq S2 = h.p().S();
            if (bpvcVar.d.size() != 2 || !bpvcVar.d.get(0).equals(S) || !bpvcVar.d.get(1).equals(S2)) {
                Bitmap decodeResource = BitmapFactory.decodeResource(bpvcVar.b.getResources(), 2131233023);
                Bitmap decodeResource2 = BitmapFactory.decodeResource(bpvcVar.b.getResources(), 2131233024);
                akpp p = akpp.p(S, false, 1, decodeResource);
                akpp p2 = akpp.p(S2, false, 1, decodeResource2);
                bpvcVar.c();
                bpvcVar.d = dcdc.g(S, S2);
                bpvcVar.c = bpvcVar.a.a().d(dcdc.g(p, p2), true);
            }
        }
        super.aR();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bpfq bpfqVar = this.at;
        boolean z = false;
        if (this.aD) {
            bnyc bnycVar = bpfqVar.i;
            if (bpfqVar.b() || bpfqVar.c.d()) {
                z = true;
            }
            bnycVar.b(z);
            return true;
        }
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwk g(dbsg dbsgVar) {
        bokm bokmVar = (bokm) bvrs.f((Bundle) dbsgVar.c(this.o), "NOTE_PROTO_KEY", (dssr) bokm.n.cu(7));
        dbsk.s(bokmVar);
        this.al = bokk.a(bokmVar);
        dpsn dpsnVar = (dpsn) bvrs.f((Bundle) dbsgVar.c(this.o), "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", (dssr) dpsn.d.cu(7));
        dbsk.s(dpsnVar);
        this.an = akqi.j(dpsnVar);
        dcdc z = dcbg.b(bpvi.c(this.ai)).s(bpfc.a).z();
        dbsg m = dcft.m(z, new dbsl(this) { // from class: bpfd
            private final bpfk a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return akqi.b(((dodb) obj).b).equals(this.a.an);
            }
        });
        if (this.ai.b) {
            z = dcdc.e();
        }
        this.am = new boxj(z, (dodb) m.f());
        this.au = new bpic(this, this.ap, this.am);
        int size = this.ai.a.size();
        boolean z2 = false;
        drlf b = drlf.b(this.ai.a.get(0).d);
        if (b == null) {
            b = drlf.UNKNOWN_TRAFFIC_ACCESS;
        }
        if (this.am.c() != null) {
            z2 = true;
        }
        boxg boxgVar = new boxg(size, b, z2);
        this.ao = boxgVar;
        boxgVar.b = boxf.values()[((Bundle) dbsgVar.c(this.o)).getInt("DIRECTIONALITY_VALUE_KEY", this.ao.b.ordinal())];
        bpfr bpfrVar = this.ar;
        int size2 = this.ai.a.size();
        boxg boxgVar2 = this.ao;
        bpic bpicVar = this.au;
        bokk bokkVar = this.al;
        bpfj bpfjVar = new bpfj(this);
        bpeb a = bpfrVar.a.a();
        bpfr.a(a, 1);
        bpeg a2 = bpfrVar.b.a();
        bpfr.a(a2, 2);
        booa a3 = bpfrVar.c.a();
        bpfr.a(a3, 3);
        bpfr.a(bpfrVar.d.a(), 4);
        ff ffVar = (ff) ((dxjd) bpfrVar.e).a;
        bpfr.a(ffVar, 5);
        bnyd a4 = bpfrVar.f.a();
        bpfr.a(a4, 6);
        bpfr.a(boxgVar2, 8);
        bpfr.a(bpicVar, 9);
        bpfr.a(bokkVar, 10);
        bpfr.a(this, 11);
        bpfr.a(bpfjVar, 12);
        bpfq bpfqVar = new bpfq(a, a2, a3, ffVar, a4, size2, boxgVar2, bpicVar, bokkVar, this, bpfjVar);
        this.at = bpfqVar;
        return bpfqVar;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwk> i() {
        return new bppr();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.aN;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NOTE_PROTO_KEY", this.al.b().bK());
        aU(bundle, dbsg.j(this.am.c()).h(bpfe.a));
        bundle.putInt("DIRECTIONALITY_VALUE_KEY", this.ao.b.ordinal());
    }
}
