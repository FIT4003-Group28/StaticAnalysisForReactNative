package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzjq  reason: default package */
/* loaded from: classes.dex */
class dzjq {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzjw f;
    final /* synthetic */ dzjs g;

    public dzjq(dzjs dzjsVar) {
        this.g = dzjsVar;
        this.b = dzjsVar.e;
        this.d = dzjsVar.g;
        this.e = dzjsVar.d;
    }

    public final int b() {
        int i;
        if (hasNext()) {
            this.d--;
            if (this.e) {
                this.e = false;
                int i2 = this.g.e;
                this.c = i2;
                return i2;
            }
            int[] iArr = this.g.a;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    int f = this.f.f((-i) - 1);
                    int a = dzgv.a(f);
                    int i3 = this.g.c;
                    while (true) {
                        int i4 = a & i3;
                        if (f == iArr[i4]) {
                            return i4;
                        }
                        a = i4 + 1;
                        i3 = this.g.c;
                    }
                }
            } while (iArr[i] == 0);
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
        int i2;
        int i3 = this.c;
        if (i3 != -1) {
            dzjs dzjsVar = this.g;
            int i4 = dzjsVar.e;
            if (i3 == i4) {
                dzjsVar.d = false;
                dzjsVar.b[i4] = 0;
            } else {
                if (this.b >= 0) {
                    int[] iArr = dzjsVar.a;
                    loop0: while (true) {
                        int i5 = (i3 + 1) & this.g.c;
                        while (true) {
                            i2 = iArr[i5];
                            if (i2 == 0) {
                                break loop0;
                            }
                            int i6 = this.g.c;
                            int a = dzgv.a(i2) & i6;
                            if (i3 > i5) {
                                if (i3 >= a && a > i5) {
                                    break;
                                }
                                i5 = (i5 + 1) & i6;
                            } else if (i3 >= a || a > i5) {
                                break;
                            } else {
                                i5 = (i5 + 1) & i6;
                            }
                        }
                        if (i5 < i3) {
                            if (this.f == null) {
                                this.f = new dzjw(2);
                            }
                            this.f.b(iArr[i5]);
                        }
                        iArr[i3] = i2;
                        Object[] objArr = this.g.b;
                        objArr[i3] = objArr[i5];
                        i3 = i5;
                    }
                    iArr[i3] = 0;
                    this.g.b[i3] = 0;
                } else {
                    dzjsVar.b(this.f.f((-i) - 1));
                    this.c = -1;
                    return;
                }
            }
            dzjs dzjsVar2 = this.g;
            dzjsVar2.g--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
