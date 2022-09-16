package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axf  reason: default package */
/* loaded from: classes2.dex */
public final class axf {
    public final int a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final ozi[] f;
    private ozi[] g;

    public axf(boolean z, int i) {
        ptx.c(i > 0);
        ptx.c(true);
        this.b = z;
        this.a = i;
        this.e = 0;
        this.g = new ozi[100];
        this.f = new ozi[1];
    }

    public final synchronized int a() {
        return this.d * this.a;
    }

    public final synchronized void b() {
        if (this.b) {
            c(0);
        }
    }

    public final synchronized void c(int i) {
        int i2 = this.c;
        this.c = i;
        if (i < i2) {
            d();
        }
    }

    public final synchronized void d() {
        int max = Math.max(0, pxi.b(this.c, this.a) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.g, max, i, (Object) null);
        this.e = max;
    }

    public final synchronized ozi e() {
        ozi oziVar;
        this.d++;
        int i = this.e;
        if (i > 0) {
            ozi[] oziVarArr = this.g;
            int i2 = i - 1;
            this.e = i2;
            oziVar = oziVarArr[i2];
            ptx.a(oziVar);
            this.g[this.e] = null;
        } else {
            oziVar = new ozi(new byte[this.a]);
        }
        return oziVar;
    }

    public final synchronized void f(ozi oziVar) {
        ozi[] oziVarArr = this.f;
        oziVarArr[0] = oziVar;
        g(oziVarArr);
    }

    public final synchronized void g(ozi[] oziVarArr) {
        int length = this.e + oziVarArr.length;
        ozi[] oziVarArr2 = this.g;
        int length2 = oziVarArr2.length;
        if (length >= length2) {
            this.g = (ozi[]) Arrays.copyOf(oziVarArr2, Math.max(length2 + length2, length));
        }
        for (ozi oziVar : oziVarArr) {
            ozi[] oziVarArr3 = this.g;
            int i = this.e;
            this.e = i + 1;
            oziVarArr3[i] = oziVar;
        }
        this.d -= oziVarArr.length;
        notifyAll();
    }
}
