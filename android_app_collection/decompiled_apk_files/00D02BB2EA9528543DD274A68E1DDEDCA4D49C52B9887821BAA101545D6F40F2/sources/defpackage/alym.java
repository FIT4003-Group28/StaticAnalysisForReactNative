package defpackage;
/* compiled from: PG */
/* renamed from: alym  reason: default package */
/* loaded from: classes.dex */
public final class alym {
    public static amza a(akrw akrwVar, alyl alylVar, String str, alyh alyhVar, String str2, String str3) {
        amyz bZ = amza.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amza amzaVar = (amza) bZ.b;
        str.getClass();
        amzaVar.a |= 1;
        amzaVar.b = str;
        drst bZ2 = drsu.e.bZ();
        int i = alyhVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drsu drsuVar = (drsu) bZ2.b;
        int i2 = drsuVar.a | 2;
        drsuVar.a = i2;
        drsuVar.c = i;
        int i3 = alyhVar.c;
        int i4 = i2 | 4;
        drsuVar.a = i4;
        drsuVar.d = i3;
        int i5 = alyhVar.a;
        drsuVar.a = i4 | 1;
        drsuVar.b = i5;
        drsu bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amza amzaVar2 = (amza) bZ.b;
        bK.getClass();
        amzaVar2.e = bK;
        int i6 = amzaVar2.a | 16;
        amzaVar2.a = i6;
        if (!akrwVar.c) {
            String str4 = akrwVar.a;
            str4.getClass();
            amzaVar2.a = i6 | 512;
            amzaVar2.i = str4;
        }
        altv altvVar = alyhVar.d;
        if (altvVar != null) {
            String o = altvVar.a.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amza amzaVar3 = (amza) bZ.b;
            o.getClass();
            amzaVar3.a |= 32;
            amzaVar3.f = o;
        }
        String j = alylVar.j();
        if (j != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amza amzaVar4 = (amza) bZ.b;
            j.getClass();
            amzaVar4.a |= 8;
            amzaVar4.d = j;
        }
        String m = alylVar.m();
        if (m != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amza amzaVar5 = (amza) bZ.b;
            m.getClass();
            amzaVar5.a |= 1024;
            amzaVar5.j = m;
        }
        String i7 = alylVar.i();
        if (i7 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amza amzaVar6 = (amza) bZ.b;
            i7.getClass();
            amzaVar6.a |= 256;
            amzaVar6.h = i7;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amza amzaVar7 = (amza) bZ.b;
        str3.getClass();
        int i8 = amzaVar7.a | 2;
        amzaVar7.a = i8;
        amzaVar7.c = str3;
        str2.getClass();
        amzaVar7.a = i8 | 64;
        amzaVar7.g = str2;
        return bZ.bK();
    }

    public static boolean b(int i) {
        return (i & 2) != 0;
    }

    public static boolean c(amze amzeVar, cqat cqatVar) {
        return (amzeVar.a & 64) != 0 && cqatVar.e() > amzeVar.h;
    }

    public static boolean d(int i, boolean z) {
        return z ? (i & 1) != 0 || !b(i) : !b(i);
    }

    public static boolean e(amze amzeVar, cqat cqatVar) {
        return (amzeVar.a & 32) != 0 && cqatVar.e() > amzeVar.g;
    }

    public static long f(amze amzeVar, akry akryVar, akrz akrzVar) {
        if ((amzeVar.a & 64) != 0) {
            return amzeVar.h - akrzVar.d(akryVar);
        }
        return -1L;
    }
}
