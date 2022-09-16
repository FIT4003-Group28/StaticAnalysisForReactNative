package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
/* compiled from: PG */
/* renamed from: clvw  reason: default package */
/* loaded from: classes5.dex */
public final class clvw implements clun {
    private final byte[] a;
    private final cmnk b;
    private final clut c;
    private clup d;
    private clvk e;
    private int f;
    private Metadata g;
    private cluz h;
    private int i;
    private int j;
    private clvu k;
    private int l;
    private long m;

    static {
        int i = clvv.a;
    }

    public clvw() {
        this(null);
    }

    private final long a(cmnk cmnkVar, boolean z) {
        boolean z2;
        cmmn.f(this.h);
        int i = cmnkVar.b;
        while (i <= cmnkVar.c - 16) {
            cmnkVar.f(i);
            if (cluu.a(cmnkVar, this.h, this.j, this.c)) {
                cmnkVar.f(i);
                return this.c.a;
            }
            i++;
        }
        if (!z) {
            cmnkVar.f(i);
            return -1L;
        }
        while (true) {
            int i2 = cmnkVar.c;
            if (i <= i2 - this.i) {
                cmnkVar.f(i);
                try {
                    z2 = cluu.a(cmnkVar, this.h, this.j, this.c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (cmnkVar.b <= cmnkVar.c && z2) {
                    cmnkVar.f(i);
                    return this.c.a;
                }
                i++;
            } else {
                cmnkVar.f(i2);
                return -1L;
            }
        }
    }

    private final void b() {
        long j = this.m;
        cluz cluzVar = this.h;
        int i = cmny.a;
        this.e.b((j * 1000000) / cluzVar.e, 1, this.l, 0, null);
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.d = clupVar;
        this.e = clupVar.RT(0);
        clupVar.RS();
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        cluw.b(clukVar, false);
        cmnk cmnkVar = new cmnk(4);
        clukVar.f(cmnkVar.a, 0, 4);
        return cmnkVar.p() == 1716281667;
    }

    public clvw(byte[] bArr) {
        this.a = new byte[42];
        this.b = new cmnk(new byte[32768], 0);
        this.c = new clut();
        this.f = 0;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f = 0;
        } else {
            clvu clvuVar = this.k;
            if (clvuVar != null) {
                clvuVar.a(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.m = j3;
        this.l = 0;
        this.b.a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c3 A[LOOP:0: B:69:0x017a->B:87:0x02c3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r25, defpackage.clvd r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clvw.g(cluk, clvd):int");
    }
}
