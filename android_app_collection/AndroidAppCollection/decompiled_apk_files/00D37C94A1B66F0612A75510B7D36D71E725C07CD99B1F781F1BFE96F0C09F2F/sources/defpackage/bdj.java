package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: bdj  reason: default package */
/* loaded from: classes2.dex */
final class bdj {
    public final bab a;
    public final byte[] d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public final boolean b = false;
    public final boolean c = false;
    private final SparseArray n = new SparseArray();
    private final SparseArray o = new SparseArray();
    public final jb m = new jb();

    public bdj(bab babVar) {
        this.a = babVar;
        byte[] bArr = new byte[128];
        this.d = bArr;
        new pwv(bArr, 0, 0);
        c();
    }

    public final void a(pwm pwmVar) {
        this.o.append(pwmVar.a, pwmVar);
    }

    public final void b(pwn pwnVar) {
        this.n.append(pwnVar.d, pwnVar);
    }

    public final void c() {
        this.g = false;
        this.i = false;
    }
}
