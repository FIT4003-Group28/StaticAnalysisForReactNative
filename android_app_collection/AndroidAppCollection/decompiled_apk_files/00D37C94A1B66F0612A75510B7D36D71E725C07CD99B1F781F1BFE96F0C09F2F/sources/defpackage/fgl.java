package defpackage;
/* compiled from: PG */
/* renamed from: fgl  reason: default package */
/* loaded from: classes3.dex */
public final class fgl extends aopi implements aoqv {
    public static final fgl a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        fgl fglVar = new fgl();
        a = fglVar;
        aopi.registerDefaultInstance(fgl.class, fglVar);
    }

    private fgl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"b", "c"});
            case 3:
                return new fgl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (fgl.class) {
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
