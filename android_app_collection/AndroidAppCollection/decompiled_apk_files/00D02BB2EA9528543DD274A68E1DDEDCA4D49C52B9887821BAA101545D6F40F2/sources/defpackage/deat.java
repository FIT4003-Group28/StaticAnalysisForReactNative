package defpackage;
/* compiled from: PG */
/* renamed from: deat  reason: default package */
/* loaded from: classes6.dex */
public final class deat extends dsqw<deat, deas> implements dssk {
    public static final deat c;
    private static volatile dssr<deat> d;
    public int a;
    public String b = "";

    static {
        deat deatVar = new deat();
        c = deatVar;
        dsqw.cc(deat.class, deatVar);
    }

    private deat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new deat();
            }
            if (i2 == 4) {
                return new deas();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deat> dssrVar = d;
            if (dssrVar == null) {
                synchronized (deat.class) {
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
