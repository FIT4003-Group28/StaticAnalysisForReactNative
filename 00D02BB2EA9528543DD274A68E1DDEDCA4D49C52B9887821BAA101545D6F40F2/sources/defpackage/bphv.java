package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bphv  reason: default package */
/* loaded from: classes3.dex */
public final class bphv extends bpdz<bpwr> {
    public bokk al;
    public bphu am;
    public akqi an;
    public bpia ao;
    private bphz ap;

    public static bphv aT(bwrs<bvrt<bpuk>> bwrsVar, dbsg<drkz> dbsgVar, bwqv bwqvVar, bphu bphuVar, dnqe dnqeVar) {
        bphv bphvVar = new bphv();
        Bundle w = w(bwqvVar, bwrsVar, dnqeVar);
        w.putInt("ATTRIBUTE_MODE_KEY", bphuVar.ordinal());
        bvrt<bpuk> c = bwrsVar.c();
        dbsk.s(c);
        digh dighVar = c.e((dssr) bpuk.c.cu(7), bpuk.c).a.get(0);
        int a = drlb.a(dighVar.f);
        if ((a != 0 && a == 2) || dighVar.g.size() > 0) {
            dpyn dpynVar = dighVar.c;
            if (dpynVar == null) {
                dpynVar = dpyn.d;
            }
            w.putString("ROAD_NAME_KEY", dpynVar.b);
        }
        bvrs.k(w, "NOTE_PROTO_KEY", new bokk("", false).b().bK());
        akqi akqiVar = akqi.a;
        if (dbsgVar.a()) {
            dpsn dpsnVar = dbsgVar.b().b;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            akqiVar = akqi.j(dpsnVar);
        }
        bvrs.k(w, "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", akqiVar.i());
        bphvVar.B(w);
        return bphvVar;
    }

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return this.an.equals(akqi.a) ? dbpy.a : dbsg.i(this.an);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bphz bphzVar = this.ap;
        if (this.aD) {
            bphzVar.b.b(bphzVar.c.d());
            return true;
        }
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwr g(dbsg dbsgVar) {
        bokm bokmVar = (bokm) bvrs.f((Bundle) dbsgVar.c(this.o), "NOTE_PROTO_KEY", (dssr) bokm.n.cu(7));
        dbsk.s(bokmVar);
        this.al = bokk.a(bokmVar);
        this.am = bphu.values()[this.o.getInt("ATTRIBUTE_MODE_KEY")];
        dpsn dpsnVar = (dpsn) bvrs.f(this.o, "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", (dssr) dpsn.d.cu(7));
        dbsk.s(dpsnVar);
        this.an = akqi.j(dpsnVar);
        bpia bpiaVar = this.ao;
        bokk bokkVar = this.al;
        dbsg j = dbsg.j(this.o.getString("ROAD_NAME_KEY"));
        bphu bphuVar = this.am;
        bpht bphtVar = new bpht(this);
        bpia.a(bokkVar, 1);
        bpia.a(j, 2);
        bpia.a(bphuVar, 3);
        bpia.a(bphtVar, 4);
        booa a = bpiaVar.a.a();
        bpia.a(a, 5);
        bnyd a2 = bpiaVar.b.a();
        bpia.a(a2, 6);
        ff ffVar = (ff) ((dxjd) bpiaVar.c).a;
        bpia.a(ffVar, 7);
        bphz bphzVar = new bphz(bokkVar, j, bphuVar, bphtVar, a, a2, ffVar);
        this.ap = bphzVar;
        return bphzVar;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwr> i() {
        return new bprt();
    }

    @Override // defpackage.ges
    public final ddho p() {
        int ordinal = bphu.values()[this.o.getInt("ATTRIBUTE_MODE_KEY")].ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dtya.aV;
            }
            if (ordinal == 2) {
                return dtya.bz;
            }
            if (ordinal == 3) {
                return dtya.bw;
            }
            if (ordinal != 4) {
                throw null;
            }
            return dtya.bt;
        }
        return dtya.aS;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NOTE_PROTO_KEY", this.al.b().bK());
    }
}
