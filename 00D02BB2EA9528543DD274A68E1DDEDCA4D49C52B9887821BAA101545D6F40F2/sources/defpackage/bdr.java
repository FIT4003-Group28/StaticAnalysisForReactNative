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
/* renamed from: bdr  reason: default package */
/* loaded from: classes3.dex */
public final class bdr implements Runnable {
    public static final /* synthetic */ int h = 0;
    final Context a;
    bgh b;
    public volatile boolean g;
    private final String i;
    private final List<bcx> j;
    private final bbj k;
    private final bfh l;
    private final WorkDatabase m;
    private final bgi n;
    private List<String> o;
    private String p;
    private final bif q;
    private final bfq r;
    private final bgv s;
    bbx d = bbx.c();
    final bid<Boolean> e = bid.e();
    dehn<bbx> f = null;
    ListenableWorker c = null;

    static {
        bbz.f("WorkerWrapper");
    }

    public bdr(bdq bdqVar) {
        this.a = bdqVar.a;
        this.q = bdqVar.h;
        this.l = bdqVar.b;
        this.i = bdqVar.e;
        this.j = bdqVar.f;
        this.k = bdqVar.c;
        WorkDatabase workDatabase = bdqVar.d;
        this.m = workDatabase;
        this.n = workDatabase.t();
        this.r = workDatabase.u();
        this.s = workDatabase.v();
    }

    private final void d() {
        if (this.n.o(this.i) == 2) {
            bbz.e().a(new Throwable[0]);
            e(true);
            return;
        }
        bbz.e().a(new Throwable[0]);
        e(false);
    }

    private final void e(boolean z) {
        ListenableWorker listenableWorker;
        this.m.F();
        try {
            List<String> j = this.m.t().j();
            if (j == null || j.isEmpty()) {
                bhe.a(this.a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.n.u(1, this.i);
                this.n.r(this.i, -1L);
            }
            if (this.b != null && (listenableWorker = this.c) != null && listenableWorker.f()) {
                bfh bfhVar = this.l;
                String str = this.i;
                synchronized (((bcw) bfhVar).d) {
                    ((bcw) bfhVar).a.remove(str);
                    ((bcw) bfhVar).f();
                }
            }
            this.m.l();
            this.m.k();
            this.e.f((bid<Boolean>) Boolean.valueOf(z));
        } catch (Throwable th) {
            this.m.k();
            throw th;
        }
    }

    private final void f() {
        this.m.F();
        try {
            this.n.u(1, this.i);
            this.n.f(this.i, System.currentTimeMillis());
            this.n.r(this.i, -1L);
            this.m.l();
        } finally {
            this.m.k();
            e(true);
        }
    }

    private final void g() {
        this.m.F();
        try {
            this.n.f(this.i, System.currentTimeMillis());
            this.n.u(1, this.i);
            this.n.t(this.i);
            this.n.r(this.i, -1L);
            this.m.l();
        } finally {
            this.m.k();
            e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!b()) {
            this.m.F();
            try {
                int o = this.n.o(this.i);
                bgf y = this.m.y();
                String str = this.i;
                y.a.E();
                awj e = y.b.e();
                if (str == null) {
                    e.f(1);
                } else {
                    e.i(1, str);
                }
                y.a.F();
                e.a();
                y.a.l();
                y.a.k();
                y.b.f(e);
                if (o == 0) {
                    e(false);
                } else if (o == 2) {
                    bbx bbxVar = this.d;
                    if (bbxVar instanceof bbw) {
                        bbz.e().c(new Throwable[0]);
                        if (!this.b.a()) {
                            this.m.F();
                            this.n.u(3, this.i);
                            this.n.e(this.i, ((bbw) this.d).a);
                            long currentTimeMillis = System.currentTimeMillis();
                            for (String str2 : this.r.a(this.i)) {
                                if (this.n.o(str2) == 5) {
                                    bfq bfqVar = this.r;
                                    br a = br.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                    if (str2 == null) {
                                        a.f(1);
                                    } else {
                                        a.i(1, str2);
                                    }
                                    bfqVar.a.E();
                                    Cursor q = bfqVar.a.q(a);
                                    boolean z = q.moveToFirst() && q.getInt(0) != 0;
                                    q.close();
                                    a.c();
                                    if (z) {
                                        bbz.e().c(new Throwable[0]);
                                        this.n.u(1, str2);
                                        this.n.f(str2, currentTimeMillis);
                                    }
                                }
                            }
                            this.m.l();
                            this.m.k();
                            e(false);
                        } else {
                            g();
                        }
                    } else if (bbxVar instanceof bbv) {
                        bbz.e().c(new Throwable[0]);
                        f();
                    } else {
                        bbz.e().c(new Throwable[0]);
                        if (this.b.a()) {
                            g();
                        } else {
                            c();
                        }
                    }
                } else if (!bck.b(o)) {
                    f();
                }
                this.m.l();
            } finally {
                this.m.k();
            }
        }
        List<bcx> list = this.j;
        if (list != null) {
            for (bcx bcxVar : list) {
                bcxVar.c(this.i);
            }
            bcy.a(this.k, this.m, this.j);
        }
    }

    public final boolean b() {
        if (this.g) {
            bbz.e().a(new Throwable[0]);
            int o = this.n.o(this.i);
            if (o == 0) {
                e(false);
            } else {
                e(!bck.b(o));
            }
            return true;
        }
        return false;
    }

    final void c() {
        this.m.F();
        try {
            String str = this.i;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.n.o(str2) != 6) {
                    this.n.u(4, str2);
                }
                linkedList.addAll(this.r.a(str2));
            }
            this.n.e(this.i, ((bbu) this.d).a);
            this.m.l();
        } finally {
            this.m.k();
            e(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        bbp a;
        List<String> a2 = this.s.a(this.i);
        this.o = a2;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.i);
        sb.append(", tags={ ");
        boolean z = true;
        boolean z2 = true;
        for (String str : a2) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.p = sb.toString();
        if (b()) {
            return;
        }
        this.m.F();
        try {
            bgh c = this.n.c(this.i);
            this.b = c;
            if (c == null) {
                bbz.e().b(new Throwable[0]);
                e(false);
            } else if (c.p != 1) {
                d();
                this.m.l();
                bbz e = bbz.e();
                String str2 = this.b.b;
                e.a(new Throwable[0]);
            } else {
                if (c.a() || this.b.b()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    bgh bghVar = this.b;
                    if (bghVar.l != 0 && currentTimeMillis < bghVar.d()) {
                        bbz e2 = bbz.e();
                        String str3 = this.b.b;
                        e2.a(new Throwable[0]);
                        e(true);
                        return;
                    }
                }
                this.m.l();
                this.m.k();
                if (this.b.a()) {
                    a = this.b.d;
                } else {
                    bbt bbtVar = this.k.d;
                    bbr b = bbr.b(this.b.c);
                    if (b == null) {
                        bbz e3 = bbz.e();
                        String str4 = this.b.c;
                        e3.b(new Throwable[0]);
                        c();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.b.d);
                    arrayList.addAll(this.n.g(this.i));
                    a = b.a(arrayList);
                }
                bbp bbpVar = a;
                UUID fromString = UUID.fromString(this.i);
                List<String> list = this.o;
                int i = this.b.j;
                bbj bbjVar = this.k;
                Executor executor = bbjVar.a;
                bcq bcqVar = bbjVar.c;
                int i2 = bhn.a;
                new bhm(this.m);
                WorkerParameters workerParameters = new WorkerParameters(fromString, bbpVar, list, executor, bcqVar);
                if (this.c == null) {
                    this.c = this.k.c.b(this.a, this.b.b, workerParameters);
                }
                ListenableWorker listenableWorker = this.c;
                if (listenableWorker == null) {
                    bbz e4 = bbz.e();
                    String str5 = this.b.b;
                    e4.b(new Throwable[0]);
                    c();
                } else if (listenableWorker.c) {
                    bbz e5 = bbz.e();
                    String str6 = this.b.b;
                    e5.b(new Throwable[0]);
                    c();
                } else {
                    listenableWorker.c = true;
                    this.m.F();
                    try {
                        if (this.n.o(this.i) == 1) {
                            this.n.u(2, this.i);
                            this.n.q(this.i);
                        } else {
                            z = false;
                        }
                        this.m.l();
                        if (!z) {
                            d();
                        } else if (!b()) {
                            bid e6 = bid.e();
                            this.q.c.execute(new bdo(this, e6));
                            e6.Pk(new bdp(this, e6), this.q.a);
                        }
                    } finally {
                    }
                }
            }
        } finally {
        }
    }
}
