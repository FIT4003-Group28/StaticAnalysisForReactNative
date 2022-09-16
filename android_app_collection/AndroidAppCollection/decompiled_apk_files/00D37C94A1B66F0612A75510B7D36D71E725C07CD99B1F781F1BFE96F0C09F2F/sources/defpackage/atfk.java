package defpackage;
/* compiled from: PG */
/* renamed from: atfk  reason: default package */
/* loaded from: classes2.dex */
public final class atfk extends aopi implements aoqv {
    public static final atfk a;
    private static volatile aorb d;
    public int b;
    public atay c;
    private atan e;
    private atao f;
    private apmm g;
    private atbd h;
    private atat i;
    private atas j;
    private atbe k;
    private ataq l;
    private atai m;
    private atap n;
    private atal o;
    private atam p;
    private atar q;
    private ataj r;
    private atbb s;
    private atax t;
    private atav u;
    private atfa v;
    private asvh w;
    private atak x;
    private atba y;
    private byte z = 2;

    static {
        atfk atfkVar = new atfk();
        a = atfkVar;
        aopi.registerDefaultInstance(atfk.class, atfkVar);
    }

    private atfk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.z = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0001\ue5d8ᡈ\uf6f5爙\u0016\u0000\u0000\u0016\ue5d8ᡈᐉ\u0002\ue592᯦ᐉ\u0014ﵝῈᐉ\u0006ﵾῈᐉ\u0007\uf26c\u209eᐉ\b\uf8db₩ᐉ\u000b\uf181₯ᐉ\f\uf433₯ᐉ\u000e\uf436₯ᐉ\u000f\uf442₯ᐉ\u0010\ue57eℎᐉ\u0000\uf47f╛ᐉ\u0003\ue72f\u2bc7ᐉ\u0017\uef36\u2bccᐉ\u0012\uf426ⵢᐉ\u001b\uf620⽏ᐉ\u0013\uf1e4⽐ᐉ\t\uf219〡ᐉ\u0001\ue8ea㙁ᐉ\u0004\uf033㚈ᐉ\u0005瀞䢤ᐉ\u0015\uf6f5爙ᐉ\u0011", new Object[]{"b", "g", "v", "k", "l", "c", "n", "o", "p", "q", "r", "e", "h", "x", "t", "y", "u", "m", "f", "i", "j", "w", "s"});
            case 3:
                return new atfk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atfk.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
