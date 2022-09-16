package defpackage;
/* compiled from: PG */
/* renamed from: awex  reason: default package */
/* loaded from: classes2.dex */
public final class awex extends aopi implements aoqv {
    public static final awex a;
    private static volatile aorb i;
    public int b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public boolean h;

    static {
        awex awexVar = new awex();
        a = awexVar;
        aopi.registerDefaultInstance(awex.class, awexVar);
    }

    private awex() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0001\u0003င\u0004\u0004င\u0005\u0005င\u0000\u0006ဂ\u0003\u0007ဇ\u0006", new Object[]{"b", "d", "f", "g", "c", "e", "h"});
            case 3:
                return new awex();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awex.class) {
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
