package defpackage;
/* compiled from: PG */
/* renamed from: dsok  reason: default package */
/* loaded from: classes6.dex */
public final class dsok extends dsqw<dsok, dsoj> implements dssk {
    public static final dsok c;
    private static volatile dssr<dsok> d;
    public String a = "";
    public dspd b = dspd.b;

    static {
        dsok dsokVar = new dsok();
        c = dsokVar;
        dsqw.cc(dsok.class, dsokVar);
    }

    private dsok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsok();
            }
            if (i2 == 4) {
                return new dsoj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsok> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsok.class) {
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
