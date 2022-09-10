package defpackage;
/* compiled from: PG */
/* renamed from: dtqu  reason: default package */
/* loaded from: classes6.dex */
public final class dtqu extends dsqw<dtqu, dtqt> implements dssk {
    public static final dtqu f;
    private static volatile dssr<dtqu> g;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    static {
        dtqu dtquVar = new dtqu();
        f = dtquVar;
        dsqw.cc(dtqu.class, dtquVar);
    }

    private dtqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဌ\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "c", dtjs.c(), "b", dtja.c(), "d", "e"});
            }
            if (i2 == 3) {
                return new dtqu();
            }
            if (i2 == 4) {
                return new dtqt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtqu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
