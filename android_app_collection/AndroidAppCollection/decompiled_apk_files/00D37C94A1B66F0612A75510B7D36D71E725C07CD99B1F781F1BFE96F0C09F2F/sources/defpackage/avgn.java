package defpackage;
/* compiled from: PG */
/* renamed from: avgn */
/* loaded from: classes2.dex */
public final class avgn extends aopi implements aoqv {
    private static final avgn a;
    private static volatile aorb b;
    private int c;
    private avgl d;

    static {
        avgn avgnVar = new avgn();
        a = avgnVar;
        aopi.registerDefaultInstance(avgn.class, avgnVar);
    }

    private avgn() {
    }

    public static avgm a() {
        return (avgm) a.createBuilder();
    }

    public static /* synthetic */ avgn b() {
        return a;
    }

    public void d(avgl avglVar) {
        avglVar.getClass();
        this.d = avglVar;
        this.c |= 1;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new avgn();
            case 4:
                return new avgm();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avgn.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
