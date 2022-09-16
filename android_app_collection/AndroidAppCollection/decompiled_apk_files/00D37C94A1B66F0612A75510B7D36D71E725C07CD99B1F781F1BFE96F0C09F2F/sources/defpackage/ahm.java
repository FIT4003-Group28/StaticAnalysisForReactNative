package defpackage;
/* compiled from: PG */
/* renamed from: ahm  reason: default package */
/* loaded from: classes.dex */
public final class ahm {
    static final boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ahi ahiVar, agy agyVar, ahh ahhVar) {
        ahhVar.p = -1;
        ahhVar.q = -1;
        if (ahiVar.ap[0] != 2 && ahhVar.ap[0] == 4) {
            int i = ahhVar.f46J.f;
            int j = ahiVar.j() - ahhVar.L.f;
            ahg ahgVar = ahhVar.f46J;
            ahgVar.h = agyVar.b(ahgVar);
            ahg ahgVar2 = ahhVar.L;
            ahgVar2.h = agyVar.b(ahgVar2);
            agyVar.f(ahhVar.f46J.h, i);
            agyVar.f(ahhVar.L.h, j);
            ahhVar.p = 2;
            ahhVar.Y = i;
            int i2 = j - i;
            ahhVar.U = i2;
            int i3 = ahhVar.ab;
            if (i2 < i3) {
                ahhVar.U = i3;
            }
        }
        if (ahiVar.ap[1] == 2 || ahhVar.ap[1] != 4) {
            return;
        }
        int i4 = ahhVar.K.f;
        int h = ahiVar.h() - ahhVar.M.f;
        ahg ahgVar3 = ahhVar.K;
        ahgVar3.h = agyVar.b(ahgVar3);
        ahg ahgVar4 = ahhVar.M;
        ahgVar4.h = agyVar.b(ahgVar4);
        agyVar.f(ahhVar.K.h, i4);
        agyVar.f(ahhVar.M.h, h);
        if (ahhVar.aa > 0 || ahhVar.ag == 8) {
            ahg ahgVar5 = ahhVar.N;
            ahgVar5.h = agyVar.b(ahgVar5);
            agyVar.f(ahhVar.N.h, ahhVar.aa + i4);
        }
        ahhVar.q = 2;
        ahhVar.Z = i4;
        int i5 = h - i4;
        ahhVar.V = i5;
        int i6 = ahhVar.ac;
        if (i5 >= i6) {
            return;
        }
        ahhVar.V = i6;
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
