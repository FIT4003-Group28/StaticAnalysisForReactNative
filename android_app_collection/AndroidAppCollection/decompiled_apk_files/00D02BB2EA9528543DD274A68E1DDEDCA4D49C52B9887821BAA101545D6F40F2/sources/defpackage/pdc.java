package defpackage;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pdc  reason: default package */
/* loaded from: classes7.dex */
public final class pdc implements pcx<dlgt> {
    public final auhi a;
    private final Application b;
    private final amfi c;
    private final btvo d;
    private final akfa e;
    private final auhj f;
    private final ahvr g;
    private final Executor h;
    private final aigw i;

    static {
        auiy.JOURNEY_SHARING_ARRIVAL_NOTIFICATION.a();
    }

    public pdc(Application application, amfi amfiVar, btvo btvoVar, akfa akfaVar, auhi auhiVar, auhj auhjVar, ahvr ahvrVar, aigw aigwVar, Executor executor) {
        this.b = application;
        this.d = btvoVar;
        this.c = amfiVar;
        this.e = akfaVar;
        this.a = auhiVar;
        this.f = auhjVar;
        this.g = ahvrVar;
        this.i = aigwVar;
        this.h = executor;
    }

    public static final int e() {
        return dpyv.JOURNEY_SHARING_ARRIVAL_NOTIFICATION_RECEIVED.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return false;
    }

    @Override // defpackage.pcx
    public final dssr<dlgt> b() {
        return (dssr) dlgt.b.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlgt dlgtVar) {
        return e();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlgt dlgtVar) {
        dlgt dlgtVar2 = dlgtVar;
        if (!this.d.getEnableFeatureParameters().z) {
            return;
        }
        btlu n = this.e.n(pauVar.b);
        this.i.a(n);
        pap papVar = pasVar.b;
        if (papVar == null) {
            papVar = pap.d;
        }
        Application application = this.b;
        String str = pauVar.b;
        dqyj dqyjVar = dlgtVar2.a;
        if (dqyjVar == null) {
            dqyjVar = dqyj.f;
        }
        Intent e = pdf.e(application, str, dqyjVar.b, dbpy.a);
        aujb g = this.a.g(dpyv.SHARED_LOCATION_RECEIVED.dm);
        augc a = this.f.a(null, cjrx.a(ddcu.av.a), e(), g);
        a.R = pauVar;
        a.S = n;
        dqyj dqyjVar2 = dlgtVar2.a;
        if (dqyjVar2 == null) {
            dqyjVar2 = dqyj.f;
        }
        a.e = dqyjVar2.b;
        a.f = papVar.b;
        a.g = papVar.c;
        a.w(2131232783);
        a.C(true);
        a.H(-1);
        a.I();
        a.E(e, auhw.ACTIVITY);
        dbsg<String> a2 = paj.a(pauVar, g, this.e);
        if (a2.a()) {
            a.h = a2.b();
        }
        Application application2 = this.b;
        amfi amfiVar = this.c;
        dqyj dqyjVar3 = dlgtVar2.a;
        if (dqyjVar3 == null) {
            dqyjVar3 = dqyj.f;
        }
        final dehn<augj> f = pdf.f(application2, amfiVar, a, dqyjVar3.c);
        f.Pk(new Runnable(this, f) { // from class: pdb
            private final pdc a;
            private final dehn b;

            {
                this.a = this;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.j((augj) deha.s(this.b));
            }
        }, this.h);
        ahvr ahvrVar = this.g;
        String str2 = pauVar.b;
        ahty ahtyVar = (ahty) ahvrVar;
        if (ahtyVar.i.a().f()) {
            return;
        }
        ahwk g2 = Profile.g();
        dqyj dqyjVar4 = dlgtVar2.a;
        if (dqyjVar4 == null) {
            dqyjVar4 = dqyj.f;
        }
        ahuw ahuwVar = (ahuw) g2;
        ahuwVar.a = PersonId.c(dqyjVar4.b);
        dqyj dqyjVar5 = dlgtVar2.a;
        if (dqyjVar5 == null) {
            dqyjVar5 = dqyj.f;
        }
        ahuwVar.b = ahty.b(dqyjVar5.d);
        dqyj dqyjVar6 = dlgtVar2.a;
        if (dqyjVar6 == null) {
            dqyjVar6 = dqyj.f;
        }
        ahuwVar.c = ahty.b(dqyjVar6.e);
        dqyj dqyjVar7 = dlgtVar2.a;
        if (dqyjVar7 == null) {
            dqyjVar7 = dqyj.f;
        }
        ahuwVar.d = ahty.b(dqyjVar7.c);
        ahtyVar.a(str2, g2.a(), new eapd(ahtyVar.h.a().b()), dbpy.a, dbsg.i(true), dbpy.a);
    }
}
