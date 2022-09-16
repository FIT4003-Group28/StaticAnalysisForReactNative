package defpackage;

import android.app.KeyguardManager;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aej  reason: default package */
/* loaded from: classes.dex */
public final class aej {
    public aej() {
        new afy();
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(KeyguardManager keyguardManager) {
        return keyguardManager.isKeyguardSecure();
    }

    public static aic b(ahh ahhVar, int i, ArrayList arrayList, aic aicVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = ahhVar.an;
        } else {
            i2 = ahhVar.ao;
        }
        if (i2 != -1 && (aicVar == null || i2 != aicVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                aic aicVar2 = (aic) arrayList.get(i4);
                if (aicVar2.c == i2) {
                    if (aicVar != null) {
                        aicVar.c(i, aicVar2);
                        arrayList.remove(aicVar);
                    }
                    aicVar = aicVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return aicVar;
        }
        if (aicVar == null) {
            if (ahhVar instanceof ahl) {
                ahl ahlVar = (ahl) ahhVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= ahlVar.ar) {
                        i3 = -1;
                        break;
                    }
                    ahh ahhVar2 = ahlVar.aq[i5];
                    if (i != 0) {
                        i3 = ahhVar2.ao;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i3 = ahhVar2.an;
                        if (i3 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i3 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        aic aicVar3 = (aic) arrayList.get(i6);
                        if (aicVar3.c == i3) {
                            aicVar = aicVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (aicVar == null) {
                aicVar = new aic(i);
            }
            arrayList.add(aicVar);
        }
        if (aicVar.d(ahhVar)) {
            if (ahhVar instanceof ahk) {
                ahk ahkVar = (ahk) ahhVar;
                ahkVar.d.c(ahkVar.aq == 0 ? 1 : 0, arrayList, aicVar);
            }
            if (i != 0) {
                ahhVar.ao = aicVar.c;
                ahhVar.K.c(1, arrayList, aicVar);
                ahhVar.N.c(1, arrayList, aicVar);
                ahhVar.M.c(1, arrayList, aicVar);
            } else {
                ahhVar.an = aicVar.c;
                ahhVar.f46J.c(0, arrayList, aicVar);
                ahhVar.L.c(0, arrayList, aicVar);
            }
            ahhVar.Q.c(i, arrayList, aicVar);
        }
        return aicVar;
    }

    public static aic c(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            aic aicVar = (aic) arrayList.get(i2);
            if (i == aicVar.c) {
                return aicVar;
            }
        }
        return null;
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
