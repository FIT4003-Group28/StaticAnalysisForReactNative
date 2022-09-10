package defpackage;
/* compiled from: PG */
/* renamed from: aimd  reason: default package */
/* loaded from: classes2.dex */
public final class aimd extends dsqw<aimd, aimc> implements dssk {
    public static final aimd d;
    private static volatile dssr<aimd> e;
    public int a;
    public dqzv b;
    public boolean c;

    static {
        aimd aimdVar = new aimd();
        d = aimdVar;
        dsqw.cc(aimd.class, aimdVar);
    }

    private aimd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new aimd();
            }
            if (i2 == 4) {
                return new aimc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aimd.class) {
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
