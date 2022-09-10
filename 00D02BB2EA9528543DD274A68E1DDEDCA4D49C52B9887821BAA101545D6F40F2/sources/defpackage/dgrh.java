package defpackage;
/* compiled from: PG */
/* renamed from: dgrh  reason: default package */
/* loaded from: classes6.dex */
public final class dgrh extends dsqw<dgrh, dgrg> implements dssk {
    public static final dgrh d;
    private static volatile dssr<dgrh> g;
    public int a;
    public long b;
    public long c;
    private dtro e;
    private byte f = 2;

    static {
        dgrh dgrhVar = new dgrh();
        d = dgrhVar;
        dsqw.cc(dgrh.class, dgrhVar);
    }

    private dgrh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dgrh();
            }
            if (i2 == 4) {
                return new dgrg();
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
            dssr<dgrh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgrh.class) {
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
