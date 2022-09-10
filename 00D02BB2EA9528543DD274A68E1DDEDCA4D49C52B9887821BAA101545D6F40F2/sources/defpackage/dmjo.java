package defpackage;
/* compiled from: PG */
/* renamed from: dmjo  reason: default package */
/* loaded from: classes.dex */
public final class dmjo extends dsqw<dmjo, dmjn> implements dssk {
    public static final dmjo b;
    private static volatile dssr<dmjo> c;
    public dsrj<dmjm> a = dssu.b;

    static {
        dmjo dmjoVar = new dmjo();
        b = dmjoVar;
        dsqw.cc(dmjo.class, dmjoVar);
    }

    private dmjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dmjm.class});
            }
            if (i2 == 3) {
                return new dmjo();
            }
            if (i2 == 4) {
                return new dmjn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmjo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmjo.class) {
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
