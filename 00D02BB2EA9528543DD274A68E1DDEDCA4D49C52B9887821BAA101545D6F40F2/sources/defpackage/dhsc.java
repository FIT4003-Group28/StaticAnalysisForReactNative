package defpackage;
/* compiled from: PG */
/* renamed from: dhsc  reason: default package */
/* loaded from: classes6.dex */
public final class dhsc extends dsqw<dhsc, dhsb> implements dssk {
    public static final dhsc d;
    private static volatile dssr<dhsc> e;
    public int a;
    public String b = "";
    public dsrj<dqzv> c = dssu.b;

    static {
        dhsc dhscVar = new dhsc();
        d = dhscVar;
        dsqw.cc(dhsc.class, dhscVar);
    }

    private dhsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dqzv.class});
            }
            if (i2 == 3) {
                return new dhsc();
            }
            if (i2 == 4) {
                return new dhsb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhsc.class) {
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
