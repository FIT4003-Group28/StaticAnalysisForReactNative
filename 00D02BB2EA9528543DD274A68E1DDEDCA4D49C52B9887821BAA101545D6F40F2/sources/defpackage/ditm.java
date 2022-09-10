package defpackage;
/* compiled from: PG */
/* renamed from: ditm  reason: default package */
/* loaded from: classes6.dex */
public final class ditm extends dsqw<ditm, ditj> implements dssk {
    public static final ditm f;
    private static volatile dssr<ditm> i;
    public int a;
    public long c;
    public boolean d;
    public dqxx e;
    private dnqh g;
    private byte h = 2;
    public dsrj<ditl> b = dssu.b;

    static {
        ditm ditmVar = new ditm();
        f = ditmVar;
        dsqw.cc(ditm.class, ditmVar);
    }

    private ditm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0001\u0002ᐉ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဇ\u0003\u0006ဉ\u0004", new Object[]{"a", "g", "b", ditl.class, "c", "d", "e"});
            }
            if (i3 == 3) {
                return new ditm();
            }
            if (i3 == 4) {
                return new ditj();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<ditm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ditm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
