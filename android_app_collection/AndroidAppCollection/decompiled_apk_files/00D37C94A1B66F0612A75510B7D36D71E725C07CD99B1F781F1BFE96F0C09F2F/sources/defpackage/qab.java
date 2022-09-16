package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: qab  reason: default package */
/* loaded from: classes4.dex */
public final class qab {
    qrm a;
    boolean b;
    final Object c;
    pzz d;
    final long e;
    qac f;
    private final Context g;

    public qab(Context context) {
        this(context, 30000L, false);
    }

    public static qaa a(Context context) {
        qab qabVar = new qab(context, -1L, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qabVar.d(false);
            qaa e = qabVar.e();
            f(e, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e;
        } finally {
        }
    }

    static final void f(qaa qaaVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (qaaVar != null) {
                if (true != qaaVar.b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = qaaVar.a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new pzy(hashMap).start();
        }
    }

    private final void g() {
        synchronized (this.c) {
            pzz pzzVar = this.d;
            if (pzzVar != null) {
                pzzVar.a.countDown();
                try {
                    this.d.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.e;
            if (j > 0) {
                this.d = new pzz(this, j);
            }
        }
    }

    public final void b() {
        qnm.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.g == null || this.a == null) {
                return;
            }
            try {
                if (this.b) {
                    qyf.a().b(this.g, this.a);
                }
            } catch (Throwable unused) {
            }
            this.b = false;
            this.f = null;
            this.a = null;
        }
    }

    public final void c() {
        d(true);
    }

    protected final void d(boolean z) {
        qnm.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.b) {
                b();
            }
            Context context = this.g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h = qrr.d.h(context, 12451000);
                if (h != 0 && h != 2) {
                    throw new IOException("Google Play services not available");
                }
                qrm qrmVar = new qrm();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (!qyf.a().c(context, intent, qrmVar, 1)) {
                    throw new IOException("Connection failure");
                }
                this.a = qrmVar;
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    qnm.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                    if (qrmVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    qrmVar.a = true;
                    IBinder iBinder = (IBinder) qrmVar.b.poll(10000L, timeUnit);
                    if (iBinder == null) {
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f = queryLocalInterface instanceof qac ? (qac) queryLocalInterface : new qac(iBinder);
                    this.b = true;
                    if (z) {
                        g();
                    }
                } catch (InterruptedException unused) {
                    throw new IOException("Interrupted exception");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new qsc(9);
            }
        }
    }

    public final qaa e() {
        qaa qaaVar;
        qnm.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.b) {
                synchronized (this.c) {
                    pzz pzzVar = this.d;
                    if (pzzVar == null || !pzzVar.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.b) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            qnm.b(this.a);
            qnm.b(this.f);
            try {
                qac qacVar = this.f;
                Parcel pw = qacVar.pw(1, qacVar.pv());
                String readString = pw.readString();
                pw.recycle();
                qac qacVar2 = this.f;
                Parcel pv = qacVar2.pv();
                dve.e(pv, true);
                Parcel pw2 = qacVar2.pw(2, pv);
                boolean j = dve.j(pw2);
                pw2.recycle();
                qaaVar = new qaa(readString, j);
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        g();
        return qaaVar;
    }

    protected final void finalize() {
        b();
        super.finalize();
    }

    public qab(Context context, long j, boolean z) {
        Context applicationContext;
        this.c = new Object();
        qnm.b(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.g = context;
        this.b = false;
        this.e = j;
    }
}
