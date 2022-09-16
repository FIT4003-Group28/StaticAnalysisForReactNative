package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccc  reason: default package */
/* loaded from: classes2.dex */
public final class ccc {
    private static final ccv a = ccv.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final ccv b = ccv.a("p", "k");
    private static final ccv c = ccv.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static caq a(ccw ccwVar, bwx bwxVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        caa caaVar = null;
        cad cadVar = null;
        cad cadVar2 = null;
        bzz bzzVar = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        bzz bzzVar2 = null;
        boolean z = false;
        cab cabVar = null;
        while (ccwVar.p()) {
            switch (ccwVar.c(a)) {
                case 0:
                    str = ccwVar.h();
                    break;
                case 1:
                    ccwVar.j();
                    int i4 = -1;
                    while (ccwVar.p()) {
                        int c2 = ccwVar.c(b);
                        if (c2 == 0) {
                            i4 = ccwVar.b();
                        } else if (c2 == 1) {
                            caaVar = lg.l(ccwVar, bwxVar, i4);
                        } else {
                            ccwVar.n();
                            ccwVar.o();
                        }
                    }
                    ccwVar.l();
                    break;
                case 2:
                    cabVar = lg.m(ccwVar, bwxVar);
                    break;
                case 3:
                    if (ccwVar.b() != 1) {
                        i = 2;
                        break;
                    } else {
                        i = 1;
                        break;
                    }
                case 4:
                    cadVar = lg.n(ccwVar, bwxVar);
                    break;
                case 5:
                    cadVar2 = lg.n(ccwVar, bwxVar);
                    break;
                case 6:
                    bzzVar = lg.j(ccwVar, bwxVar);
                    break;
                case 7:
                    i2 = lf.h()[ccwVar.b() - 1];
                    break;
                case 8:
                    i3 = lf.f()[ccwVar.b() - 1];
                    break;
                case 9:
                    f = (float) ccwVar.a();
                    break;
                case 10:
                    z = ccwVar.q();
                    break;
                case 11:
                    ccwVar.i();
                    while (ccwVar.p()) {
                        ccwVar.j();
                        String str2 = null;
                        bzz bzzVar3 = null;
                        while (ccwVar.p()) {
                            int c3 = ccwVar.c(c);
                            if (c3 != 0) {
                                bzz bzzVar4 = bzzVar2;
                                if (c3 == 1) {
                                    bzzVar3 = lg.j(ccwVar, bwxVar);
                                } else {
                                    ccwVar.n();
                                    ccwVar.o();
                                }
                                bzzVar2 = bzzVar4;
                            } else {
                                str2 = ccwVar.h();
                            }
                        }
                        bzz bzzVar5 = bzzVar2;
                        ccwVar.l();
                        if (str2.equals("o")) {
                            bzzVar2 = bzzVar3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                bwxVar.f();
                                arrayList.add(bzzVar3);
                            }
                            bzzVar2 = bzzVar5;
                        }
                    }
                    bzz bzzVar6 = bzzVar2;
                    ccwVar.k();
                    if (arrayList.size() == 1) {
                        arrayList.add((bzz) arrayList.get(0));
                    }
                    bzzVar2 = bzzVar6;
                    break;
                default:
                    ccwVar.n();
                    ccwVar.o();
                    break;
            }
        }
        if (cabVar == null) {
            cabVar = new cab(Collections.singletonList(new cdi(100)));
        }
        return new caq(str, i, caaVar, cabVar, cadVar, cadVar2, bzzVar, i2, i3, f, arrayList, bzzVar2, z);
    }
}
