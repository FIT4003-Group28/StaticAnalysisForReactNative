package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: btpc  reason: default package */
/* loaded from: classes.dex */
public class btpc implements btph {
    public final Context a;
    public final btyh b;
    public final z<NetworkInfo> c = new z<>();
    @dzsi
    public volatile NetworkInfo d;

    public btpc(Context context, btyh btyhVar) {
        this.a = context;
        this.b = btyhVar;
    }

    public static boolean l(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            return activityManager.isLowRamDevice();
        } catch (VerifyError unused) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem <= 1073741824;
        }
    }

    public static final boolean n() {
        try {
            return "wifi-only".equals(Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.carrier"));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final boolean a() {
        return btox.a(this.a);
    }

    public final int b() {
        return btox.b(this.a);
    }

    public final dehn<btoy> d() {
        dehn dehnVar;
        Context context = this.a;
        Intent d = btox.d(context);
        if (d != null) {
            dehnVar = deha.a(d);
        } else {
            final Context applicationContext = context.getApplicationContext();
            IntentFilter intentFilter = btox.a;
            deig d2 = deig.d();
            final btow btowVar = new btow(d2);
            applicationContext.registerReceiver(btowVar, intentFilter);
            d2.Pk(new Runnable(applicationContext, btowVar) { // from class: btov
                private final Context a;
                private final BroadcastReceiver b;

                {
                    this.a = applicationContext;
                    this.b = btowVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.a;
                    BroadcastReceiver broadcastReceiver = this.b;
                    IntentFilter intentFilter2 = btox.a;
                    context2.unregisterReceiver(broadcastReceiver);
                }
            }, dege.a);
            dehnVar = d2;
        }
        return deew.h(dehnVar, btpb.a, dege.a);
    }

    public final boolean e() {
        NetworkInfo networkInfo = this.d;
        return networkInfo != null && networkInfo.getType() == 1 && networkInfo.isConnected();
    }

    public final boolean f() {
        NetworkInfo networkInfo = this.d;
        if (networkInfo == null || networkInfo.getType() != 0 || !networkInfo.isConnected()) {
            return false;
        }
        switch (networkInfo.getSubtype()) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return true;
            case 4:
            case 7:
            case 11:
            case 13:
            default:
                return false;
        }
    }

    public final boolean g() {
        NetworkInfo networkInfo = this.d;
        if (networkInfo == null || networkInfo.getType() != 0 || !networkInfo.isConnected()) {
            return false;
        }
        int subtype = networkInfo.getSubtype();
        return subtype == 13 || subtype == 15;
    }

    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            this.d = null;
            return;
        }
        try {
            this.d = connectivityManager.getActiveNetworkInfo();
            this.c.f(this.d);
        } catch (SecurityException e) {
            bvoo.i(e);
        }
    }

    public final boolean i() {
        NetworkInfo networkInfo;
        if (!this.b.b() && (networkInfo = this.d) != null) {
            return networkInfo.isConnected();
        }
        return false;
    }

    public final boolean j() {
        h();
        return i();
    }

    public final boolean k() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public final boolean m() {
        return ((PowerManager) this.a.getSystemService("power")).isPowerSaveMode();
    }
}
