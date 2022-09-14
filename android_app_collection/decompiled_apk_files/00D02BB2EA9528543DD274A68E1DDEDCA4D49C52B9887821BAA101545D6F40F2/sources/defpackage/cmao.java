package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cmao  reason: default package */
/* loaded from: classes5.dex */
final class cmao implements cmap {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final clup c;
    private final clvk d;
    private final cmas e;
    private final int f;
    private final byte[] g;
    private final cmnk h;
    private final int i;
    private final Format j;
    private int k;
    private long l;
    private int m;
    private long n;

    public cmao(clup clupVar, clvk clvkVar, cmas cmasVar) {
        this.c = clupVar;
        this.d = clvkVar;
        this.e = cmasVar;
        int max = Math.max(1, cmasVar.c / 10);
        this.i = max;
        cmnk cmnkVar = new cmnk(cmasVar.f);
        cmnkVar.n();
        int n = cmnkVar.n();
        this.f = n;
        int i = cmasVar.b;
        int i2 = (((cmasVar.d - (i * 4)) * 8) / (cmasVar.e * i)) + 1;
        if (n != i2) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(n);
            throw new clob(sb.toString());
        }
        int A = cmny.A(max, n);
        this.g = new byte[cmasVar.d * A];
        this.h = new cmnk(A * (n + n) * i);
        int i3 = ((cmasVar.c * cmasVar.d) * 8) / n;
        clnf clnfVar = new clnf();
        clnfVar.k = "audio/raw";
        clnfVar.f = i3;
        clnfVar.g = i3;
        clnfVar.l = (max + max) * i;
        clnfVar.x = cmasVar.b;
        clnfVar.y = cmasVar.c;
        clnfVar.z = 2;
        this.j = clnfVar.a();
    }

    private final void d(int i) {
        long j = this.l;
        long E = cmny.E(this.n, 1000000L, this.e.c);
        int f = f(i);
        this.d.b(j + E, 1, f, this.m - f, null);
        this.n += i;
        this.m -= f;
    }

    private final int e(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int f(int i) {
        return (i + i) * this.e.b;
    }

    @Override // defpackage.cmap
    public final void a(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    @Override // defpackage.cmap
    public final void b(int i, long j) {
        this.c.b(new cmav(this.e, this.f, i, j));
        this.d.a(this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // defpackage.cmap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.cluk r20, long r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmao.c(cluk, long):boolean");
    }
}
