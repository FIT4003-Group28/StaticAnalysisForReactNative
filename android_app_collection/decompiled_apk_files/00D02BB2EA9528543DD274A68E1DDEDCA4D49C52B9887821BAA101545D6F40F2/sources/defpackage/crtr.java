package defpackage;
/* compiled from: PG */
/* renamed from: crtr  reason: default package */
/* loaded from: classes5.dex */
public final class crtr extends dsqw<crtr, crtq> implements dssk {
    public static final crtr d;
    private static volatile dssr<crtr> e;
    public int a;
    public float b;
    public float c;

    static {
        crtr crtrVar = new crtr();
        d = crtrVar;
        dsqw.cc(crtr.class, crtrVar);
    }

    private crtr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new crtr();
            }
            if (i2 == 4) {
                return new crtq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crtr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (crtr.class) {
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
