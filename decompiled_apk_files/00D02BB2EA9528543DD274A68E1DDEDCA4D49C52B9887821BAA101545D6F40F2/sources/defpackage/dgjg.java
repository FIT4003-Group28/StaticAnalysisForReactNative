package defpackage;
/* compiled from: PG */
/* renamed from: dgjg  reason: default package */
/* loaded from: classes6.dex */
public final class dgjg extends dsqw<dgjg, dgjf> implements dssk {
    public static final dgjg d;
    private static volatile dssr<dgjg> e;
    public int a;
    public dgjc b;
    public dsrj<dgjc> c = dssu.b;

    static {
        dgjg dgjgVar = new dgjg();
        d = dgjgVar;
        dsqw.cc(dgjg.class, dgjgVar);
    }

    private dgjg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0003\u001b", new Object[]{"a", "b", "c", dgjc.class});
            }
            if (i2 == 3) {
                return new dgjg();
            }
            if (i2 == 4) {
                return new dgjf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgjg.class) {
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
