package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzlq  reason: default package */
/* loaded from: classes6.dex */
class dzlq {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzmt f;
    final /* synthetic */ dzls g;

    public dzlq(dzls dzlsVar) {
        this.g = dzlsVar;
        this.b = dzlsVar.f;
        this.d = dzlsVar.h;
        this.e = dzlsVar.e;
    }

    public final int c() {
        int i;
        if (hasNext()) {
            this.d--;
            if (this.e) {
                this.e = false;
                int i2 = this.g.f;
                this.c = i2;
                return i2;
            }
            long[] jArr = this.g.b;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    long f = this.f.f((-i) - 1);
                    int b = (int) dzgv.b(f);
                    int i3 = this.g.d;
                    while (true) {
                        int i4 = i3 & b;
                        if (f == jArr[i4]) {
                            return i4;
                        }
                        i3 = i4 + 1;
                        b = this.g.d;
                    }
                }
            } while (jArr[i] == 0);
            this.c = i;
            return i;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.d != 0;
    }

    public void remove() {
        int i;
        int i2;
        long j;
        int i3 = this.c;
        if (i3 != -1) {
            dzls dzlsVar = this.g;
            if (i3 == dzlsVar.f) {
                dzlsVar.e = false;
            } else {
                if (this.b >= 0) {
                    long[] jArr = dzlsVar.b;
                    loop0: while (true) {
                        int i4 = i3 + 1;
                        int i5 = this.g.d;
                        while (true) {
                            i2 = i4 & i5;
                            j = jArr[i2];
                            if (j == 0) {
                                break loop0;
                            }
                            i5 = this.g.d;
                            int b = ((int) dzgv.b(j)) & i5;
                            if (i3 > i2) {
                                if (i3 >= b && b > i2) {
                                    break;
                                }
                                i4 = i2 + 1;
                            } else if (i3 >= b || b > i2) {
                                break;
                            } else {
                                i4 = i2 + 1;
                            }
                        }
                        if (i2 < i3) {
                            if (this.f == null) {
                                this.f = new dzmt(2);
                            }
                            this.f.b(jArr[i2]);
                        }
                        jArr[i3] = j;
                        int[] iArr = this.g.c;
                        iArr[i3] = iArr[i2];
                        i3 = i2;
                    }
                    jArr[i3] = 0;
                } else {
                    dzlsVar.b(this.f.f((-i) - 1));
                    this.c = -1;
                    return;
                }
            }
            dzls dzlsVar2 = this.g;
            dzlsVar2.h--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
