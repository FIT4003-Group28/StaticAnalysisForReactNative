package defpackage;
/* compiled from: PG */
/* renamed from: dlcq  reason: default package */
/* loaded from: classes6.dex */
public final class dlcq extends dsqw<dlcq, dlcp> implements dssk {
    public static final dlcq d;
    private static volatile dssr<dlcq> g;
    public int a;
    public djrm c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        dlcq dlcqVar = new dlcq();
        d = dlcqVar;
        dsqw.cc(dlcq.class, dlcqVar);
    }

    private dlcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0001\u0002ᐉ\u0005\u0004င\u0000", new Object[]{"e", "b", "c", "a"});
            }
            if (i2 == 3) {
                return new dlcq();
            }
            if (i2 == 4) {
                return new dlcp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlcq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlcq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
