package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dwnr  reason: default package */
/* loaded from: classes.dex */
public final class dwnr extends dsqw<dwnr, dwnq> implements dssk {
    public static final dwnr b;
    private static volatile dssr<dwnr> d;
    public int a = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    private int c;

    static {
        dwnr dwnrVar = new dwnr();
        b = dwnrVar;
        dsqw.cc(dwnr.class, dwnrVar);
    }

    private dwnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007င\u0003", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwnr();
            }
            if (i2 == 4) {
                return new dwnq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwnr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwnr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
