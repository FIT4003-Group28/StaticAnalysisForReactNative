package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pdf  reason: default package */
/* loaded from: classes7.dex */
public final class pdf implements pcx<dlgx> {
    public static final int a = auiy.LOCATION_SHARE.a().intValue();
    public final auhi b;
    private final Application c;
    private final ckcw d;
    private final btvo e;
    private final Executor f;
    private final auhj g;
    private final ahvr h;
    private final akfa i;
    private final amfi j;
    private final aigw k;

    public pdf(Application application, ckcw ckcwVar, btvo btvoVar, akfa akfaVar, auhi auhiVar, auhj auhjVar, ahvr ahvrVar, aigw aigwVar, amfi amfiVar, Executor executor) {
        this.c = application;
        this.d = ckcwVar;
        this.e = btvoVar;
        this.g = auhjVar;
        this.h = ahvrVar;
        this.i = akfaVar;
        this.b = auhiVar;
        this.k = aigwVar;
        this.j = amfiVar;
        this.f = executor;
    }

    public static Intent e(Application application, String str, String str2, dbsg<String> dbsgVar) {
        Intent intent = new Intent();
        String packageName = application.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 36);
        sb.append(packageName);
        sb.append(".");
        sb.append("LocationShareReceivedIntentActivity");
        intent.setComponent(new ComponentName(packageName, sb.toString()));
        intent.setData(new Uri.Builder().appendQueryParameter("sharer", str2).appendQueryParameter("recipient", str).appendQueryParameter("token", dbsgVar.c("")).build());
        return intent;
    }

    public static dehn<augj> f(Application application, amfi amfiVar, augc augcVar, String str) {
        deig d = deig.d();
        if (dbsj.d(str)) {
            d.j(augcVar.a());
        } else {
            amfiVar.d(ckqc.FIFE_MONOGRAM_CIRCLE_CROP.a(str, application.getResources().getDimensionPixelSize(17104901), application.getResources().getDimensionPixelSize(17104902), null), new pde(d, augcVar, application), null);
        }
        return d;
    }

    public static final int g() {
        return dpyv.SHARED_LOCATION_RECEIVED.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return this.e.getEnableFeatureParameters().z && this.b.s(dpyv.SHARED_LOCATION_RECEIVED.dm) && i == a;
    }

    @Override // defpackage.pcx
    public final dssr<dlgx> b() {
        return (dssr) dlgx.f.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlgx dlgxVar) {
        return g();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlgx dlgxVar) {
        dlgx dlgxVar2 = dlgxVar;
        if (!this.e.getEnableFeatureParameters().z) {
            return;
        }
        btlu n = this.i.n(pauVar.b);
        this.k.a(n);
        pap papVar = pasVar.b;
        if (papVar == null) {
            papVar = pap.d;
        }
        Intent e = e(this.c, pauVar.b, dlgxVar2.a, dbsg.i(dlgxVar2.e));
        aujb g = this.b.g(dpyv.SHARED_LOCATION_RECEIVED.dm);
        augc a2 = this.g.a(null, cjrx.a(ddcu.aw.a), g(), g);
        ((ckco) this.d.a(ckgd.j)).a(ckgb.a(2));
        a2.R = pauVar;
        a2.S = n;
        a2.e = dlgxVar2.a;
        a2.f = papVar.b;
        a2.g = papVar.c;
        a2.w(2131232783);
        a2.C(true);
        a2.H(-1);
        a2.I();
        a2.E(e, auhw.ACTIVITY);
        dbsg<String> a3 = paj.a(pauVar, g, this.i);
        if (a3.a()) {
            a2.h = a3.b();
        }
        final dehn<augj> f = f(this.c, this.j, a2, dlgxVar2.b);
        f.Pk(new Runnable(this, f) { // from class: pdd
            private final pdf a;
            private final dehn b;

            {
                this.a = this;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.j((augj) deha.s(this.b));
            }
        }, this.f);
        ahvr ahvrVar = this.h;
        String str = pauVar.b;
        ahty ahtyVar = (ahty) ahvrVar;
        if (ahtyVar.i.a().f()) {
            return;
        }
        ahwk g2 = Profile.g();
        ahuw ahuwVar = (ahuw) g2;
        ahuwVar.a = PersonId.c(dlgxVar2.a);
        ahuwVar.b = ahty.b(dlgxVar2.c);
        ahuwVar.c = ahty.b(dlgxVar2.d);
        ahuwVar.d = ahty.b(dlgxVar2.b);
        Profile a4 = g2.a();
        eapd eapdVar = new eapd(ahtyVar.h.a().b());
        doeo bZ = doep.i.bZ();
        dqyi bZ2 = dqyj.f.bZ();
        String str2 = dlgxVar2.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqyj dqyjVar = (dqyj) bZ2.b;
        str2.getClass();
        int i = dqyjVar.a | 1;
        dqyjVar.a = i;
        dqyjVar.b = str2;
        String str3 = dlgxVar2.b;
        str3.getClass();
        int i2 = i | 4;
        dqyjVar.a = i2;
        dqyjVar.c = str3;
        String str4 = dlgxVar2.c;
        str4.getClass();
        int i3 = i2 | 8;
        dqyjVar.a = i3;
        dqyjVar.d = str4;
        String str5 = dlgxVar2.d;
        str5.getClass();
        dqyjVar.a = i3 | 16;
        dqyjVar.e = str5;
        dqyj bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        doep doepVar = (doep) bZ.b;
        bK.getClass();
        doepVar.c = bK;
        int i4 = doepVar.a | 4;
        doepVar.a = i4;
        doepVar.a = i4 | 32;
        doepVar.e = true;
        aigl aiglVar = new aigl(eapdVar, bZ.bK());
        ahtyVar.a(str, a4, aiglVar.b, dbsg.i(dlgxVar2.e), dbsg.i(true), dbsg.i(aiglVar));
    }
}
