package defpackage;
/* compiled from: PG */
/* renamed from: dwyg  reason: default package */
/* loaded from: classes6.dex */
public final class dwyg extends dsqw<dwyg, dwyf> implements dssk {
    public static final dwyg e;
    private static volatile dssr<dwyg> f;
    public int a;
    public dpum c;
    public String b = "";
    public dsrj<dwyj> d = dssu.b;

    static {
        dwyg dwygVar = new dwyg();
        e = dwygVar;
        dsqw.cc(dwyg.class, dwygVar);
    }

    private dwyg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dwyj.class});
            }
            if (i2 == 3) {
                return new dwyg();
            }
            if (i2 == 4) {
                return new dwyf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwyg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
