package defpackage;
/* compiled from: PG */
/* renamed from: dfhs  reason: default package */
/* loaded from: classes6.dex */
public final class dfhs extends dsqw<dfhs, dfhr> implements dssk {
    public static final dfhs c;
    private static volatile dssr<dfhs> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dfhs dfhsVar = new dfhs();
        c = dfhsVar;
        dsqw.cc(dfhs.class, dfhsVar);
    }

    private dfhs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐼ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dfhg.class, dfhw.class, dfhu.class});
            }
            if (i2 == 3) {
                return new dfhs();
            }
            if (i2 == 4) {
                return new dfhr();
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
            dssr<dfhs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfhs.class) {
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
