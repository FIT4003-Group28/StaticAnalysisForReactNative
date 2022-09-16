package defpackage;
/* compiled from: PG */
/* renamed from: aram  reason: default package */
/* loaded from: classes2.dex */
public final class aram extends aopi implements aoqv {
    public static final aram a;
    private static volatile aorb m;
    public int b;
    public boolean c;
    public boolean d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public int i;
    public apzg j;
    public asir k;
    private aoux n;
    private byte o = 2;
    public aoob l = aoob.b;

    static {
        aram aramVar = new aram();
        a = aramVar;
        aopi.registerDefaultInstance(aram.class, aramVar);
    }

    private aram() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0006\u0001ဇ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\u0007ᐉ\t\bည\n\tဉ\b\nᐉ\u0005\u000bဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "n", "l", "k", "h", "i", aqyp.n});
            case 3:
                return new aram();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aram.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
