package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azjz  reason: default package */
/* loaded from: classes2.dex */
public final class azjz extends AtomicInteger implements ayoa {
    private static final long serialVersionUID = -4470634016609963609L;
    final bame[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    bamf f;
    ayrn g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l = new AtomicInteger();
    int m;
    int n;

    public azjz(bame[] bameVarArr, int i) {
        this.a = bameVarArr;
        this.d = i;
        this.e = i - (i >> 2);
        int length = bameVarArr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.b = atomicLongArray;
        atomicLongArray.lazySet(i2, length);
        this.c = new long[length];
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.h = th;
        this.i = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.n != 0 || this.g.k(obj)) {
            d();
            return;
        }
        this.f.si();
        b(new aypp("Queue is full?"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azjz.d():void");
    }

    final void e() {
        bame[] bameVarArr = this.a;
        int length = bameVarArr.length;
        int i = 0;
        while (i < length && !this.k) {
            int i2 = i + 1;
            this.l.lazySet(i2);
            bameVarArr[i].f(new azjy(this, i, length));
            i = i2;
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.n = 1;
                    this.g = ayrkVar;
                    this.i = true;
                    e();
                    d();
                    return;
                } else if (sk == 2) {
                    this.n = 2;
                    this.g = ayrkVar;
                    e();
                    bamfVar.sp(this.d);
                    return;
                }
            }
            this.g = new azmk(this.d);
            e();
            bamfVar.sp(this.d);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        this.i = true;
        d();
    }
}
