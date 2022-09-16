package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ckbg  reason: default package */
/* loaded from: classes4.dex */
public final class ckbg implements ckcw {
    private final dehn<ckcw> a;
    private final Executor b;

    public ckbg(final dzsj<? extends ckcw> dzsjVar, dehp dehpVar) {
        this.a = dehpVar.c(new Callable(dzsjVar) { // from class: ckav
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (ckcw) this.a.a();
            }
        });
        this.b = dehx.b(dehpVar);
    }

    private final void u(final bvqg<ckcw> bvqgVar) {
        this.a.Pk(new Runnable(this, bvqgVar) { // from class: ckaw
            private final ckbg a;
            private final bvqg b;

            {
                this.a = this;
                this.b = bvqgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.NU(this.a.r());
            }
        }, this.b);
    }

    @Override // defpackage.ckcw
    public final <CounterT, MetricT extends ckhb<CounterT>> CounterT a(MetricT metrict) {
        return (CounterT) r().a(metrict);
    }

    @Override // defpackage.ckcw
    public final void b(ckgx ckgxVar, ckcx ckcxVar) {
        r().b(ckgxVar, ckcxVar);
    }

    @Override // defpackage.ckcw
    public final ddyq c(ckgy ckgyVar) {
        return r().c(ckgyVar);
    }

    @Override // defpackage.ckcw
    public final ddyq d() {
        return r().d();
    }

    @Override // defpackage.ckcw
    public final ckcv e() {
        return r().e();
    }

    @Override // defpackage.ckcw
    public final void f(ckhc ckhcVar) {
        r().f(ckhcVar);
    }

    @Override // defpackage.ckcw
    public final void g(ckhc ckhcVar) {
        r().g(ckhcVar);
    }

    @Override // defpackage.ckcw
    public final void h() {
        r().h();
    }

    @Override // defpackage.ckcw
    public final void i() {
        r().i();
    }

    @Override // defpackage.ckcw
    public final dehn<?> j(final Executor executor) {
        return deew.g(this.a, new defg(executor) { // from class: ckax
            private final Executor a;

            {
                this.a = executor;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return ((ckcw) obj).j(this.a);
            }
        }, this.b);
    }

    @Override // defpackage.ckcw
    public final void k(boolean z) {
        try {
            this.a.get().k(z);
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.ckcw
    public final void l(@dzsi final btlu btluVar, final cjtk cjtkVar, final boolean z) {
        u(new bvqg(btluVar, cjtkVar, z) { // from class: ckay
            private final btlu a;
            private final cjtk b;
            private final boolean c;

            {
                this.a = btluVar;
                this.b = cjtkVar;
                this.c = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).l(this.a, this.b, this.c);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void m(final byte[] bArr, @dzsi final btlu btluVar) {
        u(new bvqg(bArr, btluVar) { // from class: ckaz
            private final byte[] a;
            private final btlu b;

            {
                this.a = bArr;
                this.b = btluVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).m(this.a, this.b);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void n(final ckgt ckgtVar, final boolean z) {
        u(new bvqg(ckgtVar, z) { // from class: ckba
            private final ckgt a;
            private final boolean b;

            {
                this.a = ckgtVar;
                this.b = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).n(this.a, this.b);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void o(final ckgu ckguVar, final long j) {
        u(new bvqg(ckguVar, j) { // from class: ckbb
            private final ckgu a;
            private final long b;

            {
                this.a = ckguVar;
                this.b = j;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).o(this.a, this.b);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void p(final dcdc<ckgy> dcdcVar, final String str, final PrintWriter printWriter) {
        u(new bvqg(dcdcVar, str, printWriter) { // from class: ckbe
            private final dcdc a;
            private final String b;
            private final PrintWriter c;

            {
                this.a = dcdcVar;
                this.b = str;
                this.c = printWriter;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).p(this.a, this.b, this.c);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void q() {
        u(ckbf.a);
    }

    public final ckcw r() {
        if (!this.a.isDone()) {
            return (ckcw) deha.s(this.a);
        }
        return (ckcw) deha.s(this.a);
    }

    @Override // defpackage.ckcw
    public final void s(final ckgz ckgzVar, final int i) {
        u(new bvqg(ckgzVar, i) { // from class: ckbc
            private final ckgz a;
            private final int b;

            {
                this.a = ckgzVar;
                this.b = i;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).s(this.a, this.b);
            }
        });
    }

    @Override // defpackage.ckcw
    public final void t(final ckha ckhaVar, final long j) {
        u(new bvqg(ckhaVar, j) { // from class: ckbd
            private final ckha a;
            private final long b;

            {
                this.a = ckhaVar;
                this.b = j;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((ckcw) obj).t(this.a, this.b);
            }
        });
    }
}
