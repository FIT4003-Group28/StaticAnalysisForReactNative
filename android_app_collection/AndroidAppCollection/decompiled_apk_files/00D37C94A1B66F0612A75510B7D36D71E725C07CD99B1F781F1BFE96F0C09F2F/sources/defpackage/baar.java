package defpackage;
/* compiled from: PG */
/* renamed from: baar  reason: default package */
/* loaded from: classes2.dex */
public final class baar extends aopi implements aoqv {
    public static final baar a;
    private static volatile aorb d;
    public aopq b = emptyIntList();
    public aopq c = emptyIntList();

    static {
        baar baarVar = new baar();
        a = baarVar;
        aopi.registerDefaultInstance(baar.class, baarVar);
    }

    private baar() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
            case 3:
                return new baar();
            case 4:
                return new aopa((boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (baar.class) {
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
