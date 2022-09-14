package defpackage;
/* compiled from: PG */
/* renamed from: dnik  reason: default package */
/* loaded from: classes6.dex */
public final class dnik extends dsqw<dnik, dnij> implements dssk {
    public static final dnik c;
    private static volatile dssr<dnik> d;
    public int a;
    public int b;

    static {
        dnik dnikVar = new dnik();
        c = dnikVar;
        dsqw.cc(dnik.class, dnikVar);
    }

    private dnik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnik();
            }
            if (i2 == 4) {
                return new dnij();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnik> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnik.class) {
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
