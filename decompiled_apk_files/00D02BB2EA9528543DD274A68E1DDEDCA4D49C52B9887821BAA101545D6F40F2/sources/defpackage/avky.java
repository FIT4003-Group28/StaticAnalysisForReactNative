package defpackage;
/* compiled from: PG */
/* renamed from: avky  reason: default package */
/* loaded from: classes3.dex */
public final class avky extends dsqw<avky, avkx> implements dssk {
    public static final avky e;
    private static volatile dssr<avky> g;
    public int a;
    public avla b;
    public avle d;
    private byte f = 2;
    public dsrj<avlg> c = dssu.b;

    static {
        avky avkyVar = new avky();
        e = avkyVar;
        dsqw.cc(avky.class, avkyVar);
    }

    private avky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဉ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", "c", avlg.class, "d"});
            }
            if (i2 == 3) {
                return new avky();
            }
            if (i2 == 4) {
                return new avkx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<avky> dssrVar = g;
            if (dssrVar == null) {
                synchronized (avky.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
