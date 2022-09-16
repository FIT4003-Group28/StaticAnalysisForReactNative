package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bok  reason: default package */
/* loaded from: classes3.dex */
public final class bok {
    private static final bph a = bph.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final bph b = bph.a("p", "k");
    private static final bph c = bph.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bmv a(bpj bpjVar, bis bisVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        bmf bmfVar = null;
        bmg bmgVar = null;
        bmi bmiVar = null;
        bmi bmiVar2 = null;
        bme bmeVar = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        bme bmeVar2 = null;
        boolean z = false;
        while (bpjVar.h()) {
            switch (bpjVar.j(a)) {
                case 0:
                    str = bpjVar.l();
                    break;
                case 1:
                    bpjVar.f();
                    int i4 = -1;
                    while (bpjVar.h()) {
                        int j = bpjVar.j(b);
                        if (j == 0) {
                            i4 = bpjVar.o();
                        } else if (j == 1) {
                            bmfVar = boa.g(bpjVar, bisVar, i4);
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
                    bmeVar = boa.a(bpjVar, bisVar);
                    break;
                case 7:
                    i2 = bng.a()[bpjVar.o() - 1];
                    break;
                case 8:
                    i3 = bnh.a()[bpjVar.o() - 1];
                    break;
                case 9:
                    f = (float) bpjVar.n();
                    break;
                case 10:
                    z = bpjVar.m();
                    break;
                case 11:
                    bpjVar.d();
                    while (bpjVar.h()) {
                        bpjVar.f();
                        String str2 = null;
                        bme bmeVar3 = null;
                        while (bpjVar.h()) {
                            int j2 = bpjVar.j(c);
                            if (j2 != 0) {
                                bme bmeVar4 = bmeVar2;
                                if (j2 == 1) {
                                    bmeVar3 = boa.a(bpjVar, bisVar);
                                } else {
                                    bpjVar.k();
                                    bpjVar.p();
                                }
                                bmeVar2 = bmeVar4;
                            } else {
                                str2 = bpjVar.l();
                            }
                        }
                        bme bmeVar5 = bmeVar2;
                        bpjVar.g();
                        if (str2.equals("o")) {
                            bmeVar2 = bmeVar3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                bisVar.h();
                                arrayList.add(bmeVar3);
                            }
                            bmeVar2 = bmeVar5;
                        }
                    }
                    bme bmeVar6 = bmeVar2;
                    bpjVar.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((bme) arrayList.get(0));
                    }
                    bmeVar2 = bmeVar6;
                    break;
                default:
                    bpjVar.k();
                    bpjVar.p();
                    break;
            }
        }
        return new bmv(str, i, bmfVar, bmgVar, bmiVar, bmiVar2, bmeVar, i2, i3, f, arrayList, bmeVar2, z);
    }
}
