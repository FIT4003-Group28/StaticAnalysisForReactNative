package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dvls  reason: default package */
/* loaded from: classes.dex */
public final class dvls extends dsqw<dvls, dvkz> implements dssk {
    public static final dvls p;
    private static volatile dssr<dvls> r;
    public dkhd a;
    public boolean c;
    public dvlj g;
    public dvlr h;
    public dvln i;
    public dvlp j;
    public dvky m;
    public boolean n;
    public int o;
    private int q;
    public dsrj<dvlb> b = dssu.b;
    public int d = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    public int e = 604800;
    public int f = 30;
    public boolean k = true;
    public int l = 600;

    static {
        dvls dvlsVar = new dvls();
        p = dvlsVar;
        dsqw.cc(dvls.class, dvlsVar);
    }

    private dvls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000f\u0000\u0001\u0002\u001a\u000f\u0000\u0001\u0000\u0002င\u0005\u0003င\u0006\u0005ဉ\n\u0006ဉ\u000b\nဇ\u0012\fင\u0013\rဇ\u0004\u000eဉ\u000e\u0010ဉ\u0014\u0011င\b\u0016ဉ\f\u0017ဇ\u0015\u0018ဌ\u0016\u0019\u001b\u001aဉ\u0000", new Object[]{"q", "d", "e", "g", "h", "k", "l", "c", "j", "m", "f", "i", "n", "o", dkha.a, "b", dvlb.class, "a"});
            }
            if (i2 == 3) {
                return new dvls();
            }
            if (i2 == 4) {
                return new dvkz();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvls> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dvls.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
