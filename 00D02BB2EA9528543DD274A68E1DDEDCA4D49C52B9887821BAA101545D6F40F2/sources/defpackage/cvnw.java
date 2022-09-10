package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cvnw  reason: default package */
/* loaded from: classes5.dex */
public final class cvnw extends cvob<dryn, dryp> {
    private static final Charset b = Charset.forName("UTF-8");
    private final cvki c;
    private final cvmy d;

    public cvnw(cvmy cvmyVar, cvki cvkiVar) {
        this.d = cvmyVar;
        this.c = cvkiVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "CreateUserSubscriptionCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<dryn, dryp> b(Bundle bundle) {
        cvmr<dryn, dryp> a;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<cvkh> b2 = this.c.b(string, 3);
        TreeSet treeSet = new TreeSet();
        for (cvkh cvkhVar : b2) {
            treeSet.add(new String(cvkhVar.c(), b));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        cvmy cvmyVar = this.d;
        try {
            cvmz cvmzVar = cvmyVar.c;
            dsay a2 = cvmzVar.b.a();
            drym bZ = dryn.e.bZ();
            String a3 = cvmzVar.a.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryn drynVar = (dryn) bZ.b;
            a3.getClass();
            drynVar.a |= 1;
            drynVar.b = a3;
            bZ.a(arrayList);
            drxp bZ2 = drxq.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drxq drxqVar = (drxq) bZ2.b;
            a2.getClass();
            drxqVar.b = a2;
            drxqVar.a |= 1;
            dsau a4 = cvmzVar.c.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drxq drxqVar2 = (drxq) bZ2.b;
            a4.getClass();
            drxqVar2.c = a4;
            drxqVar2.a |= 2;
            drxq bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryn drynVar2 = (dryn) bZ.b;
            bK.getClass();
            drynVar2.b();
            drynVar2.d.add(bK);
            dryn bK2 = bZ.bK();
            cvty<dryp> g = cvmyVar.b.g(string, bK2);
            cvmyVar.a(string, g, 19);
            a = cvmr.f(bK2, g);
        } catch (cvml e) {
            cvmp g2 = cvmr.g();
            g2.c = e;
            g2.b(true);
            a = g2.a();
        }
        if (!a.e() || !a.d()) {
            this.c.c(string, b2);
        }
        return a;
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_CREATE_USER_SUBSCRIPTION";
    }
}
