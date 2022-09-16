package defpackage;
/* compiled from: PG */
/* renamed from: anps */
/* loaded from: classes.dex */
public final class anps extends aopi implements aoqv {
    public static final anps a;
    private static volatile aorb d;
    public int b;
    public anpt c;

    static {
        anps anpsVar = new anps();
        a = anpsVar;
        aopi.registerDefaultInstance(anps.class, anpsVar);
    }

    private anps() {
    }

    public static /* synthetic */ void a(anps anpsVar) {
        anpsVar.b = 32;
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"b", "c"});
            case 3:
                return new anps();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anps.class) {
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
