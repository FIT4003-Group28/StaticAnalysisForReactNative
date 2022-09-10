package defpackage;
/* compiled from: PG */
/* renamed from: dtxf  reason: default package */
/* loaded from: classes6.dex */
public final class dtxf extends dsqw<dtxf, dtxe> implements dssk {
    public static final dtxf a;
    private static volatile dssr<dtxf> e;
    private int b;
    private dblm c;
    private byte d = 2;

    static {
        dtxf dtxfVar = new dtxf();
        a = dtxfVar;
        dsqw.cc(dtxf.class, dtxfVar);
    }

    private dtxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0001\u000eᐉ\r", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtxf();
            }
            if (i2 == 4) {
                return new dtxe();
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
            dssr<dtxf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtxf.class) {
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
