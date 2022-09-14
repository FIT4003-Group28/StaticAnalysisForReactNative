package defpackage;
/* compiled from: PG */
/* renamed from: digt  reason: default package */
/* loaded from: classes6.dex */
public final class digt extends dsqw<digt, digs> implements dssk {
    public static final digt a;
    private static volatile dssr<digt> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        digt digtVar = new digt();
        a = digtVar;
        dsqw.cc(digt.class, digtVar);
    }

    private digt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new digt();
            }
            if (i2 == 4) {
                return new digs();
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
            dssr<digt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (digt.class) {
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
