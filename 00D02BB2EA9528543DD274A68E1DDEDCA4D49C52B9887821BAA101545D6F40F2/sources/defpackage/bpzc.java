package defpackage;

import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpzc  reason: default package */
/* loaded from: classes4.dex */
public final class bpzc {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {0, 4, 8, 16};
    private static final int[] c = {2, 3, 5, 8};
    private static final int[] d = {3, 5, 7, 10};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dmqx a() {
        return f(-7303024, -986896);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dmqx b() {
        return f(-12566464, -9408400);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dmqx c() {
        dmqj bZ = dmqk.j.bZ();
        dmsk bZ2 = dmsl.l.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar = (dmsl) bZ2.b;
        dmslVar.a |= 1;
        dmslVar.b = -13342503;
        bZ.a(bZ2);
        dmsk bZ3 = dmsl.l.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmsl dmslVar2 = (dmsl) bZ3.b;
        dmslVar2.a |= 1;
        dmslVar2.b = -12216321;
        bZ.a(bZ3);
        return e(bZ.bJ());
    }

    public static dmqx d(int i, int i2) {
        List asList = Arrays.asList(48, 80);
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmqj bZ = dmqk.j.bZ();
        dmsk bZ2 = dmsl.l.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar = (dmsl) bZ2.b;
        dmslVar.a |= 1;
        dmslVar.b = i;
        bZ2.a(asList);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar2 = (dmsl) bZ2.b;
        dmslVar2.a |= 4;
        dmslVar2.d = 56;
        bZ.a(bZ2);
        dmsk bZ3 = dmsl.l.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmsl dmslVar3 = (dmsl) bZ3.b;
        dmslVar3.a |= 1;
        dmslVar3.b = i2;
        bZ3.a(asList);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmsl dmslVar4 = (dmsl) bZ3.b;
        dmslVar4.a |= 4;
        dmslVar4.d = 40;
        bZ.a(bZ3);
        int i3 = bntp.POLYLINE.k;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmqk dmqkVar = (dmqk) bZ.b;
        dmqkVar.a |= 4;
        dmqkVar.c = i3;
        dmqk bK = bZ.bK();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        int i4 = 1 | dmopVar.a;
        dmopVar.a = i4;
        dmopVar.b = 0;
        bK.getClass();
        dmopVar.e = bK;
        dmopVar.a = i4 | 8;
        dmqtVar.a(dmooVar);
        return (dmqx) dmqtVar.bK();
    }

    public static dmqx e(dmqk dmqkVar) {
        dbsk.b(dmqkVar.b.size() == 2, "Input line style should have two strokes (for outer and inner lines)");
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        for (int i = 0; i < 4; i++) {
            int i2 = c[i];
            int i3 = d[i];
            dmqj bZ = dmqk.j.bZ();
            dmsl dmslVar = dmqkVar.b.get(0);
            dsqp dsqpVar = (dsqp) dmslVar.cu(5);
            dsqpVar.bC(dmslVar);
            dmsk dmskVar = (dmsk) dsqpVar;
            int i4 = i3 * 8;
            if (dmskVar.c) {
                dmskVar.bF();
                dmskVar.c = false;
            }
            dmsl dmslVar2 = (dmsl) dmskVar.b;
            dmsl dmslVar3 = dmsl.l;
            dmslVar2.a |= 4;
            dmslVar2.d = i4;
            bZ.a(dmskVar);
            dmsl dmslVar4 = dmqkVar.b.get(1);
            dsqp dsqpVar2 = (dsqp) dmslVar4.cu(5);
            dsqpVar2.bC(dmslVar4);
            dmsk dmskVar2 = (dmsk) dsqpVar2;
            int i5 = i2 * 8;
            if (dmskVar2.c) {
                dmskVar2.bF();
                dmskVar2.c = false;
            }
            dmsl dmslVar5 = (dmsl) dmskVar2.b;
            dmslVar5.a |= 4;
            dmslVar5.d = i5;
            bZ.a(dmskVar2);
            int ordinal = bntp.POLYLINE.ordinal();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmqk dmqkVar2 = (dmqk) bZ.b;
            dmqkVar2.a = 4 | dmqkVar2.a;
            dmqkVar2.c = ordinal;
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            int i6 = b[i];
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            dmopVar.a |= 1;
            dmopVar.b = i6;
            dmqk bK = bZ.bK();
            bK.getClass();
            dmopVar.e = bK;
            dmopVar.a |= 8;
            dmqtVar.a(dmooVar);
        }
        return (dmqx) dmqtVar.bK();
    }

    private static dmqx f(int i, int i2) {
        List asList = Arrays.asList(80, 64);
        dmqj bZ = dmqk.j.bZ();
        dmsk bZ2 = dmsl.l.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmsl dmslVar = (dmsl) bZ2.b;
        dmslVar.a |= 1;
        dmslVar.b = i;
        bZ2.a(asList);
        bZ.a(bZ2);
        dmsk bZ3 = dmsl.l.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmsl dmslVar2 = (dmsl) bZ3.b;
        dmslVar2.a = 1 | dmslVar2.a;
        dmslVar2.b = i2;
        bZ3.a(asList);
        bZ.a(bZ3);
        return e(bZ.bJ());
    }
}
