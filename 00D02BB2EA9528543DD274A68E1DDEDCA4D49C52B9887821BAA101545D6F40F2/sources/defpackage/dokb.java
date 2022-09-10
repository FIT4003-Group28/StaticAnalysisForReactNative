package defpackage;
/* compiled from: PG */
/* renamed from: dokb  reason: default package */
/* loaded from: classes6.dex */
public final class dokb extends dsqw<dokb, doka> implements dssk {
    public static final dokb i;
    private static volatile dssr<dokb> j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public dsrj<dnik> f = dssu.b;
    public dsrj<dnik> g = dssu.b;
    public dsrj<dnii> h = dssu.b;

    static {
        dokb dokbVar = new dokb();
        i = dokbVar;
        dsqw.cc(dokb.class, dokbVar);
    }

    private dokb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0005ဈ\u0000\u0006ဈ\u0002\u0007\u001b\bဈ\u0003", new Object[]{"a", "c", "g", dnik.class, "h", dnii.class, "b", "d", "f", dnik.class, "e"});
            }
            if (i3 == 3) {
                return new dokb();
            }
            if (i3 == 4) {
                return new doka();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dokb> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dokb.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dnik> dsrjVar = this.f;
        if (!dsrjVar.a()) {
            this.f = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dnik> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
