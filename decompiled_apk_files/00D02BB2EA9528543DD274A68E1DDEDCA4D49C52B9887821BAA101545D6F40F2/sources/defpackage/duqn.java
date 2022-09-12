package defpackage;
/* compiled from: PG */
/* renamed from: duqn  reason: default package */
/* loaded from: classes6.dex */
public final class duqn extends dsqw<duqn, duqm> implements dssk {
    public static final dsrg<Integer, duqi> d = new duql();
    public static final duqn n;
    private static volatile dssr<duqn> q;
    public int a;
    public dwir f;
    public dwaw g;
    public dvzj h;
    public durf i;
    public dvct j;
    public dvto k;
    public dwsn l;
    public diji m;
    private dwcw o;
    private byte p = 2;
    public String b = "";
    public dsrf c = dsqz.b;
    public dsrj<duqg> e = dssu.b;

    static {
        duqn duqnVar = new duqn();
        n = duqnVar;
        dsqw.cc(duqn.class, duqnVar);
    }

    private duqn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0002\b\u0001ဈ\u0000\u0002\u001e\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005\b\u001b\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\rᐉ\t", new Object[]{"a", "b", "c", duqi.c(), "f", "g", "h", "o", "i", "e", duqg.class, "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new duqn();
            }
            if (i2 == 4) {
                return new duqm();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            }
            dssr<duqn> dssrVar = q;
            if (dssrVar == null) {
                synchronized (duqn.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.p);
    }
}
