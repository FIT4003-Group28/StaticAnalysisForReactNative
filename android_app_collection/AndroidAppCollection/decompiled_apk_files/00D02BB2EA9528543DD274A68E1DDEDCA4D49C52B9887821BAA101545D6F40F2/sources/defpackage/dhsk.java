package defpackage;
/* compiled from: PG */
/* renamed from: dhsk  reason: default package */
/* loaded from: classes6.dex */
public final class dhsk extends dsqw<dhsk, dhsj> implements dssk {
    public static final dhsk d;
    private static volatile dssr<dhsk> e;
    public int a;
    public dsrj<dwqi> b = dssu.b;
    public dwpe c;

    static {
        dhsk dhskVar = new dhsk();
        d = dhskVar;
        dsqw.cc(dhsk.class, dhskVar);
    }

    private dhsk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dwqi.class, "c"});
            }
            if (i2 == 3) {
                return new dhsk();
            }
            if (i2 == 4) {
                return new dhsj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhsk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
