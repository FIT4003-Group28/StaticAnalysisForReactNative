package defpackage;
/* compiled from: PG */
/* renamed from: dquw  reason: default package */
/* loaded from: classes6.dex */
public final class dquw extends dsqw<dquw, dqur> implements dssk {
    public static final dquw b;
    private static volatile dssr<dquw> c;
    public dsrj<dquv> a = dssu.b;

    static {
        dquw dquwVar = new dquw();
        b = dquwVar;
        dsqw.cc(dquw.class, dquwVar);
    }

    private dquw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dquv.class});
            }
            if (i2 == 3) {
                return new dquw();
            }
            if (i2 == 4) {
                return new dqur();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dquw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dquw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dquv> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
