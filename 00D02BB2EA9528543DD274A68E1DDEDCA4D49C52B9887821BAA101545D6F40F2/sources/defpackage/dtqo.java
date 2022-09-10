package defpackage;
/* compiled from: PG */
/* renamed from: dtqo  reason: default package */
/* loaded from: classes6.dex */
public final class dtqo extends dsqs<dtqo, dtqn> implements dsqt {
    public static final dtqo e;
    private static volatile dssr<dtqo> g;
    public int a;
    public djyo b;
    public dthb c;
    private byte f = 2;
    public String d = "";

    static {
        dtqo dtqoVar = new dtqo();
        e = dtqoVar;
        dsqw.cc(dtqo.class, dtqoVar);
    }

    private dtqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtqo();
            }
            if (i2 == 4) {
                return new dtqn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dtqo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtqo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
