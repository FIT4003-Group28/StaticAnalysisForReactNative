package defpackage;
/* compiled from: PG */
/* renamed from: dqgm  reason: default package */
/* loaded from: classes6.dex */
public final class dqgm extends dsqw<dqgm, dqgl> implements dssk {
    public static final dqgm c;
    private static volatile dssr<dqgm> e;
    public int a;
    public docg b;
    private byte d = 2;

    static {
        dqgm dqgmVar = new dqgm();
        c = dqgmVar;
        dsqw.cc(dqgm.class, dqgmVar);
    }

    private dqgm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqgm();
            }
            if (i2 == 4) {
                return new dqgl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dqgm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqgm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
