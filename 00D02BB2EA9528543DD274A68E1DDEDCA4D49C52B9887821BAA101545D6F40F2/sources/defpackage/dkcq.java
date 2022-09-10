package defpackage;
/* compiled from: PG */
/* renamed from: dkcq  reason: default package */
/* loaded from: classes6.dex */
public final class dkcq extends dsqw<dkcq, dkcn> implements dssk {
    public static final dkcq f;
    private static volatile dssr<dkcq> h;
    public int a;
    public int b;
    public boolean d;
    public duld e;
    private byte g = 2;
    public String c = "";

    static {
        dkcq dkcqVar = new dkcq();
        f = dkcqVar;
        dsqw.cc(dkcq.class, dkcqVar);
    }

    private dkcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဇ\u0002\u0003ᐉ\u0003\u0004ဌ\u0000", new Object[]{"a", "c", "d", "e", "b", dkcp.c()});
            }
            if (i2 == 3) {
                return new dkcq();
            }
            if (i2 == 4) {
                return new dkcn();
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
            dssr<dkcq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkcq.class) {
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
