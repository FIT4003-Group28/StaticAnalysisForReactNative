package defpackage;
/* compiled from: PG */
/* renamed from: dwrz  reason: default package */
/* loaded from: classes6.dex */
public final class dwrz extends dsqw<dwrz, dwry> implements dssk {
    public static final dwrz d;
    private static volatile dssr<dwrz> g;
    private int e;
    private byte f = 2;
    public dsrj<dwrc> a = dssu.b;
    public dspd b = dspd.b;
    public dsrj<dwqg> c = dssu.b;

    static {
        dwrz dwrzVar = new dwrz();
        d = dwrzVar;
        dsqw.cc(dwrz.class, dwrzVar);
    }

    private dwrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u001b\u0002ည\u0000\u0003Л", new Object[]{"e", "a", dwrc.class, "b", "c", dwqg.class});
            }
            if (i2 == 3) {
                return new dwrz();
            }
            if (i2 == 4) {
                return new dwry();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dwrz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwrz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
