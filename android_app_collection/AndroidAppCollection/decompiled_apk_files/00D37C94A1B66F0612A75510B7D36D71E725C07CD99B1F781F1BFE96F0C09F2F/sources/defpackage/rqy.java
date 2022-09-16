package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
/* compiled from: PG */
/* renamed from: rqy  reason: default package */
/* loaded from: classes4.dex */
public final class rqy extends qst implements rrd {
    private static final qso a;
    private static final twx e;
    private static final tzc f;
    private String b;
    private String c;
    private int d;

    static {
        twx twxVar = new twx();
        e = twxVar;
        rqw rqwVar = new rqw();
        f = rqwVar;
        a = new qso("MobileDataPlan.API", rqwVar, twxVar, null, null, null);
    }

    public rqy(Context context, rrc rrcVar) {
        super(context, a, rrcVar, qss.a);
        String packageName = context.getApplicationContext().getPackageName();
        this.b = packageName;
        try {
            if (packageName == null) {
                throw new PackageManager.NameNotFoundException();
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.b, 0);
            this.c = packageInfo.versionName;
            this.d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            this.b = "PACKAGE_NAME_NOT_FOUND";
            this.c = "PACKAGE_VERSION_NOT_FOUND";
            this.d = -1;
        }
    }

    @Override // defpackage.rrd
    public final rve a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        qnm.d(true, "getCarrierPlanId needs a non-null valid API key provided by GTAF team.");
        qnm.m(mdpCarrierPlanIdRequest.a, "getCarrierPlanId needs a valid API key provided by GTAF team.");
        final rqz rqzVar = new rqz(mdpCarrierPlanIdRequest);
        Bundle bundle = mdpCarrierPlanIdRequest.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("client_package_name", this.b);
        bundle.putString("client_version_name", this.c);
        bundle.putLong("client_version_code", this.d);
        rqzVar.a.b = bundle;
        qvx b = qvy.b();
        b.c = 16201;
        b.a = new qvo() { // from class: rqv
            @Override // defpackage.qvo
            public final void a(Object obj, Object obj2) {
                rqz rqzVar2 = rqz.this;
                rqx rqxVar = new rqx((rvh) obj2);
                rrf rrfVar = (rrf) ((rrg) obj).D();
                MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest2 = rqzVar2.a;
                Parcel pv = rrfVar.pv();
                dve.i(pv, rqxVar);
                dve.g(pv, mdpCarrierPlanIdRequest2);
                rrfVar.px(1, pv);
            }
        };
        return v(b.a());
    }
}
