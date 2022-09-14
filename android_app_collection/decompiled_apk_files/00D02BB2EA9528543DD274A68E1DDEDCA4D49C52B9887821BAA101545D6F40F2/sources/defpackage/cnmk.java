package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cnmk  reason: default package */
/* loaded from: classes5.dex */
public final class cnmk {
    public static final Executor a = cnmi.a;
    private static int g;
    private static PendingIntent h;
    public final Context c;
    public final cnmc d;
    public Messenger e;
    public CloudMessagingMessengerCompat f;
    private final ScheduledExecutorService i;
    public final aim<String, cpct<Bundle>> b = new aim<>();
    private final Messenger j = new Messenger(new cnmj(this, Looper.getMainLooper()));

    public cnmk(Context context) {
        this.c = context;
        this.d = new cnmc(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.i = scheduledThreadPoolExecutor;
    }

    public static boolean b(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized void d(Context context, Intent intent) {
        synchronized (cnmk.class) {
            if (h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", h);
        }
    }

    private static synchronized String e() {
        String num;
        synchronized (cnmk.class) {
            int i = g;
            g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public final void a(String str, Bundle bundle) {
        synchronized (this.b) {
            cpct<Bundle> remove = this.b.remove(str);
            if (remove != null) {
                remove.a(bundle);
                return;
            }
            if (String.valueOf(str).length() == 0) {
                new String("Missing callback for ");
            }
        }
    }

    public final cpcq<Bundle> c(Bundle bundle) {
        final String e = e();
        final cpct<Bundle> cpctVar = new cpct<>();
        synchronized (this.b) {
            this.b.put(e, cpctVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.d.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        d(this.c, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
        sb.append("|ID|");
        sb.append(e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        intent.putExtra("google.messenger", this.j);
        if (this.e != null || this.f != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.e;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f.a(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.i.schedule(new Runnable(cpctVar) { // from class: cnmf
                private final cpct a;

                {
                    this.a = cpctVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(new IOException("TIMEOUT"));
                }
            }, 30L, TimeUnit.SECONDS);
            cpctVar.a.n(a, new cpcf(this, e, schedule) { // from class: cnmg
                private final cnmk a;
                private final String b;
                private final ScheduledFuture c;

                {
                    this.a = this;
                    this.b = e;
                    this.c = schedule;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    cnmk cnmkVar = this.a;
                    String str = this.b;
                    ScheduledFuture scheduledFuture = this.c;
                    synchronized (cnmkVar.b) {
                        cnmkVar.b.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return cpctVar.a;
        }
        if (this.d.a() == 2) {
            this.c.sendBroadcast(intent);
        } else {
            this.c.startService(intent);
        }
        final ScheduledFuture schedule2 = this.i.schedule(new Runnable(cpctVar) { // from class: cnmf
            private final cpct a;

            {
                this.a = cpctVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        cpctVar.a.n(a, new cpcf(this, e, schedule2) { // from class: cnmg
            private final cnmk a;
            private final String b;
            private final ScheduledFuture c;

            {
                this.a = this;
                this.b = e;
                this.c = schedule2;
            }

            @Override // defpackage.cpcf
            public final void a(cpcq cpcqVar) {
                cnmk cnmkVar = this.a;
                String str = this.b;
                ScheduledFuture scheduledFuture = this.c;
                synchronized (cnmkVar.b) {
                    cnmkVar.b.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return cpctVar.a;
    }
}
