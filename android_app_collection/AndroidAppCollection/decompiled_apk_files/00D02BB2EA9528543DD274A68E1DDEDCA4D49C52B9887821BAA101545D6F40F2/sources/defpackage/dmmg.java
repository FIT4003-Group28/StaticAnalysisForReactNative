package defpackage;
/* compiled from: PG */
/* renamed from: dmmg  reason: default package */
/* loaded from: classes6.dex */
public final class dmmg extends dsqw<dmmg, dmmf> implements dssk {
    public static final dmmg c;
    private static volatile dssr<dmmg> e;
    public dsrj<dmma> a = dssu.b;
    public int b = 1;
    private int d;

    static {
        dmmg dmmgVar = new dmmg();
        c = dmmgVar;
        dsqw.cc(dmmg.class, dmmgVar);
    }

    private dmmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", dmma.class, "b", dmmj.a});
            }
            if (i2 == 3) {
                return new dmmg();
            }
            if (i2 == 4) {
                return new dmmf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmmg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmmg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
