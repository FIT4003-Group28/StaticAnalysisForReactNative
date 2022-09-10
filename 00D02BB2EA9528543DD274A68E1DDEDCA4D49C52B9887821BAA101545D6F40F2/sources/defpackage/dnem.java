package defpackage;
/* compiled from: PG */
/* renamed from: dnem  reason: default package */
/* loaded from: classes6.dex */
public final class dnem extends dsqw<dnem, dnef> implements dssk {
    public static final dnem h;
    private static volatile dssr<dnem> i;
    public int a;
    public dqfw b;
    public dnel c;
    public boolean d;
    public boolean e;
    public boolean f;
    public dneh g;

    static {
        dnem dnemVar = new dnem();
        h = dnemVar;
        dsqw.cc(dnem.class, dnemVar);
    }

    private dnem() {
    }

    public static /* synthetic */ void b(dnem dnemVar) {
        dnemVar.a |= 4;
        dnemVar.d = false;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dnem();
            }
            if (i3 == 4) {
                return new dnef();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnem> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnem.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
