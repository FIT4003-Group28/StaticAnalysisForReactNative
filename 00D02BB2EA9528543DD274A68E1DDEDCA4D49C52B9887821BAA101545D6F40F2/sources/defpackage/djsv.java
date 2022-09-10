package defpackage;
/* compiled from: PG */
/* renamed from: djsv  reason: default package */
/* loaded from: classes6.dex */
public final class djsv extends dsqw<djsv, djss> implements dssk {
    public static final djsv d;
    private static volatile dssr<djsv> g;
    public int a;
    public dnwb c;
    private dnqh e;
    private byte f = 2;
    public dsrj<djsu> b = dssu.b;

    static {
        djsv djsvVar = new djsv();
        d = djsvVar;
        dsqw.cc(djsv.class, djsvVar);
    }

    private djsv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", djsu.class, "e", "c"});
            }
            if (i2 == 3) {
                return new djsv();
            }
            if (i2 == 4) {
                return new djss();
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
            dssr<djsv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djsv.class) {
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
