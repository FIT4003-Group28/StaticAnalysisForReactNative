package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzqx  reason: default package */
/* loaded from: classes6.dex */
class dzqx {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzrd f;
    final /* synthetic */ dzqz g;

    public dzqx(dzqz dzqzVar) {
        this.g = dzqzVar;
        this.b = dzqzVar.f;
        this.d = dzqzVar.h;
        this.e = dzqzVar.e;
    }

    public final int a() {
        int i;
        if (hasNext()) {
            this.d--;
            if (this.e) {
                this.e = false;
                int i2 = this.g.f;
                this.c = i2;
                return i2;
            }
            Object[] objArr = this.g.b;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    Object obj = this.f.get((-i) - 1);
                    int a = dzgv.a(obj.hashCode());
                    int i3 = this.g.d;
                    while (true) {
                        int i4 = a & i3;
                        if (obj.equals(objArr[i4])) {
                            return i4;
                        }
                        a = i4 + 1;
                        i3 = this.g.d;
                    }
                }
            } while (objArr[i] == null);
            this.c = i;
            return i;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.d != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void remove() {
        int i;
        Object obj;
        int i2 = this.c;
        if (i2 != -1) {
            dzqz dzqzVar = this.g;
            int i3 = dzqzVar.f;
            if (i2 == i3) {
                dzqzVar.e = false;
                dzqzVar.b[i3] = 0;
                dzqzVar.c[i3] = 0;
            } else {
                if (this.b >= 0) {
                    Object[] objArr = dzqzVar.b;
                    loop0: while (true) {
                        int i4 = (i2 + 1) & this.g.d;
                        while (true) {
                            obj = objArr[i4];
                            if (obj == null) {
                                break loop0;
                            }
                            int hashCode = obj.hashCode();
                            int i5 = this.g.d;
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
                            if (this.f == null) {
                                this.f = new dzrd(2);
                            }
                            this.f.add(objArr[i4]);
                        }
                        objArr[i2] = obj;
                        Object[] objArr2 = this.g.c;
                        objArr2[i2] = objArr2[i4];
                        i2 = i4;
                    }
                    objArr[i2] = null;
                    this.g.c[i2] = 0;
                } else {
                    dzqzVar.remove(this.f.set((-i) - 1, null));
                    this.c = -1;
                    return;
                }
            }
            dzqz dzqzVar2 = this.g;
            dzqzVar2.h--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
