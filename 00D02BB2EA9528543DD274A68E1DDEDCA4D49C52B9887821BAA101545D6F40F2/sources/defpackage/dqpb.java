package defpackage;
/* compiled from: PG */
/* renamed from: dqpb  reason: default package */
/* loaded from: classes.dex */
public final class dqpb extends dsqw<dqpb, dqpa> implements dssk {
    public static final dqpb d;
    private static volatile dssr<dqpb> e;
    public int a;
    public float b;
    public float c;

    static {
        dqpb dqpbVar = new dqpb();
        d = dqpbVar;
        dsqw.cc(dqpb.class, dqpbVar);
    }

    private dqpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqpb();
            }
            if (i2 == 4) {
                return new dqpa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqpb.class) {
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
