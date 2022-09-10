package com.google.android.apps.gmm.base.app;

import android.app.Application;
import android.content.SharedPreferences;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleMapsApplication extends ejd {
    @Override // defpackage.ejl
    protected final ejk l(cjwt cjwtVar, bvjj bvjjVar) {
        fyv fyvVar = new fyv();
        fyvVar.a = new fyz(this);
        fyvVar.b = this;
        SharedPreferences sharedPreferences = bvjjVar.d;
        fyvVar.c = bvrv.a;
        dxjg.b(bvjjVar);
        fyvVar.d = bvjjVar;
        dxjg.a(fyvVar.a, fza.class);
        dxjg.a(fyvVar.b, Application.class);
        dxjg.a(fyvVar.c, bvrv.class);
        dxjg.a(fyvVar.d, bvjj.class);
        fyx fyxVar = new fyx(fyvVar.a, fyvVar.b, fyvVar.c, fyvVar.d);
        dzsj dzsjVar = fyxVar.a;
        if (dzsjVar == null) {
            dzsjVar = new fyw(fyxVar);
            fyxVar.a = dzsjVar;
        }
        dcdn k = dcdn.k(iqz.class, dzsjVar);
        iqz e = fyxVar.e();
        ejt ejtVar = new ejt();
        dxjg.b(e);
        ejtVar.b = e;
        ejtVar.a = fyxVar;
        ejtVar.c = cjwtVar;
        dxjg.a(ejtVar.a, eiy.class);
        dxjg.a(ejtVar.b, iqz.class);
        dxjg.a(ejtVar.c, cjwt.class);
        return new ejk(new fyu(ejtVar.a, ejtVar.b, ejtVar.c), k);
    }
}
