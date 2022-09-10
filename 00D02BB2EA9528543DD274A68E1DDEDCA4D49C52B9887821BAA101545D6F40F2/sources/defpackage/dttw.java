package defpackage;
/* compiled from: PG */
/* renamed from: dttw  reason: default package */
/* loaded from: classes6.dex */
public final class dttw extends dsqw<dttw, dttv> implements dssk {
    public static final dttw a;
    private static volatile dssr<dttw> b;

    static {
        dttw dttwVar = new dttw();
        a = dttwVar;
        dsqw.cc(dttw.class, dttwVar);
    }

    private dttw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dttw();
            }
            if (i2 == 4) {
                return new dttv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dttw.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
