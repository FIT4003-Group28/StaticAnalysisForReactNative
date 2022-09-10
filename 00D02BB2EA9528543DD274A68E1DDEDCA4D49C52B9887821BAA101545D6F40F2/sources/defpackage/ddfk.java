package defpackage;
/* compiled from: PG */
/* renamed from: ddfk  reason: default package */
/* loaded from: classes.dex */
public final class ddfk extends dsqw<ddfk, ddfi> implements dssk {
    public static final ddfk d;
    private static volatile dssr<ddfk> e;
    public int a;
    public int b;
    public float c;

    static {
        ddfk ddfkVar = new ddfk();
        d = ddfkVar;
        dsqw.cc(ddfk.class, ddfkVar);
    }

    private ddfk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"a", "b", ddfj.a, "c"});
            }
            if (i2 == 3) {
                return new ddfk();
            }
            if (i2 == 4) {
                return new ddfi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddfk.class) {
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
