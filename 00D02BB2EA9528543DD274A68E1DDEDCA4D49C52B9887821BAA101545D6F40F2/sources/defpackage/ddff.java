package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ddff  reason: default package */
/* loaded from: classes5.dex */
public final class ddff extends dsqw<ddff, ddfe> implements dssk {
    public static final ddff a;
    public static final dsqv<ddbw, ddff> b;
    private static volatile dssr<ddff> c;

    static {
        ddff ddffVar = new ddff();
        a = ddffVar;
        dsqw.cc(ddff.class, ddffVar);
        b = dsqw.newSingularGeneratedExtension(ddbw.a, ddffVar, ddffVar, null, R.styleable.AppCompatTheme_windowActionBarOverlay, dsur.MESSAGE, ddff.class);
    }

    private ddff() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddff();
            }
            if (i2 == 4) {
                return new ddfe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddff> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddff.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
