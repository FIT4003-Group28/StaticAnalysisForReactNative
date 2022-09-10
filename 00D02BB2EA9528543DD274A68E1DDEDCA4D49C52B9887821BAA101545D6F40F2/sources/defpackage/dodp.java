package defpackage;
/* compiled from: PG */
/* renamed from: dodp  reason: default package */
/* loaded from: classes6.dex */
public final class dodp extends dsqw<dodp, dodo> implements dssk {
    public static final dodp d;
    private static volatile dssr<dodp> e;
    public int a;
    public dnoh b;
    public boolean c;

    static {
        dodp dodpVar = new dodp();
        d = dodpVar;
        dsqw.cc(dodp.class, dodpVar);
    }

    private dodp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dodp();
            }
            if (i2 == 4) {
                return new dodo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dodp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dodp.class) {
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
