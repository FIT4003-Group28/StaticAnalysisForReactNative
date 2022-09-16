package defpackage;
/* compiled from: PG */
/* renamed from: awac  reason: default package */
/* loaded from: classes2.dex */
public final class awac extends aopi implements aoqv {
    public static final awac a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public String e = "";
    public long f;

    static {
        awac awacVar = new awac();
        a = awacVar;
        aopi.registerDefaultInstance(awac.class, awacVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awacVar, awacVar, null, 76, aosj.MESSAGE, awac.class);
    }

    private awac() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new awac();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awac.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
