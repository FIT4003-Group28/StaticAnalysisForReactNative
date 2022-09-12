package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dbbk  reason: default package */
/* loaded from: classes5.dex */
public final class dbbk extends dbba {
    public BroadcastReceiver a;
    public Context b;
    public PackageInstaller c;
    public PackageInstaller.SessionCallback d;
    public daic e;
    private Context g;
    private final Queue<Runnable> f = new ArrayDeque();
    private volatile int i = 1;
    private final ServiceConnection h = new dbbb(this);

    public static final void g(Activity activity, dbay dbayVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            dbao dbaoVar = dbao.a;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo != null && next.activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z = true;
                    break;
                }
            }
            dbaoVar.c = !z;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            dbayVar.b(new FatalException("Failed to launch installer.", e));
        }
    }

    public static final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    public static final void i(Activity activity, Bundle bundle, dbay dbayVar) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                dbayVar.b(new FatalException("Installation Intent failed", e));
                return;
            }
        }
        dbayVar.b(new FatalException("Installation intent failed to unparcel."));
    }

    @Override // defpackage.dbba
    public final synchronized void a(Context context) {
        this.g = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.h, 1)) {
            this.i = 2;
            return;
        }
        this.i = 1;
        this.g = null;
        context.unbindService(this.h);
    }

    @Override // defpackage.dbba
    public final synchronized void b() {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                this.g.unbindService(this.h);
                this.g = null;
                this.i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                this.b.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.d;
            if (sessionCallback == null) {
                return;
            }
            this.c.unregisterSessionCallback(sessionCallback);
            this.d = null;
            return;
        }
        throw null;
    }

    @Override // defpackage.dbba
    public final synchronized void c(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        try {
            f(new dbbd(this, context, iCheckAvailabilityCallback));
        } catch (dbbj unused) {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void d(IBinder iBinder) {
        daic daicVar;
        if (iBinder == null) {
            daicVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof daic) {
                daicVar = (daic) queryLocalInterface;
            } else {
                daicVar = new daic(iBinder);
            }
        }
        this.e = daicVar;
        this.i = 3;
        for (Runnable runnable : this.f) {
            runnable.run();
        }
    }

    public final synchronized void e() {
        this.i = 1;
        this.e = null;
    }

    public final synchronized void f(Runnable runnable) {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                throw new dbbj();
            }
            if (i2 == 1) {
                this.f.offer(runnable);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                runnable.run();
                return;
            }
        }
        throw null;
    }
}
