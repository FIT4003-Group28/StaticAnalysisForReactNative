package defpackage;
/* compiled from: PG */
/* renamed from: bjfo  reason: default package */
/* loaded from: classes3.dex */
public final class bjfo extends dsqw<bjfo, bjfn> implements dssk {
    public static final bjfo k;
    private static volatile dssr<bjfo> l;
    public int a;
    public bjfm b;
    public bjfq c;
    public int e;
    public int f;
    public boolean j;
    public String d = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        bjfo bjfoVar = new bjfo();
        k = bjfoVar;
        dsqw.cc(bjfo.class, bjfoVar);
    }

    private bjfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", dqjh.c(), "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new bjfo();
            }
            if (i2 == 4) {
                return new bjfn();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bjfo> dssrVar = l;
            if (dssrVar == null) {
                synchronized (bjfo.class) {
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
