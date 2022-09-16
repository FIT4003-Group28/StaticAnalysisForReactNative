package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmfg  reason: default package */
/* loaded from: classes5.dex */
final class cmfg {
    public final cmnk a = new cmnk(32);
    public cmff b;
    public cmff c;
    public cmff d;
    public long e;
    public final cmkk f;

    public cmfg(cmkk cmkkVar) {
        this.f = cmkkVar;
        cmff cmffVar = new cmff(0L);
        this.b = cmffVar;
        this.c = cmffVar;
        this.d = cmffVar;
    }

    private final void f(long j) {
        while (true) {
            cmff cmffVar = this.c;
            if (j >= cmffVar.b) {
                this.c = cmffVar.e;
            } else {
                return;
            }
        }
    }

    public final void a(long j) {
        cmff cmffVar;
        if (j != -1) {
            while (true) {
                cmffVar = this.b;
                if (j < cmffVar.b) {
                    break;
                }
                this.f.d(cmffVar.d);
                this.b = this.b.b();
            }
            if (this.c.a >= cmffVar.a) {
                return;
            }
            this.c = cmffVar;
        }
    }

    public final void b(long j, ByteBuffer byteBuffer, int i) {
        f(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.c.b - j));
            cmff cmffVar = this.c;
            byteBuffer.put(cmffVar.d.a, cmffVar.a(j), min);
            i -= min;
            j += min;
            cmff cmffVar2 = this.c;
            if (j == cmffVar2.b) {
                this.c = cmffVar2.e;
            }
        }
    }

    public final void c(long j, byte[] bArr, int i) {
        f(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.c.b - j));
            cmff cmffVar = this.c;
            System.arraycopy(cmffVar.d.a, cmffVar.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            cmff cmffVar2 = this.c;
            if (j == cmffVar2.b) {
                this.c = cmffVar2.e;
            }
        }
    }

    public final int d(int i) {
        cmff cmffVar = this.d;
        if (!cmffVar.c) {
            cmjs c = this.f.c();
            cmff cmffVar2 = new cmff(this.d.b);
            cmffVar.d = c;
            cmffVar.e = cmffVar2;
            cmffVar.c = true;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void e(int i) {
        long j = this.e + i;
        this.e = j;
        cmff cmffVar = this.d;
        if (j == cmffVar.b) {
            this.d = cmffVar.e;
        }
    }
}
