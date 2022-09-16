package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: pdk  reason: default package */
/* loaded from: classes7.dex */
public final class pdk implements pcx<dlip> {
    public static final int a = auiy.LOCATION_SHARING_REQUEST.a().intValue();
    public final auhi b;
    private final Application c;
    private final amfi d;
    private final ckcw e;
    private final btvo f;
    private final akfa g;
    private final auhj h;
    private final ahvr i;
    private final aigw j;

    public pdk(Application application, ckcw ckcwVar, btvo btvoVar, auhi auhiVar, auhj auhjVar, akfa akfaVar, ahvr ahvrVar, aigw aigwVar, amfi amfiVar) {
        this.c = application;
        this.e = ckcwVar;
        this.f = btvoVar;
        this.h = auhjVar;
        this.i = ahvrVar;
        this.g = akfaVar;
        this.b = auhiVar;
        this.j = aigwVar;
        this.d = amfiVar;
    }

    public static final int e() {
        return dpyv.SHARED_LOCATION_REQUEST.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return this.f.getLocationSharingParameters().v && this.b.s(dpyv.SHARED_LOCATION_REQUEST.dm) && i == a;
    }

    @Override // defpackage.pcx
    public final dssr<dlip> b() {
        return (dssr) dlip.f.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlip dlipVar) {
        return e();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlip dlipVar) {
        dlip dlipVar2 = dlipVar;
        if (!this.f.getLocationSharingParameters().v) {
            return;
        }
        String str = pauVar.b;
        btlu n = this.g.n(str);
        this.j.a(n);
        pap papVar = pasVar.b;
        if (papVar == null) {
            papVar = pap.d;
        }
        String packageName = this.c.getPackageName();
        Intent intent = new Intent();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 30);
        sb.append(packageName);
        sb.append(".");
        sb.append("RequestLocationIntentActivity");
        Intent data = intent.setComponent(new ComponentName(packageName, sb.toString())).setData(new Uri.Builder().appendQueryParameter("sender", dlipVar2.a).appendQueryParameter("recipient", str).build());
        aujb g = this.b.g(dpyv.SHARED_LOCATION_REQUEST.dm);
        augc a2 = this.h.a(null, cjrx.a(ddcu.Jq.a), e(), g);
        ((ckco) this.e.a(ckgd.j)).a(ckgb.a(3));
        a2.R = pauVar;
        a2.S = n;
        a2.e = dlipVar2.a;
        a2.f = papVar.b;
        a2.g = papVar.c;
        a2.w(2131232783);
        a2.C(true);
        a2.H(-1);
        a2.I();
        a2.E(data, auhw.ACTIVITY);
        dbsg<String> a3 = paj.a(pauVar, g, this.g);
        if (a3.a()) {
            a2.h = a3.b();
        }
        String str2 = dlipVar2.b;
        if (dbsj.d(str2)) {
            this.b.j(a2.a());
        } else {
            this.d.d(ckqc.FIFE_MONOGRAM_CIRCLE_CROP.a(str2, this.c.getResources().getDimensionPixelSize(17104901), this.c.getResources().getDimensionPixelSize(17104902), null), new pdj(this, a2), null);
        }
        ahvr ahvrVar = this.i;
        String str3 = pauVar.b;
        ahty ahtyVar = (ahty) ahvrVar;
        if (ahtyVar.i.a().f()) {
            return;
        }
        ahwk g2 = Profile.g();
        ahuw ahuwVar = (ahuw) g2;
        ahuwVar.a = PersonId.c(dlipVar2.a);
        ahuwVar.b = ahty.b(dlipVar2.c);
        ahuwVar.c = ahty.b(dlipVar2.d);
        ahuwVar.d = ahty.b(dlipVar2.b);
        ahuwVar.e = ahty.b(dlipVar2.e);
        ahtyVar.a(str3, g2.a(), new eapd(ahtyVar.h.a().b()), dbpy.a, dbpy.a, dbpy.a);
    }
}
