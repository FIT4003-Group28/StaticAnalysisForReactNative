package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dkks  reason: default package */
/* loaded from: classes.dex */
public final class dkks extends dsqw<dkks, dkjg> implements dkkt {
    public static final dkks K;
    private static volatile dssr<dkks> L;
    public int C;
    public int E;
    public dkkl F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public int a;
    public dkjk b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public dkkf g;
    public int h;
    public dkkf i;
    public boolean j;
    public int k;
    public dkjt l;
    public int m;
    public int n;
    public int o;
    public dkjo r;
    public int s;
    public int t;
    public int w;
    public boolean z;
    public int p = 1;
    public int q = 5;
    public int u = -1;
    public dsrf v = dsqz.b;
    public dsrf x = dsqz.b;
    public dsrf y = dsqz.b;
    public dsrf A = dsqz.b;
    public dsrf B = dsqz.b;
    public dsrf D = dsqz.b;

    static {
        dkks dkksVar = new dkks();
        K = dkksVar;
        dsqw.cc(dkks.class, dkksVar);
    }

    private dkks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(K, "\u0001#\u0000\u0001\u00011#\u0000\u0006\u0000\u0001ဇ\u0002\u0002ဇ\u0003\u0003င\u0005\u0004င\u0007\u0005ဌ\n\u0006ဌ\f\u0007ဌ\r\nဌ\u0012\rဉ\u0006\u000eဉ\b\u000fဌ\u0016\u0010ဇ\t\u0011ဌ\u0013\u0013ဇ\u0018\u0014\u0016\u0015ဌ\u001a\u0016ဉ\u001b\u0017\u0016\u0018င\u0010\u0019\u0016\u001aဉ\u0011\u001cင\u0015\u001dဌ\u000e\u001eဉ\u000b\u001fင\u0019 \u0016!ဇ\u001c#င\u001d$\u0016&\u0016'ဇ\u001e(ဇ\u001f)ဌ\u00040င\u000f1ဉ\u0000", new Object[]{"a", "c", "d", "f", "h", "k", dkjy.a, "m", dkka.a, "n", dkkm.a, "s", dkko.a, "g", "i", "w", dkju.a, "j", "t", dkkq.a, "z", "A", "E", dkjh.a, "F", "x", "q", "B", "r", "u", "o", dkjw.a, "l", "C", "v", "G", "H", "y", "D", "I", "J", "e", dkkg.a, "p", "b"});
            }
            if (i2 == 3) {
                return new dkks();
            }
            if (i2 == 4) {
                return new dkjg();
            }
            if (i2 == 5) {
                return K;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkks> dssrVar = L;
            if (dssrVar == null) {
                synchronized (dkks.class) {
                    dssrVar = L;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(K);
                        L = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    @Override // defpackage.dkkt
    public final List<Integer> a() {
        return this.y;
    }

    @Override // defpackage.dkkt
    public final int b() {
        return this.H;
    }

    @Override // defpackage.dkkt
    public final void c() {
    }

    @Override // defpackage.dkkt
    public final int d() {
        int a = dkkb.a(this.m);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
