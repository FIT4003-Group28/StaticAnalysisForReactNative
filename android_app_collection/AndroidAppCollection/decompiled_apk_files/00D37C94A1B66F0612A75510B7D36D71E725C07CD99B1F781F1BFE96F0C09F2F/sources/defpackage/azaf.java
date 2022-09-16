package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azaf  reason: default package */
/* loaded from: classes2.dex */
public final class azaf extends AtomicInteger implements ayre, bamf {
    private static final long serialVersionUID = 1577321883966341961L;
    final bame a;
    final ayqe b;
    final azag[] c;
    final AtomicReferenceArray d;
    final AtomicReference e;
    final AtomicLong f;
    final azoj g;
    volatile boolean h;

    public azaf(bame bameVar, ayqe ayqeVar) {
        this.a = bameVar;
        this.b = ayqeVar;
        azag[] azagVarArr = new azag[2];
        for (int i = 0; i < 2; i++) {
            azagVarArr[i] = new azag(this, i);
        }
        this.c = azagVarArr;
        this.d = new AtomicReferenceArray(2);
        this.e = new AtomicReference();
        this.f = new AtomicLong();
        this.g = new azoj();
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.h = true;
        d(-1);
        axzl.h(this.a, th, this, this.g);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (e(obj) || this.h) {
            return;
        }
        ((bamf) this.e.get()).sp(1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i) {
        azag[] azagVarArr = this.c;
        int i2 = 0;
        while (true) {
            int length = azagVarArr.length;
            if (i2 < 2) {
                if (i2 != i) {
                    azof.f(azagVarArr[i2]);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ayre
    public final boolean e(Object obj) {
        if (this.h) {
            return false;
        }
        AtomicReferenceArray atomicReferenceArray = this.d;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        objArr[0] = obj;
        int i = 0;
        while (i < length) {
            Object obj2 = atomicReferenceArray.get(i);
            if (obj2 == null) {
                return false;
            }
            i++;
            objArr[i] = obj2;
        }
        try {
            Object a = this.b.a(objArr);
            ayrd.b(a, "The combiner returned a null value");
            axzl.i(this.a, a, this, this.g);
            return true;
        } catch (Throwable th) {
            bapv.j(th);
            si();
            b(th);
            return false;
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.j(this.e, this.f, bamfVar);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this.e);
        azag[] azagVarArr = this.c;
        int length = azagVarArr.length;
        for (int i = 0; i < 2; i++) {
            azof.f(azagVarArr[i]);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.h) {
            this.h = true;
            d(-1);
            axzl.f(this.a, this, this.g);
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.a(this.e, this.f, j);
    }
}
