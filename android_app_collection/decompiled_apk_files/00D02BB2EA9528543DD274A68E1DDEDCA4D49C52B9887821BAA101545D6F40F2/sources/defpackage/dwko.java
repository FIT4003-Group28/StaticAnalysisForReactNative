package defpackage;
/* compiled from: PG */
/* renamed from: dwko  reason: default package */
/* loaded from: classes.dex */
public final class dwko extends dsqw<dwko, dwkn> implements dssk {
    public static final dwko c;
    private static volatile dssr<dwko> f;
    public boolean b;
    private int d;
    private byte e = 2;
    public dsrj<dvox> a = dssu.b;

    static {
        dwko dwkoVar = new dwko();
        c = dwkoVar;
        dsqw.cc(dwko.class, dwkoVar);
    }

    private dwko() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"d", "a", dvox.class, "b"});
            }
            if (i2 == 3) {
                return new dwko();
            }
            if (i2 == 4) {
                return new dwkn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dwko> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwko.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
