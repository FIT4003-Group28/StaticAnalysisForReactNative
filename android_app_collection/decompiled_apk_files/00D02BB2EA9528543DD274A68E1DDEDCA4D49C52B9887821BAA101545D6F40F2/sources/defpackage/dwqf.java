package defpackage;
/* compiled from: PG */
/* renamed from: dwqf  reason: default package */
/* loaded from: classes6.dex */
public final class dwqf extends dsqw<dwqf, dwpq> implements dssk {
    public static final dwqf g;
    private static volatile dssr<dwqf> i;
    public int a;
    public doqw b;
    public dvyw c;
    public dwqe d;
    public dwqc e;
    private byte h = 2;
    public dsrj<dwpp> f = dssu.b;

    static {
        dwqf dwqfVar = new dwqf();
        g = dwqfVar;
        dsqw.cc(dwqf.class, dwqfVar);
    }

    private dwqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dwpp.class});
            }
            if (i3 == 3) {
                return new dwqf();
            }
            if (i3 == 4) {
                return new dwpq();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwqf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwqf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
