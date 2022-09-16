package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ouj  reason: default package */
/* loaded from: classes4.dex */
public abstract class ouj extends ouo {
    private final ouh[] a = new ouh[1];
    private int[] b;
    private int[] c;
    private ouh d;
    private int e;
    private long f;

    public ouj(oui... ouiVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.a[i] = ouiVarArr[i].f();
        }
    }

    private final long l(long j) {
        long d = this.d.d(this.e);
        if (d != Long.MIN_VALUE) {
            r(d);
            return d;
        }
        return j;
    }

    private static final void n(ouh ouhVar) {
        try {
            ouhVar.i();
        } catch (IOException e) {
            throw new osx(e);
        }
    }

    protected abstract void A(long j, long j2, boolean z);

    protected abstract boolean E(MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int J(long j, oue oueVar, oug ougVar) {
        return this.d.b(this.e, j, oueVar, ougVar);
    }

    protected long K(long j) {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void L() {
        for (int i = 0; i <= 0; i++) {
            this.a[i].j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public long b() {
        return this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final long c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final MediaFormat d(int i) {
        return this.a[this.b[i]].e(this.c[i]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void e(long j, long j2) {
        long K = K(j);
        A(l(K), j2, this.d.l(this.e, K));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void f() {
        ouh ouhVar = this.d;
        if (ouhVar != null) {
            n(ouhVar);
            return;
        }
        for (int i = 0; i <= 0; i++) {
            n(this.a[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void g(long j) {
        long K = K(j);
        this.d.k(K);
        l(K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean j() {
        boolean z = true;
        for (char c = 0; c <= 0; c = 1) {
            z &= this.a[0].m();
        }
        if (z) {
            int i = 0;
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                i += this.a[0].a();
            }
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            long j = 0;
            int i2 = 0;
            for (char c3 = 0; c3 <= 0; c3 = 1) {
                ouh ouhVar = this.a[0];
                int a = ouhVar.a();
                for (int i3 = 0; i3 < a; i3++) {
                    MediaFormat e = ouhVar.e(i3);
                    try {
                        if (E(e)) {
                            iArr[i2] = 0;
                            iArr2[i2] = i3;
                            i2++;
                            if (j != -1) {
                                long j2 = e.e;
                                if (j2 == -1) {
                                    j = -1;
                                } else if (j2 != -2) {
                                    j = Math.max(j, j2);
                                }
                            }
                        }
                    } catch (otu e2) {
                        throw new osx(e2);
                    }
                }
            }
            this.f = j;
            this.b = Arrays.copyOf(iArr, i2);
            this.c = Arrays.copyOf(iArr2, i2);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final int pN() {
        return this.c.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public void pO(int i, long j, boolean z) {
        long K = K(j);
        ouh ouhVar = this.a[this.b[i]];
        this.d = ouhVar;
        int i2 = this.c[i];
        this.e = i2;
        ouhVar.h(i2, K);
        r(K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public void q() {
        this.d.g(this.e);
        this.d = null;
    }

    protected abstract void r(long j);
}
