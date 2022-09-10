package defpackage;
/* compiled from: PG */
/* renamed from: drke  reason: default package */
/* loaded from: classes6.dex */
public final class drke extends dsqw<drke, drkb> implements dssk {
    public static final drke k;
    private static volatile dssr<drke> l;
    public int a;
    public int b;
    public drdg e;
    public dqfu f;
    public drdg h;
    public dqfu i;
    public String c = "";
    public String d = "";
    public String g = "";
    public String j = "";

    static {
        drke drkeVar = new drke();
        k = drkeVar;
        dsqw.cc(drke.class, drkeVar);
    }

    private drke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\tဉ\b\nဈ\t", new Object[]{"a", "b", drkd.c(), "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new drke();
            }
            if (i2 == 4) {
                return new drkb();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drke> dssrVar = l;
            if (dssrVar == null) {
                synchronized (drke.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
