package defpackage;
/* compiled from: PG */
/* renamed from: dmac  reason: default package */
/* loaded from: classes6.dex */
public final class dmac extends dsqw<dmac, dmab> implements dssk {
    public static final dmac d;
    private static volatile dssr<dmac> e;
    public int a;
    public dmae b;
    public dmae c;

    static {
        dmac dmacVar = new dmac();
        d = dmacVar;
        dsqw.cc(dmac.class, dmacVar);
    }

    private dmac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmac();
            }
            if (i2 == 4) {
                return new dmab();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmac> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmac.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
