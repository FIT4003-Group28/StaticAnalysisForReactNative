package defpackage;
/* compiled from: PG */
/* renamed from: duqc  reason: default package */
/* loaded from: classes6.dex */
public final class duqc extends dsqw<duqc, duqb> implements dssk {
    public static final duqc f;
    private static volatile dssr<duqc> g;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;

    static {
        duqc duqcVar = new duqc();
        f = duqcVar;
        dsqw.cc(duqc.class, duqcVar);
    }

    private duqc() {
    }

    public static /* synthetic */ void c(duqc duqcVar) {
        duqcVar.a |= 1;
        duqcVar.b = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", dqek.c(), "d", "e", dqvj.d()});
            }
            if (i2 == 3) {
                return new duqc();
            }
            if (i2 == 4) {
                return new duqb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duqc.class) {
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
