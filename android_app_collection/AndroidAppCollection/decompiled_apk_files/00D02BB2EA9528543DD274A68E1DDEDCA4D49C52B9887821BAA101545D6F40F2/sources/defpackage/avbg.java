package defpackage;

import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: avbg  reason: default package */
/* loaded from: classes2.dex */
public final class avbg {
    private final cqat a;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private final PriorityQueue<Long> f = new PriorityQueue<>();

    public avbg(cqat cqatVar) {
        this.a = cqatVar;
    }

    public final synchronized void a() {
        this.c--;
    }

    public final synchronized void b(int i) {
        this.b += i;
    }

    public final synchronized boolean c(int i) {
        int i2;
        int i3 = this.c;
        if (i <= i3 || (i2 = this.b) <= 0) {
            return false;
        }
        this.b = i2 - 1;
        this.c = i3 + 1;
        return true;
    }

    public final synchronized void d(int i) {
        this.d += i;
    }

    public final synchronized void e() {
        this.d--;
        this.e++;
    }

    public final synchronized void f() {
        this.e--;
    }

    public final synchronized void g(long j) {
        this.f.add(Long.valueOf(this.a.b() + j));
    }

    public final synchronized void h() {
        this.f.poll();
    }

    public final synchronized void i(ddpb ddpbVar) {
        int min = Math.min(this.b, 99) + (Math.min(this.c, 99) * 100) + (Math.min(this.d, 99) * 10000) + (Math.min(this.e, 9) * 1000000) + (Math.min(this.f.size(), 99) * 10000000);
        if (ddpbVar.c) {
            ddpbVar.bF();
            ddpbVar.c = false;
        }
        ddpg ddpgVar = (ddpg) ddpbVar.b;
        ddpg ddpgVar2 = ddpg.j;
        ddpgVar.a |= 2;
        ddpgVar.b = min;
        if (this.f.isEmpty()) {
            if (ddpbVar.c) {
                ddpbVar.bF();
                ddpbVar.c = false;
            }
            ddpg ddpgVar3 = (ddpg) ddpbVar.b;
            ddpgVar3.a |= 16;
            ddpgVar3.d = 0;
            return;
        }
        Long peek = this.f.peek();
        dbsk.s(peek);
        int b = decl.b(peek.longValue() - this.a.b());
        if (ddpbVar.c) {
            ddpbVar.bF();
            ddpbVar.c = false;
        }
        ddpg ddpgVar4 = (ddpg) ddpbVar.b;
        ddpgVar4.a |= 16;
        ddpgVar4.d = b;
    }

    public final synchronized void j() {
    }
}
