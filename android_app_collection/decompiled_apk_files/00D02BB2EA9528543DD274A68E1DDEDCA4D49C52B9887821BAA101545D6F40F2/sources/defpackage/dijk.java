package defpackage;
/* compiled from: PG */
/* renamed from: dijk  reason: default package */
/* loaded from: classes6.dex */
public final class dijk extends dsqw<dijk, dijj> implements dssk {
    public static final dijk c;
    private static volatile dssr<dijk> e;
    public int a;
    public diwb b;
    private byte d = 2;

    static {
        dijk dijkVar = new dijk();
        c = dijkVar;
        dsqw.cc(dijk.class, dijkVar);
    }

    private dijk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dijk();
            }
            if (i2 == 4) {
                return new dijj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dijk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dijk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
