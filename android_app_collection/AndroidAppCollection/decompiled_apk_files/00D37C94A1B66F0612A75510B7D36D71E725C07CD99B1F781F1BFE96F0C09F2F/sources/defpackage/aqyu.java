package defpackage;
/* compiled from: PG */
/* renamed from: aqyu  reason: default package */
/* loaded from: classes2.dex */
public final class aqyu extends aopi implements aoqv {
    public static final aqyu a;
    private static volatile aorb i;
    public int b;
    public atol c;
    public atsi d;
    public atrk e;
    public auuu f;
    public atcm g;
    public arfr h;

    static {
        aqyu aqyuVar = new aqyu();
        a = aqyuVar;
        aopi.registerDefaultInstance(aqyu.class, aqyuVar);
    }

    private aqyu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\tဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqyu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqyu.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
