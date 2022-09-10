package defpackage;
/* compiled from: PG */
/* renamed from: duwo  reason: default package */
/* loaded from: classes.dex */
public final class duwo extends dsqw<duwo, duwn> implements dssk {
    public static final duwo c;
    private static volatile dssr<duwo> e;
    public boolean a;
    public int b = 5;
    private int d;

    static {
        duwo duwoVar = new duwo();
        c = duwoVar;
        dsqw.cc(duwo.class, duwoVar);
    }

    private duwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new duwo();
            }
            if (i2 == 4) {
                return new duwn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duwo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
