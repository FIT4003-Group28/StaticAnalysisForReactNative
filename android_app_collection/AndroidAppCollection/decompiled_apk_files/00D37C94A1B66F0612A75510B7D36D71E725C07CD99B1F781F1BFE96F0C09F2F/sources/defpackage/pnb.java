package defpackage;

import java.util.ArrayDeque;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pnb  reason: default package */
/* loaded from: classes4.dex */
public abstract class pnb implements pmr {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final pmv[] e;
    private final pmz[] f;
    private int g;
    private int h;
    private pmv i;
    private pmt j;
    private boolean k;
    private boolean l;
    private int m;

    /* JADX INFO: Access modifiers changed from: protected */
    public pnb(pmv[] pmvVarArr, pmz[] pmzVarArr) {
        this.e = pmvVarArr;
        this.g = pmvVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = pmzVarArr;
        this.h = pmzVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        pna pnaVar = new pna(this);
        this.a = pnaVar;
        pnaVar.start();
    }

    private final void g() {
        if (t()) {
            this.b.notify();
        }
    }

    private final void s(pmv pmvVar) {
        pmvVar.clear();
        pmv[] pmvVarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        pmvVarArr[i] = pmvVar;
    }

    private final boolean t() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private final void x() {
        pmt pmtVar = this.j;
        if (pmtVar == null) {
            return;
        }
        throw pmtVar;
    }

    protected abstract pmt a(Throwable th);

    protected abstract pmt b(pmv pmvVar, pmz pmzVar, boolean z);

    protected abstract pmv c();

    protected abstract pmz d();

    @Override // defpackage.pmr
    public void f() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.pmr
    public final void j() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            pmv pmvVar = this.i;
            if (pmvVar != null) {
                s(pmvVar);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                s((pmv) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((pmz) this.d.removeFirst()).release();
            }
        }
    }

    @Override // defpackage.pmr
    /* renamed from: l */
    public final pmv h() {
        pmv pmvVar;
        synchronized (this.b) {
            x();
            ptx.e(this.i == null);
            int i = this.g;
            if (i == 0) {
                pmvVar = null;
            } else {
                pmv[] pmvVarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                pmvVar = pmvVarArr[i2];
            }
            this.i = pmvVar;
        }
        return pmvVar;
    }

    @Override // defpackage.pmr
    /* renamed from: m */
    public final pmz i() {
        synchronized (this.b) {
            x();
            if (this.d.isEmpty()) {
                return null;
            }
            return (pmz) this.d.removeFirst();
        }
    }

    @Override // defpackage.pmr
    /* renamed from: n */
    public final void k(pmv pmvVar) {
        synchronized (this.b) {
            x();
            ptx.c(pmvVar == this.i);
            this.c.addLast(pmvVar);
            g();
            this.i = null;
        }
    }

    public final void o(pmz pmzVar) {
        synchronized (this.b) {
            pmzVar.clear();
            pmz[] pmzVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            pmzVarArr[i] = pmzVar;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(int i) {
        ptx.e(this.g == this.e.length);
        for (pmv pmvVar : this.e) {
            pmvVar.e(i);
        }
    }

    public final boolean q() {
        pmt a;
        synchronized (this.b) {
            while (!this.l && !t()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            pmv pmvVar = (pmv) this.c.removeFirst();
            pmz[] pmzVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            pmz pmzVar = pmzVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (pmvVar.isEndOfStream()) {
                pmzVar.addFlag(4);
            } else {
                if (pmvVar.isDecodeOnly()) {
                    pmzVar.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                }
                try {
                    a = b(pmvVar, pmzVar, z);
                } catch (OutOfMemoryError e) {
                    a = a(e);
                } catch (RuntimeException e2) {
                    a = a(e2);
                }
                if (a != null) {
                    synchronized (this.b) {
                        this.j = a;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    pmzVar.release();
                } else if (pmzVar.isDecodeOnly()) {
                    this.m++;
                    pmzVar.release();
                } else {
                    pmzVar.skippedOutputBufferCount = this.m;
                    this.m = 0;
                    this.d.addLast(pmzVar);
                }
                s(pmvVar);
            }
            return true;
        }
    }
}
