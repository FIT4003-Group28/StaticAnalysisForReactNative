package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: txw  reason: default package */
/* loaded from: classes4.dex */
public final class txw {
    private azqb A;
    private azqb B;
    private azqb C;
    private azqb D;
    private azqb E;
    private azqb F;
    private azqb G;
    private azqb H;
    private azqb I;

    /* renamed from: J  reason: collision with root package name */
    private azqb f268J;
    public final txg a;
    public azqb b;
    public azqb c;
    public azqb d;
    public azqb e;
    public azqb f;
    public azqb g;
    public azqb h;
    public azqb i;
    public azqb j;
    public azqb k;
    public azqb l;
    private azqb m;
    private azqb n;
    private azqb o;
    private azqb p;
    private azqb q;
    private azqb r;
    private azqb s;
    private azqb t;
    private azqb u;
    private azqb v;
    private azqb w;
    private azqb x;
    private azqb y;
    private azqb z;

    public txw(txg txgVar, txj txjVar, txl txlVar, txo txoVar, txt txtVar) {
        this.a = txgVar;
        this.b = axot.b(new txs(txoVar));
        this.c = axot.b(new txs(txoVar, 7));
        this.m = new txh(txgVar);
        this.d = axot.b(new txs(txoVar, 3));
        azqb b = axot.b(new txs(txoVar, 2));
        this.e = b;
        this.n = new txe(this.m, this.c, this.d, b);
        this.o = axot.b(new oql(this.m, this.d, 12));
        this.f = axot.b(new txs(txoVar, 6));
        twa twaVar = new twa(this.e);
        this.p = twaVar;
        this.q = axot.b(new txu(txtVar, this.m, this.o, this.f, this.b, twaVar, 3));
        azqb b2 = axot.b(new txm(txlVar));
        this.g = b2;
        this.r = axot.b(new txr(this.m, this.c, this.q, b2, this.e, 3, (char[]) null));
        azqb b3 = axot.b(new oql(this.m, this.d, 11));
        this.s = b3;
        azqb b4 = axot.b(new txu(txtVar, this.m, b3, this.f, this.b, this.p));
        this.t = b4;
        azqb b5 = axot.b(new txr(this.m, this.c, b4, this.g, this.e));
        this.u = b5;
        tvf tvfVar = new tvf(this.m, this.b, this.n, this.r, b5, this.o, this.s, this.p, this.f, this.g, this.e);
        this.v = tvfVar;
        this.h = axot.b(new ooq(tvfVar, 12));
        this.w = axot.b(new txk(txjVar));
        this.x = axot.b(new txs(txoVar, 4));
        this.y = axot.b(new txs(txoVar, 1));
        this.z = axot.b(new txk(txjVar, 1));
        azqb b6 = axot.b(txq.a);
        this.i = b6;
        this.A = new txc(this.m, b6, this.c, this.d, this.g);
        azqb b7 = axot.b(new oql(this.m, this.d, 10));
        this.B = b7;
        azqb b8 = axot.b(new txu(txtVar, this.m, b7, this.f, this.b, this.p, 2));
        this.C = b8;
        this.D = axot.b(new txr(this.m, this.i, this.c, b8, this.g, 2, (byte[]) null));
        azqb b9 = axot.b(new oql(this.m, this.d, 9));
        this.E = b9;
        azqb b10 = axot.b(new txu(txtVar, this.m, b9, this.f, this.b, this.p, 1));
        this.F = b10;
        azqb b11 = axot.b(new wdw(this.m, this.i, this.c, b10, this.g, this.e, 1));
        this.G = b11;
        tuv tuvVar = new tuv(this.b, this.A, this.D, b11, this.B, this.E, this.p, this.f, this.g, this.e);
        this.H = tuvVar;
        this.j = axot.b(new ooq(tuvVar, 11));
        this.I = axot.b(new txp(txoVar, this.m));
        this.k = axot.b(new txs(txoVar, 5));
        azqb b12 = axot.b(new txv(txtVar, this.m, this.d));
        this.f268J = b12;
        this.l = axot.b(new oql(b12, this.i, 8, (int[]) null));
    }

    public final tuk a() {
        Context b = txh.b(this.a);
        tyk tykVar = (tyk) this.b.get();
        trv trvVar = (trv) this.c.get();
        tul tulVar = (tul) this.j.get();
        twv b2 = b();
        snc sncVar = (snc) this.i.get();
        ampq ampqVar = (ampq) this.I.get();
        return new tuk(b, tykVar, trvVar, tulVar, b2, sncVar, (Executor) this.g.get(), (ampq) this.d.get(), (vjb) this.f.get(), (ampq) this.k.get(), (tqe) this.e.get());
    }

    public final twv b() {
        return new twv(txh.b(this.a), (trv) this.c.get(), (twy) this.h.get(), (vjb) this.f.get(), new tyi(txh.b(this.a), (amqo) this.w.get(), (vjb) this.f.get(), (tzq) this.x.get(), (ampq) this.y.get(), (Executor) this.g.get(), (tqe) this.e.get()), (ampq) this.z.get(), (ampq) this.y.get(), (tyk) this.b.get(), (tul) this.j.get(), (ampq) this.d.get(), (Executor) this.g.get());
    }

    public txw() {
    }
}
