package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dziq  reason: default package */
/* loaded from: classes6.dex */
class dziq {
    int b;
    int c = -1;
    int d;
    boolean e;
    dzjw f;
    final /* synthetic */ dzis g;

    public dziq(dzis dzisVar) {
        this.g = dzisVar;
        this.b = dzisVar.f;
        this.d = dzisVar.h;
        this.e = dzisVar.e;
    }

    public final int b() {
        int i;
        if (hasNext()) {
            this.d--;
            if (this.e) {
                this.e = false;
                int i2 = this.g.f;
                this.c = i2;
                return i2;
            }
            int[] iArr = this.g.b;
            do {
                i = this.b - 1;
                this.b = i;
                if (i < 0) {
                    this.c = Integer.MIN_VALUE;
                    int f = this.f.f((-i) - 1);
                    int a = dzgv.a(f);
                    int i3 = this.g.d;
                    while (true) {
                        int i4 = a & i3;
                        if (f == iArr[i4]) {
                            return i4;
                        }
                        a = i4 + 1;
                        i3 = this.g.d;
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

    public void remove() {
        int i;
        int i2;
        int i3 = this.c;
        if (i3 != -1) {
            dzis dzisVar = this.g;
            if (i3 == dzisVar.f) {
                dzisVar.e = false;
            } else {
                if (this.b >= 0) {
                    int[] iArr = dzisVar.b;
                    loop0: while (true) {
                        int i4 = (i3 + 1) & this.g.d;
                        while (true) {
                            i2 = iArr[i4];
                            if (i2 == 0) {
                                break loop0;
                            }
                            int i5 = this.g.d;
                            int a = dzgv.a(i2) & i5;
                            if (i3 > i4) {
                                if (i3 >= a && a > i4) {
                                    break;
                                }
                                i4 = (i4 + 1) & i5;
                            } else if (i3 >= a || a > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        }
                        if (i4 < i3) {
                            if (this.f == null) {
                                this.f = new dzjw(2);
                            }
                            this.f.b(iArr[i4]);
                        }
                        iArr[i3] = i2;
                        int[] iArr2 = this.g.c;
                        iArr2[i3] = iArr2[i4];
                        i3 = i4;
                    }
                    iArr[i3] = 0;
                } else {
                    dzisVar.b(this.f.f((-i) - 1));
                    this.c = -1;
                    return;
                }
            }
            dzis dzisVar2 = this.g;
            dzisVar2.h--;
            this.c = -1;
            return;
        }
        throw new IllegalStateException();
    }
}
