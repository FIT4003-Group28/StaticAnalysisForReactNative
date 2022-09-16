package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cco  reason: default package */
/* loaded from: classes2.dex */
public final class cco {
    private static final ccv a = ccv.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cay a(ccw ccwVar, bwx bwxVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(a);
            if (c == 0) {
                str = ccwVar.h();
            } else if (c == 1) {
                z = ccwVar.q();
            } else if (c == 2) {
                ccwVar.i();
                while (ccwVar.p()) {
                    can a2 = cbv.a(ccwVar, bwxVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                ccwVar.k();
            } else {
                ccwVar.o();
            }
        }
        return new cay(str, arrayList, z);
    }
}
