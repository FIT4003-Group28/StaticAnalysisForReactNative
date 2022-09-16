package defpackage;
/* compiled from: PG */
/* renamed from: awqc  reason: default package */
/* loaded from: classes2.dex */
public final class awqc extends aopi implements aoqv {
    public static final awqc a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public String d = "";

    static {
        awqc awqcVar = new awqc();
        a = awqcVar;
        aopi.registerDefaultInstance(awqc.class, awqcVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awqcVar, awqcVar, null, 360463768, aosj.MESSAGE, awqc.class);
    }

    private awqc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awqc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awqc.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
