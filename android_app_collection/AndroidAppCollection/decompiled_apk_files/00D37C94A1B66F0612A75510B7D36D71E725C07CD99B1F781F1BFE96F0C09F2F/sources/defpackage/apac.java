package defpackage;
/* compiled from: PG */
/* renamed from: apac  reason: default package */
/* loaded from: classes.dex */
public final class apac extends aopi implements aoqv {
    public static final apac a;
    private static volatile aorb d;
    public int b;
    public atpz c;

    static {
        apac apacVar = new apac();
        a = apacVar;
        aopi.registerDefaultInstance(apac.class, apacVar);
    }

    private apac() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf2d9₰\uf2d9₰\u0001\u0000\u0000\u0000\uf2d9₰ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apac();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apac.class) {
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
