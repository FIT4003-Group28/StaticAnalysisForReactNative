package defpackage;
/* compiled from: PG */
/* renamed from: atdc  reason: default package */
/* loaded from: classes2.dex */
public final class atdc extends aopi implements aoqv {
    public static final atdc a;
    private static volatile aorb d;
    public int b;
    public atcy c;

    static {
        atdc atdcVar = new atdc();
        a = atdcVar;
        aopi.registerDefaultInstance(atdc.class, atdcVar);
    }

    private atdc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf0da㔥\uf0da㔥\u0001\u0000\u0000\u0000\uf0da㔥ဉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new atdc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atdc.class) {
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
