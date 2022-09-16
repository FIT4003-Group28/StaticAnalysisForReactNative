package defpackage;
/* compiled from: PG */
/* renamed from: duya  reason: default package */
/* loaded from: classes6.dex */
public final class duya extends dsqw<duya, duxz> implements dssk {
    public static final duya d;
    private static volatile dssr<duya> e;
    public int a;
    public int b = 4;
    public dnwb c;

    static {
        duya duyaVar = new duya();
        d = duyaVar;
        dsqw.cc(duya.class, duyaVar);
    }

    private duya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", dnqi.a, "c"});
            }
            if (i2 == 3) {
                return new duya();
            }
            if (i2 == 4) {
                return new duxz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duya> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duya.class) {
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
