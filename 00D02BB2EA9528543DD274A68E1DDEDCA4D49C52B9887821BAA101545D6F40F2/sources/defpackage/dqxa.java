package defpackage;
/* compiled from: PG */
/* renamed from: dqxa  reason: default package */
/* loaded from: classes.dex */
public final class dqxa extends dsqw<dqxa, dqwz> implements dssk {
    public static final dqxa f;
    private static volatile dssr<dqxa> g;
    public int a;
    public int b = 0;
    public Object c;
    public dpoj d;
    public dpoj e;

    static {
        dqxa dqxaVar = new dqxa();
        f = dqxaVar;
        dsqw.cc(dqxa.class, dqxaVar);
    }

    private dqxa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003့\u0000\u0004့\u0000\u0005်\u0000", new Object[]{"c", "b", "a", "d", "e"});
            }
            if (i2 == 3) {
                return new dqxa();
            }
            if (i2 == 4) {
                return new dqwz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqxa.class) {
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
