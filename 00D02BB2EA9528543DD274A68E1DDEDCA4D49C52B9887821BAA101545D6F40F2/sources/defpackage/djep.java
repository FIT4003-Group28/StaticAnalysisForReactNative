package defpackage;
/* compiled from: PG */
/* renamed from: djep  reason: default package */
/* loaded from: classes6.dex */
public final class djep extends dsqw<djep, djdo> implements dssk {
    public static final djep c;
    private static volatile dssr<djep> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        djep djepVar = new djep();
        c = djepVar;
        dsqw.cc(djep.class, djepVar);
    }

    private djep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\r\u0001\u0000\u0001\r\r\u0000\u0000\u0003\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000\tᐼ\u0000\nြ\u0000\u000bြ\u0000\fᐼ\u0000\rြ\u0000", new Object[]{"b", "a", djdu.class, djdw.class, djdy.class, djea.class, djeg.class, djek.class, djee.class, djeo.class, djem.class, djei.class, djdq.class, djds.class, djec.class});
            }
            if (i2 == 3) {
                return new djep();
            }
            if (i2 == 4) {
                return new djdo();
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
            dssr<djep> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djep.class) {
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
