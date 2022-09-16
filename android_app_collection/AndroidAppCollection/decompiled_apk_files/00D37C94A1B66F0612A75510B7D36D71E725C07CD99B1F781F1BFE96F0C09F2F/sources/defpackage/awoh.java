package defpackage;
/* compiled from: PG */
/* renamed from: awoh  reason: default package */
/* loaded from: classes2.dex */
public final class awoh extends aopi implements aoqv {
    public static final awoh a;
    public static final aopg b;
    private static volatile aorb e;
    public awmt d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        awoh awohVar = new awoh();
        a = awohVar;
        aopi.registerDefaultInstance(awoh.class, awohVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awohVar, awohVar, null, 325347951, aosj.MESSAGE, awoh.class);
    }

    private awoh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new awoh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awoh.class) {
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
