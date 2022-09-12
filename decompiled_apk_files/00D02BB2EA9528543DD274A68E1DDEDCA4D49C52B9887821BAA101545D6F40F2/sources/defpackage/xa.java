package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xa  reason: default package */
/* loaded from: classes.dex */
public final class xa {
    final abf e;
    private final my<wz> f = new mz(30);
    public final ArrayList<wz> a = new ArrayList<>();
    public final ArrayList<wz> b = new ArrayList<>();
    public int d = 0;
    final aau c = new aau(this);

    public xa(abf abfVar) {
        this.e = abfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r9 == (r0 + 1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m(defpackage.wz r13) {
        /*
            r12 = this;
            int r0 = r13.a
            r1 = 1
            if (r0 == r1) goto L85
            r2 = 8
            if (r0 == r2) goto L85
            int r2 = r13.b
            int r0 = r12.n(r2, r0)
            int r2 = r13.b
            int r3 = r13.a
            r4 = 2
            r5 = 0
            r6 = 4
            if (r3 == r4) goto L33
            if (r3 != r6) goto L1c
            r3 = 1
            goto L34
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            r3 = 0
        L34:
            r7 = 1
            r8 = 1
        L36:
            int r9 = r13.d
            if (r7 >= r9) goto L71
            int r9 = r13.b
            int r10 = r3 * r7
            int r9 = r9 + r10
            int r10 = r13.a
            int r9 = r12.n(r9, r10)
            int r10 = r13.a
            if (r10 == r4) goto L51
            if (r10 == r6) goto L4c
            goto L5b
        L4c:
            int r11 = r0 + 1
            if (r9 != r11) goto L55
            goto L53
        L51:
            if (r9 != r0) goto L55
        L53:
            r11 = 1
            goto L56
        L55:
            r11 = 0
        L56:
            if (r11 == 0) goto L5b
            int r8 = r8 + 1
            goto L6e
        L5b:
            java.lang.Object r11 = r13.c
            wz r0 = r12.j(r10, r0, r8, r11)
            r12.d(r0, r2)
            r12.k(r0)
            int r0 = r13.a
            if (r0 != r6) goto L6c
            int r2 = r2 + r8
        L6c:
            r0 = r9
            r8 = 1
        L6e:
            int r7 = r7 + 1
            goto L36
        L71:
            java.lang.Object r1 = r13.c
            r12.k(r13)
            if (r8 <= 0) goto L84
            int r13 = r13.a
            wz r13 = r12.j(r13, r0, r8, r1)
            r12.d(r13, r2)
            r12.k(r13)
        L84:
            return
        L85:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            goto L8e
        L8d:
            throw r13
        L8e:
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa.m(wz):void");
    }

    private final int n(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            wz wzVar = this.b.get(size);
            int i7 = wzVar.a;
            if (i7 == 8) {
                int i8 = wzVar.b;
                int i9 = wzVar.d;
                int i10 = i8 < i9 ? i9 : i8;
                int i11 = i8 < i9 ? i8 : i9;
                if (i < i11 || i > i10) {
                    if (i < i8) {
                        if (i2 == 1) {
                            wzVar.b = i8 + 1;
                            i3 = i9 + 1;
                        } else if (i2 == 2) {
                            wzVar.b = i8 - 1;
                            i3 = i9 - 1;
                        }
                        wzVar.d = i3;
                    }
                } else if (i11 == i8) {
                    if (i2 == 1) {
                        i4 = i9 + 1;
                    } else {
                        if (i2 == 2) {
                            i4 = i9 - 1;
                        }
                        i++;
                    }
                    wzVar.d = i4;
                    i++;
                } else {
                    if (i2 == 1) {
                        i5 = i8 + 1;
                    } else {
                        if (i2 == 2) {
                            i5 = i8 - 1;
                        }
                        i--;
                    }
                    wzVar.b = i5;
                    i--;
                }
            } else {
                int i12 = wzVar.b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i6 = i12 + 1;
                    } else if (i2 == 2) {
                        i6 = i12 - 1;
                    }
                    wzVar.b = i6;
                } else if (i7 == 1) {
                    i -= wzVar.d;
                } else if (i7 == 2) {
                    i += wzVar.d;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                wz wzVar2 = this.b.get(size2);
                if (wzVar2.a == 8) {
                    int i13 = wzVar2.d;
                    if (i13 == wzVar2.b || i13 < 0) {
                        this.b.remove(size2);
                        k(wzVar2);
                    }
                } else if (wzVar2.d <= 0) {
                    this.b.remove(size2);
                    k(wzVar2);
                }
            } else {
                return i;
            }
        }
    }

    private final boolean o(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            wz wzVar = this.b.get(i2);
            int i3 = wzVar.a;
            if (i3 == 8) {
                if (h(wzVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = wzVar.b;
                int i5 = wzVar.d + i4;
                while (i4 < i5) {
                    if (h(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private final void p(wz wzVar) {
        this.b.add(wzVar);
        int i = wzVar.a;
        if (i == 1) {
            this.e.e(wzVar.b, wzVar.d);
        } else if (i == 2) {
            abf abfVar = this.e;
            abfVar.a.S(wzVar.b, wzVar.d, false);
            abfVar.a.K = true;
        } else if (i == 4) {
            this.e.c(wzVar.b, wzVar.d, wzVar.c);
        } else if (i == 8) {
            this.e.f(wzVar.b, wzVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + wzVar);
        }
    }

    public final void a() {
        l(this.a);
        l(this.b);
        this.d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa.b():void");
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.d(this.b.get(i));
        }
        l(this.b);
        this.d = 0;
    }

    final void d(wz wzVar, int i) {
        this.e.d(wzVar);
        int i2 = wzVar.a;
        if (i2 == 2) {
            this.e.b(i, wzVar.d);
        } else if (i2 == 4) {
            this.e.c(i, wzVar.d, wzVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final boolean e() {
        return this.a.size() > 0;
    }

    public final boolean f(int i) {
        return (i & this.d) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(int i) {
        return h(i, 0);
    }

    final int h(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            wz wzVar = this.b.get(i2);
            int i3 = wzVar.a;
            if (i3 == 8) {
                int i4 = wzVar.b;
                if (i4 == i) {
                    i = wzVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (wzVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = wzVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = wzVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += wzVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final void i() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            wz wzVar = this.a.get(i);
            int i2 = wzVar.a;
            if (i2 == 1) {
                this.e.d(wzVar);
                this.e.e(wzVar.b, wzVar.d);
            } else if (i2 == 2) {
                this.e.d(wzVar);
                this.e.b(wzVar.b, wzVar.d);
            } else if (i2 == 4) {
                this.e.d(wzVar);
                this.e.c(wzVar.b, wzVar.d, wzVar.c);
            } else if (i2 == 8) {
                this.e.d(wzVar);
                this.e.f(wzVar.b, wzVar.d);
            }
        }
        l(this.a);
        this.d = 0;
    }

    public final wz j(int i, int i2, int i3, Object obj) {
        wz a = this.f.a();
        if (a == null) {
            return new wz(i, i2, i3, obj);
        }
        a.a = i;
        a.b = i2;
        a.d = i3;
        a.c = obj;
        return a;
    }

    public final void k(wz wzVar) {
        wzVar.c = null;
        this.f.b(wzVar);
    }

    final void l(List<wz> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k(list.get(i));
        }
        list.clear();
    }
}
