package defpackage;
/* compiled from: PG */
/* renamed from: dggz  reason: default package */
/* loaded from: classes6.dex */
public final class dggz extends dsqw<dggz, dggy> implements dssk {
    public static final dggz b;
    private static volatile dssr<dggz> d;
    public String a = "";
    private int c;

    static {
        dggz dggzVar = new dggz();
        b = dggzVar;
        dsqw.cc(dggz.class, dggzVar);
    }

    private dggz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dggz();
            }
            if (i2 == 4) {
                return new dggy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dggz.class) {
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
