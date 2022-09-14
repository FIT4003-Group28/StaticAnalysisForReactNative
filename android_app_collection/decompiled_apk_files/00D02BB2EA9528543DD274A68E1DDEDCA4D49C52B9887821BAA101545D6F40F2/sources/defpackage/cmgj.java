package defpackage;

import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgj  reason: default package */
/* loaded from: classes5.dex */
public final class cmgj extends cmgs {
    private boolean A;
    private long B;
    private final int l;
    private final int m;
    private final int n;
    private List<cmfw> r;
    private List<cmfw> s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private byte x;
    private byte y;
    private static final int[] d = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] f = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, R.styleable.AppCompatTheme_switchStyle, 102, R.styleable.AppCompatTheme_textAppearanceListItem, 104, 105, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};
    private static final int[] g = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final cmnk k = new cmnk();
    private final ArrayList<cmgi> p = new ArrayList<>();
    private cmgi q = new cmgi(0, 4);
    private int z = 0;
    private final long o = 16000000;

    public cmgj(String str, int i2) {
        this.l = true != "application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.n = 0;
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.n = 0;
            } else if (i2 != 4) {
                this.n = 0;
                this.m = 0;
                k(0);
                n();
                this.A = true;
                this.B = -9223372036854775807L;
            } else {
                this.n = 1;
            }
            this.m = 1;
            k(0);
            n();
            this.A = true;
            this.B = -9223372036854775807L;
        } else {
            this.n = 1;
        }
        this.m = 0;
        k(0);
        n();
        this.A = true;
        this.B = -9223372036854775807L;
    }

    private final List<cmfw> j() {
        int size = this.p.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            cmfw f2 = this.p.get(i3).f(Integer.MIN_VALUE);
            arrayList.add(f2);
            if (f2 != null) {
                i2 = Math.min(i2, f2.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            cmfw cmfwVar = (cmfw) arrayList.get(i4);
            if (cmfwVar != null) {
                if (cmfwVar.i != i2) {
                    cmfwVar = this.p.get(i4).f(i2);
                    cmmn.f(cmfwVar);
                }
                arrayList2.add(cmfwVar);
            }
        }
        return arrayList2;
    }

    private final void k(int i2) {
        int i3 = this.t;
        if (i3 == i2) {
            return;
        }
        this.t = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.p.size(); i4++) {
                this.p.get(i4).g = 3;
            }
            return;
        }
        n();
        if (i3 != 3 && i2 != 1 && i2 != 0) {
            return;
        }
        this.r = Collections.emptyList();
    }

    private final void m(int i2) {
        this.u = i2;
        this.q.h = i2;
    }

    private final void n() {
        this.q.a(this.t);
        this.p.clear();
        this.p.add(this.q);
    }

    private static char o(byte b) {
        return (char) f[b - 32];
    }

    private static boolean p(byte b) {
        return (b & 224) == 0;
    }

    @Override // defpackage.cmgs, defpackage.cltd
    public final /* bridge */ /* synthetic */ cmge c() {
        return c();
    }

    @Override // defpackage.cmgs, defpackage.cltd
    public final void d() {
        super.d();
        this.r = null;
        this.s = null;
        k(0);
        m(4);
        n();
        this.v = false;
        this.w = false;
        this.x = (byte) 0;
        this.y = (byte) 0;
        this.z = 0;
        this.A = true;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.cmgs, defpackage.cltd
    public final void e() {
    }

    @Override // defpackage.cmgs
    public final cmge f() {
        cmge pollFirst;
        cmge c = super.c();
        if (c == null) {
            long j2 = this.o;
            long j3 = this.B;
            if (j3 == -9223372036854775807L || this.c - j3 < j2 || (pollFirst = this.b.pollFirst()) == null) {
                return null;
            }
            this.r = Collections.emptyList();
            this.B = -9223372036854775807L;
            pollFirst.e(this.c, h(), Long.MAX_VALUE);
            return pollFirst;
        }
        return c;
    }

    @Override // defpackage.cmgs
    protected final boolean g() {
        return this.r != this.s;
    }

    @Override // defpackage.cmgs
    protected final cmga h() {
        List<cmfw> list = this.r;
        this.s = list;
        cmmn.f(list);
        return new cmgt(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0015 A[SYNTHETIC] */
    @Override // defpackage.cmgs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void i(defpackage.cmgd r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgj.i(cmgd):void");
    }
}
