package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amee  reason: default package */
/* loaded from: classes.dex */
public final class amee {
    public static final amzy a = amzy.l("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final ankw c;
    public final ankx d;
    public final Map e;
    public final vei f;
    private final PowerManager g;
    private final ankx h;
    private boolean i;

    public amee(Context context, PowerManager powerManager, ankw ankwVar, Map map, ankx ankxVar, ankx ankxVar2, vei veiVar) {
        aqxo.i(new amqo() { // from class: amdy
            @Override // defpackage.amqo
            public final Object get() {
                amee ameeVar = amee.this;
                String a2 = veg.a(ameeVar.b);
                String substring = ameeVar.f.a() ? "main_process_service_key" : a2.substring(a2.lastIndexOf(":") + 1);
                substring.getClass();
                aqxo.B(ameeVar.e.containsKey(substring), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", substring);
                return new Intent(ameeVar.b, (Class) ((azqb) ameeVar.e.get(substring)).get());
            }
        });
        this.i = false;
        this.b = context;
        this.g = powerManager;
        this.c = ankwVar;
        this.d = ankxVar;
        this.h = ankxVar2;
        this.e = map;
        this.f = veiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ankt anktVar, String str, Object[] objArr) {
        try {
            anlz.y(anktVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((amzw) ((amzw) ((amzw) a.f()).h(e.getCause())).i("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$logOnFailure$3", 324, "AndroidFutures.java")).w(str, objArr);
        }
    }

    public static void b(final ankt anktVar, final String str, final Object... objArr) {
        anktVar.qY(ammo.f(new Runnable() { // from class: ameb
            @Override // java.lang.Runnable
            public final void run() {
                amee.a(ankt.this, str, objArr);
            }
        }), anjk.a);
    }

    public final void c(ankt anktVar) {
        amlv a2 = amna.a();
        String g = a2 == null ? "<no trace>" : amna.g(a2);
        if (anktVar.isDone()) {
            return;
        }
        try {
            final PowerManager.WakeLock newWakeLock = this.g.newWakeLock(1, g);
            newWakeLock.acquire();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ankt r = anlz.r(anktVar);
            anlz.A(anlz.x(r, 45L, timeUnit, this.d), ammo.e(new amed(r, g)), anjk.a);
            ankt x = anlz.x(anlz.r(anktVar), 3600L, TimeUnit.SECONDS, this.h);
            newWakeLock.getClass();
            x.qY(new Runnable() { // from class: amdz
                @Override // java.lang.Runnable
                public final void run() {
                    newWakeLock.release();
                }
            }, anjk.a);
        } catch (SecurityException e) {
            if (this.i) {
                return;
            }
            try {
                PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str)) {
                            this.i = true;
                            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", (char) 154, "AndroidFutures.java")).q("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            throw e;
        }
    }
}
