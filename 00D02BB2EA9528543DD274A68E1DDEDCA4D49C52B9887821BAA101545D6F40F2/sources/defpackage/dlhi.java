package defpackage;
/* compiled from: PG */
/* renamed from: dlhi  reason: default package */
/* loaded from: classes6.dex */
public final class dlhi extends dsqw<dlhi, dlhh> implements dssk {
    public static final dlhi b;
    private static volatile dssr<dlhi> c;
    public dsrj<String> a = dssu.b;

    static {
        dlhi dlhiVar = new dlhi();
        b = dlhiVar;
        dsqw.cc(dlhi.class, dlhiVar);
    }

    private dlhi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dlhi();
            }
            if (i2 == 4) {
                return new dlhh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlhi.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
