package defpackage;
/* compiled from: PG */
/* renamed from: diiw  reason: default package */
/* loaded from: classes6.dex */
public final class diiw extends dsqw<diiw, diiv> implements dssk {
    public static final diiw d;
    private static volatile dssr<diiw> f;
    public dhxw a;
    public int b;
    public boolean c;
    private int e;

    static {
        diiw diiwVar = new diiw();
        d = diiwVar;
        dsqw.cc(diiw.class, diiwVar);
    }

    private diiw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new diiw();
            }
            if (i2 == 4) {
                return new diiv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diiw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diiw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
