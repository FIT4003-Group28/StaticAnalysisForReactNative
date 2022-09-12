package defpackage;
/* compiled from: PG */
/* renamed from: dsez  reason: default package */
/* loaded from: classes6.dex */
public final class dsez extends dsqw<dsez, dsey> implements dssk {
    public static final dsez c;
    private static volatile dssr<dsez> e;
    public dsew a;
    public float b;
    private int d;

    static {
        dsez dsezVar = new dsez();
        c = dsezVar;
        dsqw.cc(dsez.class, dsezVar);
    }

    private dsez() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dsez();
            }
            if (i2 == 4) {
                return new dsey();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsez> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsez.class) {
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
