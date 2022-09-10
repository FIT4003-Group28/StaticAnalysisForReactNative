package defpackage;
/* compiled from: PG */
/* renamed from: akwe  reason: default package */
/* loaded from: classes2.dex */
public final class akwe extends dsqw<akwe, akwb> implements dssk {
    public static final akwe d;
    private static volatile dssr<akwe> e;
    public int a;
    public float b;
    public int c;

    static {
        akwe akweVar = new akwe();
        d = akweVar;
        dsqw.cc(akwe.class, akweVar);
    }

    private akwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", akwd.c()});
            }
            if (i2 == 3) {
                return new akwe();
            }
            if (i2 == 4) {
                return new akwb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akwe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (akwe.class) {
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
