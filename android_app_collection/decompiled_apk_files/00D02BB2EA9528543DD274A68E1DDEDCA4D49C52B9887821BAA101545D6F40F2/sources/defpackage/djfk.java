package defpackage;
/* compiled from: PG */
/* renamed from: djfk  reason: default package */
/* loaded from: classes6.dex */
public final class djfk extends dsqw<djfk, djfj> implements dssk {
    public static final djfk e;
    private static volatile dssr<djfk> g;
    public int a;
    public dwlh b;
    private byte f = 2;
    public String c = "";
    public String d = "";

    static {
        djfk djfkVar = new djfk();
        e = djfkVar;
        dsqw.cc(djfk.class, djfkVar);
    }

    private djfk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djfk();
            }
            if (i2 == 4) {
                return new djfj();
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
            dssr<djfk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfk.class) {
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
