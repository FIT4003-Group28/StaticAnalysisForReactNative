package defpackage;
/* compiled from: PG */
/* renamed from: dkjs  reason: default package */
/* loaded from: classes6.dex */
public final class dkjs extends dsqw<dkjs, dkjr> implements dssk {
    public static final dsrg<Integer, dpvf> c = new dkjq();
    public static final dkjs h;
    private static volatile dssr<dkjs> i;
    public int a;
    public dsrf b = dsqz.b;
    public dkkf d;
    public dkkf e;
    public int f;
    public int g;

    static {
        dkjs dkjsVar = new dkjs();
        h = dkjsVar;
        dsqw.cc(dkjs.class, dkjsVar);
    }

    private dkjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဌ\u0002\u0005င\u0003", new Object[]{"a", "b", dpvf.c(), "d", "e", "f", dkjy.a, "g"});
            }
            if (i3 == 3) {
                return new dkjs();
            }
            if (i3 == 4) {
                return new dkjr();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkjs> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkjs.class) {
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
