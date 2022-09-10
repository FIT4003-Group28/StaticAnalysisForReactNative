package defpackage;
/* compiled from: PG */
/* renamed from: aimp  reason: default package */
/* loaded from: classes2.dex */
public final class aimp extends dsqw<aimp, aimm> implements dssk {
    public static final aimp f;
    private static volatile dssr<aimp> g;
    public int a;
    public long b;
    public aiml c;
    public int d;
    public boolean e;

    static {
        aimp aimpVar = new aimp();
        f = aimpVar;
        dsqw.cc(aimp.class, aimpVar);
    }

    private aimp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", aimn.a, "e"});
            }
            if (i2 == 3) {
                return new aimp();
            }
            if (i2 == 4) {
                return new aimm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (aimp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
