package defpackage;
/* compiled from: PG */
/* renamed from: aplm  reason: default package */
/* loaded from: classes2.dex */
final class aplm {
    private static final dcqe a = dcqe.c("aplm");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(dmim dmimVar, double d, double d2) {
        dmif dmifVar;
        dmib dmibVar;
        dmil dmilVar;
        int a2 = dmih.a(dmimVar.a);
        int i = a2 - 1;
        if (a2 != 0) {
            if (i == 0) {
                if (dmimVar.a == 1) {
                    dmifVar = (dmif) dmimVar.b;
                } else {
                    dmifVar = dmif.e;
                }
                return dmifVar.a <= d && dmifVar.b >= d && dmifVar.c <= d2 && dmifVar.d >= d2;
            } else if (i == 1) {
                if (dmimVar.a == 2) {
                    dmibVar = (dmib) dmimVar.b;
                } else {
                    dmibVar = dmib.c;
                }
                dmid dmidVar = dmibVar.a;
                if (dmidVar == null) {
                    dmidVar = dmid.c;
                }
                return Math.pow(dmidVar.a - d, 2.0d) + Math.pow(dmidVar.b - d2, 2.0d) <= Math.pow(dmibVar.b, 2.0d);
            } else if (i != 2) {
                if (i != 3) {
                    throw new AssertionError();
                }
                return false;
            } else {
                if (dmimVar.a == 3) {
                    dmilVar = (dmil) dmimVar.b;
                } else {
                    dmilVar = dmil.d;
                }
                dmim dmimVar2 = dmilVar.b;
                if (dmimVar2 == null) {
                    dmimVar2 = dmim.c;
                }
                dmim dmimVar3 = dmilVar.c;
                if (dmimVar3 == null) {
                    dmimVar3 = dmim.c;
                }
                int a3 = dmik.a(dmilVar.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i2 = a3 - 1;
                if (i2 == 1) {
                    if (!a(dmimVar2, d, d2)) {
                        if (!a(dmimVar3, d, d2)) {
                            return false;
                        }
                    }
                    return true;
                } else if (i2 == 2) {
                    return a(dmimVar2, d, d2) && a(dmimVar3, d, d2);
                } else if (i2 == 3) {
                    return a(dmimVar2, d, d2) && !a(dmimVar3, d, d2);
                } else if (i2 != 4) {
                    bvoo.h("Unsupported region op", new Object[0]);
                    return false;
                } else {
                    return a(dmimVar2, d, d2) ^ a(dmimVar3, d, d2);
                }
            }
        }
        throw null;
    }
}
