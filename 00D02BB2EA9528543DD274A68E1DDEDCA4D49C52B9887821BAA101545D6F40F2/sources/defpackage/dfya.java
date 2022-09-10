package defpackage;
/* compiled from: PG */
/* renamed from: dfya  reason: default package */
/* loaded from: classes6.dex */
public final class dfya extends dsqw<dfya, dfxz> implements dssk {
    public static final dfya c;
    private static volatile dssr<dfya> e;
    private byte d = 2;
    public dsrj<dfxd> a = dssu.b;
    public dsre b = dsqk.b;

    static {
        dfya dfyaVar = new dfya();
        c = dfyaVar;
        dsqw.cc(dfya.class, dfyaVar);
    }

    private dfya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u0013", new Object[]{"a", dfxd.class, "b"});
            }
            if (i2 == 3) {
                return new dfya();
            }
            if (i2 == 4) {
                return new dfxz();
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
            dssr<dfya> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfya.class) {
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
