package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: asxy  reason: default package */
/* loaded from: classes2.dex */
public final class asxy extends aopi implements aoqv {
    public static final asxy a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public String d;

    static {
        asxy asxyVar = new asxy();
        a = asxyVar;
        aopi.registerDefaultInstance(asxy.class, asxyVar);
    }

    private asxy() {
        aoob aoobVar = aoob.b;
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new asxy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asxy.class) {
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
