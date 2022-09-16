package defpackage;
/* compiled from: PG */
/* renamed from: ddze  reason: default package */
/* loaded from: classes.dex */
public final class ddze extends dsqw<ddze, ddzd> implements dssk {
    public static final ddze a;
    private static volatile dssr<ddze> e;
    private int b;
    private dtbk c;
    private byte d = 2;

    static {
        ddze ddzeVar = new ddze();
        a = ddzeVar;
        dsqw.cc(ddze.class, ddzeVar);
    }

    private ddze() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001  \u0001\u0000\u0000\u0001 ᐉ\u0019", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ddze();
            }
            if (i2 == 4) {
                return new ddzd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<ddze> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddze.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
