package defpackage;
/* compiled from: PG */
/* renamed from: dkdk  reason: default package */
/* loaded from: classes6.dex */
public final class dkdk extends dsqw<dkdk, dkdj> implements dssk {
    public static final dkdk e;
    private static volatile dssr<dkdk> g;
    public int a;
    public duld d;
    private byte f = 2;
    public dsrj<dwfl> b = dssu.b;
    public dsrj<dulb> c = dssu.b;

    static {
        dkdk dkdkVar = new dkdk();
        e = dkdkVar;
        dsqw.cc(dkdk.class, dkdkVar);
    }

    private dkdk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u001b\u0002Л\u0003ᐉ\u0000", new Object[]{"a", "b", dwfl.class, "c", dulb.class, "d"});
            }
            if (i2 == 3) {
                return new dkdk();
            }
            if (i2 == 4) {
                return new dkdj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dkdk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkdk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
