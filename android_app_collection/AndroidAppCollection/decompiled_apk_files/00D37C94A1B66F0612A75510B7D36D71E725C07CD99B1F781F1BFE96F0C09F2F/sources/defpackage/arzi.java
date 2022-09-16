package defpackage;
/* compiled from: PG */
/* renamed from: arzi  reason: default package */
/* loaded from: classes2.dex */
public final class arzi extends aopi implements aoqv {
    public static final arzi a;
    private static volatile aorb d;
    public int b;
    public atrv c;

    static {
        arzi arziVar = new arzi();
        a = arziVar;
        aopi.registerDefaultInstance(arzi.class, arziVar);
    }

    private arzi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue359ᢐ\ue359ᢐ\u0001\u0000\u0000\u0000\ue359ᢐဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arzi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arzi.class) {
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
