package defpackage;
/* compiled from: PG */
/* renamed from: dlua  reason: default package */
/* loaded from: classes6.dex */
public final class dlua extends dsqw<dlua, dltv> implements dssk {
    public static final dlua h;
    private static volatile dssr<dlua> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;

    static {
        dlua dluaVar = new dlua();
        h = dluaVar;
        dsqw.cc(dlua.class, dluaVar);
    }

    private dlua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0007ဂ\u0006", new Object[]{"a", "b", dltw.a, "c", dltz.c(), "d", "e", dlpu.a, "f", "g"});
            }
            if (i3 == 3) {
                return new dlua();
            }
            if (i3 == 4) {
                return new dltv();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlua> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlua.class) {
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
