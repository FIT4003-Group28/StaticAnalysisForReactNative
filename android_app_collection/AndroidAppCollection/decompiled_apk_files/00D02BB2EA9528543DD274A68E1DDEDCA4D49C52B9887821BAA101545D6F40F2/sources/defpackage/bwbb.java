package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bwbb  reason: default package */
/* loaded from: classes4.dex */
public final class bwbb extends bvwn<dmin> {
    public dmim b;
    private final gga c;
    private final egk d;
    private final AtomicInteger e;
    private final double f;

    public bwbb(gga ggaVar, egk egkVar, AtomicInteger atomicInteger, double d) {
        super(dmin.d);
        this.b = dmim.c;
        this.c = ggaVar;
        this.d = egkVar;
        this.e = atomicInteger;
        this.f = d;
    }

    private static void g(dmim dmimVar) {
        dmil dmilVar;
        boolean z = true;
        dbsk.a(dmih.a(dmimVar.a) != 4);
        if (dmih.a(dmimVar.a) == 3) {
            if (dmimVar.a == 3) {
                dmilVar = (dmil) dmimVar.b;
            } else {
                dmilVar = dmil.d;
            }
            int a = dmik.a(dmilVar.a);
            if (a == 0 || a == 1) {
                z = false;
            }
            dbsk.a(z);
            dmim dmimVar2 = dmilVar.b;
            if (dmimVar2 == null) {
                dmimVar2 = dmim.c;
            }
            g(dmimVar2);
            dmim dmimVar3 = dmilVar.c;
            if (dmimVar3 == null) {
                dmimVar3 = dmim.c;
            }
            g(dmimVar3);
        }
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmin dminVar) {
        dmin dminVar2 = dminVar;
        int NR = gwu.b().NR(this.c);
        egk egkVar = this.d;
        dbsk.s(this.a);
        int width = this.a.getWidth();
        dmhy dmhyVar = dminVar2.a;
        if (dmhyVar == null) {
            dmhyVar = dmhy.c;
        }
        egkVar.c = (width - ((int) (dmhyVar.a * this.f))) - NR;
        AtomicInteger atomicInteger = this.e;
        dmhy dmhyVar2 = dminVar2.a;
        if (dmhyVar2 == null) {
            dmhyVar2 = dmhy.c;
        }
        atomicInteger.set((int) (dmhyVar2.b * this.f));
        this.d.b();
        try {
            dmim dmimVar = dminVar2.b;
            if (dmimVar == null) {
                dmimVar = dmim.c;
            }
            g(dmimVar);
            dmim dmimVar2 = dminVar2.b;
            if (dmimVar2 == null) {
                dmimVar2 = dmim.c;
            }
            this.b = dmimVar2;
        } catch (IllegalArgumentException e) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            bvwj a = c.a();
            a.initCause(e);
            throw a;
        }
    }
}
