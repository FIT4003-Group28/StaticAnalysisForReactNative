package defpackage;
/* compiled from: PG */
/* renamed from: atha  reason: default package */
/* loaded from: classes2.dex */
public final class atha extends aopi implements aoqv {
    public static final atha a;
    private static volatile aorb s;
    public int b;
    public avhn c;
    public atgz d;
    public aunb e;
    public atgy f;
    public atgv g;
    public aunb h;
    public aunb i;
    public atgu j;
    public aunb k;
    public aunb l;
    public aunb m;
    public aunb n;
    public aunb o;
    public boolean p;
    public aunb q;
    public aunb r;
    private atgx t;
    private atgx u;
    private atgt v;
    private atgw w;
    private byte x = 2;

    static {
        atha athaVar = new atha();
        a = athaVar;
        aopi.registerDefaultInstance(atha.class, athaVar);
    }

    private atha() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.x = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\u000b\nᐉ\f\fᐉ\u000e\rᐉ\u000f\u000eᐉ\r\u000fᐉ\u0010\u0010ᐉ\u0002\u0011ᐉ\t\u0012ᐉ\n\u0013ဇ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"b", "c", "d", "f", "t", "u", "g", "v", "w", "j", "k", "m", "n", "l", "o", "e", "h", "i", "p", "q", "r"});
            case 3:
                return new atha();
            case 4:
                return new aopa((short[]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (atha.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
