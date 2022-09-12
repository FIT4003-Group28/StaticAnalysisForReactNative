package defpackage;
/* compiled from: PG */
/* renamed from: crpv  reason: default package */
/* loaded from: classes5.dex */
public class crpv extends crpu implements crqj {
    public final dpio a;
    public final amub c;
    private final amuh d;
    private final long e;
    private final dpfa f;

    public crpv(dpio dpioVar, amuh amuhVar, amub amubVar, long j) {
        dbsk.s(dpioVar);
        this.a = dpioVar;
        dbsk.s(amuhVar);
        this.d = amuhVar;
        this.c = amubVar;
        this.e = j;
        dpfh dpfhVar = dpioVar.d;
        dpfa dpfaVar = (dpfhVar == null ? dpfh.l : dpfhVar).i;
        this.f = dpfaVar == null ? dpfa.e : dpfaVar;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.BETTER_ROUTE;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return false;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return false;
    }

    @Override // defpackage.crqj
    public final dpfa d() {
        return this.f;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final long f() {
        return this.e;
    }

    @Override // defpackage.crqj
    public final boolean i() {
        return true;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amuh j() {
        return this.d;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub k() {
        return this.d.k();
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub l() {
        return this.c;
    }
}
