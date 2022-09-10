package defpackage;
/* compiled from: PG */
/* renamed from: dtiq  reason: default package */
/* loaded from: classes6.dex */
public final class dtiq extends dsqw<dtiq, dtie> implements dssk {
    public static final dtiq i;
    private static volatile dssr<dtiq> j;
    public int a;
    public int b = 1;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;
    public dsrj<dtik> e = dssu.b;
    public dsrf f = dsqz.b;
    public boolean g;
    public dtim h;

    static {
        dtiq dtiqVar = new dtiq();
        i = dtiqVar;
        dsqw.cc(dtiq.class, dtiqVar);
    }

    private dtiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0004\u0000\u0001\u001b\u0004ဉ\u0002\u0006\u001e\u0007\u001e\b\u001e\tဇ\u0001\nဌ\u0000", new Object[]{"a", "e", dtik.class, "h", "c", dtic.c(), "d", dtia.c(), "f", dtio.c(), "g", "b", dtip.a});
            }
            if (i3 == 3) {
                return new dtiq();
            }
            if (i3 == 4) {
                return new dtie();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtiq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtiq.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
