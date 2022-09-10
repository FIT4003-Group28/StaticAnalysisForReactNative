package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
/* compiled from: PG */
/* renamed from: dbao  reason: default package */
/* loaded from: classes5.dex */
public final class dbao extends ArCoreApk {
    public static final dbao a = new dbao();
    public Exception b;
    boolean c = true;
    public ArCoreApk.Availability d;
    public boolean e;
    private boolean f;
    private int g;
    private long h;
    private dbba i;
    private boolean j;
    private boolean k;
    private int l;

    private final void e(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        if (!c(context)) {
            if (g(context) == -1) {
                if (d(context)) {
                    iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                } else {
                    a(context).c(context, iCheckAvailabilityCallback);
                    return;
                }
            }
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
            return;
        }
        iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_INSTALLED);
    }

    private static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private static int g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            if (packageInfo.services != null) {
                if (packageInfo.services.length != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void h(Context context) {
        if (this.j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                string.getClass();
                this.k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.j = true;
                                return;
                            }
                        }
                        String valueOf = String.valueOf(canonicalName);
                        throw new FatalException(valueOf.length() != 0 ? "Application manifest must contain activity ".concat(valueOf) : new String("Application manifest must contain activity "));
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new FatalException("Could not load application package info", e);
                    }
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FatalException("Could not load application package metadata", e2);
        }
    }

    private static final ArCoreApk.InstallStatus i(Activity activity) {
        PendingIntent b = dbbn.b(activity);
        if (b != null) {
            try {
                activity.startIntentSender(b.getIntentSender(), null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException unused) {
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    public final synchronized dbba a(Context context) {
        if (this.i == null) {
            dbbk dbbkVar = new dbbk();
            dbbkVar.a(context.getApplicationContext());
            this.i = dbbkVar;
        }
        return this.i;
    }

    public final synchronized void b() {
        if (this.b == null) {
            this.g = 0;
        }
        this.f = false;
        dbba dbbaVar = this.i;
        if (dbbaVar != null) {
            dbbaVar.b();
            this.i = null;
        }
    }

    final boolean c(Context context) {
        h(context);
        return g(context) == 0 || g(context) >= this.l;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        if (!f()) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        try {
            if (c(context)) {
                b();
                return dbbn.a(context);
            }
            synchronized (this) {
                ArCoreApk.Availability availability = this.d;
                if ((availability == null || availability.isUnknown()) && !this.e) {
                    this.e = true;
                    e(context, new dban(this));
                }
                ArCoreApk.Availability availability2 = this.d;
                if (availability2 != null) {
                    return availability2;
                }
                if (!this.e) {
                    return ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                return ArCoreApk.Availability.UNKNOWN_CHECKING;
            }
        } catch (FatalException unused) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    public final boolean d(Context context) {
        h(context);
        return this.k;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.UserMessageType userMessageType;
        ArCoreApk.InstallBehavior installBehavior = d(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        if (d(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!f()) {
            throw new UnavailableDeviceNotCompatibleException();
        }
        if (c(activity)) {
            b();
            return i(activity);
        } else if (this.f) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.b;
            if (exc != null) {
                if (!z) {
                    if (exc instanceof UnavailableDeviceNotCompatibleException) {
                        throw ((UnavailableDeviceNotCompatibleException) exc);
                    }
                    if (exc instanceof UnavailableUserDeclinedInstallationException) {
                        throw ((UnavailableUserDeclinedInstallationException) exc);
                    }
                    if (exc instanceof RuntimeException) {
                        throw ((RuntimeException) exc);
                    }
                    throw new RuntimeException("Unexpected exception type", exc);
                }
                this.b = null;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.h > 5000) {
                this.g = 0;
            }
            int i = this.g + 1;
            this.g = i;
            this.h = uptimeMillis;
            if (i > 2) {
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
            try {
                activity.startActivity(new Intent(activity, InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                this.f = true;
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (ActivityNotFoundException e) {
                throw new FatalException("Failed to launch InstallActivity", e);
            }
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailability(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        if (!f()) {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
            return;
        }
        try {
            if (c(context)) {
                b();
                iCheckAvailabilityCallback.onResult(dbbn.a(context));
                return;
            }
            e(context, iCheckAvailabilityCallback);
        } catch (FatalException unused) {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
