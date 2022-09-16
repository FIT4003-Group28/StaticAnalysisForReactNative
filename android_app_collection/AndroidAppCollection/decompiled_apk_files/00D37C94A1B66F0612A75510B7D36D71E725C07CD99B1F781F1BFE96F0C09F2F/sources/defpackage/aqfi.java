package defpackage;
/* compiled from: PG */
/* renamed from: aqfi  reason: default package */
/* loaded from: classes2.dex */
public final class aqfi extends aopi implements aoqv {
    public static final aqfi a;
    public static final aopg b;
    private static volatile aorb d;
    public String c = "";
    private int e;

    static {
        aqfi aqfiVar = new aqfi();
        a = aqfiVar;
        aopi.registerDefaultInstance(aqfi.class, aqfiVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqfiVar, aqfiVar, null, 289084567, aosj.MESSAGE, aqfi.class);
    }

    private aqfi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "c"});
            case 3:
                return new aqfi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqfi.class) {
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
