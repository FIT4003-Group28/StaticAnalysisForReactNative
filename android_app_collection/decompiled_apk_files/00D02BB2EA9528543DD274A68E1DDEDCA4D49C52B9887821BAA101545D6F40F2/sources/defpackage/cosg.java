package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.measurement.api.internal.InitializationParams;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cosg  reason: default package */
/* loaded from: classes5.dex */
public final class cosg extends cosl {
    final /* synthetic */ Context a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ cosu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosg(cosu cosuVar, Context context, Bundle bundle) {
        super(cosuVar);
        this.c = cosuVar;
        this.a = context;
        this.b = bundle;
    }

    @Override // defpackage.cosl
    public final void a() {
        int i;
        boolean z;
        cobo coboVar;
        cosb cosbVar;
        try {
            Context context = this.a;
            synchronized (cosu.class) {
                try {
                } catch (Exception unused) {
                    cosu.c = true;
                }
                if (cosu.c == null) {
                    cnwc.l("app_measurement_internal_disable_startup_flags");
                    try {
                        ApplicationInfo a = cnyb.b(context).a(context.getPackageName(), 128);
                        if (a != null && a.metaData != null) {
                            if (a.metaData.getBoolean("app_measurement_internal_disable_startup_flags")) {
                                cosu.c = true;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    cosu.c = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", true));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("allow_remote_dynamite");
                    edit.apply();
                }
            }
            boolean booleanValue = cosu.c.booleanValue();
            cosu cosuVar = this.c;
            Context context2 = this.a;
            cosb cosbVar2 = null;
            try {
                if (!booleanValue) {
                    coboVar = cobp.b;
                } else {
                    coboVar = cobp.d;
                }
                IBinder e = cobp.a(context2, coboVar, "com.google.android.gms.measurement.dynamite").e("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                if (e != null) {
                    IInterface queryLocalInterface = e.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                    if (queryLocalInterface instanceof cosb) {
                        cosbVar = (cosb) queryLocalInterface;
                    } else {
                        cosbVar = new cosb(e);
                    }
                    cosbVar2 = cosbVar;
                }
            } catch (cobl e2) {
                cosuVar.b(e2, true, false);
            }
            cosuVar.f = cosbVar2;
            if (this.c.f == null) {
                return;
            }
            int b = cobp.b(this.a, "com.google.android.gms.measurement.dynamite");
            int d = cobp.d(this.a, "com.google.android.gms.measurement.dynamite");
            if (booleanValue) {
                i = Math.max(b, d);
                z = d < b;
            } else {
                if (b > 0) {
                    d = b;
                }
                i = d;
                z = b > 0;
            }
            this.c.f.e(cobb.b(this.a), new InitializationParams(34020L, i, z, null, null, null, this.b, cosv.a(this.a)), this.f);
        } catch (Exception e3) {
            this.c.b(e3, true, false);
        }
    }
}
