package defpackage;
/* compiled from: PG */
/* renamed from: bonb  reason: default package */
/* loaded from: classes3.dex */
public final class bonb {
    private static final dcdc<dory> a = dcdc.h(dory.AUTO_FILLED, dory.PRE_FILLED, dory.REVERSE_GEOCODED);

    public static void a(doru doruVar, @dzsi dory doryVar, cpnd cpndVar) {
        if (a.contains(doryVar)) {
            return;
        }
        cpnd cpndVar2 = cpnd.USER_INPUT_NOT_VERIFIED;
        int ordinal = cpndVar.ordinal();
        int i = 4;
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        } else if (ordinal != 2) {
            i = ordinal != 3 ? ordinal != 4 ? 1 : 6 : 5;
        }
        if (doruVar.c) {
            doruVar.bF();
            doruVar.c = false;
        }
        dorz dorzVar = (dorz) doruVar.b;
        dorz dorzVar2 = dorz.f;
        dorzVar.e = i - 1;
        dorzVar.a |= 8;
    }

    public static dbsg<doru> b(@dzsi dory doryVar, @dzsi String str, @dzsi String str2) {
        if (doryVar == null) {
            return dbpy.a;
        }
        doru bZ = dorz.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dorz dorzVar = (dorz) bZ.b;
        dorzVar.b = doryVar.i;
        dorzVar.a |= 1;
        if (!doryVar.equals(dory.USER_PROVIDED)) {
            dnip bZ2 = dniu.i.bZ();
            if (str != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dniu dniuVar = (dniu) bZ2.b;
                str.getClass();
                dniuVar.a |= 1;
                dniuVar.b = str;
            }
            if (str2 != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dniu dniuVar2 = (dniu) bZ2.b;
                str2.getClass();
                dniuVar2.a |= 4;
                dniuVar2.d = str2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dorz dorzVar2 = (dorz) bZ.b;
            dniu bK = bZ2.bK();
            bK.getClass();
            dorzVar2.c = bK;
            dorzVar2.a |= 2;
        }
        return dbsg.i(bZ);
    }
}
