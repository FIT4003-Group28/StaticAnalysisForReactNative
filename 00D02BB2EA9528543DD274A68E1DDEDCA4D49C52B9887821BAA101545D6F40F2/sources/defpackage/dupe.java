package defpackage;
/* compiled from: PG */
/* renamed from: dupe  reason: default package */
/* loaded from: classes6.dex */
public final class dupe extends dsqw<dupe, dupc> implements dssk {
    public static final dupe e;
    private static volatile dssr<dupe> h;
    public int a;
    public int b;
    private dnqh f;
    private byte g = 2;
    public dsrj<String> c = dssu.b;
    public String d = "";

    static {
        dupe dupeVar = new dupe();
        e = dupeVar;
        dsqw.cc(dupe.class, dupeVar);
    }

    private dupe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0001\u0002ဈ\u0002\u0003ᐉ\u0000\u0004\u001a\u0006ဌ\u0001", new Object[]{"a", "d", "f", "c", "b", dupd.a});
            }
            if (i2 == 3) {
                return new dupe();
            }
            if (i2 == 4) {
                return new dupc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dupe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dupe.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
