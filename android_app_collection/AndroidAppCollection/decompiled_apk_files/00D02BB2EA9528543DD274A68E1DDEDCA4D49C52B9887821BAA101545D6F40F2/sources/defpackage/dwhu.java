package defpackage;
/* compiled from: PG */
/* renamed from: dwhu  reason: default package */
/* loaded from: classes6.dex */
public final class dwhu extends dsqw<dwhu, dwht> implements dssk {
    public static final dwhu d;
    private static volatile dssr<dwhu> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dwhu dwhuVar = new dwhu();
        d = dwhuVar;
        dsqw.cc(dwhu.class, dwhuVar);
    }

    private dwhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwhu();
            }
            if (i2 == 4) {
                return new dwht();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwhu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwhu.class) {
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
