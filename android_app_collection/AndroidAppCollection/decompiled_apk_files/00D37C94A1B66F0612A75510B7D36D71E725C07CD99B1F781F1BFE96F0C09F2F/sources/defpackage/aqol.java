package defpackage;
/* compiled from: PG */
/* renamed from: aqol  reason: default package */
/* loaded from: classes2.dex */
public final class aqol extends aopi implements aoqv {
    public static final aqol a;
    public static final aopg b;
    private static volatile aorb d;
    public float c;
    private int e;

    static {
        aqol aqolVar = new aqol();
        a = aqolVar;
        aopi.registerDefaultInstance(aqol.class, aqolVar);
        b = aopi.newSingularGeneratedExtension(awnz.a, aqolVar, aqolVar, null, 339295757, aosj.MESSAGE, aqol.class);
    }

    private aqol() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"e", "c"});
            case 3:
                return new aqol();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqol.class) {
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
