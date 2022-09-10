package defpackage;
/* compiled from: PG */
/* renamed from: dpid  reason: default package */
/* loaded from: classes6.dex */
public final class dpid extends dsqw<dpid, dphy> implements dssk {
    public static final dpid h;
    private static volatile dssr<dpid> j;
    public int a;
    public dgas b;
    public dpgj d;
    private byte i = 2;
    public dsrj<doyp> c = dssu.b;
    public dsrj<dpic> e = dssu.b;
    public dsrj<dpic> f = dssu.b;
    public dsrj<dpia> g = dssu.b;

    static {
        dpid dpidVar = new dpid();
        h = dpidVar;
        dsqw.cc(dpid.class, dpidVar);
    }

    private dpid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0004\u0004\u0001ဉ\u0000\u0003Л\u0004ဉ\u0001\u0007Л\bЛ\tЛ", new Object[]{"a", "b", "c", doyp.class, "d", "e", dpic.class, "f", dpic.class, "g", dpia.class});
            }
            if (i2 == 3) {
                return new dpid();
            }
            if (i2 == 4) {
                return new dphy();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dpid> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dpid.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
