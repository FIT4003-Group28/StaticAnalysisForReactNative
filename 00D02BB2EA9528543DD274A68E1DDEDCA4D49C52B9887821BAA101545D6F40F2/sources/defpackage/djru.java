package defpackage;
/* compiled from: PG */
/* renamed from: djru  reason: default package */
/* loaded from: classes6.dex */
public final class djru extends dsqw<djru, djrt> implements dssk {
    public static final djru a;
    private static volatile dssr<djru> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        djru djruVar = new djru();
        a = djruVar;
        dsqw.cc(djru.class, djruVar);
    }

    private djru() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new djru();
            }
            if (i2 == 4) {
                return new djrt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<djru> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djru.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
