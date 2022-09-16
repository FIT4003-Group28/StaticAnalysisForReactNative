package defpackage;
/* compiled from: PG */
/* renamed from: dofj  reason: default package */
/* loaded from: classes6.dex */
public final class dofj extends dsqw<dofj, dofc> implements dssk {
    public static final dofj d;
    private static volatile dssr<dofj> e;
    public int a;
    public dofi b;
    public int c;

    static {
        dofj dofjVar = new dofj();
        d = dofjVar;
        dsqw.cc(dofj.class, dofjVar);
    }

    private dofj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dofd.a});
            }
            if (i2 == 3) {
                return new dofj();
            }
            if (i2 == 4) {
                return new dofc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dofj.class) {
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
