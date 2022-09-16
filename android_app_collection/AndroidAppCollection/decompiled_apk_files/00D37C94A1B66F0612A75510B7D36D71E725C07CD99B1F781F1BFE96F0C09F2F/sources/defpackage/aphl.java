package defpackage;
/* compiled from: PG */
/* renamed from: aphl  reason: default package */
/* loaded from: classes.dex */
public final class aphl extends aopi implements aoqv {
    public static final aphl a;
    private static volatile aorb d;
    public apok b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        aphl aphlVar = new aphl();
        a = aphlVar;
        aopi.registerDefaultInstance(aphl.class, aphlVar);
    }

    private aphl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c", aoxm.e});
            case 3:
                return new aphl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aphl.class) {
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
