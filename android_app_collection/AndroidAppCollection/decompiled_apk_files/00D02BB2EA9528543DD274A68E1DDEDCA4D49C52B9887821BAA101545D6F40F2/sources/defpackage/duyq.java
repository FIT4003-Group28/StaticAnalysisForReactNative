package defpackage;
/* compiled from: PG */
/* renamed from: duyq  reason: default package */
/* loaded from: classes6.dex */
public final class duyq extends dsqw<duyq, duyp> implements dssk {
    public static final duyq d;
    private static volatile dssr<duyq> g;
    public dusk a;
    private int e;
    private byte f = 2;
    public dsrj<dulb> b = dssu.b;
    public String c = "";

    static {
        duyq duyqVar = new duyq();
        d = duyqVar;
        dsqw.cc(duyq.class, duyqVar);
    }

    private duyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဈ\u0001", new Object[]{"e", "a", "b", dulb.class, "c"});
            }
            if (i2 == 3) {
                return new duyq();
            }
            if (i2 == 4) {
                return new duyp();
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
            dssr<duyq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duyq.class) {
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
