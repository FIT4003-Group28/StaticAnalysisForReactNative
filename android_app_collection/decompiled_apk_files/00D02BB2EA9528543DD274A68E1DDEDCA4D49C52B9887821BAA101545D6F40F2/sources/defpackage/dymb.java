package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: dymb  reason: default package */
/* loaded from: classes6.dex */
public final class dymb extends dykm {
    public int a;
    private final Queue<dytj> b = new ArrayDeque();

    private final void h(dyma dymaVar, int i) {
        a(i);
        if (!this.b.isEmpty()) {
            i();
        }
        while (i > 0 && !this.b.isEmpty()) {
            dytj peek = this.b.peek();
            int min = Math.min(i, peek.c());
            try {
                dymaVar.d = dymaVar.a(peek, min);
            } catch (IOException e) {
                dymaVar.e = e;
            }
            if (dymaVar.e != null) {
                return;
            }
            i -= min;
            this.a -= min;
            i();
        }
        if (i <= 0) {
            return;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final void i() {
        if (this.b.peek().c() == 0) {
            this.b.remove().close();
        }
    }

    public final void b(dytj dytjVar) {
        if (!(dytjVar instanceof dymb)) {
            this.b.add(dytjVar);
            this.a += dytjVar.c();
            return;
        }
        dymb dymbVar = (dymb) dytjVar;
        while (!dymbVar.b.isEmpty()) {
            this.b.add(dymbVar.b.remove());
        }
        this.a += dymbVar.a;
        dymbVar.a = 0;
        dymbVar.close();
    }

    @Override // defpackage.dytj
    public final int c() {
        return this.a;
    }

    @Override // defpackage.dykm, defpackage.dytj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.b.isEmpty()) {
            this.b.remove().close();
        }
    }

    @Override // defpackage.dytj
    public final int d() {
        dyly dylyVar = new dyly();
        h(dylyVar, 1);
        return dylyVar.d;
    }

    @Override // defpackage.dytj
    public final void e(byte[] bArr, int i, int i2) {
        h(new dylz(i, bArr), i2);
    }

    @Override // defpackage.dytj
    /* renamed from: f */
    public final dymb g(int i) {
        a(i);
        this.a -= i;
        dymb dymbVar = new dymb();
        while (i > 0) {
            dytj peek = this.b.peek();
            if (peek.c() > i) {
                dymbVar.b(peek.g(i));
                i = 0;
            } else {
                dymbVar.b(this.b.poll());
                i -= peek.c();
            }
        }
        return dymbVar;
    }
}
