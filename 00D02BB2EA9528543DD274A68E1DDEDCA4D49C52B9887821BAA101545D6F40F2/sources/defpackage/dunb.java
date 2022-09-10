package defpackage;
/* compiled from: PG */
/* renamed from: dunb  reason: default package */
/* loaded from: classes.dex */
public final class dunb extends dsqw<dunb, duna> implements dssk {
    public static final dunb f;
    private static volatile dssr<dunb> h;
    public int a;
    public dumz c;
    public djpw d;
    private byte g = 2;
    public dsrj<dvgo> b = dssu.b;
    public dspd e = dspd.b;

    static {
        dunb dunbVar = new dunb();
        f = dunbVar;
        dsqw.cc(dunb.class, dunbVar);
    }

    private dunb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ည\u0002", new Object[]{"a", "b", dvgo.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dunb();
            }
            if (i2 == 4) {
                return new duna();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dunb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dunb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
