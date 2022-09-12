package defpackage;
/* compiled from: PG */
/* renamed from: djqw  reason: default package */
/* loaded from: classes6.dex */
public final class djqw extends dsqw<djqw, djqn> implements dssk {
    public static final djqw h;
    private static volatile dssr<djqw> j;
    public int a;
    public double b;
    public int c;
    public djqt d;
    public dvzd e;
    public djqp f;
    public dnqh g;
    private byte i = 2;

    static {
        djqw djqwVar = new djqw();
        h = djqwVar;
        dsqw.cc(djqw.class, djqwVar);
    }

    private djqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001က\u0000\u0002ဌ\u0001\u0003ဉ\u0003\u0004ᐉ\u0005\u0006ဉ\u0002\u0007ဉ\u0004", new Object[]{"a", "b", "c", djqr.c(), "e", "g", "d", "f"});
            }
            if (i2 == 3) {
                return new djqw();
            }
            if (i2 == 4) {
                return new djqn();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<djqw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djqw.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
