package defpackage;
/* compiled from: PG */
/* renamed from: dmyy  reason: default package */
/* loaded from: classes6.dex */
public final class dmyy extends dsqw<dmyy, dmyx> implements dssk {
    public static final dmyy c;
    private static volatile dssr<dmyy> e;
    private byte d = 2;
    public dsrf a = dsqz.b;
    public dsrj<drsu> b = dssu.b;

    static {
        dmyy dmyyVar = new dmyy();
        c = dmyyVar;
        dsqw.cc(dmyy.class, dmyyVar);
    }

    private dmyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001'\u0002Л", new Object[]{"a", "b", drsu.class});
            }
            if (i2 == 3) {
                return new dmyy();
            }
            if (i2 == 4) {
                return new dmyx();
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
            dssr<dmyy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmyy.class) {
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
