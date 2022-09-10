package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.io.File;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cwxf  reason: default package */
/* loaded from: classes5.dex */
final class cwxf implements cwwr {
    public final Application b;
    public final dehq c;
    public final dxio<cwwz> d;
    public final cqat f;
    public final cwwo g;
    public ScheduledFuture<?> h;
    public final dbty<dbsg<File>> i;
    private final dbty<cwxg> j;
    private WifiManager k;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final IntentFilter e = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public cwxf(cwwp cwwpVar, final Context context, dehq dehqVar, dxio<cwwz> dxioVar, dzsj<cxfg> dzsjVar, cqat cqatVar, final dzsj<cwxg> dzsjVar2) {
        this.g = cwwpVar.a(dehqVar, dxioVar, dzsjVar);
        this.b = (Application) context;
        this.c = dehqVar;
        this.d = dxioVar;
        this.f = cqatVar;
        this.i = dbud.a(new dbty(this, context) { // from class: cwxa
            private final cwxf a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Object i;
                cwxf cwxfVar = this.a;
                Context context2 = this.b;
                synchronized (cwxfVar) {
                    String d = cwuu.d();
                    String concat = String.valueOf(d).concat(".trace");
                    File filesDir = context2.getFilesDir();
                    String valueOf = String.valueOf(d);
                    File file = new File(filesDir, valueOf.length() != 0 ? "primes_profiling_".concat(valueOf) : new String("primes_profiling_"));
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, concat);
                        file2.deleteOnExit();
                        cwxf.d(file2);
                        i = dbsg.i(file2);
                    } else {
                        i = dbpy.a;
                    }
                }
                return i;
            }
        });
        this.j = dbud.a(new dbty(dzsjVar2) { // from class: cwxb
            private final dzsj a;

            {
                this.a = dzsjVar2;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (cwxg) this.a.a();
            }
        });
    }

    public static void d(File file) {
        try {
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (RuntimeException unused) {
        }
    }

    public static final float f(Intent intent) {
        return intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1);
    }

    private final synchronized void h() {
        ScheduledFuture<?> scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
    }

    @Override // defpackage.cwud
    public final void Sz() {
        h();
    }

    public final synchronized void a(boolean z) {
        cwwz a = this.d.a();
        if (a.b() != 3 || !this.g.a() || a.c() <= 0 || a.c() > 3145728 || a.d() <= 0 || a.f() <= 0 || a.g() <= dcyn.a) {
            return;
        }
        if (z) {
            dbsg<File> a2 = this.i.a();
            if (a2.a()) {
                d(a2.b());
            }
        }
        if (this.a.get()) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            cwxg a3 = this.j.a();
            czhz.c();
            cqat cqatVar = a3.a;
            long currentTimeMillis = System.currentTimeMillis();
            Long a4 = a3.a(currentTimeMillis - (currentTimeMillis % 31557600000L));
            if (a4 == null) {
                return;
            }
            long longValue = a4.longValue() - this.f.b();
            if (longValue > 0) {
                this.a.set(true);
                this.h = this.c.d(new cwxe(this, a4.longValue()), longValue, TimeUnit.MILLISECONDS);
                return;
            }
        }
    }

    public final dzza c(Intent intent) {
        dzyz bZ = dzza.f.bZ();
        if (this.k == null) {
            this.k = (WifiManager) this.b.getSystemService("wifi");
        }
        boolean isWifiEnabled = this.k.isWifiEnabled();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzza dzzaVar = (dzza) bZ.b;
        dzzaVar.a |= 4;
        dzzaVar.d = isWifiEnabled;
        boolean z = true;
        if (akm.d(this.b, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z2 = defaultAdapter != null && defaultAdapter.isEnabled();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dzza dzzaVar2 = (dzza) bZ.b;
            dzzaVar2.a |= 8;
            dzzaVar2.e = z2;
        }
        boolean c = cwuu.c(this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzza dzzaVar3 = (dzza) bZ.b;
        dzzaVar3.a |= 1;
        dzzaVar3.b = c;
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dzza dzzaVar4 = (dzza) bZ.b;
        dzzaVar4.a = 2 | dzzaVar4.a;
        dzzaVar4.c = z;
        return bZ.bK();
    }

    @Override // defpackage.cwwr
    public final void g() {
        cwtl.a(deha.e(new Runnable(this) { // from class: cwxc
            private final cwxf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(true);
            }
        }, this.c));
    }
}
