package defpackage;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzrt  reason: default package */
/* loaded from: classes6.dex */
public final class dzrt extends dznx {
    int a;
    int b = -1;
    int c;
    boolean d;
    dzrd e;
    final /* synthetic */ dzru f;

    public dzrt(dzru dzruVar) {
        this.f = dzruVar;
        this.a = dzruVar.d;
        this.c = dzruVar.f;
        this.d = dzruVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (hasNext()) {
            this.c--;
            if (this.d) {
                this.d = false;
                dzru dzruVar = this.f;
                int i2 = dzruVar.d;
                this.b = i2;
                return dzruVar.a[i2];
            }
            Object[] objArr = this.f.a;
            do {
                i = this.a - 1;
                this.a = i;
                if (i >= 0) {
                    obj = objArr[i];
                } else {
                    this.b = Integer.MIN_VALUE;
                    return this.e.get((-i) - 1);
                }
            } while (obj == null);
            this.b = i;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dznx, java.util.Iterator
    public final void remove() {
        int i;
        Object obj;
        int i2 = this.b;
        if (i2 != -1) {
            dzru dzruVar = this.f;
            int i3 = dzruVar.d;
            if (i2 == i3) {
                dzruVar.c = false;
                dzruVar.a[i3] = 0;
            } else {
                if (this.a >= 0) {
                    Object[] objArr = dzruVar.a;
                    loop0: while (true) {
                        int i4 = (i2 + 1) & this.f.b;
                        while (true) {
                            obj = objArr[i4];
                            if (obj == null) {
                                break loop0;
                            }
                            int hashCode = obj.hashCode();
                            int i5 = this.f.b;
                            int a = dzgv.a(hashCode) & i5;
                            if (i2 > i4) {
                                if (i2 >= a && a > i4) {
                                    break;
                                }
                                i4 = (i4 + 1) & i5;
                            } else if (i2 >= a || a > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        }
                        if (i4 < i2) {
                            if (this.e == null) {
                                this.e = new dzrd(2);
                            }
                            this.e.add(objArr[i4]);
                        }
                        objArr[i2] = obj;
                        i2 = i4;
                    }
                    objArr[i2] = null;
                } else {
                    dzruVar.remove(this.e.set((-i) - 1, null));
                    this.b = -1;
                    return;
                }
            }
            dzru dzruVar2 = this.f;
            dzruVar2.f--;
            this.b = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
