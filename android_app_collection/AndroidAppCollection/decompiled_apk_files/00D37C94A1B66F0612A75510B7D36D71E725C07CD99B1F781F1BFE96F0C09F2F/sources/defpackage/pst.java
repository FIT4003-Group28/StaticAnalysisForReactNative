package defpackage;

import android.util.Log;
import com.google.cardboard.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pst  reason: default package */
/* loaded from: classes4.dex */
public final class pst extends ptb {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private List r;
    private List s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final pwu k = new pwu();
    private final ArrayList p = new ArrayList();
    private pss q = new pss(0, 4);
    private int z = 0;
    private final long o = 16000000;

    public pst(String str, int i2) {
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.n = 0;
            } else if (i2 != 4) {
                Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.n = 0;
                this.m = 0;
                n(0);
                m();
                this.A = true;
                this.B = -9223372036854775807L;
            } else {
                this.n = 1;
            }
            this.m = 1;
            n(0);
            m();
            this.A = true;
            this.B = -9223372036854775807L;
        } else {
            this.n = 1;
        }
        this.m = 0;
        n(0);
        m();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private static char g(byte b) {
        return (char) f[b - 32];
    }

    private final List l() {
        int size = this.p.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            psg b = ((pss) this.p.get(i3)).b(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            arrayList.add(b);
            if (b != null) {
                i2 = Math.min(i2, b.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            psg psgVar = (psg) arrayList.get(i4);
            if (psgVar != null) {
                if (psgVar.j != i2) {
                    psgVar = ((pss) this.p.get(i4)).b(i2);
                    ptx.a(psgVar);
                }
                arrayList2.add(psgVar);
            }
        }
        return arrayList2;
    }

    private final void m() {
        this.q.e(this.t);
        this.p.clear();
        this.p.add(this.q);
    }

    private final void n(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                ((pss) this.p.get(i4)).g = 3;
            }
            return;
        }
        m();
        if (i3 != 3 && i2 != 1 && i2 != 0) {
            return;
        }
        this.r = Collections.emptyList();
    }

    private final void o(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private static boolean p(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.ptb
    protected final psk a() {
        List list = this.r;
        this.s = list;
        ptx.a(list);
        return new ptm(list, 1);
    }

    @Override // defpackage.ptb
    public final pso b() {
        pso psoVar;
        pso i2 = super.i();
        if (i2 == null) {
            long j2 = this.o;
            long j3 = this.B;
            if (j3 == -9223372036854775807L || this.c - j3 < j2 || (psoVar = (pso) this.b.pollFirst()) == null) {
                return null;
            }
            this.r = Collections.emptyList();
            this.B = -9223372036854775807L;
            psoVar.e(this.c, a(), Long.MAX_VALUE);
            return psoVar;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0015 A[SYNTHETIC] */
    @Override // defpackage.ptb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c(defpackage.psn r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pst.c(psn):void");
    }

    @Override // defpackage.ptb
    protected final boolean d() {
        return this.r != this.s;
    }

    @Override // defpackage.pmr
    public final String e() {
        throw null;
    }

    @Override // defpackage.ptb, defpackage.pmr
    public final void f() {
    }

    @Override // defpackage.ptb, defpackage.pmr
    public final /* bridge */ /* synthetic */ Object i() {
        return i();
    }

    @Override // defpackage.ptb, defpackage.pmr
    public final void j() {
        super.j();
        this.r = null;
        this.s = null;
        n(0);
        o(4);
        m();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }
}
