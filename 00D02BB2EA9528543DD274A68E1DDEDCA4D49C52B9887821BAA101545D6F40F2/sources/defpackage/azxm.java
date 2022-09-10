package defpackage;

import defpackage.azwm;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxm  reason: default package */
/* loaded from: classes.dex */
public abstract class azxm<T extends azwm<T>> {
    public static final azxm<azvm> a;
    public static final azxm<azvo> b;
    public static final azxm<azwo> c;
    public static final azxm<azzh> d;
    public static final azxm<azxk> e;
    public static final azxm<azyh> f;
    public static final azxm<azwc> g;
    public static final azxm<azxa> h;
    public static final azxm<azwa> i;
    public static final azxm<azxi> j;
    public static final azxm<azxg> k;
    public static final azxm<azyf> l;
    public static final azxm<azxe> m;
    public static final dcep<azxm<?>> n;

    static {
        azxo azxoVar = new azxo();
        a = azxoVar;
        azxp azxpVar = new azxp();
        b = azxpVar;
        azxw azxwVar = new azxw();
        c = azxwVar;
        azyd azydVar = new azyd();
        d = azydVar;
        azya azyaVar = new azya();
        e = azyaVar;
        azyc azycVar = new azyc();
        f = azycVar;
        azxv azxvVar = new azxv();
        g = azxvVar;
        azxn azxnVar = new azxn();
        h = azxnVar;
        azxq azxqVar = new azxq();
        i = azxqVar;
        azxz azxzVar = new azxz();
        j = azxzVar;
        azxy azxyVar = new azxy();
        k = azxyVar;
        azyb azybVar = new azyb();
        l = azybVar;
        azxx azxxVar = new azxx();
        m = azxxVar;
        n = dcep.G(azxoVar, azxpVar, azydVar, azyaVar, azxwVar, azycVar, azxvVar, azxnVar, azxqVar, azxzVar, azxyVar, azybVar, azxxVar);
    }

    public static azxm<?> a(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return b;
            }
            switch (i2) {
                case 6:
                    return d;
                case 7:
                    return e;
                case 8:
                    return c;
                case 9:
                    return f;
                case 10:
                    return g;
                case 11:
                    return h;
                case 12:
                    return i;
                case 13:
                    return j;
                case 14:
                    return k;
                case 15:
                    return l;
                case 16:
                    return m;
                default:
                    throw new IllegalArgumentException(String.format("Unknown corpus ID %d", Integer.valueOf(i2)));
            }
        }
        return a;
    }

    public abstract azxl b();

    public abstract azwh<T> c(byte[] bArr);

    public abstract List<azwj> d(doiz doizVar);

    public abstract List<T> e(doiz doizVar);

    public abstract byte[] f(T t);

    @dzsi
    public ckhg g() {
        return null;
    }
}
