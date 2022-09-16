package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cvnx  reason: default package */
/* loaded from: classes5.dex */
public final class cvnx extends cvob<dryr, dryt> {
    private static final Charset b = Charset.forName("UTF-8");
    private final cvki c;
    private final cvmy d;

    public cvnx(cvmy cvmyVar, cvki cvkiVar) {
        this.d = cvmyVar;
        this.c = cvkiVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "DeleteUserSubscriptionCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<dryr, dryt> b(Bundle bundle) {
        cvmr<dryr, dryt> a;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<cvkh> b2 = this.c.b(string, 4);
        TreeSet treeSet = new TreeSet();
        for (cvkh cvkhVar : b2) {
            treeSet.add(new String(cvkhVar.c(), b));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        cvmy cvmyVar = this.d;
        try {
            cvna cvnaVar = cvmyVar.d;
            dryq bZ = dryr.e.bZ();
            String a2 = cvnaVar.a.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dryr dryrVar = (dryr) bZ.b;
            a2.getClass();
            dryrVar.a |= 1;
            dryrVar.b = a2;
            bZ.a(arrayList);
            bZ.b(cvnaVar.b.a());
            dryr bK = bZ.bK();
            cvty<dryt> h = cvmyVar.b.h(string, bK);
            cvmyVar.a(string, h, 20);
            a = cvmr.f(bK, h);
        } catch (cvml e) {
            cvmp g = cvmr.g();
            g.c = e;
            g.b(true);
            a = g.a();
        }
        if (!a.e() || !a.d()) {
            this.c.c(string, b2);
        }
        return a;
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }
}
