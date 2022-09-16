package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azpd  reason: default package */
/* loaded from: classes2.dex */
public final class azpd extends azpb {
    static final azpc[] b = new azpc[0];
    static final azpc[] c = new azpc[0];
    final AtomicReference d = new AtomicReference(c);
    Throwable e;

    public static azpd ar() {
        return new azpd();
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        azpc[] azpcVarArr;
        azpc[] azpcVarArr2;
        azpc azpcVar = new azpc(bameVar, this);
        bameVar.f(azpcVar);
        do {
            azpcVarArr = (azpc[]) this.d.get();
            if (azpcVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    bameVar.b(th);
                    return;
                } else {
                    bameVar.sm();
                    return;
                }
            }
            int length = azpcVarArr.length;
            azpcVarArr2 = new azpc[length + 1];
            System.arraycopy(azpcVarArr, 0, azpcVarArr2, 0, length);
            azpcVarArr2[length] = azpcVar;
        } while (!this.d.compareAndSet(azpcVarArr, azpcVarArr2));
        if (azpcVar.get() == Long.MIN_VALUE) {
            as(azpcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void as(azpc azpcVar) {
        azpc[] azpcVarArr;
        azpc[] azpcVarArr2;
        do {
            azpcVarArr = (azpc[]) this.d.get();
            if (azpcVarArr == b || azpcVarArr == c) {
                return;
            }
            int length = azpcVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azpcVarArr[i] == azpcVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azpcVarArr2 = c;
            } else {
                azpc[] azpcVarArr3 = new azpc[length - 1];
                System.arraycopy(azpcVarArr, 0, azpcVarArr3, 0, i);
                System.arraycopy(azpcVarArr, i + 1, azpcVarArr3, i, (length - i) - 1);
                azpcVarArr2 = azpcVarArr3;
            }
        } while (!this.d.compareAndSet(azpcVarArr, azpcVarArr2));
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azpc[] azpcVarArr;
        ayrd.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            azqc.d(th);
            return;
        }
        this.e = th;
        for (azpc azpcVar : (azpc[]) this.d.getAndSet(obj2)) {
            if (azpcVar.get() != Long.MIN_VALUE) {
                azpcVar.a.b(th);
            } else {
                azqc.d(th);
            }
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        azpc[] azpcVarArr;
        ayrd.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (azpc azpcVar : (azpc[]) this.d.get()) {
            long j = azpcVar.get();
            if (j != Long.MIN_VALUE) {
                if (j == 0) {
                    azpcVar.si();
                    azpcVar.a.b(new aypp("Could not emit value due to lack of requests"));
                } else {
                    azpcVar.a.c(obj);
                    ayno.f(azpcVar, 1L);
                }
            }
        }
    }

    @Override // defpackage.bame
    public final void f(bamf bamfVar) {
        if (this.d.get() == b) {
            bamfVar.si();
        } else {
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        azpc[] azpcVarArr;
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            return;
        }
        for (azpc azpcVar : (azpc[]) this.d.getAndSet(obj2)) {
            if (azpcVar.get() != Long.MIN_VALUE) {
                azpcVar.a.sm();
            }
        }
    }
}
