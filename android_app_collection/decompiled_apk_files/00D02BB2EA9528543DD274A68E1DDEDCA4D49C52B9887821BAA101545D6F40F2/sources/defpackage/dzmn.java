package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzmn  reason: default package */
/* loaded from: classes.dex */
class dzmn {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzmt f;
    final /* synthetic */ dzmp g;

    public dzmn(dzmp dzmpVar) {
        this.g = dzmpVar;
        this.b = dzmpVar.e;
        this.d = dzmpVar.g;
        this.e = dzmpVar.d;
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
            long[] jArr = this.g.a;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    long f = this.f.f((-i) - 1);
                    int b = (int) dzgv.b(f);
                    int i3 = this.g.c;
                    while (true) {
                        int i4 = i3 & b;
                        if (f == jArr[i4]) {
                            return i4;
                        }
                        i3 = i4 + 1;
                        b = this.g.c;
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

    /* JADX WARN: Multi-variable type inference failed */
    public void remove() {
        int i;
        int i2;
        long j;
        int i3 = this.c;
        if (i3 != -1) {
            dzmp dzmpVar = this.g;
            int i4 = dzmpVar.e;
            if (i3 == i4) {
                dzmpVar.d = false;
                dzmpVar.b[i4] = 0;
            } else {
                if (this.b >= 0) {
                    long[] jArr = dzmpVar.a;
                    loop0: while (true) {
                        int i5 = i3 + 1;
                        int i6 = this.g.c;
                        while (true) {
                            i2 = i5 & i6;
                            j = jArr[i2];
                            if (j == 0) {
                                break loop0;
                            }
                            i6 = this.g.c;
                            int b = ((int) dzgv.b(j)) & i6;
                            if (i3 > i2) {
                                if (i3 >= b && b > i2) {
                                    break;
                                }
                                i5 = i2 + 1;
                            } else if (i3 >= b || b > i2) {
                                break;
                            } else {
                                i5 = i2 + 1;
                            }
                        }
                        if (i2 < i3) {
                            if (this.f == null) {
                                this.f = new dzmt(2);
                            }
                            this.f.b(jArr[i2]);
                        }
                        jArr[i3] = j;
                        Object[] objArr = this.g.b;
                        objArr[i3] = objArr[i2];
                        i3 = i2;
                    }
                    jArr[i3] = 0;
                    this.g.b[i3] = 0;
                } else {
                    dzmpVar.b(this.f.f((-i) - 1));
                    this.c = -1;
                    return;
                }
            }
            dzmp dzmpVar2 = this.g;
            dzmpVar2.g--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
