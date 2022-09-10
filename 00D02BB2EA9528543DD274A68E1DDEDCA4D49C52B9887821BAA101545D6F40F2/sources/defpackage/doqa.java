package defpackage;
/* compiled from: PG */
/* renamed from: doqa  reason: default package */
/* loaded from: classes6.dex */
public final class doqa extends dsqw<doqa, dopw> implements dssk {
    public static final doqa f;
    private static volatile dssr<doqa> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;

    static {
        doqa doqaVar = new doqa();
        f = doqaVar;
        dsqw.cc(doqa.class, doqaVar);
    }

    private doqa() {
    }

    public static /* synthetic */ void b(doqa doqaVar) {
        doqaVar.a |= 2;
        doqaVar.g = 30000;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004င\u0003\u0005ဌ\u0004", new Object[]{"a", "b", dopy.a, "g", "c", dopy.a, "d", "e", dopx.a});
            }
            if (i2 == 3) {
                return new doqa();
            }
            if (i2 == 4) {
                return new dopw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (doqa.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
