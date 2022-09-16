package defpackage;
/* compiled from: PG */
/* renamed from: atve  reason: default package */
/* loaded from: classes2.dex */
public final class atve extends aopi implements aoqv {
    public static final atve a;
    private static volatile aorb d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        atve atveVar = new atve();
        a = atveVar;
        aopi.registerDefaultInstance(atve.class, atveVar);
    }

    private atve() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဇ\u0002\u0006ဇ\u0004", new Object[]{"e", "b", "c"});
            case 3:
                return new atve();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atve.class) {
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
