package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzor  reason: default package */
/* loaded from: classes6.dex */
class dzor {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzrd f;
    final /* synthetic */ dzot g;

    public dzor(dzot dzotVar) {
        this.g = dzotVar;
        this.b = dzotVar.e;
        this.d = dzotVar.g;
        this.e = dzotVar.d;
    }

    public final int a() {
        int i;
        if (hasNext()) {
            this.d--;
            if (this.e) {
                this.e = false;
                int i2 = this.g.e;
                this.c = i2;
                return i2;
            }
            Object[] objArr = this.g.a;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    Object obj = this.f.get((-i) - 1);
                    int a = dzgv.a(obj.hashCode());
                    int i3 = this.g.c;
                    while (true) {
                        int i4 = a & i3;
                        if (obj.equals(objArr[i4])) {
                            return i4;
                        }
                        a = i4 + 1;
                        i3 = this.g.c;
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
            dzot dzotVar = this.g;
            int i3 = dzotVar.e;
            if (i2 == i3) {
                dzotVar.d = false;
                dzotVar.a[i3] = 0;
            } else {
                if (this.b >= 0) {
                    Object[] objArr = dzotVar.a;
                    loop0: while (true) {
                        int i4 = (i2 + 1) & this.g.c;
                        while (true) {
                            obj = objArr[i4];
                            if (obj == null) {
                                break loop0;
                            }
                            int hashCode = obj.hashCode();
                            int i5 = this.g.c;
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
                        boolean[] zArr = this.g.b;
                        zArr[i2] = zArr[i4];
                        i2 = i4;
                    }
                    objArr[i2] = null;
                } else {
                    dzotVar.b(this.f.set((-i) - 1, null));
                    this.c = -1;
                    return;
                }
            }
            dzot dzotVar2 = this.g;
            dzotVar2.g--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}