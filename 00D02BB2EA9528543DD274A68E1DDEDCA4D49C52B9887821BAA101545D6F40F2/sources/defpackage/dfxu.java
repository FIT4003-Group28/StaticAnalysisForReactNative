package defpackage;
/* compiled from: PG */
/* renamed from: dfxu  reason: default package */
/* loaded from: classes6.dex */
public final class dfxu extends dsqw<dfxu, dfxt> implements dssk {
    public static final dfxu a;
    private static volatile dssr<dfxu> e;
    private int b;
    private dtro c;
    private byte d = 2;

    static {
        dfxu dfxuVar = new dfxu();
        a = dfxuVar;
        dsqw.cc(dfxu.class, dfxuVar);
    }

    private dfxu() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\f", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dfxu();
            }
            if (i2 == 4) {
                return new dfxt();
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
            dssr<dfxu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfxu.class) {
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
