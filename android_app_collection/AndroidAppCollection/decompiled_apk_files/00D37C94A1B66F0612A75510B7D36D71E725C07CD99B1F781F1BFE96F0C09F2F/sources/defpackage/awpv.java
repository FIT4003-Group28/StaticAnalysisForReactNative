package defpackage;
/* compiled from: PG */
/* renamed from: awpv  reason: default package */
/* loaded from: classes2.dex */
public final class awpv extends aopi implements aoqv {
    public static final awpv a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public int f;

    static {
        awpv awpvVar = new awpv();
        a = awpvVar;
        aopi.registerDefaultInstance(awpv.class, awpvVar);
    }

    private awpv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0002င\u0002\u0004ဇ\u0004\u0006ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", avuh.r});
            case 3:
                return new awpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awpv.class) {
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
