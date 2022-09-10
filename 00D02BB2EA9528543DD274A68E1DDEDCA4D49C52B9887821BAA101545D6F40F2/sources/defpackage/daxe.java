package defpackage;
/* compiled from: PG */
/* renamed from: daxe  reason: default package */
/* loaded from: classes5.dex */
public final class daxe extends dsqw<daxe, daxb> implements dssk {
    public static final daxe c;
    private static volatile dssr<daxe> e;
    public int a;
    public dsrj<String> b = dssu.b;
    private int d;

    static {
        daxe daxeVar = new daxe();
        c = daxeVar;
        dsqw.cc(daxe.class, daxeVar);
    }

    private daxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a", new Object[]{"d", "a", daxc.a, "b"});
            }
            if (i2 == 3) {
                return new daxe();
            }
            if (i2 == 4) {
                return new daxb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (daxe.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
