package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpc  reason: default package */
/* loaded from: classes3.dex */
public final class bpc {
    private static final bph a = bph.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final bph b = bph.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bni a(bpj bpjVar, bis bisVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        bme bmeVar = null;
        bmd bmdVar = null;
        bmg bmgVar = null;
        bme bmeVar2 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        boolean z = false;
        while (bpjVar.h()) {
            switch (bpjVar.j(a)) {
                case 0:
                    str = bpjVar.l();
                    break;
                case 1:
                    bmdVar = boa.f(bpjVar, bisVar);
                    break;
                case 2:
                    bmeVar2 = boa.a(bpjVar, bisVar);
                    break;
                case 3:
                    bmgVar = boa.c(bpjVar, bisVar);
                    break;
                case 4:
                    i = bng.a()[bpjVar.o() - 1];
                    break;
                case 5:
                    i2 = bnh.a()[bpjVar.o() - 1];
                    break;
                case 6:
                    f = (float) bpjVar.n();
                    break;
                case 7:
                    z = bpjVar.m();
                    break;
                case 8:
                    bpjVar.d();
                    while (bpjVar.h()) {
                        bpjVar.f();
                        bme bmeVar3 = null;
                        String str2 = null;
                        while (bpjVar.h()) {
                            int j = bpjVar.j(b);
                            if (j == 0) {
                                str2 = bpjVar.l();
                            } else if (j == 1) {
                                bmeVar3 = boa.a(bpjVar, bisVar);
                            } else {
                                bpjVar.k();
                                bpjVar.p();
                            }
                        }
                        bpjVar.g();
                        int hashCode = str2.hashCode();
                        if (hashCode == 100) {
                            if (str2.equals("d")) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            bmeVar = bmeVar3;
                        } else if (c == 1 || c == 2) {
                            bisVar.h();
                            arrayList.add(bmeVar3);
                        }
                    }
                    bpjVar.e();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((bme) arrayList.get(0));
                        break;
                    }
                default:
                    bpjVar.p();
                    break;
            }
        }
        return new bni(str, bmeVar, arrayList, bmdVar, bmgVar, bmeVar2, i, i2, f, z);
    }
}
