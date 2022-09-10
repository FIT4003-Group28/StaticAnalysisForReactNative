package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: bxep  reason: default package */
/* loaded from: classes4.dex */
public class bxep<Q extends dssj, S extends dssj> extends bttk<Q, S> {
    private final bxkz a;
    public final bxla b;
    public final bxkx c;
    public final cqat d;
    protected dcdc<bxmh> e;
    protected dcdc<dpui> f;
    @dzsi
    protected drgv g;
    protected int j;

    public bxep(dunt duntVar, bxla bxlaVar, bxkz bxkzVar, bxkx bxkxVar, cqat cqatVar) {
        bvrj bvrjVar = bvrj.CURRENT;
        this.e = dcdc.e();
        this.f = dcdc.e();
        this.g = null;
        this.j = -1;
        dbsk.s(bxlaVar);
        this.b = bxlaVar;
        dbsk.s(bxkzVar);
        this.a = bxkzVar;
        dbsk.s(bxkxVar);
        this.c = bxkxVar;
        dbsk.s(cqatVar);
        this.d = cqatVar;
    }

    @Override // defpackage.bttu
    protected final void a(@dzsi bttq bttqVar) {
    }

    public final String c() {
        return this.a.a();
    }

    public final int d() {
        return this.a.b();
    }

    public final synchronized dcdc<bxmh> e() {
        return this.e;
    }

    public final synchronized dcdc<dpui> f() {
        return this.f;
    }

    @dzsi
    public final synchronized drgv g() {
        return this.g;
    }

    public final synchronized int h() {
        return this.j;
    }
}
