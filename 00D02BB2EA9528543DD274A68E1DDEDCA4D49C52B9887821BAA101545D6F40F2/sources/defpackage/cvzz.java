package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.view.View;
/* renamed from: cvzz  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cvzz implements View.OnClickListener {
    private final CrossProfileApps a;
    private final UserHandle b;
    private final cvze c;
    private final Context d;

    public cvzz(CrossProfileApps crossProfileApps, UserHandle userHandle, cvze cvzeVar, Context context) {
        this.a = crossProfileApps;
        this.b = userHandle;
        this.c = cvzeVar;
        this.d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CrossProfileApps crossProfileApps = this.a;
        UserHandle userHandle = this.b;
        cvze cvzeVar = this.c;
        Context context = this.d;
        Context applicationContext = view.getContext().getApplicationContext();
        if (!crossProfileApps.getTargetUserProfiles().contains(userHandle)) {
            cvzeVar.l().b.a().a(applicationContext.getPackageName());
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            if (String.valueOf(packageName).length() != 0) {
                return;
            }
            new String("getLaunchIntentForPackage return null for package ");
            return;
        }
        ComponentName component = launchIntentForPackage.getComponent();
        if (component == null) {
            if (String.valueOf(packageName).length() != 0) {
                return;
            }
            new String("Launch component was null for package ");
            return;
        }
        try {
            try {
                crossProfileApps.startMainActivity(component, userHandle);
            } catch (SecurityException e) {
                throw e;
            }
        } finally {
            cvzeVar.l().b("OK", launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER"), launchIntentForPackage.hasCategory("android.intent.category.INFO"), crossProfileApps.getTargetUserProfiles().contains(userHandle), Build.VERSION.SDK_INT, applicationContext.getPackageName());
        }
    }
}
