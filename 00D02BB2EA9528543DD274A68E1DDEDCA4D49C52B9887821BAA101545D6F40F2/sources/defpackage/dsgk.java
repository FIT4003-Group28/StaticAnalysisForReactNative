package defpackage;
/* compiled from: PG */
/* renamed from: dsgk  reason: default package */
/* loaded from: classes6.dex */
public final class dsgk extends dsqw<dsgk, dsgi> implements dssk {
    public static final dsgk c;
    private static volatile dssr<dsgk> d;
    public int a = 0;
    public Object b;

    static {
        dsgk dsgkVar = new dsgk();
        c = dsgkVar;
        dsqw.cc(dsgk.class, dsgkVar);
    }

    private dsgk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dsia.class, dshf.class, dsgq.class});
            }
            if (i2 == 3) {
                return new dsgk();
            }
            if (i2 == 4) {
                return new dsgi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsgk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
