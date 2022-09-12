package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dkog  reason: default package */
/* loaded from: classes.dex */
public final class dkog extends dsqw<dkog, dkob> implements dssk {
    public static final dkog T;
    private static volatile dssr<dkog> W;
    public boolean A;
    public boolean B;
    public dkoa C;
    public dkod D;
    public dkod E;
    public boolean F;
    public dqzi G;
    public dqzi H;
    public dqza J;
    public dqza K;
    public boolean L;
    public dqyy M;
    public dqzg N;
    public boolean O;
    public long R;
    public long S;
    private int U;
    private int V;
    public int a;
    public boolean b;
    public boolean c;
    public boolean e;
    public dkof q;
    public boolean s;
    public boolean u;
    public boolean v;
    public boolean y;
    public boolean z;
    public boolean d = true;
    public String f = "";
    public boolean g = true;
    public int h = 60;
    public int i = 60;
    public int j = cpnx.a;
    public boolean k = true;
    public int l = 40320;
    public int m = 4320;
    public String n = "https://myaccount.google.com/blocklist";
    public int o = 30;
    public int p = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    public boolean r = true;
    public int t = 900000;
    public int w = 900;
    public int x = 604800000;
    public dsrj<dqzk> I = dssu.b;
    public long P = 1545397200000L;
    public long Q = 1545829200000L;

    static {
        dkog dkogVar = new dkog();
        T = dkogVar;
        dsqw.cc(dkog.class, dkogVar);
    }

    private dkog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(T, "\u0001,\u0000\u0003\u0002_,\u0000\u0001\u0000\u0002င\u000b\u0003င\f\u0005င\u0013\u0006ဉ\u0015\u000eဇ!\u0010င$\u0012ဇ\u0018\u0016င'\u0017ဇ(\u0018ဇ)\u001aင\u0014\u001eဇ\u001d\u001fင\u001e ဇ+!ဇ\u001f\"ဉ8$ဈ\u0012(င\u000f)င\u0010,ဉ<-ဉ=3ဇ\u000e7င\n9ဇ\u0004<ဇ\u0007=ဇ\t@ဇAAဈ\bBဉBCဉCD\u001bEဉEFဉHGဉIIဂKJဂLMဇJNဂNOဂOSဇ\u0002Tဇ\u0001WဉFXဇG_ဇ,", new Object[]{"a", "U", "V", "i", "j", "o", "q", "v", "w", "r", "x", "y", "z", "p", "s", "t", "A", "u", "C", "n", "l", "m", "D", "E", "k", "h", "d", "e", "g", "F", "f", "G", "H", "I", dqzk.class, "J", "M", "N", "P", "Q", "O", "R", "S", "c", "b", "K", "L", "B"});
            }
            if (i2 == 3) {
                return new dkog();
            }
            if (i2 == 4) {
                return new dkob();
            }
            if (i2 == 5) {
                return T;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkog> dssrVar = W;
            if (dssrVar == null) {
                synchronized (dkog.class) {
                    dssrVar = W;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(T);
                        W = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
