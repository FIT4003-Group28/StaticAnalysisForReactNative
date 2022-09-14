package defpackage;
/* compiled from: PG */
/* renamed from: chif  reason: default package */
/* loaded from: classes4.dex */
public final class chif extends dsqw<chif, chie> implements dssk {
    public static final chif d;
    private static volatile dssr<chif> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        chif chifVar = new chif();
        d = chifVar;
        dsqw.cc(chif.class, chifVar);
    }

    private chif() {
    }

    public static /* synthetic */ void b(chif chifVar) {
        chifVar.a |= 1;
        chifVar.b = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chif();
            }
            if (i2 == 4) {
                return new chie();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chif> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chif.class) {
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
