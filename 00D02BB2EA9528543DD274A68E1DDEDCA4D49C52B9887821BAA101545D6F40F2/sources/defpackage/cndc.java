package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cndc  reason: default package */
/* loaded from: classes5.dex */
public class cndc extends cmwz {
    public final Context b;
    public final cmze c;
    public final cmzh d;
    public final cnac e;
    public final Looper f;
    public final Object g;
    private final dehn<cncj> h;
    private final int i;
    private volatile dehn<cncj> j;
    private volatile int k;
    private volatile boolean l;
    private volatile boolean m;

    public cndc(Context context, cmze cmzeVar, cmzh cmzhVar, cnac cnacVar, Looper looper, int i, int i2) {
        super(i2);
        dehn<cncj> b = deha.b(new cnai(ddid.UNDEFINED_REASON, "Token not connected."));
        this.h = b;
        this.g = new Object();
        this.j = b;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.b = context;
        this.c = cmzeVar;
        this.d = cmzhVar;
        this.e = cnacVar;
        this.f = looper;
        this.i = i;
    }

    @Override // defpackage.cmwc
    public final cnab a() {
        cncj cncjVar;
        synchronized (this.g) {
            dbsk.l(b());
            cncjVar = (cncj) deha.s(this.j);
        }
        return cncjVar;
    }

    @Override // defpackage.cmwc
    public final boolean b() {
        boolean a;
        synchronized (this.g) {
            a = cnep.a(this.j);
        }
        return a;
    }

    @Override // defpackage.cmwz
    public final void c() {
        i();
    }

    @Override // defpackage.cmwz
    public final void d() {
        synchronized (this.g) {
            if (this.l) {
                int i = cnjc.a;
                this.m = true;
                return;
            }
            int i2 = cnjc.a;
            deha.q(this.j, new cndb(this), dege.a);
            if (!this.j.isDone()) {
                this.j.cancel(false);
            }
            this.j = this.h;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ddid f() {
        return ddid.NO_FALLBACK_GH_CAR_USED;
    }

    public final void g() {
        synchronized (this.g) {
            if (!b()) {
                return;
            }
            this.l = true;
            synchronized (this.g) {
                this.l = false;
                if (this.m) {
                    this.m = false;
                    d();
                }
            }
        }
    }

    protected cnce h() {
        cncs h = cncu.h(this.b, new cncc(this) { // from class: cncx
            private final cndc a;

            {
                this.a = this;
            }

            @Override // defpackage.cncc
            public final void a(cnai cnaiVar) {
                int i;
                cndc cndcVar = this.a;
                int i2 = cnjc.a;
                synchronized (cndcVar.g) {
                    cmzf c = cmzg.c();
                    if (cnaiVar instanceof cnah) {
                        i = 3;
                    } else {
                        i = cnaiVar instanceof cnaj ? 6 : 5;
                    }
                    ((cmvo) c).b = i;
                    cmzh cmzhVar = cndcVar.d;
                    c.b();
                    cmzhVar.a();
                }
            }
        }, new cncd(this) { // from class: cncy
            private final cndc a;

            {
                this.a = this;
            }

            @Override // defpackage.cncd
            public final void a() {
                cndc cndcVar = this.a;
                int i = cnjc.a;
                synchronized (cndcVar.g) {
                    cndcVar.c.a();
                    cndcVar.d();
                    cndcVar.i();
                }
            }
        });
        h.a = this.i;
        return h.a();
    }

    public final void i() {
        synchronized (this.g) {
            dehn<cncj> dehnVar = this.j;
            if (dehnVar.isDone() && !cnep.a(dehnVar)) {
                cnci cnciVar = new cnci(h());
                cnciVar.b = this.f;
                final cncj cncjVar = new cncj(cnciVar.a, cnciVar.b);
                this.k++;
                int i = cnjc.a;
                this.j = deew.h(degp.q(cncjVar.h), new dbrn(cncjVar) { // from class: cncv
                    private final cncj a;

                    {
                        this.a = cncjVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        Void r2 = (Void) obj;
                        return this.a;
                    }
                }, dege.a);
                deha.q(degp.q(this.j), new cnda(this, cncjVar), dege.a);
            } else if (this.m) {
                new cojb(this.f).post(new Runnable(this) { // from class: cncw
                    private final cndc a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g();
                    }
                });
            }
            this.m = false;
        }
    }
}
