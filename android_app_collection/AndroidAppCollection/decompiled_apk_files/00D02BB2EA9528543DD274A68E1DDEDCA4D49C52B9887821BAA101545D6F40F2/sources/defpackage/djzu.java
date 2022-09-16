package defpackage;
/* compiled from: PG */
/* renamed from: djzu  reason: default package */
/* loaded from: classes6.dex */
public final class djzu extends dsqs<djzu, djzt> implements dsqt {
    public static final djzu d;
    private static volatile dssr<djzu> g;
    public dqaw b;
    public dnwb c;
    private int e;
    private byte f = 2;
    public String a = "";

    static {
        djzu djzuVar = new djzu();
        d = djzuVar;
        dsqw.cc(djzu.class, djzuVar);
    }

    private djzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djzu();
            }
            if (i2 == 4) {
                return new djzt();
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
            dssr<djzu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djzu.class) {
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
