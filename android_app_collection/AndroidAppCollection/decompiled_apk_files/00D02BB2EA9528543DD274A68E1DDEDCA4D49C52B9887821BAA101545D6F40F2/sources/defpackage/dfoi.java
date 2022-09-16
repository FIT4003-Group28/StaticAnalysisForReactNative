package defpackage;
/* compiled from: PG */
/* renamed from: dfoi  reason: default package */
/* loaded from: classes6.dex */
public final class dfoi extends dsqw<dfoi, dfof> implements dssk {
    public static final dfoi h;
    private static volatile dssr<dfoi> i;
    public int a;
    public dghy b;
    public dgbk c;
    public String d = "";
    public String e = "";
    public dfoh f;
    public boolean g;

    static {
        dfoi dfoiVar = new dfoi();
        h = dfoiVar;
        dsqw.cc(dfoi.class, dfoiVar);
    }

    private dfoi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0005ဈ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "f", "e", "g"});
            }
            if (i3 == 3) {
                return new dfoi();
            }
            if (i3 == 4) {
                return new dfof();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dfoi> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dfoi.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
