package defpackage;
/* compiled from: PG */
/* renamed from: awqg  reason: default package */
/* loaded from: classes2.dex */
public final class awqg extends aopi implements aoqv {
    public static final awqg a;
    public static final aopg b;
    private static volatile aorb d;
    public String c = "";
    private int e;

    static {
        awqg awqgVar = new awqg();
        a = awqgVar;
        aopi.registerDefaultInstance(awqg.class, awqgVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awqgVar, awqgVar, null, 315254111, aosj.MESSAGE, awqg.class);
    }

    private awqg() {
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
                return new awqg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awqg.class) {
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
