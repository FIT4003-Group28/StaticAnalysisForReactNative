package defpackage;
/* compiled from: PG */
/* renamed from: duto  reason: default package */
/* loaded from: classes6.dex */
public final class duto extends dsqw<duto, dutn> implements dssk {
    public static final duto b;
    private static volatile dssr<duto> d;
    public int a = 1;
    private int c;

    static {
        duto dutoVar = new duto();
        b = dutoVar;
        dsqw.cc(duto.class, dutoVar);
    }

    private duto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dutr.a});
            }
            if (i2 == 3) {
                return new duto();
            }
            if (i2 == 4) {
                return new dutn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duto> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duto.class) {
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
