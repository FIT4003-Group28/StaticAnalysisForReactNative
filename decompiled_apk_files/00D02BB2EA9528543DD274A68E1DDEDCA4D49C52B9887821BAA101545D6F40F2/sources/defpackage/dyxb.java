package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dyxb  reason: default package */
/* loaded from: classes6.dex */
public final class dyxb {
    final eaiz a;
    final int b;
    int c;
    int d;
    dywk e;
    boolean f;
    final /* synthetic */ dyxd g;

    public dyxb(dyxd dyxdVar, int i, int i2) {
        this.g = dyxdVar;
        this.f = false;
        this.b = i;
        this.c = i2;
        this.a = new eaiz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return Math.max(0, Math.min(this.c, (int) this.a.b)) - this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return Math.min(this.c, this.g.d.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.b > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(eaiz eaizVar, int i, boolean z) {
        do {
            int min = Math.min(i, ((dyyh) ((dywa) this.g.b).b).a);
            int i2 = -min;
            this.g.d.f(i2);
            f(i2);
            try {
                boolean z2 = eaizVar.b == ((long) min) && z;
                dyxz dyxzVar = this.g.b;
                int i3 = this.b;
                ((dywa) dyxzVar).c.b(2, i3, eaizVar, min, z2);
                try {
                    ((dywa) dyxzVar).b.e(z2, i3, eaizVar, min);
                } catch (IOException e) {
                    ((dywa) dyxzVar).a.a(e);
                }
                this.e.h.m(min);
                i -= min;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, dyxc dyxcVar) {
        int min = Math.min(i, b());
        int i2 = 0;
        while (c() && min > 0) {
            eaiz eaizVar = this.a;
            long j = eaizVar.b;
            if (min >= j) {
                int i3 = (int) j;
                i2 += i3;
                d(eaizVar, i3, this.f);
            } else {
                i2 += min;
                d(eaizVar, min, false);
            }
            dyxcVar.a++;
            min = Math.min(i - i2, b());
        }
    }

    public final void f(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.c) {
            this.c += i;
            return;
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("Window size overflow for stream: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public dyxb(dyxd dyxdVar, dywk dywkVar, int i) {
        this(dyxdVar, dywkVar.g, i);
        this.e = dywkVar;
    }
}
