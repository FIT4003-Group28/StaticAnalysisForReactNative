package defpackage;
/* compiled from: PG */
/* renamed from: dqht  reason: default package */
/* loaded from: classes6.dex */
public final class dqht extends dsqw<dqht, dqhs> implements dssk {
    public static final dqht b;
    private static volatile dssr<dqht> c;
    public dsrj<dqhw> a = dssu.b;

    static {
        dqht dqhtVar = new dqht();
        b = dqhtVar;
        dsqw.cc(dqht.class, dqhtVar);
    }

    private dqht() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dqhw.class});
            }
            if (i2 == 3) {
                return new dqht();
            }
            if (i2 == 4) {
                return new dqhs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqht> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqht.class) {
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
        dsrj<dqhw> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
