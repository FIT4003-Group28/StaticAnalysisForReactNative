package defpackage;
/* compiled from: PG */
/* renamed from: aqoq  reason: default package */
/* loaded from: classes2.dex */
public final class aqoq extends aopi implements aoqv {
    public static final aqoq a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    private awpc f;
    private awpc g;
    private byte h = 2;
    public String d = "";

    static {
        aqoq aqoqVar = new aqoq();
        a = aqoqVar;
        aopi.registerDefaultInstance(aqoq.class, aqoqVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqoqVar, aqoqVar, null, 353892150, aosj.MESSAGE, aqoq.class);
    }

    private aqoq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u000e\u0003\u0000\u0000\u0002\u0002ဈ\u000f\rᐉ\u0006\u000eᐉ\u0007", new Object[]{"c", "d", "f", "g"});
            case 3:
                return new aqoq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqoq.class) {
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
