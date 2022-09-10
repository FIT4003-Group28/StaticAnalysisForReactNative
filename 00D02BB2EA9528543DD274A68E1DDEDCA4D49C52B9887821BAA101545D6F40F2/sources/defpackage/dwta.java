package defpackage;
/* compiled from: PG */
/* renamed from: dwta  reason: default package */
/* loaded from: classes.dex */
public final class dwta extends dsqw<dwta, dwsz> implements dssk {
    public static final dwta c;
    private static volatile dssr<dwta> e;
    public boolean a;
    public int b = 10;
    private int d;

    static {
        dwta dwtaVar = new dwta();
        c = dwtaVar;
        dsqw.cc(dwta.class, dwtaVar);
    }

    private dwta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwta();
            }
            if (i2 == 4) {
                return new dwsz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwta> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwta.class) {
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
