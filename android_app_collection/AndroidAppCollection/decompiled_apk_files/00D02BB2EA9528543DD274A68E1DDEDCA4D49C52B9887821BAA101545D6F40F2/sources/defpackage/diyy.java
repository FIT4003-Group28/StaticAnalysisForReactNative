package defpackage;
/* compiled from: PG */
/* renamed from: diyy  reason: default package */
/* loaded from: classes6.dex */
public final class diyy extends dsqw<diyy, diyv> implements dssk {
    public static final diyy b;
    private static volatile dssr<diyy> c;
    public dsrj<diyx> a = dssu.b;

    static {
        diyy diyyVar = new diyy();
        b = diyyVar;
        dsqw.cc(diyy.class, diyyVar);
    }

    private diyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", diyx.class});
            }
            if (i2 == 3) {
                return new diyy();
            }
            if (i2 == 4) {
                return new diyv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diyy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (diyy.class) {
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
