package defpackage;
/* compiled from: PG */
/* renamed from: dqnp  reason: default package */
/* loaded from: classes6.dex */
public final class dqnp extends dsqw<dqnp, dqno> implements dssk {
    public static final dqnp d;
    private static volatile dssr<dqnp> e;
    public int a;
    public dpum b;
    public dqnn c;

    static {
        dqnp dqnpVar = new dqnp();
        d = dqnpVar;
        dsqw.cc(dqnp.class, dqnpVar);
    }

    private dqnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqnp();
            }
            if (i2 == 4) {
                return new dqno();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqnp.class) {
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
