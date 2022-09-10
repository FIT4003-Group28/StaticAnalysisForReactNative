package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apya  reason: default package */
/* loaded from: classes2.dex */
public final class apya implements crzp<dcdn<String, apzn>> {
    private final Application a;
    private final dxio<aprv> b;
    private final dxio<auhi> c;
    private final dxio<auhj> d;
    private final dxio<aqwq> e;
    private final btlu f;

    public apya(Application application, dxio<aprv> dxioVar, dxio<auhi> dxioVar2, dxio<auhj> dxioVar3, dxio<aqwq> dxioVar4, btlu btluVar) {
        this.a = application;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
        this.f = btluVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dcdn<String, apzn>> crzmVar) {
        boolean o;
        apsi<dbsg<apsg>> l;
        dcdn<String, apzn> l2 = crzmVar.l();
        if (l2 == null) {
            return;
        }
        dcpd<String> it = l2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            aqwq a = this.e.a();
            btlu btluVar = this.f;
            synchronized (a.e) {
                o = a.d.o(aqwq.h(next), btluVar, false);
            }
            if (!o && !this.e.a().d(this.f, next) && (l = this.b.a().e(next, this.f).l()) != null && l.a().a()) {
                String string = this.a.getString(R.string.MERCHANT_MESSAGING_FEATURE_NOTIFICATION_BODY_TEXT, new Object[]{l.a().b().b()});
                Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("https").authority("business.google.com").path("/messages/l").appendPath(next).build());
                auhj a2 = this.d.a();
                ddxw bZ = ddxx.j.bZ();
                int i = ddcu.m.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddxx ddxxVar = (ddxx) bZ.b;
                ddxxVar.a |= 8;
                ddxxVar.d = i;
                augc a3 = a2.a(null, cjrx.b(bZ.bK()), dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm, this.c.a().h(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm));
                a3.C(true);
                a3.D(ibm.w().b(this.a));
                a3.E(intent, auhw.ACTIVITY);
                a3.g = string;
                a3.f = this.a.getString(R.string.MERCHANT_MESSAGING_FEATURE_PROMO_BANNER_TEXT);
                a3.U = 2;
                ia iaVar = new ia();
                iaVar.e(string);
                a3.s = iaVar;
                a3.s(true);
                a3.v = 2;
                if (this.c.a().j(a3.a()).b == auhh.SHOWN) {
                    aqwq a4 = this.e.a();
                    btlu btluVar2 = this.f;
                    synchronized (a4.e) {
                        a4.d.T(aqwq.h(next), btluVar2, true);
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
