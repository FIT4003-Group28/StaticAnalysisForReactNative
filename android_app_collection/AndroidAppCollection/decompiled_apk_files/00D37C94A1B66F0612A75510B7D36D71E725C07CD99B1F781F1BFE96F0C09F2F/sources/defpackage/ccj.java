package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccj  reason: default package */
/* loaded from: classes2.dex */
public final class ccj {
    private static final ccv a = ccv.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static cat a(ccw ccwVar, bwx bwxVar) {
        boolean z = false;
        String str = null;
        bzz bzzVar = null;
        cak cakVar = null;
        bzz bzzVar2 = null;
        bzz bzzVar3 = null;
        bzz bzzVar4 = null;
        bzz bzzVar5 = null;
        bzz bzzVar6 = null;
        int i = 0;
        boolean z2 = false;
        while (ccwVar.p()) {
            switch (ccwVar.c(a)) {
                case 0:
                    str = ccwVar.h();
                    break;
                case 1:
                    int b = ccwVar.b();
                    char c = 2;
                    int[] iArr = {1, 2};
                    for (int i2 = z; i2 < c; i2++) {
                        i = iArr[i2];
                        if (i == 0) {
                            throw null;
                        }
                        if (i == b) {
                            break;
                        } else {
                            c = 2;
                        }
                    }
                    z = false;
                    i = 0;
                    continue;
                case 2:
                    bzzVar = lg.k(ccwVar, bwxVar, z);
                    continue;
                case 3:
                    cakVar = cbr.b(ccwVar, bwxVar);
                    continue;
                case 4:
                    bzzVar2 = lg.k(ccwVar, bwxVar, z);
                    continue;
                case 5:
                    bzzVar4 = lg.j(ccwVar, bwxVar);
                    continue;
                case 6:
                    bzzVar6 = lg.k(ccwVar, bwxVar, z);
                    continue;
                case 7:
                    bzzVar3 = lg.j(ccwVar, bwxVar);
                    continue;
                case 8:
                    bzzVar5 = lg.k(ccwVar, bwxVar, z);
                    continue;
                case 9:
                    z2 = ccwVar.q();
                    continue;
                default:
                    ccwVar.n();
                    ccwVar.o();
                    break;
            }
            z = false;
        }
        return new cat(str, i, bzzVar, cakVar, bzzVar2, bzzVar3, bzzVar4, bzzVar5, bzzVar6, z2);
    }
}
