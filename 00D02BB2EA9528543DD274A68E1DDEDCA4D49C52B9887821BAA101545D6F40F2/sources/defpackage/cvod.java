package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvod  reason: default package */
/* loaded from: classes5.dex */
public final class cvod extends cvob<drzu, drzw> {
    private final cvmy b;

    public cvod(cvmy cvmyVar) {
        this.b = cvmyVar;
    }

    @Override // defpackage.cvob
    protected final String a() {
        return "StoreTargetCallback";
    }

    @Override // defpackage.cvob
    public final cvmr<drzu, drzw> b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        int a = dsdj.a(bundle.getInt("com.google.android.libraries.notifications.REGISTRATION_REASON", 0));
        cvmy cvmyVar = this.b;
        try {
            drzu a2 = cvmyVar.j.a(string, a);
            cvty<drzw> a3 = cvmyVar.b.a(string, a2);
            cvmyVar.a(string, a3, 15);
            return cvmr.f(a2, a3);
        } catch (cvml e) {
            cvmp g = cvmr.g();
            g.c = e;
            g.b(true);
            return g.a();
        }
    }

    @Override // defpackage.cvle
    public final String c() {
        return "RPC_STORE_TARGET";
    }
}
