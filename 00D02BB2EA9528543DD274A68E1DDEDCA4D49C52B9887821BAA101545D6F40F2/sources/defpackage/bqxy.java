package defpackage;
/* compiled from: PG */
/* renamed from: bqxy  reason: default package */
/* loaded from: classes4.dex */
public final class bqxy extends amaw implements bqxu, bqyq {
    static final akry x = akry.ROAD_GRAPH;
    public static final /* synthetic */ int y = 0;
    @dzsi
    private final bqyj A;
    private final bqxo B;
    private final bqxt C;
    private final boolean D;
    private final bvrb E;
    private final alzu F;
    private final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bqxy(int r20, defpackage.amby r21, defpackage.bqyj r22, defpackage.bqxo r23, defpackage.bqxt r24, defpackage.alzn r25, defpackage.alzu r26, defpackage.akrz r27, defpackage.ckcw r28, defpackage.dzsj r29, java.lang.Runnable r30, defpackage.cqat r31, defpackage.bvrb r32, defpackage.dehq r33, defpackage.dehq r34, defpackage.aluh r35) {
        /*
            r19 = this;
            r7 = r19
            r0 = r19
            r16 = r20
            r3 = r21
            r8 = r25
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r33
            r15 = r34
            r17 = r35
            akry r4 = defpackage.bqxy.x
            akrw r1 = defpackage.akrw.a(r4)
            alyl r2 = defpackage.alyl.o
            bqxx r5 = new bqxx
            r6 = r5
            r5.<init>()
            amcc r5 = new amcc
            r18 = r5
            r7 = r31
            r5.<init>(r7, r4)
            r4 = 0
            r5 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r20
            r0.z = r1
            r1 = r22
            r0.A = r1
            r1 = r23
            r0.B = r1
            r2 = r24
            r0.C = r2
            boolean r1 = r23.s()
            r0.D = r1
            r1 = r32
            r0.E = r1
            r1 = r26
            r0.F = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqxy.<init>(int, amby, bqyj, bqxo, bqxt, alzn, alzu, akrz, ckcw, dzsj, java.lang.Runnable, cqat, bvrb, dehq, dehq, aluh):void");
    }

    private final boolean J() {
        return !this.D && this.z != Jd && this.z == this.C.b();
    }

    @Override // defpackage.amaw, defpackage.amco
    public final void F(alyh alyhVar, @dzsi amcm amcmVar, int i) {
        if (J()) {
            super.F(alyhVar, amcmVar, i);
        } else {
            this.E.b(new bqxw(amcmVar, alyhVar), bvrj.BACKGROUND_THREADPOOL);
        }
    }

    @Override // defpackage.bqyq
    public final void I(alyh alyhVar) {
        a(alyhVar, bqxv.a);
    }

    @Override // defpackage.amaw, defpackage.amco
    public final void a(alyh alyhVar, amcm amcmVar) {
        if (J()) {
            super.a(alyhVar, amcmVar);
        } else {
            d(alyhVar, amcmVar, false);
        }
    }

    @Override // defpackage.amaw, defpackage.btni
    public final int b(float f) {
        bqyj bqyjVar = this.A;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amaw
    public final void j(ambv ambvVar) {
        this.F.c(!this.B.c);
        super.j(ambvVar);
    }

    @Override // defpackage.amaw, defpackage.amco
    public final boolean k(alyh alyhVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amaw
    @dzsi
    public final alyg q(ambv ambvVar, alzt alztVar, bvnv bvnvVar) {
        alyg alygVar = null;
        if (alztVar.e == 1) {
            byte[] G = alztVar.a.c.G();
            this.C.d(this.z, false);
            alyh b = ambvVar.b();
            if (G != null) {
                this.B.b(amze.o, G, bvnvVar);
            }
            if (!ambvVar.m() && this.A != null && (alygVar = this.B.n(b)) != null) {
                this.A.o(b, alygVar);
            }
        }
        return alygVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amaw
    public final void t(ambv ambvVar, btzy btzyVar) {
        super.t(ambvVar, btzyVar);
        if (btzyVar.equals(btzy.m)) {
            this.C.d(this.z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amaw
    @dzsi
    public final alyg y(amcl amclVar, alyh alyhVar) {
        if (amclVar.m(alyhVar)) {
            return amclVar.n(alyhVar);
        }
        return null;
    }
}
