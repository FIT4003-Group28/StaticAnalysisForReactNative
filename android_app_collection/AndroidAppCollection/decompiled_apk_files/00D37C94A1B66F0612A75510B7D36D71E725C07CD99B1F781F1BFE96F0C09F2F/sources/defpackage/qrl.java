package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: qrl  reason: default package */
/* loaded from: classes4.dex */
public final class qrl {
    public static final Executor a = qrj.a;
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int f;
    private static PendingIntent g;
    public Messenger d;
    public CloudMessagingMessengerCompat e;
    private final Context h;
    private final qrf i;
    private final ScheduledExecutorService j;
    public final agd c = new agd();
    private final Messenger k = new Messenger(new qrk(this, Looper.getMainLooper()));

    public qrl(Context context) {
        this.h = context;
        this.i = new qrf(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        String num;
        synchronized (qrl.class) {
            int i = f;
            f = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static synchronized void f(Context context, Intent intent) {
        synchronized (qrl.class) {
            if (g == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                g = rfi.b(context, 0, intent2, rfi.a);
            }
            intent.putExtra("app", g);
        }
    }

    public final rve a(Bundle bundle) {
        final String e = e();
        final rvh rvhVar = new rvh();
        synchronized (this.c) {
            this.c.put(e, rvhVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.i.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.h, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
        sb.append("|ID|");
        sb.append(e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        intent.putExtra("google.messenger", this.k);
        if (this.d != null || this.e != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.d;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.e.b(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.j.schedule(new Runnable() { // from class: qri
                @Override // java.lang.Runnable
                public final void run() {
                    if (rvh.this.c(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            rvhVar.a.m(a, new rut() { // from class: qrh
                @Override // defpackage.rut
                public final void a(rve rveVar) {
                    qrl qrlVar = qrl.this;
                    String str = e;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (qrlVar.c) {
                        qrlVar.c.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return rvhVar.a;
        }
        if (this.i.b() == 2) {
            this.h.sendBroadcast(intent);
        } else {
            this.h.startService(intent);
        }
        final ScheduledFuture schedule2 = this.j.schedule(new Runnable() { // from class: qri
            @Override // java.lang.Runnable
            public final void run() {
                if (rvh.this.c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        rvhVar.a.m(a, new rut() { // from class: qrh
            @Override // defpackage.rut
            public final void a(rve rveVar) {
                qrl qrlVar = qrl.this;
                String str = e;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (qrlVar.c) {
                    qrlVar.c.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return rvhVar.a;
    }

    public final rve b(final Bundle bundle) {
        if (this.i.a() < 12000000) {
            if (this.i.b() == 0) {
                return rwd.b(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return a(bundle).c(a, new rui() { // from class: qrg
                @Override // defpackage.rui
                public final Object a(rve rveVar) {
                    return (rveVar.k() && qrl.d((Bundle) rveVar.g())) ? qrl.this.a(bundle).e(qrl.a, qro.b) : rveVar;
                }
            });
        }
        qre b2 = qre.b(this.h);
        return b2.c(new qrd(b2.a(), bundle)).b(a, rcb.b);
    }

    public final void c(String str, Bundle bundle) {
        synchronized (this.c) {
            rvh rvhVar = (rvh) this.c.remove(str);
            if (rvhVar == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            rvhVar.b(bundle);
        }
    }
}
