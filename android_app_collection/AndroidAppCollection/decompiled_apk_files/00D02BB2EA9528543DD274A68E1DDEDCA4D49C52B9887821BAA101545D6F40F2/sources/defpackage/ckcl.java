package defpackage;

import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ckcl  reason: default package */
/* loaded from: classes4.dex */
public final class ckcl implements ckcw {
    private final Map<ckgy, ckcs> a = dcjz.k(ckgy.class);

    public ckcl() {
        for (ckgy ckgyVar : ckgy.values()) {
            this.a.put(ckgyVar, new ckcs(null));
        }
    }

    @Override // defpackage.ckcw
    public final <CounterT, MetricT extends ckhb<CounterT>> CounterT a(MetricT metrict) {
        ckcs ckcsVar = this.a.get(metrict.c);
        dbsk.s(ckcsVar);
        return (CounterT) metrict.a(ckcsVar);
    }

    @Override // defpackage.ckcw
    public final void b(ckgx ckgxVar, ckcx ckcxVar) {
    }

    @Override // defpackage.ckcw
    public final ddyq c(ckgy ckgyVar) {
        return ddyq.K;
    }

    @Override // defpackage.ckcw
    public final ddyq d() {
        return ddyq.K;
    }

    @Override // defpackage.ckcw
    public final ckcv e() {
        return new ckck();
    }

    @Override // defpackage.ckcw
    public final void f(ckhc ckhcVar) {
    }

    @Override // defpackage.ckcw
    public final void g(ckhc ckhcVar) {
    }

    @Override // defpackage.ckcw
    public final void h() {
    }

    @Override // defpackage.ckcw
    public final void i() {
    }

    @Override // defpackage.ckcw
    public final dehn<?> j(Executor executor) {
        return deha.a(null);
    }

    @Override // defpackage.ckcw
    public final void k(boolean z) {
    }

    @Override // defpackage.ckcw
    public final void l(@dzsi btlu btluVar, cjtk cjtkVar, boolean z) {
    }

    @Override // defpackage.ckcw
    public final void m(byte[] bArr, @dzsi btlu btluVar) {
    }

    @Override // defpackage.ckcw
    public final void n(ckgt ckgtVar, boolean z) {
        ckct.a(this, ckgtVar, z);
    }

    @Override // defpackage.ckcw
    public final void o(ckgu ckguVar, long j) {
        ckct.b(this, ckguVar, j);
    }

    @Override // defpackage.ckcw
    public final void p(dcdc dcdcVar, String str, PrintWriter printWriter) {
    }

    @Override // defpackage.ckcw
    public final void q() {
    }

    @Override // defpackage.ckcw
    public final void s(ckgz ckgzVar, int i) {
        ckct.c(this, ckgzVar, i);
    }

    @Override // defpackage.ckcw
    public final void t(ckha ckhaVar, long j) {
        ckct.d(this, ckhaVar, j);
    }
}
