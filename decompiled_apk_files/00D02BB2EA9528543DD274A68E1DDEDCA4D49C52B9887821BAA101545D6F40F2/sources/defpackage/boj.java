package defpackage;

import android.graphics.Path;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boj  reason: default package */
/* loaded from: classes3.dex */
public final class boj {
    private static final bph a = bph.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final bph b = bph.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmu a(bpj bpjVar, bis bisVar) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        bmf bmfVar = null;
        bmg bmgVar = null;
        bmi bmiVar = null;
        bmi bmiVar2 = null;
        int i = 0;
        boolean z = false;
        while (bpjVar.h()) {
            switch (bpjVar.j(a)) {
                case 0:
                    str = bpjVar.l();
                    break;
                case 1:
                    bpjVar.f();
                    int i2 = -1;
                    while (bpjVar.h()) {
                        int j = bpjVar.j(b);
                        if (j == 0) {
                            i2 = bpjVar.o();
                        } else if (j == 1) {
                            bmfVar = boa.g(bpjVar, bisVar, i2);
                        } else {
                            bpjVar.k();
                            bpjVar.p();
                        }
                    }
                    bpjVar.g();
                    break;
                case 2:
                    bmgVar = boa.c(bpjVar, bisVar);
                    break;
                case 3:
                    if (bpjVar.o() != 1) {
                        i = 2;
                        break;
                    } else {
                        i = 1;
                        break;
                    }
                case 4:
                    bmiVar = boa.d(bpjVar, bisVar);
                    break;
                case 5:
                    bmiVar2 = boa.d(bpjVar, bisVar);
                    break;
                case 6:
                    if (bpjVar.o() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    z = bpjVar.m();
                    break;
                default:
                    bpjVar.k();
                    bpjVar.p();
                    break;
            }
        }
        return new bmu(str, i, fillType, bmfVar, bmgVar, bmiVar, bmiVar2, z);
    }
}
