package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
/* compiled from: PG */
/* renamed from: azyk  reason: default package */
/* loaded from: classes2.dex */
public final class azyk extends Thread {
    public final azyu a;
    public final azts b;
    public boolean c;
    final /* synthetic */ azyl d;
    public int e;
    private long f;
    private long g;
    private int h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public azyk(azyl azylVar, int i) {
        this.d = azylVar;
        setDaemon(true);
        this.a = new azyu();
        this.e = 4;
        this.b = ayme.g();
        this.nextParkedWorker = azyl.a;
        aztb aztbVar = aztb.b;
        Object obj = ((azsx) aztb.b).a.get();
        obj.getClass();
        this.h = ((Random) obj).nextInt();
        c(i);
    }

    private final azyq e() {
        if (a(2) == 0) {
            azyq azyqVar = (azyq) this.d.i.b();
            return azyqVar == null ? (azyq) this.d.j.b() : azyqVar;
        }
        azyq azyqVar2 = (azyq) this.d.j.b();
        return azyqVar2 == null ? (azyq) this.d.i.b() : azyqVar2;
    }

    private final azyq f(boolean z) {
        long b;
        long b2;
        boolean z2 = azuy.a;
        int i = (int) (this.d.h.b & 2097151);
        if (i < 2) {
            return null;
        }
        int a = a(i);
        azyl azylVar = this.d;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            a++;
            if (a > i) {
                a = 1;
            }
            azyk azykVar = (azyk) azylVar.g.get(a);
            if (azykVar != null && azykVar != this) {
                if (z) {
                    azyu azyuVar = this.a;
                    azyu azyuVar2 = azykVar.a;
                    azyuVar2.getClass();
                    int i3 = azyuVar2.c.a;
                    AtomicReferenceArray atomicReferenceArray = azyuVar2.a;
                    for (int i4 = azyuVar2.d.a; i4 != i3; i4++) {
                        int i5 = i4 & 127;
                        if (azyuVar2.e.a == 0) {
                            break;
                        }
                        azyq azyqVar = (azyq) atomicReferenceArray.get(i5);
                        if (azyqVar != null && azyqVar.h.e() == 1 && atomicReferenceArray.compareAndSet(i5, azyqVar, null)) {
                            azyuVar2.e.a();
                            azyuVar.c(azyqVar, false);
                            b2 = -1;
                            break;
                        }
                    }
                    b2 = azyuVar.b(azyuVar2, true);
                    b = b2;
                } else {
                    azyu azyuVar3 = this.a;
                    azyu azyuVar4 = azykVar.a;
                    azyuVar4.getClass();
                    azyq e = azyuVar4.e();
                    if (e != null) {
                        azyuVar3.c(e, false);
                        b = -1;
                    } else {
                        b = azyuVar3.b(azyuVar4, false);
                    }
                }
                if (b == -1) {
                    return this.a.d();
                }
                if (b > 0) {
                    j = Math.min(j, b);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.g = j;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != azyl.a;
    }

    public final int a(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final void c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.e);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int i = 1;
        boolean z2 = false;
        loop0: while (true) {
            boolean z3 = false;
            while (!this.d.d() && this.e != 5) {
                azyq b = b(this.c);
                long j = -2097152;
                if (b != null) {
                    this.g = 0L;
                    int e = b.h.e();
                    this.f = 0L;
                    if (this.e == 3) {
                        boolean z4 = azuy.a;
                        this.e = 2;
                    }
                    if (e != 0 && d(2)) {
                        this.d.c();
                    }
                    azyl.f(b);
                    if (e != 0) {
                        this.d.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z5 = azuy.a;
                            this.e = 4;
                        }
                    }
                } else {
                    this.c = z2;
                    if (this.g == 0) {
                        if (!g()) {
                            azyl azylVar = this.d;
                            if (this.nextParkedWorker == azyl.a) {
                                aztt azttVar = azylVar.f;
                                while (true) {
                                    long j2 = azttVar.b;
                                    int i2 = this.indexInArray;
                                    boolean z6 = azuy.a;
                                    this.nextParkedWorker = azylVar.g.get((int) (j2 & 2097151));
                                    if (azylVar.f.b(j2, i2 | ((2097152 + j2) & j))) {
                                        break;
                                    }
                                    j = -2097152;
                                }
                            }
                        } else {
                            boolean z7 = azuy.a;
                            azts aztsVar = this.b;
                            int i3 = aztv.a;
                            aztsVar.a = -1;
                            while (g() && this.b.a == -1 && !this.d.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.f == 0) {
                                    z = z3;
                                    this.f = System.nanoTime() + this.d.d;
                                } else {
                                    z = z3;
                                }
                                LockSupport.parkNanos(this.d.d);
                                if (System.nanoTime() - this.f >= 0) {
                                    this.f = 0L;
                                    azyl azylVar2 = this.d;
                                    synchronized (azylVar2.g) {
                                        if (!azylVar2.d()) {
                                            if (((int) (azylVar2.h.b & 2097151)) > azylVar2.b) {
                                                if (this.b.c(-1, i)) {
                                                    int i4 = this.indexInArray;
                                                    c(0);
                                                    azylVar2.b(this, i4, 0);
                                                    int andDecrement = (int) (aztt.a.getAndDecrement(azylVar2.h) & 2097151);
                                                    if (andDecrement != i4) {
                                                        azyk azykVar = (azyk) azylVar2.g.get(andDecrement);
                                                        azykVar.getClass();
                                                        azylVar2.g.set(i4, azykVar);
                                                        azykVar.c(i4);
                                                        azylVar2.b(azykVar, andDecrement, i4);
                                                    }
                                                    azylVar2.g.set(andDecrement, null);
                                                    this.e = 5;
                                                    z3 = z;
                                                    i = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                z3 = z;
                            }
                        }
                        z3 = z3;
                        i = 1;
                        z2 = false;
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        d(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.g);
                        this.g = 0L;
                    }
                }
            }
        }
        d(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r0 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.azyq b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 1
            if (r0 != r1) goto L6
            goto L4e
        L6:
            azyl r0 = r8.d
            aztt r2 = r0.h
        La:
            long r3 = r2.b
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r6 = (int) r5
            if (r6 != 0) goto L3e
            if (r9 == 0) goto L2d
            azyu r9 = r8.a
            azyq r9 = r9.d()
            if (r9 != 0) goto L37
            azyl r9 = r8.d
            azxx r9 = r9.j
            java.lang.Object r9 = r9.b()
            azyq r9 = (defpackage.azyq) r9
            goto L37
        L2d:
            azyl r9 = r8.d
            azxx r9 = r9.j
            java.lang.Object r9 = r9.b()
            azyq r9 = (defpackage.azyq) r9
        L37:
            if (r9 != 0) goto L3d
            azyq r9 = r8.f(r1)
        L3d:
            return r9
        L3e:
            aztt r5 = r0.h
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r3
            boolean r3 = r5.b(r3, r6)
            if (r3 == 0) goto La
            r8.e = r1
        L4e:
            if (r9 == 0) goto L72
            azyl r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L61
            azyq r0 = r8.e()
            if (r0 != 0) goto L78
        L61:
            azyu r0 = r8.a
            azyq r0 = r0.d()
            if (r0 != 0) goto L78
            if (r9 == 0) goto L79
            azyq r0 = r8.e()
            if (r0 == 0) goto L79
            goto L78
        L72:
            azyq r0 = r8.e()
            if (r0 == 0) goto L79
        L78:
            return r0
        L79:
            r9 = 0
            azyq r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyk.b(boolean):azyq");
    }
}
