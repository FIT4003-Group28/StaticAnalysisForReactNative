package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: a  reason: collision with root package name */
    private final z4 f7754a;

    public w4(z4 z4Var) {
        com.google.android.gms.common.internal.s.a(z4Var);
        this.f7754a = z4Var;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.s.a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void a(Context context, Intent intent) {
        d5 a2 = d5.a(context, null, null);
        z3 c2 = a2.c();
        if (intent == null) {
            c2.v().a("Receiver called with null intent");
            return;
        }
        a2.w();
        String action = intent.getAction();
        c2.B().a("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
                return;
            }
            c2.v().a("Install Referrer Broadcasts are deprecated");
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c2.B().a("Starting wakeful intent.");
        this.f7754a.a(context, className);
    }
}
