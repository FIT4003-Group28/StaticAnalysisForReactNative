package defpackage;
/* compiled from: PG */
/* renamed from: aaam  reason: default package */
/* loaded from: classes2.dex */
public final class aaam extends dsqw<aaam, aaal> implements dssk {
    public static final aaam d;
    private static volatile dssr<aaam> e;
    public int a;
    public String b = "";
    public boolean c;

    static {
        aaam aaamVar = new aaam();
        d = aaamVar;
        dsqw.cc(aaam.class, aaamVar);
    }

    private aaam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new aaam();
            }
            if (i2 == 4) {
                return new aaal();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aaam> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aaam.class) {
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
