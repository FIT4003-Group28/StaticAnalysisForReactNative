package defpackage;
/* compiled from: PG */
/* renamed from: anpy  reason: default package */
/* loaded from: classes.dex */
public final class anpy extends aopi implements aoqv {
    public static final anpy a;
    private static volatile aorb c;
    public int b;

    static {
        anpy anpyVar = new anpy();
        a = anpyVar;
        aopi.registerDefaultInstance(anpy.class, anpyVar);
    }

    private anpy() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
            case 3:
                return new anpy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anpy.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
