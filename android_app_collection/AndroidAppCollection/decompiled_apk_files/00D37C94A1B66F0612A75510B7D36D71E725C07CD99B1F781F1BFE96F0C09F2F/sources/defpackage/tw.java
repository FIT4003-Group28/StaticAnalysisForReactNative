package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: tw  reason: default package */
/* loaded from: classes4.dex */
public final class tw {
    final xn e;
    private final jk f = new jl(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int d = 0;
    final xa c = new xa(this);

    public tw(xn xnVar) {
        this.e = xnVar;
    }

    private final int m(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            tv tvVar = (tv) this.b.get(size);
            int i3 = tvVar.a;
            if (i3 == 8) {
                int i4 = tvVar.b;
                int i5 = tvVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            tvVar.b = i4 + 1;
                            tvVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            tvVar.b = i4 - 1;
                            tvVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        tvVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        tvVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        tvVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        tvVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = tvVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= tvVar.d;
                    } else if (i3 == 2) {
                        i += tvVar.d;
                    }
                } else if (i2 == 1) {
                    tvVar.b = i8 + 1;
                } else if (i2 == 2) {
                    tvVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                tv tvVar2 = (tv) this.b.get(size2);
                if (tvVar2.a == 8) {
                    int i9 = tvVar2.d;
                    if (i9 == tvVar2.b || i9 < 0) {
                        this.b.remove(size2);
                        h(tvVar2);
                    }
                } else if (tvVar2.d <= 0) {
                    this.b.remove(size2);
                    h(tvVar2);
                }
            } else {
                return i;
            }
        }
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
    private final void n(defpackage.tv r13) {
        /*
            r12 = this;
            int r0 = r13.a
            r1 = 1
            if (r0 == r1) goto L85
            r2 = 8
            if (r0 == r2) goto L85
            int r2 = r13.b
            int r0 = r12.m(r2, r0)
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
            int r9 = r12.m(r9, r10)
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
            tv r0 = r12.c(r10, r0, r8, r11)
            r12.f(r0, r2)
            r12.h(r0)
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
            r12.h(r13)
            if (r8 <= 0) goto L84
            int r13 = r13.a
            tv r13 = r12.c(r13, r0, r8, r1)
            r12.f(r13, r2)
            r12.h(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.n(tv):void");
    }

    private final void o(tv tvVar) {
        this.b.add(tvVar);
        int i = tvVar.a;
        if (i == 1) {
            this.e.d(tvVar.b, tvVar.d);
        } else if (i == 2) {
            xn xnVar = this.e;
            xnVar.a.Q(tvVar.b, tvVar.d, false);
            xnVar.a.N = true;
        } else if (i == 4) {
            this.e.c(tvVar.b, tvVar.d, tvVar.c);
        } else if (i == 8) {
            this.e.e(tvVar.b, tvVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + tvVar);
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            tv tvVar = (tv) this.b.get(i2);
            int i3 = tvVar.a;
            if (i3 == 8) {
                if (b(tvVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = tvVar.b;
                int i5 = tvVar.d + i4;
                while (i4 < i5) {
                    if (b(i4, i2 + 1) == i) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            tv tvVar = (tv) this.b.get(i2);
            int i3 = tvVar.a;
            if (i3 == 8) {
                int i4 = tvVar.b;
                if (i4 == i) {
                    i = tvVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (tvVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = tvVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = tvVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += tvVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final tv c(int i, int i2, int i3, Object obj) {
        tv tvVar = (tv) this.f.a();
        if (tvVar == null) {
            return new tv(i, i2, i3, obj);
        }
        tvVar.a = i;
        tvVar.b = i2;
        tvVar.d = i3;
        tvVar.c = obj;
        return tvVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.b((tv) this.b.get(i));
        }
        i(this.b);
        this.d = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            tv tvVar = (tv) this.a.get(i);
            int i2 = tvVar.a;
            if (i2 == 1) {
                this.e.b(tvVar);
                this.e.d(tvVar.b, tvVar.d);
            } else if (i2 == 2) {
                this.e.b(tvVar);
                this.e.f(tvVar.b, tvVar.d);
            } else if (i2 == 4) {
                this.e.b(tvVar);
                this.e.c(tvVar.b, tvVar.d, tvVar.c);
            } else if (i2 == 8) {
                this.e.b(tvVar);
                this.e.e(tvVar.b, tvVar.d);
            }
        }
        i(this.a);
        this.d = 0;
    }

    final void f(tv tvVar, int i) {
        this.e.b(tvVar);
        int i2 = tvVar.a;
        if (i2 == 2) {
            this.e.f(i, tvVar.d);
        } else if (i2 == 4) {
            this.e.c(i, tvVar.d, tvVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
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
    public final void g() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.g():void");
    }

    public final void h(tv tvVar) {
        tvVar.c = null;
        this.f.b(tvVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((tv) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.d = 0;
    }

    public final boolean k(int i) {
        return (i & this.d) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
