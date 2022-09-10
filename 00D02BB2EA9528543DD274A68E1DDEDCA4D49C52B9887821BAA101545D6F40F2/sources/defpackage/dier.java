package defpackage;
/* compiled from: PG */
/* renamed from: dier  reason: default package */
/* loaded from: classes6.dex */
public final class dier extends dsqw<dier, dieb> implements dssk {
    public static final dier d;
    private static volatile dssr<dier> e;
    public int a;
    public dieq b;
    public dlno c;

    static {
        dier dierVar = new dier();
        d = dierVar;
        dsqw.cc(dier.class, dierVar);
    }

    private dier() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0000", new Object[]{"a", "c", "b"});
            }
            if (i2 == 3) {
                return new dier();
            }
            if (i2 == 4) {
                return new dieb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dier> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dier.class) {
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
