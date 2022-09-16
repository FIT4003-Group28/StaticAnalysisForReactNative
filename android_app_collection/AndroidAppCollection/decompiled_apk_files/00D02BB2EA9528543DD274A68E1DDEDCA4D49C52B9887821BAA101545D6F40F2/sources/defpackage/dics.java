package defpackage;
/* compiled from: PG */
/* renamed from: dics  reason: default package */
/* loaded from: classes6.dex */
public final class dics extends dsqs<dics, dicr> implements dsqt {
    public static final dics d;
    private static volatile dssr<dics> g;
    public int a;
    public dnwb c;
    private dnqh e;
    private byte f = 2;
    public dspd b = dspd.b;

    static {
        dics dicsVar = new dics();
        d = dicsVar;
        dsqw.cc(dics.class, dicsVar);
    }

    private dics() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"a", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dics();
            }
            if (i2 == 4) {
                return new dicr();
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
            dssr<dics> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dics.class) {
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
