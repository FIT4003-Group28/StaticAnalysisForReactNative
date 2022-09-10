package defpackage;
/* compiled from: PG */
/* renamed from: chit  reason: default package */
/* loaded from: classes4.dex */
public final class chit extends dsqw<chit, chis> implements dssk {
    public static final chit i;
    private static volatile dssr<chit> k;
    public int a;
    public boolean c;
    public int d;
    public chir f;
    public int g;
    public int h;
    private byte j = 2;
    public dsrj<chik> b = dssu.b;
    public String e = "";

    static {
        chit chitVar = new chit();
        i = chitVar;
        dsqw.cc(chit.class, chitVar);
    }

    private chit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000\u0003င\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဌ\u0005", new Object[]{"a", "b", chik.class, "c", "d", "e", "f", "g", "h", chil.a});
            }
            if (i3 == 3) {
                return new chit();
            }
            if (i3 == 4) {
                return new chis();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<chit> dssrVar = k;
            if (dssrVar == null) {
                synchronized (chit.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }

    public final void b() {
        dsrj<chik> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
