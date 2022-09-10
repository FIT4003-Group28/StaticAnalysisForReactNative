package defpackage;
/* compiled from: PG */
/* renamed from: aimt  reason: default package */
/* loaded from: classes2.dex */
public final class aimt extends dsqw<aimt, aims> implements dssk {
    public static final aimt f;
    private static volatile dssr<aimt> g;
    public int a;
    public aimx b;
    public dqzl c;
    public long d;
    public aimr e;

    static {
        aimt aimtVar = new aimt();
        f = aimtVar;
        dsqw.cc(aimt.class, aimtVar);
    }

    private aimt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0003\u0003ဂ\u0002\u0004ဉ\u0000", new Object[]{"a", "c", "e", "d", "b"});
            }
            if (i2 == 3) {
                return new aimt();
            }
            if (i2 == 4) {
                return new aims();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (aimt.class) {
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
