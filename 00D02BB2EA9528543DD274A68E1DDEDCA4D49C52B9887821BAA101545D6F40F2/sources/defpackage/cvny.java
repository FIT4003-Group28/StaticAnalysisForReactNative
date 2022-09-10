package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvny  reason: default package */
/* loaded from: classes5.dex */
public final class cvny extends cvob<dryv, dryx> {
    private final cvmy b;

    public cvny(cvmy cvmyVar) {
        this.b = cvmyVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "FetchLatestThreadsCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<dryv, dryx> b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        int a = dscn.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", 0));
        cvmy cvmyVar = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            cvnb cvnbVar = cvmyVar.e;
            dryu bZ = dryv.g.bZ();
            String a2 = cvnbVar.a.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryv dryvVar = (dryv) bZ.b;
            a2.getClass();
            dryvVar.a |= 1;
            dryvVar.b = a2;
            dsba b = cvnbVar.c.b(string);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryv dryvVar2 = (dryv) bZ.b;
            b.getClass();
            dryvVar2.c = b;
            int i = dryvVar2.a | 2;
            dryvVar2.a = i;
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            }
            dryvVar2.f = i2;
            dryvVar2.a = i | 32;
            dsau a3 = cvnbVar.b.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryv dryvVar3 = (dryv) bZ.b;
            a3.getClass();
            dryvVar3.e = a3;
            dryvVar3.a |= 16;
            if (valueOf.longValue() > 0) {
                long longValue = valueOf.longValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dryv dryvVar4 = (dryv) bZ.b;
                dryvVar4.a |= 4;
                dryvVar4.d = longValue;
            }
            dryv bK = bZ.bK();
            cvty<dryx> c = cvmyVar.b.c(string, bK);
            cvmyVar.a(string, c, 13);
            return cvmr.f(bK, c);
        } catch (cvml e) {
            cvmp g = cvmr.g();
            g.c = e;
            g.b(true);
            return g.a();
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_FETCH_LATEST_THREADS";
    }
}
