package defpackage;
/* compiled from: PG */
/* renamed from: auoi  reason: default package */
/* loaded from: classes2.dex */
public final class auoi extends aopi implements aoqv {
    public static final auoi a;
    public static final aopg b;
    private static volatile aorb d;
    public boolean c;
    private int e;

    static {
        auoi auoiVar = new auoi();
        a = auoiVar;
        aopi.registerDefaultInstance(auoi.class, auoiVar);
        b = aopi.newSingularGeneratedExtension(awok.a, auoiVar, auoiVar, null, 305711371, aosj.MESSAGE, auoi.class);
    }

    private auoi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"e", "c"});
            case 3:
                return new auoi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auoi.class) {
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
