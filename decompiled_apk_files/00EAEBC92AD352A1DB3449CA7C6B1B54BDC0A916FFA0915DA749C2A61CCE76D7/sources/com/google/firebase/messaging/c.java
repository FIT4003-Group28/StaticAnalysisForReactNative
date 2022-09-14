package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.g;
import com.google.firebase.messaging.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f9449a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9450b;

    /* renamed from: c  reason: collision with root package name */
    private final r f9451c;

    public c(Context context, r rVar, Executor executor) {
        this.f9449a = executor;
        this.f9450b = context;
        this.f9451c = rVar;
    }

    private void a(g.e eVar, p pVar) {
        if (pVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) c.e.a.b.g.k.a(pVar.b(), 5L, TimeUnit.SECONDS);
            eVar.a(bitmap);
            g.b bVar = new g.b();
            bVar.b(bitmap);
            bVar.a((Bitmap) null);
            eVar.a(bVar);
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            pVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            String valueOf = String.valueOf(e2.getCause());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Failed to download image: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            pVar.close();
        }
    }

    private void a(a.C0190a c0190a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f9450b.getSystemService("notification")).notify(c0190a.f9429b, c0190a.f9430c, c0190a.f9428a.a());
    }

    private boolean b() {
        if (((KeyguardManager) this.f9450b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.l.g()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f9450b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private p c() {
        p b2 = p.b(this.f9451c.g("gcm.n.image"));
        if (b2 != null) {
            b2.a(this.f9449a);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f9451c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        p c2 = c();
        a.C0190a b2 = a.b(this.f9450b, this.f9451c);
        a(b2.f9428a, c2);
        a(b2);
        return true;
    }
}
