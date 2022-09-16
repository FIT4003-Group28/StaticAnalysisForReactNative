package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ans  reason: default package */
/* loaded from: classes.dex */
public final class ans {
    private int a = 1;
    private final aob b;
    private aob c;
    private aob d;
    private int e;
    private int f;
    private final boolean g;
    private final int[] h;

    public ans(aob aobVar, boolean z, int[] iArr) {
        this.b = aobVar;
        this.c = aobVar;
        this.g = z;
        this.h = iArr;
    }

    private static boolean e(int i) {
        return i == 65039;
    }

    private final boolean f() {
        bmq e = this.c.a.e();
        int a = e.a(6);
        if ((a == 0 || e.b.get(a + e.a) == 0) && !e(this.e)) {
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.a.a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private final void g() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final int a(int i) {
        aob a = this.c.a(i);
        int i2 = 3;
        if (this.a == 2) {
            if (a != null) {
                this.c = a;
                this.f++;
            } else {
                if (i == 65038) {
                    g();
                } else if (!e(i)) {
                    aob aobVar = this.c;
                    if (aobVar.a == null) {
                        g();
                    } else if (this.f == 1) {
                        if (f()) {
                            this.d = this.c;
                            g();
                        } else {
                            g();
                        }
                    } else {
                        this.d = aobVar;
                        g();
                    }
                }
                i2 = 1;
            }
            i2 = 2;
        } else if (a == null) {
            g();
            i2 = 1;
        } else {
            this.a = 2;
            this.c = a;
            this.f = 1;
            i2 = 2;
        }
        this.e = i;
        return i2;
    }

    public final anq b() {
        return this.c.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anq c() {
        return this.d.a;
    }

    public final boolean d() {
        return this.a == 2 && this.c.a != null && (this.f > 1 || f());
    }
}
