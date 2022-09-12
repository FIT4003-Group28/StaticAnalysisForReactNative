package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: bolc  reason: default package */
/* loaded from: classes3.dex */
public final class bolc extends ges implements bokz {
    public bolb a;
    @dzsi
    bola ad;
    @dzsi
    bole ae;
    @dzsi
    private cqkf<bole> af;
    public cqkj b;
    public efg c;
    public begg d;
    public akfa e;
    public bsvm f;
    public ausy g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bold) btsx.b(bold.class, this)).da(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bole> cqkfVar = this.af;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
    }

    @Override // defpackage.bokz
    public final void a(List<dlfh> list) {
        aujb e = this.g.e(dpyv.EDIT_PUBLISHED.dm);
        this.ae = new bolh(J(), list, e == null ? null : e.w(), this.d, this.f);
        cqkf<bole> cqkfVar = this.af;
        dbsk.s(cqkfVar);
        bole boleVar = this.ae;
        dbsk.s(boleVar);
        cqkfVar.e(boleVar);
        bola bolaVar = this.ad;
        dbsk.s(bolaVar);
        bolaVar.b(list);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bole> c = this.b.c(new boly(), null);
        this.af = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        akfa akfaVar = this.e;
        dbsk.s(akfaVar);
        btlu j = akfaVar.j();
        String str = j != null ? j.d : "";
        bolb bolbVar = this.a;
        dbsk.s(bolbVar);
        this.ad = bolbVar.a(str);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bola bolaVar = this.ad;
        dbsk.s(bolaVar);
        bolaVar.a(this);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(true);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.F(null);
        efgVar.a(egjVar.a());
    }
}
