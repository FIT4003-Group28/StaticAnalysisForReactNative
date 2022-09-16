package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: bbf  reason: default package */
/* loaded from: classes2.dex */
public final class bbf implements aze {
    public boolean a;
    private final pwu b;
    private final azt c;
    private final azp d;
    private final azr e;
    private final bab f;
    private azh g;
    private bab h;
    private bab i;
    private int j;
    private Metadata k;
    private long l;
    private long m;
    private long n;
    private int o;
    private bbg p;

    public bbf() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(defpackage.azf r40) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbf.a(azf):int");
    }

    private final long b(long j) {
        return this.l + ((j * 1000000) / this.c.d);
    }

    private final bbg c(azf azfVar) {
        azfVar.j(this.b.a, 0, 4);
        this.b.G(0);
        this.c.a(this.b.d());
        aza azaVar = (aza) azfVar;
        long j = azaVar.b;
        long j2 = azaVar.c;
        azt aztVar = this.c;
        return new ayz(j, j2, aztVar.f, aztVar.c);
    }

    private static boolean i(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean j(azf azfVar) {
        bbg bbgVar = this.p;
        if (bbgVar != null) {
            long e = bbgVar.e();
            if (e != -1 && azfVar.d() > e - 4) {
                return true;
            }
        }
        try {
            return !azfVar.o(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean k(azf azfVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = true != z ? 131072 : 32768;
        azfVar.l();
        if (((aza) azfVar).c == 0) {
            Metadata a2 = this.e.a(azfVar, null);
            this.k = a2;
            if (a2 != null) {
                this.d.b(a2);
            }
            i2 = (int) azfVar.d();
            if (!z) {
                azfVar.m(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!j(azfVar)) {
                this.b.G(0);
                int d = this.b.d();
                if ((i == 0 || i(d, i)) && (a = azu.a(d)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(d);
                        i = d;
                    }
                    azfVar.f(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (!z) {
                            throw pjq.a("Searched too many bytes.", null);
                        }
                        return false;
                    }
                    if (z) {
                        azfVar.l();
                        azfVar.f(i2 + i6);
                    } else {
                        azfVar.m(1);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            azfVar.m(i2 + i5);
        } else {
            azfVar.l();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        ptx.b(this.h);
        int i = pxi.a;
        int a = a(azfVar);
        if (a == -1 && (this.p instanceof bbd)) {
            if (this.p.a() != b(this.m)) {
                bbd bbdVar = (bbd) this.p;
                throw null;
            }
        }
        return a;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.g = azhVar;
        bab pT = azhVar.pT(0, 1);
        this.h = pT;
        this.i = pT;
        this.g.b();
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.o = 0;
        bbg bbgVar = this.p;
        if (!(bbgVar instanceof bbd)) {
            return;
        }
        bbd bbdVar = (bbd) bbgVar;
        throw null;
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        return k(azfVar, true);
    }

    public bbf(byte[] bArr) {
        this.b = new pwu(10);
        this.c = new azt();
        this.d = new azp();
        this.l = -9223372036854775807L;
        this.e = new azr();
        azd azdVar = new azd();
        this.f = azdVar;
        this.i = azdVar;
    }
}
