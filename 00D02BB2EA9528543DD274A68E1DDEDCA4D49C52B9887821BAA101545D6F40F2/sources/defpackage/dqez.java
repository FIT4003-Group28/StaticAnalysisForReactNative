package defpackage;
/* compiled from: PG */
/* renamed from: dqez  reason: default package */
/* loaded from: classes.dex */
public final class dqez extends dsqw<dqez, dqey> implements dssk {
    public static final dqez c;
    private static volatile dssr<dqez> e;
    public dpva a;
    public int b;
    private int d;

    static {
        dqez dqezVar = new dqez();
        c = dqezVar;
        dsqw.cc(dqez.class, dqezVar);
    }

    private dqez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dpsw.a});
            }
            if (i2 == 3) {
                return new dqez();
            }
            if (i2 == 4) {
                return new dqey();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqez> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqez.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
