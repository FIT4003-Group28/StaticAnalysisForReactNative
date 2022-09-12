package defpackage;
/* compiled from: PG */
/* renamed from: drzg  reason: default package */
/* loaded from: classes6.dex */
public final class drzg extends dsqw<drzg, drzf> implements dssk {
    public static final drzg c;
    private static volatile dssr<drzg> e;
    public dsrj<dscr> a = dssu.b;
    public long b;
    private int d;

    static {
        drzg drzgVar = new drzg();
        c = drzgVar;
        dsqw.cc(drzg.class, drzgVar);
    }

    private drzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"d", "b", "a", dscr.class});
            }
            if (i2 == 3) {
                return new drzg();
            }
            if (i2 == 4) {
                return new drzf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drzg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
