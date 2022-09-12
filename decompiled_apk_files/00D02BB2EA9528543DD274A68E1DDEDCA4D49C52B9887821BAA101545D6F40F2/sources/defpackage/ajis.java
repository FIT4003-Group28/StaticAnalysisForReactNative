package defpackage;
/* compiled from: PG */
/* renamed from: ajis  reason: default package */
/* loaded from: classes2.dex */
public final class ajis extends dsqw<ajis, ajir> implements dssk {
    public static final ajis d;
    private static volatile dssr<ajis> e;
    public int a;
    public String b = "";
    public long c;

    static {
        ajis ajisVar = new ajis();
        d = ajisVar;
        dsqw.cc(ajis.class, ajisVar);
    }

    private ajis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ajis();
            }
            if (i2 == 4) {
                return new ajir();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajis> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ajis.class) {
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
