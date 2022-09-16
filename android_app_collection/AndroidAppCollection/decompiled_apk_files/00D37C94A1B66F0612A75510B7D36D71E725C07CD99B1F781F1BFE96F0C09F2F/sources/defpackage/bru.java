package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bru  reason: default package */
/* loaded from: classes2.dex */
public final class bru implements Runnable {
    static final String a = bqf.b("WorkerWrapper");
    public static final /* synthetic */ int j = 0;
    final Context b;
    bum c;
    public volatile boolean f;
    final bwn g;
    private final String k;
    private final List l;
    private final bps m;
    private final btk n;
    private final WorkDatabase o;
    private final bun p;
    private List q;
    private String r;
    private final btt s;
    private final bva t;
    adz i = adz.g();
    final bwk h = bwk.h();
    ankt e = null;
    ListenableWorker d = null;

    public bru(brt brtVar) {
        this.b = brtVar.a;
        this.g = brtVar.g;
        this.n = brtVar.b;
        this.k = brtVar.e;
        this.l = brtVar.f;
        this.m = brtVar.c;
        WorkDatabase workDatabase = brtVar.d;
        this.o = workDatabase;
        this.p = workDatabase.n();
        this.s = workDatabase.p();
        this.t = workDatabase.u();
    }

    private final void d() {
        this.o.f();
        try {
            this.p.k(1, this.k);
            this.p.g(this.k, System.currentTimeMillis());
            this.p.j(this.k, -1L);
            this.o.h();
        } finally {
            this.o.g();
            f(true);
        }
    }

    private final void e() {
        this.o.f();
        try {
            this.p.g(this.k, System.currentTimeMillis());
            this.p.k(1, this.k);
            bun bunVar = this.p;
            String str = this.k;
            ((bux) bunVar).a.e();
            bmb d = ((bux) bunVar).d.d();
            if (str == null) {
                d.e(1);
            } else {
                d.f(1, str);
            }
            ((bux) bunVar).a.f();
            d.a();
            ((bux) bunVar).a.h();
            ((bux) bunVar).a.g();
            ((bux) bunVar).d.e(d);
            this.p.j(this.k, -1L);
            this.o.h();
        } finally {
            this.o.g();
            f(false);
        }
    }

    private final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.o.f();
        try {
            bun n = this.o.n();
            bku a2 = bku.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            ((bux) n).a.e();
            Cursor f = ld.f(((bux) n).a, a2, false);
            boolean z2 = f.moveToFirst() && f.getInt(0) != 0;
            f.close();
            a2.i();
            if (!z2) {
                bvi.a(this.b, RescheduleReceiver.class, false);
            }
            if (z) {
                this.p.k(1, this.k);
                this.p.j(this.k, -1L);
            }
            if (this.c != null && (listenableWorker = this.d) != null && listenableWorker.h()) {
                btk btkVar = this.n;
                String str = this.k;
                synchronized (((bqy) btkVar).g) {
                    ((bqy) btkVar).d.remove(str);
                    ((bqy) btkVar).d();
                }
            }
            this.o.h();
            this.o.g();
            this.h.e(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.o.g();
            throw th;
        }
    }

    private final void g() {
        int h = this.p.h(this.k);
        if (h == 2) {
            bqf a2 = bqf.a();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.k);
            a2.d(new Throwable[0]);
            f(true);
            return;
        }
        bqf a3 = bqf.a();
        String.format("Status for %s is %s; not doing any work", this.k, adz.d(h));
        a3.d(new Throwable[0]);
        f(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!c()) {
            this.o.f();
            try {
                int h = this.p.h(this.k);
                bui t = this.o.t();
                String str = this.k;
                t.a.e();
                bmb d = t.b.d();
                if (str == null) {
                    d.e(1);
                } else {
                    d.f(1, str);
                }
                t.a.f();
                d.a();
                t.a.h();
                t.a.g();
                t.b.e(d);
                if (h == 0) {
                    f(false);
                } else if (h == 2) {
                    adz adzVar = this.i;
                    if (adzVar instanceof bqe) {
                        bqf.a();
                        String.format("Worker result SUCCESS for %s", this.r);
                        bqf.f(new Throwable[0]);
                        if (!this.c.e()) {
                            this.o.f();
                            this.p.k(3, this.k);
                            this.p.f(this.k, ((bqe) this.i).a);
                            long currentTimeMillis = System.currentTimeMillis();
                            for (String str2 : this.s.a(this.k)) {
                                if (this.p.h(str2) == 5) {
                                    btt bttVar = this.s;
                                    bku a2 = bku.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                    if (str2 == null) {
                                        a2.e(1);
                                    } else {
                                        a2.f(1, str2);
                                    }
                                    bttVar.a.e();
                                    Cursor f = ld.f(bttVar.a, a2, false);
                                    boolean z = f.moveToFirst() && f.getInt(0) != 0;
                                    f.close();
                                    a2.i();
                                    if (z) {
                                        bqf.a();
                                        String.format("Setting status to enqueued for %s", str2);
                                        bqf.f(new Throwable[0]);
                                        this.p.k(1, str2);
                                        this.p.g(str2, currentTimeMillis);
                                    }
                                }
                            }
                            this.o.h();
                            this.o.g();
                            f(false);
                        } else {
                            e();
                        }
                    } else if (!(adzVar instanceof bqd)) {
                        bqf.a();
                        String.format("Worker result FAILURE for %s", this.r);
                        bqf.f(new Throwable[0]);
                        if (this.c.e()) {
                            e();
                        } else {
                            b();
                        }
                    } else {
                        bqf.a();
                        String.format("Worker result RETRY for %s", this.r);
                        bqf.f(new Throwable[0]);
                        d();
                    }
                } else if (!adz.e(h)) {
                    d();
                }
                this.o.h();
            } finally {
                this.o.g();
            }
        }
        List<bqz> list = this.l;
        if (list != null) {
            for (bqz bqzVar : list) {
                bqzVar.b(this.k);
            }
            bra.b(this.o, this.l);
        }
    }

    final void b() {
        this.o.f();
        try {
            String str = this.k;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.p.h(str2) != 6) {
                    this.p.k(4, str2);
                }
                linkedList.addAll(this.s.a(str2));
            }
            this.p.f(this.k, ((bqc) this.i).a);
            this.o.h();
        } finally {
            this.o.g();
            f(false);
        }
    }

    public final boolean c() {
        if (this.f) {
            bqf a2 = bqf.a();
            String.format("Work interrupted for %s", this.r);
            a2.d(new Throwable[0]);
            int h = this.p.h(this.k);
            if (h == 0) {
                f(false);
            } else {
                f(!adz.e(h));
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bpx a2;
        List<String> a3 = this.t.a(this.k);
        this.q = a3;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.k);
        sb.append(", tags={ ");
        boolean z = false;
        boolean z2 = true;
        for (String str : a3) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.r = sb.toString();
        if (c()) {
            return;
        }
        this.o.f();
        try {
            bum a4 = this.p.a(this.k);
            this.c = a4;
            if (a4 == null) {
                bqf.a();
                bqf.e(a, String.format("Didn't find WorkSpec for id %s", this.k), new Throwable[0]);
                f(false);
                this.o.h();
            } else if (a4.r != 1) {
                g();
                this.o.h();
                bqf a5 = bqf.a();
                String.format("%s is not in ENQUEUED state. Nothing more to do.", this.c.d);
                a5.d(new Throwable[0]);
            } else {
                if (a4.e() || this.c.d()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    bum bumVar = this.c;
                    if (bumVar.n != 0 && currentTimeMillis < bumVar.a()) {
                        bqf a6 = bqf.a();
                        String.format("Delaying execution for %s because it is being executed before schedule.", this.c.d);
                        a6.d(new Throwable[0]);
                        f(true);
                        this.o.h();
                        return;
                    }
                }
                this.o.h();
                this.o.g();
                if (this.c.e()) {
                    a2 = this.c.f;
                } else {
                    ado adoVar = this.m.h;
                    bqb b = bqb.b(this.c.e);
                    if (b == null) {
                        bqf.a();
                        bqf.e(a, String.format("Could not create Input Merger %s", this.c.e), new Throwable[0]);
                        b();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.c.f);
                    bun bunVar = this.p;
                    String str2 = this.k;
                    bku a7 = bku.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                    if (str2 == null) {
                        a7.e(1);
                    } else {
                        a7.f(1, str2);
                    }
                    bux buxVar = (bux) bunVar;
                    buxVar.a.e();
                    Cursor f = ld.f(buxVar.a, a7, false);
                    try {
                        ArrayList arrayList2 = new ArrayList(f.getCount());
                        while (f.moveToNext()) {
                            arrayList2.add(bpx.a(f.getBlob(0)));
                        }
                        f.close();
                        a7.i();
                        arrayList.addAll(arrayList2);
                        a2 = b.a(arrayList);
                    } catch (Throwable th) {
                        f.close();
                        a7.i();
                        throw th;
                    }
                }
                bpx bpxVar = a2;
                UUID fromString = UUID.fromString(this.k);
                List list = this.q;
                int i = this.c.l;
                bps bpsVar = this.m;
                Executor executor = bpsVar.a;
                bqt bqtVar = bpsVar.c;
                int i2 = bvw.a;
                WorkerParameters workerParameters = new WorkerParameters(fromString, bpxVar, list, i, executor, bqtVar, new bvv(this.o, this.n, this.g));
                if (this.d == null) {
                    this.d = this.m.c.b(this.b, this.c.d, workerParameters);
                }
                ListenableWorker listenableWorker = this.d;
                if (listenableWorker == null) {
                    bqf.a();
                    bqf.e(a, String.format("Could not create Worker %s", this.c.d), new Throwable[0]);
                    b();
                } else if (listenableWorker.d) {
                    bqf.a();
                    bqf.e(a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.c.d), new Throwable[0]);
                    b();
                } else {
                    listenableWorker.d = true;
                    this.o.f();
                    try {
                        if (this.p.h(this.k) == 1) {
                            this.p.k(2, this.k);
                            bun bunVar2 = this.p;
                            String str3 = this.k;
                            ((bux) bunVar2).a.e();
                            bmb d = ((bux) bunVar2).c.d();
                            if (str3 == null) {
                                d.e(1);
                            } else {
                                d.f(1, str3);
                            }
                            ((bux) bunVar2).a.f();
                            d.a();
                            ((bux) bunVar2).a.h();
                            ((bux) bunVar2).a.g();
                            ((bux) bunVar2).c.e(d);
                            z = true;
                        }
                        this.o.h();
                        if (!z) {
                            g();
                        } else if (!c()) {
                            bwk h = bwk.h();
                            bvt bvtVar = new bvt(this.b, this.c, this.d, workerParameters.g, this.g);
                            this.g.c.execute(bvtVar);
                            bwk bwkVar = bvtVar.f;
                            bwkVar.qY(new brr(this, bwkVar, h), this.g.c);
                            h.qY(new brs(this, h, this.r), this.g.a);
                        }
                    } finally {
                    }
                }
            }
        } finally {
        }
    }
}
