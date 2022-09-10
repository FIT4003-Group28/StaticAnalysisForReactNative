package defpackage;
/* compiled from: PG */
/* renamed from: cykr  reason: default package */
/* loaded from: classes5.dex */
public final class cykr extends dsqw<cykr, cykq> implements dssk {
    public static final cykr c;
    private static volatile dssr<cykr> d;
    public String a = "";
    public dsrj<String> b = dssu.b;

    static {
        cykr cykrVar = new cykr();
        c = cykrVar;
        dsqw.cc(cykr.class, cykrVar);
    }

    private cykr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cykr();
            }
            if (i2 == 4) {
                return new cykq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cykr.class) {
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
