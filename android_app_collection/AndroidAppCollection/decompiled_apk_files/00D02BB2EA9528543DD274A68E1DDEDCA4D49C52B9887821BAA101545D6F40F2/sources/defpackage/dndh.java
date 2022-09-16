package defpackage;
/* compiled from: PG */
/* renamed from: dndh  reason: default package */
/* loaded from: classes6.dex */
public final class dndh extends dsqw<dndh, dndg> implements dssk {
    public static final dndh d;
    private static volatile dssr<dndh> e;
    public int a;
    public dndc b;
    public boolean c;

    static {
        dndh dndhVar = new dndh();
        d = dndhVar;
        dsqw.cc(dndh.class, dndhVar);
    }

    private dndh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0007ဇ\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dndh();
            }
            if (i2 == 4) {
                return new dndg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dndh.class) {
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
