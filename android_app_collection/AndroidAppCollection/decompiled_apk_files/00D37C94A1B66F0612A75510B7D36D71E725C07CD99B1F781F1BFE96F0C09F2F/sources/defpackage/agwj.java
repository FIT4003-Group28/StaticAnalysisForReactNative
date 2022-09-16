package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: agwj  reason: default package */
/* loaded from: classes.dex */
public final class agwj {
    private final agwi a;
    private final agqf b;
    private final HashSet c;
    private volatile agqg d;
    private volatile int e;
    private volatile int f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private volatile boolean k;

    public agwj(agwi agwiVar, agqf agqfVar) {
        this.a = agwiVar;
        this.b = agqfVar;
        this.c = new HashSet(agqfVar.f);
    }

    public final synchronized int a() {
        return this.c.size();
    }

    public final synchronized int b() {
        return this.h;
    }

    public final agqg c() {
        if (this.d == null) {
            this.d = new agqg(this.b, a(), b(), this.j, this.e, this.f, this.g, this.k);
        }
        return this.d;
    }

    public final synchronized HashSet d() {
        return this.c;
    }

    public final synchronized void e(String str) {
        zgh.m(str);
        this.c.add(str);
        this.a.d(str, this.b.a);
    }

    public final synchronized void f() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public final synchronized void g() {
        this.k = false;
        this.j = 0;
    }

    public final synchronized void h(int i) {
        this.h = i;
    }

    public final synchronized boolean i(agqz agqzVar) {
        boolean z;
        String t = agxg.t(agqzVar.f);
        if (this.c.remove(t)) {
            this.a.f(t, this.b.a);
            int i = this.b.f;
            if (i > 0) {
                this.i = i - this.c.size();
                this.e = this.f;
                this.f = (this.i * 100) / this.b.f;
            }
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean j(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        int i = 0;
        if (this.c.contains(t)) {
            if (!agqzVar.c()) {
                this.c.remove(t);
                this.a.f(t, this.b.a);
                if (agqzVar.b == avkl.TRANSFER_STATE_FAILED) {
                    this.k = true;
                    this.j++;
                }
            }
            int i2 = this.b.f;
            if (i2 > 0) {
                int size = i2 - this.c.size();
                int i3 = this.b.f;
                if (size == i3) {
                    this.e = this.f;
                    this.f = 100;
                } else {
                    int i4 = (size * 100) / i3;
                    if (agqzVar.c()) {
                        i4 += agqzVar.a() / this.b.f;
                    }
                    if (i4 == 0) {
                        i4 = agqzVar.d > 0 ? 1 : 0;
                    }
                    int min = Math.min(99, i4);
                    if (min > this.f) {
                        this.e = this.f;
                        this.f = min;
                    }
                }
                this.i = size;
            }
            int i5 = this.b.f - this.h;
            if (i5 > 0) {
                int size2 = i5 - this.c.size();
                if (size2 == i5) {
                    this.g = 100;
                } else {
                    int i6 = (size2 * 100) / i5;
                    if (agqzVar.c()) {
                        i6 += agqzVar.a() / i5;
                    }
                    if (i6 != 0) {
                        i = i6;
                    } else if (agqzVar.d > 0) {
                        i = 1;
                    }
                    int min2 = Math.min(99, i);
                    if (min2 > this.g) {
                        this.g = min2;
                    }
                }
                this.i = size2 + this.h;
            }
            this.d = null;
            return true;
        }
        return false;
    }
}
