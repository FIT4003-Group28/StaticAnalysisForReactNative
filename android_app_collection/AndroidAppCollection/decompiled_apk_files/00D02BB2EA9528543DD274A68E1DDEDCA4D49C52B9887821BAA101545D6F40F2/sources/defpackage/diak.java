package defpackage;
/* compiled from: PG */
/* renamed from: diak  reason: default package */
/* loaded from: classes6.dex */
public final class diak extends dsqs<diak, diaj> implements dsqt {
    public static final diak g;
    private static volatile dssr<diak> i;
    public int a;
    public dhtc b;
    public dkfl d;
    public dkfx e;
    public dqam f;
    private byte h = 2;
    public dsrj<dhsy> c = dssu.b;

    static {
        diak diakVar = new diak();
        g = diakVar;
        dsqw.cc(diak.class, diakVar);
    }

    private diak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0004ဉ\u0003\u0007ဉ\u0001\tဉ\u0007", new Object[]{"a", "b", "c", dhsy.class, "e", "d", "f"});
            }
            if (i3 == 3) {
                return new diak();
            }
            if (i3 == 4) {
                return new diaj();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<diak> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diak.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
