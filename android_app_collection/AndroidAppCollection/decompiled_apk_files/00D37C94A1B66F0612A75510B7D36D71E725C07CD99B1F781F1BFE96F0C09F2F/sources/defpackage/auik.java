package defpackage;
/* compiled from: PG */
/* renamed from: auik  reason: default package */
/* loaded from: classes2.dex */
public final class auik extends aopi implements aoqv {
    public static final auik a;
    private static volatile aorb x;
    public int b;
    public avhn c;
    public aunb d;
    public arhs e;
    public arag f;
    public arag g;
    public arag h;
    public aunb i;
    public aunb j;
    public long k;
    public boolean l;
    public arag m;
    public apzg n;
    public aunb p;
    public long q;
    public apnp r;
    public boolean t;
    public auhy u;
    public auij v;
    public boolean w;
    private byte y = 2;
    public aopu o = emptyProtobufList();
    public aopu s = emptyProtobufList();

    static {
        auik auikVar = new auik();
        a = auikVar;
        aopi.registerDefaultInstance(auik.class, auikVar);
    }

    private auik() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0002\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\n\bᐉ\u000b\tЛ\nᐉ\f\u000bဂ\r\fဉ\u000e\rЛ\u000eဇ\u000f\u000fᐉ\u0006\u0011ဉ\u0011\u0012ဉ\u0012\u0014ဇ\u0014\u0016ᐉ\u0007\u0017ဂ\b\u0018ဇ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "m", "n", "o", apzg.class, "p", "q", "r", "s", apzg.class, "t", "i", "u", "v", "w", "j", "k", "l"});
            case 3:
                return new auik();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = x;
                if (aorbVar == null) {
                    synchronized (auik.class) {
                        aorbVar = x;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            x = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
