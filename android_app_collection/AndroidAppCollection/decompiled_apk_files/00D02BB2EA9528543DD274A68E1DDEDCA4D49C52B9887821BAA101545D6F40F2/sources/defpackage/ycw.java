package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ycw  reason: default package */
/* loaded from: classes7.dex */
public final class ycw implements ycu {
    private final dbsg<arkb> b;
    private final Executor d;
    private final bzge c = new bzge();
    public dcdc<amuo> a = dcdc.e();
    private int e = 1;

    public ycw(dbsg<arkb> dbsgVar, Executor executor) {
        this.b = dbsgVar;
        this.d = executor;
    }

    private final synchronized void e() {
        if (this.a.isEmpty()) {
            c(3);
            return;
        }
        c(2);
        dcdc<amuo> dcdcVar = this.a;
        amuo[] amuoVarArr = (amuo[]) dcdcVar.toArray(new amuo[0]);
        deha.q(this.b.b().c(), new ycv(this, dcdcVar), this.d);
    }

    @Override // defpackage.ycu
    public final synchronized void a(amuo[] amuoVarArr) {
        if (!this.b.a()) {
            return;
        }
        this.a = dcdc.t(amuoVarArr);
        e();
    }

    @Override // defpackage.ycu
    public final synchronized int b() {
        return this.e;
    }

    public final synchronized void c(int i) {
        if (this.e != i) {
            this.e = i;
            this.c.a();
        }
    }

    @Override // defpackage.bzgh
    public final synchronized void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        if (!this.b.a()) {
            return;
        }
        this.c.b(bzgfVar, bzgjVar, executor);
        e();
    }
}
