package defpackage;
/* compiled from: PG */
/* renamed from: ajiq  reason: default package */
/* loaded from: classes2.dex */
public final class ajiq extends dsqw<ajiq, ajip> implements dssk {
    public static final ajiq d;
    private static volatile dssr<ajiq> e;
    public int a;
    public String b = "";
    public ajio c;

    static {
        ajiq ajiqVar = new ajiq();
        d = ajiqVar;
        dsqw.cc(ajiq.class, ajiqVar);
    }

    private ajiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ajiq();
            }
            if (i2 == 4) {
                return new ajip();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajiq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ajiq.class) {
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
