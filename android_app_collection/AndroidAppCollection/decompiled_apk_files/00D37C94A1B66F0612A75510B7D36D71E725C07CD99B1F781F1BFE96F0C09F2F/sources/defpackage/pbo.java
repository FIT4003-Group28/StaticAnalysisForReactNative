package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pbo  reason: default package */
/* loaded from: classes4.dex */
public final class pbo {
    public final int a;
    private int b;
    private int c;
    private anuf[] d;

    public pbo(int i) {
        pce.b(i > 0);
        pce.b(true);
        this.a = i;
        this.c = 0;
        this.d = new anuf[100];
    }

    public final synchronized int a() {
        return this.b * this.a;
    }

    public final synchronized void b(int i) {
        while (a() > i) {
            wait();
        }
    }

    public final synchronized void c(int i) {
        int max = Math.max(0, pcx.a(i, this.a) - this.b);
        int i2 = this.c;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.d, max, i2, (Object) null);
        this.c = max;
    }

    public final synchronized anuf d() {
        anuf anufVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            anuf[] anufVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            anufVar = anufVarArr[i2];
            anufVarArr[i2] = null;
        } else {
            anufVar = new anuf(new byte[this.a]);
        }
        return anufVar;
    }

    public final synchronized void e(anuf anufVar) {
        byte[] bArr = anufVar.a;
        boolean z = true;
        if (bArr != null && bArr.length != this.a) {
            z = false;
        }
        pce.b(z);
        this.b--;
        int i = this.c;
        anuf[] anufVarArr = this.d;
        int length = anufVarArr.length;
        if (i == length) {
            this.d = (anuf[]) Arrays.copyOf(anufVarArr, length + length);
        }
        anuf[] anufVarArr2 = this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        anufVarArr2[i2] = anufVar;
        notifyAll();
    }

    public final synchronized void f(anuf[] anufVarArr) {
        int length = this.c + anufVarArr.length;
        anuf[] anufVarArr2 = this.d;
        int length2 = anufVarArr2.length;
        if (length >= length2) {
            this.d = (anuf[]) Arrays.copyOf(anufVarArr2, Math.max(length2 + length2, length));
        }
        for (anuf anufVar : anufVarArr) {
            byte[] bArr = anufVar.a;
            boolean z = true;
            if (bArr != null && bArr.length != this.a) {
                z = false;
            }
            pce.b(z);
            anuf[] anufVarArr3 = this.d;
            int i = this.c;
            this.c = i + 1;
            anufVarArr3[i] = anufVar;
        }
        this.b -= anufVarArr.length;
        notifyAll();
    }
}
