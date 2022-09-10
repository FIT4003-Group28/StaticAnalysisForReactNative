package defpackage;
/* compiled from: PG */
/* renamed from: dzyi  reason: default package */
/* loaded from: classes6.dex */
public final class dzyi extends dsqw<dzyi, dzyh> implements dssk {
    public static final dzyi d;
    private static volatile dssr<dzyi> e;
    public int a;
    public long b;
    public String c = "";

    static {
        dzyi dzyiVar = new dzyi();
        d = dzyiVar;
        dsqw.cc(dzyi.class, dzyiVar);
    }

    private dzyi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dzyi();
            }
            if (i2 == 4) {
                return new dzyh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzyi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dzyi.class) {
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
