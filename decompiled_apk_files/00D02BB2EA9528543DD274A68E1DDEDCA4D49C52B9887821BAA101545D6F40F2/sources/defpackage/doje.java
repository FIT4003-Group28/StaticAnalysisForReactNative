package defpackage;
/* compiled from: PG */
/* renamed from: doje  reason: default package */
/* loaded from: classes6.dex */
public final class doje extends dsqw<doje, dojd> implements dssk {
    public static final doje c;
    private static volatile dssr<doje> d;
    public int a;
    public dokf b;

    static {
        doje dojeVar = new doje();
        c = dojeVar;
        dsqw.cc(doje.class, dojeVar);
    }

    private doje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new doje();
            }
            if (i2 == 4) {
                return new dojd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doje> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doje.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
