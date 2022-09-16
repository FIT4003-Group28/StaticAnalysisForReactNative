package defpackage;

import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agkk  reason: default package */
/* loaded from: classes.dex */
public final class agkk {
    private final agkj a;
    private final agqq b;
    private final HashSet c;
    private volatile agqr d;
    private volatile int e;
    private volatile int f = 0;
    private volatile int g;
    private volatile int h;

    public agkk(agkj agkjVar, agqq agqqVar) {
        this.a = agkjVar;
        this.b = agqqVar;
        this.c = new HashSet(agqqVar.b);
    }

    final synchronized int a() {
        return this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final agqr b() {
        if (this.d == null) {
            this.d = new agqr(a(), this.e);
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        zgh.m(str);
        this.c.add(str);
        this.a.d(str, this.b.a);
        this.f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        this.h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        if (this.c.remove(t)) {
            this.a.e(t, this.b.a);
            if (this.f > 0) {
                this.g = this.f - this.c.size();
                this.e = (this.g * 100) / this.f;
            }
            this.f--;
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        if (this.c.contains(t)) {
            int i = 1;
            if (!agqzVar.c()) {
                this.c.remove(t);
                this.a.e(t, this.b.a);
                if (agqzVar.b == avkl.TRANSFER_STATE_FAILED) {
                    this.h++;
                }
            }
            if (this.f > 0) {
                int size = this.f - this.c.size();
                if (size == this.f) {
                    this.e = 100;
                } else {
                    int i2 = (size * 100) / this.f;
                    if (agqzVar.c()) {
                        i2 += agqzVar.a() / this.f;
                    }
                    if (i2 != 0) {
                        i = i2;
                    } else if (agqzVar.d <= 0) {
                        i = 0;
                    }
                    int min = Math.min(99, i);
                    if (min > this.e) {
                        this.e = min;
                    }
                }
                this.g = size;
            }
            this.d = null;
        }
    }
}
