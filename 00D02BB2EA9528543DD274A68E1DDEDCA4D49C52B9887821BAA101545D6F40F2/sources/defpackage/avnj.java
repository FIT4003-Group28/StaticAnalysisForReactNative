package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avnj  reason: default package */
/* loaded from: classes3.dex */
public final class avnj implements avnt {
    public final dbty<awcy> a;
    public final dbty<awcd> b;
    private final bvrb c;
    private final awmu d;
    private final awmu e;
    private final avnk f;

    public avnj(bvrb bvrbVar, avnk avnkVar, awmu awmuVar, awmu awmuVar2, dbty<awcy> dbtyVar, dbty<awcd> dbtyVar2) {
        this.c = bvrbVar;
        this.f = avnkVar;
        this.d = awmuVar;
        this.e = awmuVar2;
        this.a = dbtyVar;
        this.b = dbtyVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <Q extends dssj, S extends dssj> btzc g(String str, awmu awmuVar, final Q q, buad buadVar, final dbty<avnh> dbtyVar, final dssr<S> dssrVar, btzi<Q, S> btziVar, bvrj bvrjVar) {
        avnk avnkVar = this.f;
        final dlvc a = avnk.a(avnkVar.a, avnkVar.c.a().a(), buadVar.f, avnkVar.b.b());
        btzq a2 = btzr.a();
        a2.a = q;
        a2.c = buadVar.e;
        a2.e = new btzw(null);
        btzq.b(1);
        dtaq dtaqVar = a.d;
        if (dtaqVar == null) {
            dtaqVar = dtaq.m;
        }
        a2.d = new ahnd(dtaqVar);
        btzr a3 = a2.a();
        dehn b = awmuVar.b(str, new awmt(dbtyVar, a, q, dssrVar) { // from class: avmr
            private final dbty a;
            private final dlvc b;
            private final dssj c;
            private final dssr d;

            {
                this.a = dbtyVar;
                this.b = a;
                this.c = q;
                this.d = dssrVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dbty dbtyVar2 = this.a;
                dlvc dlvcVar = this.b;
                dssj dssjVar = this.c;
                dssr dssrVar2 = this.d;
                byte[] a4 = ((avnh) dbtyVar2.a()).a(dlvcVar.bS(), dssjVar.bS());
                if (a4 != null) {
                    try {
                        return (dssj) dssrVar2.i(a4, dsqa.c());
                    } catch (dsrm e) {
                        throw new avni(btzy.g.b(e));
                    }
                }
                throw new avni(btzy.l);
            }
        });
        avnf avnfVar = new avnf(btziVar, a3, awmuVar);
        Executor g = this.c.g(bvrjVar);
        dbsk.s(g);
        deha.q(b, avnfVar, g);
        return new avng(b);
    }

    @Override // defpackage.avnt
    public final btzc a(dwir dwirVar, buad buadVar, btzi<dwir, dwiv> btziVar, bvrj bvrjVar) {
        return g("search", this.d, dwirVar, buadVar, new dbty(this) { // from class: avmx
            private final avnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                awcy a = this.a.a.a();
                a.getClass();
                return new avnh(a) { // from class: avmv
                    private final awcy a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.avnh
                    public final byte[] a(byte[] bArr, byte[] bArr2) {
                        return this.a.a(bArr, bArr2);
                    }
                };
            }
        }, (dssr) dwiv.M.cu(7), btziVar, bvrjVar);
    }

    @Override // defpackage.avnt
    public final btzc b(dwjn dwjnVar, buad buadVar, btzi<dwjn, dwjp> btziVar, bvrj bvrjVar) {
        return g("suggest", this.d, dwjnVar, buadVar, new dbty(this) { // from class: avmy
            private final avnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                awcy a = this.a.a.a();
                a.getClass();
                return new avnh(a) { // from class: avmu
                    private final awcy a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.avnh
                    public final byte[] a(byte[] bArr, byte[] bArr2) {
                        return this.a.e(bArr, bArr2);
                    }
                };
            }
        }, (dssr) dwjp.h.cu(7), btziVar, bvrjVar);
    }

    @Override // defpackage.avnt
    public final btzc c(dwcw dwcwVar, buad buadVar, btzi<dwcw, dwcy> btziVar, bvrj bvrjVar) {
        return g("locationDetails", this.d, dwcwVar, buadVar, new dbty(this) { // from class: avmz
            private final avnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                awcy a = this.a.a.a();
                a.getClass();
                return new avnh(a) { // from class: avmt
                    private final awcy a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.avnh
                    public final byte[] a(byte[] bArr, byte[] bArr2) {
                        return this.a.g(bArr, bArr2);
                    }
                };
            }
        }, (dssr) dwcy.e.cu(7), btziVar, bvrjVar);
    }

    @Override // defpackage.avnt
    public final btzc d(dvzj dvzjVar, buad buadVar, btzi<dvzj, dvzl> btziVar, bvrj bvrjVar) {
        return g("placeDetails", this.d, dvzjVar, buadVar, new dbty(this) { // from class: avna
            private final avnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                awcy a = this.a.a.a();
                a.getClass();
                return new avnh(a) { // from class: avms
                    private final awcy a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.avnh
                    public final byte[] a(byte[] bArr, byte[] bArr2) {
                        return this.a.f(bArr, bArr2);
                    }
                };
            }
        }, (dssr) dvzl.g.cu(7), btziVar, bvrjVar);
    }

    @Override // defpackage.avnt
    public final btzc e(dwaw dwawVar, buad buadVar, btzi<dwaw, dwbc> btziVar, bvrj bvrjVar) {
        return g("getDirections", this.e, dwawVar, buadVar, new dbty(this) { // from class: avnb
            private final avnj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final awcd a = this.a.b.a();
                a.getClass();
                return new avnh(a) { // from class: avne
                    private final awcd a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.avnh
                    public final byte[] a(byte[] bArr, byte[] bArr2) {
                        return this.a.a(bArr, bArr2);
                    }
                };
            }
        }, (dssr) dwbc.g.cu(7), btziVar, bvrjVar);
    }

    @Override // defpackage.avnt
    public final btzc f(dvvu dvvuVar, buad buadVar, btzi<dvvu, dvvw> btziVar, bvrj bvrjVar) {
        return g("categories", this.d, dvvuVar, buadVar, avnc.a, (dssr) dvvw.b.cu(7), btziVar, bvrjVar);
    }
}
