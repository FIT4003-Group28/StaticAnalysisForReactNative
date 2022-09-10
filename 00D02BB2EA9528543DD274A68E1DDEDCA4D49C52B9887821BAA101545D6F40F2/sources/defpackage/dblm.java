package defpackage;
/* compiled from: PG */
/* renamed from: dblm  reason: default package */
/* loaded from: classes5.dex */
public final class dblm extends dsqw<dblm, dbll> implements dssk {
    public static final dblm a;
    private static volatile dssr<dblm> i;
    private int b;
    private int c;
    private dbkr d;
    private dgrf e;
    private dblt f;
    private dblo g;
    private byte h = 2;

    static {
        dblm dblmVar = new dblm();
        a = dblmVar;
        dsqw.cc(dblm.class, dblmVar);
    }

    private dblm() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0002\u0003'\u0004\u0000\u0000\u0002\u0003ᐉ\u0003\u000bᐉ\u000b\u001dဉ!'ဉ\u0014", new Object[]{"b", "c", "d", "e", "g", "f"});
            }
            if (i3 == 3) {
                return new dblm();
            }
            if (i3 == 4) {
                return new dbll();
            }
            if (i3 == 5) {
                return a;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dblm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dblm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
