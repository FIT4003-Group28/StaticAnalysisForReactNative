package defpackage;
/* compiled from: PG */
/* renamed from: dzzk  reason: default package */
/* loaded from: classes.dex */
public final class dzzk extends dsqw<dzzk, dzzj> implements dssk {
    public static final dzzk c;
    private static volatile dssr<dzzk> d;
    public int a;
    public dzzg b;

    static {
        dzzk dzzkVar = new dzzk();
        c = dzzkVar;
        dsqw.cc(dzzk.class, dzzkVar);
    }

    private dzzk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dzzk();
            }
            if (i2 == 4) {
                return new dzzj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dzzk.class) {
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