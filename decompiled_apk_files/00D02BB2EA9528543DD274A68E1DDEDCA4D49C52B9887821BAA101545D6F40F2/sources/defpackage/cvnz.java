package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvnz  reason: default package */
/* loaded from: classes5.dex */
public final class cvnz extends cvob<drze, drzg> {
    private final cvkk b;
    private final cvmy c;

    public cvnz(cvmy cvmyVar, cvkk cvkkVar) {
        this.c = cvmyVar;
        this.b = cvkkVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "FetchUpdatedThreadsCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<drze, drzg> b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        int a = dscn.a(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", 0));
        List<cvkj> f = this.b.f(string, j);
        cvmy cvmyVar = this.c;
        List<dsbc> u = cvkj.u(f);
        try {
            cvnd cvndVar = cvmyVar.g;
            drzc bZ = drze.i.bZ();
            String a2 = cvndVar.a.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drze drzeVar = (drze) bZ.b;
            a2.getClass();
            drzeVar.a |= 1;
            drzeVar.b = a2;
            dsba b = cvndVar.c.b(string);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drze drzeVar2 = (drze) bZ.b;
            b.getClass();
            drzeVar2.c = b;
            drzeVar2.a |= 2;
            dsau a3 = cvndVar.b.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drze drzeVar3 = (drze) bZ.b;
            a3.getClass();
            drzeVar3.f = a3;
            int i = drzeVar3.a | 32;
            drzeVar3.a = i;
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            }
            drzeVar3.g = i2;
            drzeVar3.a = i | 64;
            drze drzeVar4 = (drze) bZ.b;
            drzeVar4.e = 1;
            int i3 = drzeVar4.a | 16;
            drzeVar4.a = i3;
            drzeVar4.a = i3 | 4;
            drzeVar4.d = j;
            drze drzeVar5 = (drze) bZ.b;
            dsrj<dsbc> dsrjVar = drzeVar5.h;
            if (!dsrjVar.a()) {
                drzeVar5.h = dsqw.cl(dsrjVar);
            }
            dsod.bv(u, drzeVar5.h);
            drze bK = bZ.bK();
            cvty<drzg> d = cvmyVar.b.d(string, bK);
            cvmyVar.a(string, d, 14);
            return cvmr.f(bK, d);
        } catch (cvml e) {
            cvmp g = cvmr.g();
            g.c = e;
            g.b(true);
            return g.a();
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_FETCH_UPDATED_THREADS";
    }
}
