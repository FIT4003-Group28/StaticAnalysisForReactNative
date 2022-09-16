package defpackage;
/* compiled from: PG */
/* renamed from: anre  reason: default package */
/* loaded from: classes.dex */
public final class anre extends aopi implements aoqv {
    public static final anre a;
    private static volatile aorb f;
    public anrb b;
    public int c;
    public int d;
    public int e;

    static {
        anre anreVar = new anre();
        a = anreVar;
        aopi.registerDefaultInstance(anre.class, anreVar);
    }

    private anre() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anre();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (anre.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
