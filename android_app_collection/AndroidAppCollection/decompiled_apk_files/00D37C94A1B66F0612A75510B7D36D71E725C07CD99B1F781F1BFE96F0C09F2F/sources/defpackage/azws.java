package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: PG */
/* renamed from: azws  reason: default package */
/* loaded from: classes2.dex */
public final class azws extends azwp {
    public final azts b;
    private final ReentrantLock c = new ReentrantLock();
    private Object[] d;
    private int e;

    public azws() {
        int min = Math.min(10, 8);
        Object[] objArr = new Object[min];
        azqn.g(objArr, azwq.a, 0, min);
        this.d = objArr;
        this.b = ayme.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azwp
    public final Object a() {
        azxw azxwVar;
        azxw j;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.b.a;
            if (i == 0) {
                Object f = f();
                if (f == null) {
                    f = azwq.d;
                }
                return f;
            }
            Object[] objArr = this.d;
            int i2 = this.e;
            Object obj = objArr[i2];
            objArr[i2] = null;
            azts aztsVar = this.b;
            int i3 = aztv.a;
            aztsVar.a = i - 1;
            azyg azygVar = azwq.d;
            if (i == 10) {
                azxt azxtVar = this.a;
                while (true) {
                    azxwVar = (azxw) azxtVar.g();
                    if (azxwVar == azxtVar || !(azxwVar instanceof azxa)) {
                        break;
                    } else if (((((azxa) azxwVar) instanceof azxa) && !azxwVar.sw()) || (j = azxwVar.j()) == null) {
                        break;
                    } else {
                        j.l();
                    }
                }
                azxwVar = null;
                if (((azxa) azxwVar) != null) {
                    throw null;
                }
                i = 10;
            }
            if (azygVar != azwq.d) {
                this.b.a = i;
                Object[] objArr2 = this.d;
                objArr2[(this.e + i) % objArr2.length] = azygVar;
            }
            this.e = (this.e + 1) % this.d.length;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azwp
    public final boolean c(azwx azwxVar) {
        boolean z;
        int f;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            azxw azxwVar = this.a;
            azwo azwoVar = new azwo(azwxVar, this);
            do {
                azxw i = azxwVar.i();
                z = true;
                if (!(i instanceof azxa)) {
                    f = i.f(azwxVar, azxwVar, azwoVar);
                    if (f == 1) {
                        break;
                    }
                } else {
                    break;
                }
            } while (f != 2);
            z = false;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.azwr
    protected final Object d(Object obj) {
        azxw azxwVar;
        azwz azwzVar;
        azxw j;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.b.a;
            azxa f = f();
            if (f != null) {
                return f;
            }
            if (i < 10) {
                azts aztsVar = this.b;
                int i2 = aztv.a;
                aztsVar.a = i + 1;
            }
            if (i == 0) {
                do {
                    azxt azxtVar = this.a;
                    while (true) {
                        azxwVar = (azxw) azxtVar.g();
                        if (azxwVar == azxtVar || !(azxwVar instanceof azwz)) {
                            break;
                        } else if (((((azwz) azxwVar) instanceof azxa) && !azxwVar.sw()) || (j = azxwVar.j()) == null) {
                            break;
                        } else {
                            j.l();
                        }
                    }
                    azxwVar = null;
                    azwzVar = (azwz) azxwVar;
                    if (azwzVar == null) {
                        i = 0;
                    } else if (azwzVar instanceof azxa) {
                        azts aztsVar2 = this.b;
                        int i3 = aztv.a;
                        aztsVar2.a = 0;
                        return azwzVar;
                    }
                } while (azwzVar.d() == null);
                boolean z = azuy.a;
                azts aztsVar3 = this.b;
                int i4 = aztv.a;
                aztsVar3.a = 0;
                reentrantLock.unlock();
                azwzVar.b(obj);
                return azwzVar.a();
            }
            if (i < 10) {
                int length = this.d.length;
                if (i >= length) {
                    int min = Math.min(length + length, 10);
                    Object[] objArr = new Object[min];
                    if (i > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            Object[] objArr2 = this.d;
                            objArr[i5] = objArr2[(this.e + i5) % objArr2.length];
                            if (i6 >= i) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    azqn.g(objArr, azwq.a, i, min);
                    this.d = objArr;
                    this.e = 0;
                }
                Object[] objArr3 = this.d;
                objArr3[(this.e + i) % objArr3.length] = obj;
            } else {
                boolean z2 = azuy.a;
                Object[] objArr4 = this.d;
                int i7 = this.e;
                int length2 = objArr4.length;
                objArr4[i7 % length2] = null;
                objArr4[(i + i7) % length2] = obj;
                this.e = (i7 + 1) % length2;
            }
            return azwq.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.azwr
    protected final String e() {
        return "(buffer:capacity=10,size=" + this.b.a + ')';
    }
}
