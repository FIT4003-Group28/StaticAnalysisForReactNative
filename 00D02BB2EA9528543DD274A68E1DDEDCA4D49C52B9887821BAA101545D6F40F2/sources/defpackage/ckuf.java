package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ckuf  reason: default package */
/* loaded from: classes4.dex */
public final class ckuf {
    private static final byte[] o = new byte[0];
    public final btrm a;
    public final bvrb b;
    public final ckuv c;
    public final dzsj<ckti> d;
    public final dzsj<cksw> e;
    public final cktd f;
    public final ckup g;
    public final Context h;
    public boolean i;
    @dzsi
    public ckti j;
    @dzsi
    public cksw k;
    public final ckud l = new ckud(this);
    public final cktc m = new ckua(this);
    public final ckuc n = new ckuc(this);
    private final long p;

    public ckuf(btrm btrmVar, bvrb bvrbVar, ckuv ckuvVar, dzsj<ckti> dzsjVar, dzsj<cksw> dzsjVar2, cktd cktdVar, ckup ckupVar, Context context) {
        dbsk.s(btrmVar);
        this.a = btrmVar;
        dbsk.s(bvrbVar);
        this.b = bvrbVar;
        dbsk.s(ckuvVar);
        this.c = ckuvVar;
        dbsk.s(dzsjVar);
        this.d = dzsjVar;
        dbsk.s(dzsjVar2);
        this.e = dzsjVar2;
        dbsk.s(cktdVar);
        this.f = cktdVar;
        dbsk.s(ckupVar);
        this.g = ckupVar;
        dbsk.s(context);
        this.h = context;
        this.p = System.currentTimeMillis();
    }

    private final byte[] f() {
        ckwu bZ = ckwv.d.bZ();
        long j = this.p;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckwv ckwvVar = (ckwv) bZ.b;
        ckwvVar.a |= 1;
        ckwvVar.b = j;
        cksx cksxVar = this.k.a;
        cksxVar.i = false;
        if (cksxVar.b) {
            cksxVar.e = cksxVar.d;
            cksxVar.c = true;
        }
        cksxVar.h = cksxVar.g;
        ckwt bK = cksxVar.a.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckwv ckwvVar2 = (ckwv) bZ.b;
        bK.getClass();
        ckwvVar2.c = bK;
        ckwvVar2.a |= 2;
        return bZ.bK().bS();
    }

    public final void a() {
        bvrj.WEARABLE_DATA.c();
        this.c.b("/navigation_stopped", o);
    }

    public final void b() {
        bvrj.WEARABLE_DATA.c();
        this.c.b("/navigation_guidance", f());
    }

    public final void c(String str) {
        dbsk.l(this.i);
        bvrj.WEARABLE_DATA.c();
        this.c.c(str, "/navigation_guidance", f());
    }

    public final void d(String str) {
        dbsk.l(this.i);
        bvrj.WEARABLE_DATA.c();
        this.c.c(str, "/navigation_route", e());
    }

    public final byte[] e() {
        ckxi bZ = ckxj.d.bZ();
        long j = this.p;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckxj ckxjVar = (ckxj) bZ.b;
        ckxjVar.a |= 1;
        ckxjVar.b = j;
        ckti cktiVar = this.j;
        cktiVar.f = false;
        ckxh bK = cktiVar.a.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckxj ckxjVar2 = (ckxj) bZ.b;
        bK.getClass();
        ckxjVar2.c = bK;
        ckxjVar2.a |= 2;
        return bZ.bK().bS();
    }
}
