package defpackage;

import java.util.ArrayList;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccq  reason: default package */
/* loaded from: classes2.dex */
public final class ccq {
    private static final ccv a = ccv.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final ccv b = ccv.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cba a(ccw ccwVar, bwx bwxVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        bzz bzzVar = null;
        bzy bzyVar = null;
        bzz bzzVar2 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        boolean z = false;
        cab cabVar = null;
        while (true) {
            int i3 = 100;
            if (ccwVar.p()) {
                switch (ccwVar.c(a)) {
                    case 0:
                        str = ccwVar.h();
                        break;
                    case 1:
                        bzyVar = lg.i(ccwVar, bwxVar);
                        break;
                    case 2:
                        bzzVar2 = lg.j(ccwVar, bwxVar);
                        break;
                    case 3:
                        cabVar = lg.m(ccwVar, bwxVar);
                        break;
                    case 4:
                        i = lf.h()[ccwVar.b() - 1];
                        break;
                    case 5:
                        i2 = lf.f()[ccwVar.b() - 1];
                        break;
                    case 6:
                        f = (float) ccwVar.a();
                        break;
                    case 7:
                        z = ccwVar.q();
                        break;
                    case 8:
                        ccwVar.i();
                        while (ccwVar.p()) {
                            ccwVar.j();
                            bzz bzzVar3 = null;
                            String str2 = null;
                            while (ccwVar.p()) {
                                int c2 = ccwVar.c(b);
                                if (c2 == 0) {
                                    str2 = ccwVar.h();
                                } else if (c2 == 1) {
                                    bzzVar3 = lg.j(ccwVar, bwxVar);
                                } else {
                                    ccwVar.n();
                                    ccwVar.o();
                                }
                            }
                            ccwVar.l();
                            int hashCode = str2.hashCode();
                            if (hashCode == i3) {
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
                                bzzVar = bzzVar3;
                            } else if (c == 1 || c == 2) {
                                bwxVar.f();
                                arrayList.add(bzzVar3);
                            }
                            i3 = 100;
                        }
                        ccwVar.k();
                        if (arrayList.size() != 1) {
                            break;
                        } else {
                            arrayList.add((bzz) arrayList.get(0));
                            break;
                        }
                    default:
                        ccwVar.o();
                        break;
                }
            } else {
                if (cabVar == null) {
                    cabVar = new cab(Collections.singletonList(new cdi(100)));
                }
                return new cba(str, bzzVar, arrayList, bzyVar, cabVar, bzzVar2, i, i2, f, z);
            }
        }
    }
}
