package defpackage;
/* compiled from: PG */
/* renamed from: aqvv  reason: default package */
/* loaded from: classes2.dex */
public final class aqvv extends aopi implements aoqv {
    public static final aqvv a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aqvv aqvvVar = new aqvv();
        a = aqvvVar;
        aopi.registerDefaultInstance(aqvv.class, aqvvVar);
    }

    private aqvv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0007ဌ\u0006", new Object[]{"b", "c", aqvj.e, "d", "e", aqvj.c, "f", aqvj.d, "g", apfa.o});
            case 3:
                return new aqvv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqvv.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
