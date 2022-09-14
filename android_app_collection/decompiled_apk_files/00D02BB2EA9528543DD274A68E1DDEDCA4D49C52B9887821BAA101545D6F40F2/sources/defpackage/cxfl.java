package defpackage;
/* compiled from: PG */
/* renamed from: cxfl  reason: default package */
/* loaded from: classes5.dex */
public final class cxfl extends dsqs<cxfl, cxfk> implements dsqt {
    public static final cxfl c;
    private static volatile dssr<cxfl> e;
    public int a;
    public eacd b;
    private byte d = 2;

    static {
        cxfl cxflVar = new cxfl();
        c = cxflVar;
        dsqw.cc(cxfl.class, cxflVar);
    }

    private cxfl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cxfl();
            }
            if (i2 == 4) {
                return new cxfk();
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
            dssr<cxfl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cxfl.class) {
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
