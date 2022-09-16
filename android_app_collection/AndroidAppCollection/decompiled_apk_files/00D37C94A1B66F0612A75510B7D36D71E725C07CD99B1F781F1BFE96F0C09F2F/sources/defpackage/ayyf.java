package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayyf  reason: default package */
/* loaded from: classes2.dex */
final class ayyf extends AtomicInteger implements ayoa, aypg {
    static final ayye[] a = new ayye[0];
    static final ayye[] b = new ayye[0];
    private static final long serialVersionUID = -202316842419149694L;
    final AtomicReference c;
    final int d;
    volatile Object h;
    int i;
    volatile ayrn j;
    final AtomicReference g = new AtomicReference();
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public ayyf(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.d = i;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h == null) {
            this.h = azoq.b(th);
            d();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.i != 0 || this.j.k(obj)) {
            d();
        } else {
            b(new aypp("Prefetch queue is full?!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015c, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
        if (r10 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
        if (r23.i == 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
        ((defpackage.bamf) r23.g.get()).sp(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
        if (r10 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
        if (r23.i == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
        ((defpackage.bamf) r23.g.get()).sp(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0147, code lost:
        if (r12 == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0149, code lost:
        if (r0 != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayyf.d():void");
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.get() == b;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this.g, bamfVar)) {
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(7);
                if (sk == 1) {
                    this.i = 1;
                    this.j = ayrkVar;
                    this.h = azoq.a;
                    d();
                    return;
                } else if (sk == 2) {
                    this.i = 2;
                    this.j = ayrkVar;
                    bamfVar.sp(this.d);
                    return;
                }
            }
            this.j = new azmk(this.d);
            bamfVar.sp(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ayye ayyeVar) {
        ayye[] ayyeVarArr;
        ayye[] ayyeVarArr2;
        do {
            ayyeVarArr = (ayye[]) this.e.get();
            int length = ayyeVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayyeVarArr[i].equals(ayyeVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayyeVarArr2 = a;
            } else {
                ayye[] ayyeVarArr3 = new ayye[length - 1];
                System.arraycopy(ayyeVarArr, 0, ayyeVarArr3, 0, i);
                System.arraycopy(ayyeVarArr, i + 1, ayyeVarArr3, i, (length - i) - 1);
                ayyeVarArr2 = ayyeVarArr3;
            }
        } while (!this.e.compareAndSet(ayyeVarArr, ayyeVarArr2));
    }

    final boolean h(Object obj, boolean z) {
        int i = 0;
        if (obj != null) {
            if (!azoq.g(obj)) {
                Throwable d = azoq.d(obj);
                this.c.compareAndSet(this, null);
                ayye[] ayyeVarArr = (ayye[]) this.e.getAndSet(b);
                int length = ayyeVarArr.length;
                if (length != 0) {
                    while (i < length) {
                        ayyeVarArr[i].a.b(d);
                        i++;
                    }
                } else {
                    azqc.d(d);
                }
                return true;
            } else if (z) {
                this.c.compareAndSet(this, null);
                ayye[] ayyeVarArr2 = (ayye[]) this.e.getAndSet(b);
                int length2 = ayyeVarArr2.length;
                while (i < length2) {
                    ayyeVarArr2[i].a.sm();
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aypg
    public final void qr() {
        Object obj = this.e.get();
        Object obj2 = b;
        if (obj == obj2 || ((ayye[]) this.e.getAndSet(obj2)) == obj2) {
            return;
        }
        this.c.compareAndSet(this, null);
        azof.f(this.g);
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.h == null) {
            this.h = azoq.a;
            d();
        }
    }
}
