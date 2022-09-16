package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: imb  reason: default package */
/* loaded from: classes6.dex */
public final class imb {
    static final long a = TimeUnit.DAYS.toMillis(30);
    static final long b = TimeUnit.DAYS.toMillis(90);
    static final long c = TimeUnit.HOURS.toMillis(12);
    static final long d = TimeUnit.MINUTES.toMillis(1);
    static final long e = TimeUnit.MINUTES.toMillis(5);
    static final long f = TimeUnit.SECONDS.toMillis(12);
    public final bwqv g;
    public bkew h = bkew.b;
    public final bvjj i;
    public final dxio<akfa> j;
    public final dbty<Integer> k;
    private final eeu l;
    private final Executor m;
    private final ania n;
    private final cqat o;

    public imb(eeu eeuVar, bwqv bwqvVar, bvjj bvjjVar, final btvo btvoVar, dxio<akfa> dxioVar, Executor executor, ania aniaVar, cqat cqatVar) {
        this.l = eeuVar;
        this.g = bwqvVar;
        this.i = bvjjVar;
        this.j = dxioVar;
        this.m = executor;
        this.n = aniaVar;
        this.o = cqatVar;
        this.k = dbud.a(new dbty(btvoVar) { // from class: ilz
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.getSearchParameters().f());
            }
        });
    }

    private final boolean f() {
        return this.n.a();
    }

    private final void g() {
        if (!this.j.a().c() || !f()) {
            return;
        }
        this.m.execute(new Runnable(this) { // from class: ima
            private final imb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                imb imbVar = this.a;
                imbVar.e();
                bwqv bwqvVar = imbVar.g;
                bwrj bwrjVar = bwrj.PLACE_HISTORY;
                btlu j = imbVar.j.a().j();
                dbsk.s(j);
                bwqvVar.h(bwrjVar, Integer.toString(j.d.hashCode()), imbVar.h);
            }
        });
    }

    public final synchronized void a(btlu btluVar) {
        this.h = bkew.b;
        if (btluVar.o()) {
            return;
        }
        if (!((efh) this.l).b) {
            return;
        }
        bkew bkewVar = (bkew) this.g.k(bwrj.PLACE_HISTORY, Integer.toString(btluVar.d.hashCode()), (dssr) bkew.b.cu(7));
        if (bkewVar == null) {
            return;
        }
        this.h = bkewVar;
    }

    public final synchronized void b(ilo iloVar) {
        if (this.j.a().c() && f()) {
            akqi ai = iloVar.ai();
            bkeu bkeuVar = (bkeu) Collections.unmodifiableMap(this.h.a).get(ai.o());
            if (bkeuVar == null) {
                bkeuVar = bkeu.e;
            }
            long j = bkeuVar.b;
            long j2 = bkeuVar.d;
            long j3 = this.i.m(bvjk.gN, false) ? d : a;
            long j4 = this.i.m(bvjk.gN, false) ? f : c;
            if (j2 >= this.o.b() - j3 || j >= this.o.b() - j4) {
                return;
            }
            long c2 = c(iloVar);
            bkes ca = bkew.b.ca(this.h);
            String o = ai.o();
            bket ca2 = bkeu.e.ca(bkeuVar);
            long b2 = this.o.b();
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            bkeu bkeuVar2 = (bkeu) ca2.b;
            int i = bkeuVar2.a | 1;
            bkeuVar2.a = i;
            bkeuVar2.b = b2;
            bkeuVar2.a = i | 2;
            bkeuVar2.c = c2 + 1;
            ca.a(o, ca2.bK());
            bkew bK = ca.bK();
            dbsk.s(bK);
            this.h = bK;
            g();
        }
    }

    public final synchronized long c(ilo iloVar) {
        if (this.j.a().c() && f()) {
            bkeu bkeuVar = (bkeu) Collections.unmodifiableMap(this.h.a).get(iloVar.ai().o());
            if (bkeuVar == null) {
                return 0L;
            }
            if (bkeuVar.b < this.o.b() - (this.i.m(bvjk.gN, false) ? e : b)) {
                return 0L;
            }
            return bkeuVar.c;
        }
        return 0L;
    }

    public final synchronized void d(ilo iloVar) {
        if (this.j.a().c() && f()) {
            akqi ai = iloVar.ai();
            bkeu bkeuVar = (bkeu) Collections.unmodifiableMap(this.h.a).get(ai.o());
            if (bkeuVar == null) {
                bkeuVar = bkeu.e;
            }
            bkes ca = bkew.b.ca(this.h);
            String o = ai.o();
            bket ca2 = bkeu.e.ca(bkeuVar);
            long b2 = this.o.b();
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            bkeu bkeuVar2 = (bkeu) ca2.b;
            int i = bkeuVar2.a | 4;
            bkeuVar2.a = i;
            bkeuVar2.d = b2;
            bkeuVar2.a = i | 2;
            bkeuVar2.c = 0L;
            ca.a(o, ca2.bK());
            this.h = ca.bK();
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        long j = this.i.m(bvjk.gN, false) ? e : b;
        HashSet<Map.Entry> hashSet = new HashSet(Collections.unmodifiableMap(this.h.a).entrySet());
        bkes ca = bkew.b.ca(this.h);
        long b2 = this.o.b();
        for (Map.Entry entry : hashSet) {
            if (((bkeu) entry.getValue()).b < b2 - j) {
                String str = (String) entry.getKey();
                str.getClass();
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                ((bkew) ca.b).b().remove(str);
            }
        }
        this.h = ca.bK();
    }
}
