package defpackage;
/* compiled from: PG */
/* renamed from: djom  reason: default package */
/* loaded from: classes6.dex */
public final class djom extends dsqs<djom, djol> implements dsqt {
    public static final djom b;
    private static volatile dssr<djom> e;
    public dnwb a;
    private int c;
    private byte d = 2;

    static {
        djom djomVar = new djom();
        b = djomVar;
        dsqw.cc(djom.class, djomVar);
    }

    private djom() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djom();
            }
            if (i2 == 4) {
                return new djol();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<djom> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djom.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
