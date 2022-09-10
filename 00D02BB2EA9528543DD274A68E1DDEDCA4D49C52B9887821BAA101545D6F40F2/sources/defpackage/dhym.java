package defpackage;
/* compiled from: PG */
/* renamed from: dhym  reason: default package */
/* loaded from: classes6.dex */
public final class dhym extends dsqw<dhym, dhyi> implements dssk {
    public static final dhym c;
    private static volatile dssr<dhym> e;
    private byte d = 2;
    public dsrj<dqfq> a = dssu.b;
    public dsrj<dhyl> b = dssu.b;

    static {
        dhym dhymVar = new dhym();
        c = dhymVar;
        dsqw.cc(dhym.class, dhymVar);
    }

    private dhym() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0003\u0006\u0002\u0000\u0002\u0001\u0003Л\u0006\u001b", new Object[]{"b", dhyl.class, "a", dqfq.class});
            }
            if (i2 == 3) {
                return new dhym();
            }
            if (i2 == 4) {
                return new dhyi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhym> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhym.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
