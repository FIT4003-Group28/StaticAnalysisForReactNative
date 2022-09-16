package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: PG */
/* renamed from: yxe  reason: default package */
/* loaded from: classes4.dex */
public final class yxe {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final azqb d;
    public final snc e;
    public final yxi f;
    public final yxm g;
    public final Queue h;
    public final Queue i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final zdb m;
    private final AtomicReferenceArray n;
    private final azqb o;
    private final int[] p;

    public yxe(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, snc sncVar, zdb zdbVar, ywk ywkVar, yxm yxmVar, byte[] bArr, byte[] bArr2) {
        this.o = azqbVar;
        this.d = azqbVar2;
        this.j = azqbVar3;
        this.k = azqbVar4;
        this.l = azqbVar5;
        this.e = sncVar;
        this.m = zdbVar;
        int c = (int) ywkVar.c(ywk.H);
        boolean z = true;
        this.b = (ywkVar.c(ywk.E) & 4194304) != 0;
        z = c <= ThreadLocalRandom.current().nextInt(127) ? false : z;
        this.a = z;
        this.c = new ArrayList();
        this.p = new int[]{0, 1, 0, 0, 1, 1, 1};
        this.n = new AtomicReferenceArray(12);
        this.g = yxmVar;
        if (z) {
            this.f = new yxi();
            this.h = new ConcurrentLinkedQueue();
            this.i = new ConcurrentLinkedQueue();
            return;
        }
        this.f = null;
        yxmVar.a();
        this.h = null;
        this.i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return this.p[i];
    }

    public final synchronized yxd b(String str) {
        yxd yxdVar;
        yxdVar = new yxd(this, str);
        this.c.add(yxdVar);
        return yxdVar;
    }

    public final Executor c() {
        return (Executor) this.o.get();
    }

    public final void d(int i) {
        Object obj = this.n.get(i);
        if (obj == null || obj == this || !this.n.compareAndSet(i, obj, this) || !this.a) {
            return;
        }
        yxb yxbVar = (yxb) obj;
        yxbVar.d.a();
        yxd.j(yxbVar);
        this.h.add(yxbVar);
    }

    public final void e(int i) {
        f(i, null);
    }

    public final void f(int i, Throwable th) {
        Object obj = this.n.get(i);
        if (obj == null || obj == this || !this.n.compareAndSet(i, obj, this) || !this.a) {
            return;
        }
        yxj yxjVar = (yxj) obj;
        yxjVar.a();
        if (th != null) {
            yxjVar.g = th;
        }
        this.i.add(yxjVar);
    }

    public final boolean g(int i) {
        if (this.n.get(i) != null) {
            return false;
        }
        yxj yxjVar = new yxj(i, this.e, 4);
        if (!this.n.compareAndSet(i, null, yxjVar)) {
            return false;
        }
        if (!this.a) {
            return true;
        }
        yxjVar.b();
        return true;
    }

    public final void h(int i) {
        if (this.n.get(i) != null) {
            return;
        }
        yxb yxbVar = new yxb(i, this.e);
        if (!this.n.compareAndSet(i, null, yxbVar) || !this.a) {
            return;
        }
        yxbVar.d.b();
        yxd.k(yxbVar);
    }
}
