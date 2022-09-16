package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: agki  reason: default package */
/* loaded from: classes.dex */
public final class agki {
    private final agkh a;
    private final HashSet b;
    private volatile agqj c;
    private volatile int d;

    public agki(agkh agkhVar, HashSet hashSet) {
        this.a = agkhVar;
        this.b = new HashSet(hashSet);
    }

    final synchronized int a() {
        return this.b.size();
    }

    public final agqj b() {
        if (this.c == null) {
            this.c = new agqj(this.a.a(), a(), this.d);
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        zgh.m(str);
        this.b.add(str);
        this.a.d(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        int i = 0;
        if (this.b.contains(t)) {
            if (!agqzVar.c()) {
                this.b.remove(t);
                if (this.b.isEmpty()) {
                    this.a.c().clear();
                }
            }
            int a = this.a.a();
            if (a > 0) {
                int size = a - this.b.size();
                if (size == a) {
                    this.d = 100;
                } else {
                    int i2 = (size * 100) / a;
                    if (agqzVar.c()) {
                        i2 += agqzVar.a() / a;
                    }
                    if (i2 != 0) {
                        i = i2;
                    } else if (agqzVar.d > 0) {
                        i = 1;
                    }
                    this.d = Math.min(99, i);
                }
            }
            this.c = null;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        if (this.b.remove(t)) {
            this.a.e(t);
            this.c = null;
        }
    }
}
