package defpackage;

import android.graphics.PointF;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bou  reason: default package */
/* loaded from: classes3.dex */
public final class bou {
    private static final bph a = bph.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmz a(bpj bpjVar, bis bisVar) {
        boolean z = false;
        String str = null;
        bme bmeVar = null;
        bmp<PointF, PointF> bmpVar = null;
        bme bmeVar2 = null;
        bme bmeVar3 = null;
        bme bmeVar4 = null;
        bme bmeVar5 = null;
        bme bmeVar6 = null;
        int i = 0;
        boolean z2 = false;
        while (bpjVar.h()) {
            switch (bpjVar.j(a)) {
                case 0:
                    str = bpjVar.l();
                    break;
                case 1:
                    int o = bpjVar.o();
                    int[] a2 = bmy.a();
                    for (int i2 = 0; i2 < 2; i2++) {
                        int i3 = a2[i2];
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i3 == o) {
                            i = i3;
                            break;
                        }
                    }
                    z = false;
                    i = 0;
                    continue;
                case 2:
                    bmeVar = boa.b(bpjVar, bisVar, z);
                    continue;
                case 3:
                    bmpVar = bnx.b(bpjVar, bisVar);
                    continue;
                case 4:
                    bmeVar2 = boa.b(bpjVar, bisVar, z);
                    continue;
                case 5:
                    bmeVar4 = boa.a(bpjVar, bisVar);
                    continue;
                case 6:
                    bmeVar6 = boa.b(bpjVar, bisVar, z);
                    continue;
                case 7:
                    bmeVar3 = boa.a(bpjVar, bisVar);
                    continue;
                case 8:
                    bmeVar5 = boa.b(bpjVar, bisVar, z);
                    continue;
                case 9:
                    z2 = bpjVar.m();
                    continue;
                default:
                    bpjVar.k();
                    bpjVar.p();
                    break;
            }
            z = false;
        }
        return new bmz(str, i, bmeVar, bmpVar, bmeVar2, bmeVar3, bmeVar4, bmeVar5, bmeVar6, z2);
    }
}
