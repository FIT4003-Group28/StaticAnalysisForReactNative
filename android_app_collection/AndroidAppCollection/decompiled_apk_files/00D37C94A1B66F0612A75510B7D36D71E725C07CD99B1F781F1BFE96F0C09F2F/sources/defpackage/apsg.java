package defpackage;
/* compiled from: PG */
/* renamed from: apsg  reason: default package */
/* loaded from: classes2.dex */
public final class apsg extends aopi implements aoqv {
    public static final apsg a;
    private static volatile aorb d;
    public int b;
    public arag c;
    private int e;
    private byte f = 2;

    static {
        apsg apsgVar = new apsg();
        a = apsgVar;
        aopi.registerDefaultInstance(apsg.class, apsgVar);
    }

    private apsg() {
        aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002ဌ\u0001\u0004ᐉ\u0002", new Object[]{"e", "b", apog.m, "c"});
            case 3:
                return new apsg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apsg.class) {
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
