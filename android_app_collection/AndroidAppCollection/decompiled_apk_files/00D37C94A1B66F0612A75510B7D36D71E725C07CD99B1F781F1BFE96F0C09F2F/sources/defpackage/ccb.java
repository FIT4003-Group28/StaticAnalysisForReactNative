package defpackage;

import android.graphics.Path;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccb  reason: default package */
/* loaded from: classes2.dex */
public final class ccb {
    private static final ccv a = ccv.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final ccv b = ccv.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cap a(ccw ccwVar, bwx bwxVar) {
        cab cabVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        caa caaVar = null;
        cad cadVar = null;
        cad cadVar2 = null;
        int i = 0;
        boolean z = false;
        while (ccwVar.p()) {
            switch (ccwVar.c(a)) {
                case 0:
                    str = ccwVar.h();
                    break;
                case 1:
                    ccwVar.j();
                    int i2 = -1;
                    while (ccwVar.p()) {
                        int c = ccwVar.c(b);
                        if (c == 0) {
                            i2 = ccwVar.b();
                        } else if (c == 1) {
                            caaVar = lg.l(ccwVar, bwxVar, i2);
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
                    if (ccwVar.b() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    z = ccwVar.q();
                    break;
                default:
                    ccwVar.n();
                    ccwVar.o();
                    break;
            }
        }
        return new cap(str, i, fillType, caaVar, cabVar == null ? new cab(Collections.singletonList(new cdi(100))) : cabVar, cadVar, cadVar2, z);
    }
}
