package defpackage;
/* compiled from: PG */
/* renamed from: assg  reason: default package */
/* loaded from: classes2.dex */
public final class assg extends aopi implements aoqv {
    public static final assg a;
    private static volatile aorb g;
    public int b;
    public arag d;
    public arag e;
    public aoqp f = aoqp.a;
    private byte h = 2;
    public String c = "";

    static {
        assg assgVar = new assg();
        a = assgVar;
        aopi.registerDefaultInstance(assg.class, assgVar);
    }

    private assg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004в", new Object[]{"b", "c", "d", "e", "f", assf.a});
            case 3:
                return new assg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (assg.class) {
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
