package defpackage;

import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: pdb  reason: default package */
/* loaded from: classes4.dex */
public abstract class pdb extends Thread {
    private final Object a = new Object();
    private final LinkedList b = new LinkedList();
    private final LinkedList c = new LinkedList();
    private final pcz[] d;
    private final pda[] e;
    private int f;
    private int g;
    private pcz h;
    private Exception i;
    private boolean j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: protected */
    public pdb(pcz[] pczVarArr, pda[] pdaVarArr) {
        this.d = pczVarArr;
        this.f = pczVarArr.length;
        for (int i = 0; i < this.f; i++) {
            this.d[i] = a();
        }
        this.e = pdaVarArr;
        this.g = pdaVarArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = b();
        }
    }

    private final void e() {
        if (m()) {
            this.a.notify();
        }
    }

    private final void l() {
        Exception exc = this.i;
        if (exc == null) {
            return;
        }
        throw exc;
    }

    private final boolean m() {
        return !this.b.isEmpty() && this.g > 0;
    }

    protected abstract pcz a();

    protected abstract pda b();

    protected abstract Exception c(pcz pczVar, pda pdaVar, boolean z);

    public void d() {
        synchronized (this.a) {
            this.k = true;
            this.a.notify();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final pcz f() {
        synchronized (this.a) {
            l();
            pce.d(this.h == null);
            int i = this.f;
            if (i == 0) {
                return null;
            }
            pcz[] pczVarArr = this.d;
            int i2 = i - 1;
            this.f = i2;
            pcz pczVar = pczVarArr[i2];
            pczVar.reset();
            this.h = pczVar;
            return pczVar;
        }
    }

    public final pda g() {
        synchronized (this.a) {
            l();
            if (this.c.isEmpty()) {
                return null;
            }
            return (pda) this.c.removeFirst();
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.j = true;
            pcz pczVar = this.h;
            if (pczVar != null) {
                pcz[] pczVarArr = this.d;
                int i = this.f;
                this.f = i + 1;
                pczVarArr[i] = pczVar;
                this.h = null;
            }
            while (!this.b.isEmpty()) {
                pcz[] pczVarArr2 = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                pczVarArr2[i2] = (pcz) this.b.removeFirst();
            }
            while (!this.c.isEmpty()) {
                ((pda) this.c.removeFirst()).release();
            }
        }
    }

    public final void i(pcz pczVar) {
        synchronized (this.a) {
            l();
            pce.b(pczVar == this.h);
            this.b.addLast(pczVar);
            e();
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(pda pdaVar) {
        synchronized (this.a) {
            pda[] pdaVarArr = this.e;
            int i = this.g;
            this.g = i + 1;
            pdaVarArr[i] = pdaVar;
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i) {
        int i2 = 0;
        pce.d(this.f == this.d.length);
        while (true) {
            pcz[] pczVarArr = this.d;
            if (i2 < pczVarArr.length) {
                pczVarArr[i2].a.b(i);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                synchronized (this.a) {
                    while (!this.k && !m()) {
                        this.a.wait();
                    }
                    if (this.k) {
                        return;
                    }
                    pcz pczVar = (pcz) this.b.removeFirst();
                    pda[] pdaVarArr = this.e;
                    int i = this.g - 1;
                    this.g = i;
                    pda pdaVar = pdaVarArr[i];
                    boolean z = this.j;
                    this.j = false;
                    pdaVar.reset();
                    if (pczVar.getFlag(1)) {
                        pdaVar.setFlag(1);
                    } else {
                        if (pczVar.getFlag(2)) {
                            pdaVar.setFlag(2);
                        }
                        Exception c = c(pczVar, pdaVar, z);
                        this.i = c;
                        if (c != null) {
                            synchronized (this.a) {
                            }
                            return;
                        }
                    }
                    synchronized (this.a) {
                        if (!this.j && !pdaVar.getFlag(2)) {
                            this.c.addLast(pdaVar);
                            pcz[] pczVarArr = this.d;
                            int i2 = this.f;
                            this.f = i2 + 1;
                            pczVarArr[i2] = pczVar;
                        }
                        pdaVar.release();
                        pcz[] pczVarArr2 = this.d;
                        int i22 = this.f;
                        this.f = i22 + 1;
                        pczVarArr2[i22] = pczVar;
                    }
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
