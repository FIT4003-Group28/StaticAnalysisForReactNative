package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bxkt  reason: default package */
/* loaded from: classes4.dex */
public class bxkt {
    private boolean a;
    private boolean b;
    private boolean c;
    private long d;
    private long e;
    private final List<bxkx> f = dchl.a();

    public bxkt() {
        a();
    }

    public final synchronized void a() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = 0L;
        this.e = 0L;
        this.f.clear();
    }

    public final synchronized void b(boolean z) {
        this.a = z;
    }

    public final synchronized boolean c() {
        return this.a;
    }

    public final synchronized void d(cqat cqatVar) {
        dbsk.l(!this.c);
        dbsk.l(!this.b);
        this.d = cqatVar.e();
        this.b = true;
    }

    final synchronized void e(cqat cqatVar) {
        boolean z = true;
        dbsk.l(!this.c);
        dbsk.l(this.b);
        if (this.d == 0) {
            z = false;
        }
        dbsk.l(z);
        this.e = cqatVar.e();
        this.b = false;
    }

    public final synchronized void f(bxkx bxkxVar) {
        if (this.b) {
            this.f.add(bxkxVar);
        }
    }

    @dzsi
    public final synchronized bxkv g(bxkr bxkrVar, cjqy cjqyVar, cqat cqatVar) {
        if (this.c) {
            return null;
        }
        e(cqatVar);
        bxkv bxkvVar = new bxkv(this.d, this.e, bxkrVar, this.f, cqatVar);
        if (this.a) {
            cjqyVar.u(bxkvVar);
        }
        this.c = true;
        return bxkvVar;
    }
}
