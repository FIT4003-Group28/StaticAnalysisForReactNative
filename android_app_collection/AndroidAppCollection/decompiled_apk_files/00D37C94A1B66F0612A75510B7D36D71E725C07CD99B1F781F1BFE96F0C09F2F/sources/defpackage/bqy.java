package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bqy  reason: default package */
/* loaded from: classes2.dex */
public final class bqy implements bqv, btk {
    public static final String a = bqf.b("Processor");
    public final Context c;
    private final bps h;
    private final WorkDatabase i;
    private final List j;
    private final bwn l;
    public final Map e = new HashMap();
    public final Map d = new HashMap();
    public final Set f = new HashSet();
    private final List k = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object g = new Object();

    public bqy(Context context, bps bpsVar, bwn bwnVar, WorkDatabase workDatabase, List list) {
        this.c = context;
        this.h = bpsVar;
        this.l = bwnVar;
        this.i = workDatabase;
        this.j = list;
    }

    public static boolean e(String str, bru bruVar) {
        boolean z;
        if (bruVar != null) {
            bruVar.f = true;
            bruVar.c();
            ankt anktVar = bruVar.e;
            if (anktVar != null) {
                z = anktVar.isDone();
                bruVar.e.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = bruVar.d;
            if (listenableWorker == null || z) {
                String.format("WorkSpec %s is already done. Not interrupting.", bruVar.c);
                bqf.a().d(new Throwable[0]);
            } else {
                listenableWorker.g();
            }
            bqf a2 = bqf.a();
            String.format("WorkerWrapper interrupted for %s", str);
            a2.d(new Throwable[0]);
            return true;
        }
        bqf a3 = bqf.a();
        String.format("WorkerWrapper could not be found for %s", str);
        a3.d(new Throwable[0]);
        return false;
    }

    @Override // defpackage.bqv
    public final void a(String str, boolean z) {
        synchronized (this.g) {
            this.e.remove(str);
            bqf a2 = bqf.a();
            String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z));
            a2.d(new Throwable[0]);
            for (bqv bqvVar : this.k) {
                bqvVar.a(str, z);
            }
        }
    }

    public final void b(bqv bqvVar) {
        synchronized (this.g) {
            this.k.add(bqvVar);
        }
    }

    public final void c(bqv bqvVar) {
        synchronized (this.g) {
            this.k.remove(bqvVar);
        }
    }

    public final void d() {
        synchronized (this.g) {
            if (this.d.isEmpty()) {
                this.c.startService(btn.d(this.c));
                PowerManager.WakeLock wakeLock = this.b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.b = null;
                }
            }
        }
    }

    public final boolean f(String str) {
        boolean z;
        synchronized (this.g) {
            z = true;
            if (!this.e.containsKey(str) && !this.d.containsKey(str)) {
                z = false;
            }
        }
        return z;
    }

    public final boolean g(String str) {
        synchronized (this.g) {
            if (f(str)) {
                bqf a2 = bqf.a();
                String.format("Work %s is already enqueued for processing", str);
                a2.d(new Throwable[0]);
                return false;
            }
            brt brtVar = new brt(this.c, this.h, this.l, this, this.i, str);
            brtVar.f = this.j;
            bru bruVar = new bru(brtVar);
            bwk bwkVar = bruVar.h;
            bwkVar.qY(new bqx(this, str, bwkVar), this.l.c);
            this.e.put(str, bruVar);
            this.l.a.execute(bruVar);
            bqf a3 = bqf.a();
            String.format("%s: processing %s", getClass().getSimpleName(), str);
            a3.d(new Throwable[0]);
            return true;
        }
    }
}
