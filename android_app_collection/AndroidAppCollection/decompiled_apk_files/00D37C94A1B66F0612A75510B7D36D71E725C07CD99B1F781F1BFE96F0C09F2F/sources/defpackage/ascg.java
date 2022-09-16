package defpackage;
/* compiled from: PG */
/* renamed from: ascg  reason: default package */
/* loaded from: classes2.dex */
public final class ascg extends aopi implements aoqv {
    public static final ascg a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        ascg ascgVar = new ascg();
        a = ascgVar;
        aopi.registerDefaultInstance(ascg.class, ascgVar);
    }

    private ascg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0002", new Object[]{"b", "c"});
            case 3:
                return new ascg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (ascg.class) {
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
