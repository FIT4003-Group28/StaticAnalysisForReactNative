package defpackage;
/* compiled from: PG */
/* renamed from: dlvg  reason: default package */
/* loaded from: classes6.dex */
public final class dlvg extends dsqw<dlvg, dlvf> implements dssk {
    public static final dlvg d;
    private static volatile dssr<dlvg> f;
    public int a;
    private byte e = 2;
    public dsrj<drsu> b = dssu.b;
    public String c = "";

    static {
        dlvg dlvgVar = new dlvg();
        d = dlvgVar;
        dsqw.cc(dlvg.class, dlvgVar);
    }

    private dlvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"a", "b", drsu.class, "c"});
            }
            if (i2 == 3) {
                return new dlvg();
            }
            if (i2 == 4) {
                return new dlvf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dlvg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlvg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
