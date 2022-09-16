package defpackage;
/* compiled from: PG */
/* renamed from: dqlc  reason: default package */
/* loaded from: classes6.dex */
public final class dqlc extends dsqw<dqlc, dqks> implements dssk {
    public static final dqlc f;
    private static volatile dssr<dqlc> g;
    public int a;
    public dsrj<dpum> b;
    public dqkw c;
    public dqlb d;
    public dqky e;

    static {
        dqlc dqlcVar = new dqlc();
        f = dqlcVar;
        dsqw.cc(dqlc.class, dqlcVar);
    }

    private dqlc() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0001\u0000\u0002\u001b\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006", new Object[]{"a", "b", dpum.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqlc();
            }
            if (i2 == 4) {
                return new dqks();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqlc.class) {
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

    public final void b() {
        dsrj<dpum> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
