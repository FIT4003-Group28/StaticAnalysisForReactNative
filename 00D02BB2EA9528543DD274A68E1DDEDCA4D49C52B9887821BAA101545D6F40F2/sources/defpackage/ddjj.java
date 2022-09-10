package defpackage;
/* compiled from: PG */
/* renamed from: ddjj  reason: default package */
/* loaded from: classes.dex */
public final class ddjj extends dsqw<ddjj, ddji> implements dssk {
    public static final ddjj c;
    private static volatile dssr<ddjj> e;
    public int a;
    private byte d = 2;
    public String b = "";

    static {
        ddjj ddjjVar = new ddjj();
        c = ddjjVar;
        dsqw.cc(ddjj.class, ddjjVar);
    }

    private ddjj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddjj();
            }
            if (i2 == 4) {
                return new ddji();
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
            dssr<ddjj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddjj.class) {
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
