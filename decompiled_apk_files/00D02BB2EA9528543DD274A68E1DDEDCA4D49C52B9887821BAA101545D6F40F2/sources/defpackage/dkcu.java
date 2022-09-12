package defpackage;
/* compiled from: PG */
/* renamed from: dkcu  reason: default package */
/* loaded from: classes6.dex */
public final class dkcu extends dsqw<dkcu, dkct> implements dssk {
    public static final dkcu d;
    private static volatile dssr<dkcu> g;
    public dusk a;
    private int e;
    private byte f = 2;
    public dsrj<dulb> b = dssu.b;
    public String c = "";

    static {
        dkcu dkcuVar = new dkcu();
        d = dkcuVar;
        dsqw.cc(dkcu.class, dkcuVar);
    }

    private dkcu() {
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
                return new dkcu();
            }
            if (i2 == 4) {
                return new dkct();
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
            dssr<dkcu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkcu.class) {
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
