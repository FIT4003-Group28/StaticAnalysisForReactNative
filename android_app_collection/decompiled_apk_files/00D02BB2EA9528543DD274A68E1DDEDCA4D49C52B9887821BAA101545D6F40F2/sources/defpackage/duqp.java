package defpackage;
/* compiled from: PG */
/* renamed from: duqp  reason: default package */
/* loaded from: classes6.dex */
public final class duqp extends dsqw<duqp, duqo> implements dssk {
    private static volatile dssr<duqp> I;
    public static final duqp y;
    private dwcw A;
    private djyy B;
    private diwr C;
    private dibo D;
    private durr E;
    private dwcy F;
    private duqe G;
    private byte H = 2;
    public int a;
    public duqk b;
    public dwir c;
    public dwaw d;
    public dvzj e;
    public dvct f;
    public durb g;
    public dwiv h;
    public dwbc i;
    public dvzl j;
    public durv k;
    public durh l;
    public dvcx m;
    public duqx n;
    public duqz o;
    public durd p;
    public durt q;
    public dibq r;
    public dwsr s;
    public duqa t;
    public durp u;
    public duqt v;
    public durl w;
    public duqc x;
    private int z;

    static {
        duqp duqpVar = new duqp();
        y = duqpVar;
        dsqw.cc(duqp.class, duqpVar);
    }

    private duqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(y, "\u0001\u001e\u0000\u0002\u0001%\u001e\u0000\u0000\u0012\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\f\u0007ᐉ\r\bᐉ\u000e\tᐉ\u000f\nဉ\u0011\u000bဉ\u0012\fᐉ\u0005\rဉ\u0013\u0011ᐉ\u0010\u0012ᐉ\u0007\u0013ဉ\u001c\u0014ဉ\u001d\u0015ᐉ\b\u0017ᐉ\u0017\u0018ᐉ\n\u0019ᐉ\u001b\u001cဉ\u0018\u001dᐉ\u000b\u001eဉ\u0014 ဉ\u001f!ဉ \"ᐉ\"#ဉ!$ᐉ\t%ဉ\u001a", new Object[]{"a", "z", "b", "c", "d", "e", "A", "h", "i", "j", "F", "l", "m", "f", "n", "k", "B", "t", "u", "C", "p", "g", "s", "q", "E", "o", "v", "w", "G", "x", "D", "r"});
            }
            if (i2 == 3) {
                return new duqp();
            }
            if (i2 == 4) {
                return new duqo();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.H = b;
                return null;
            }
            dssr<duqp> dssrVar = I;
            if (dssrVar == null) {
                synchronized (duqp.class) {
                    dssrVar = I;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(y);
                        I = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.H);
    }
}
