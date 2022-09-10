package defpackage;
/* compiled from: PG */
/* renamed from: dshb  reason: default package */
/* loaded from: classes6.dex */
public final class dshb extends dsqw<dshb, dsgw> implements dssk {
    public static final dshb f;
    private static volatile dssr<dshb> g;
    public int a;
    public String b = "";
    public dsrj<dsha> c = dssu.b;
    public dshd d;
    public dsiq e;

    static {
        dshb dshbVar = new dshb();
        f = dshbVar;
        dsqw.cc(dshb.class, dshbVar);
    }

    private dshb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", dsha.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dshb();
            }
            if (i2 == 4) {
                return new dsgw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dshb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
