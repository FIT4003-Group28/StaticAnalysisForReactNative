package defpackage;
/* compiled from: PG */
/* renamed from: ascd  reason: default package */
/* loaded from: classes2.dex */
public final class ascd extends aopi implements aoqv {
    public static final ascd a;
    private static volatile aorb b;
    private int c;
    private arfm d;
    private aqlo e;
    private atia f;
    private byte g = 2;

    static {
        ascd ascdVar = new ascd();
        a = ascdVar;
        aopi.registerDefaultInstance(ascd.class, ascdVar);
    }

    private ascd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue0ae\u2d72\ue84d㫇\u0003\u0000\u0000\u0003\ue0ae\u2d72ᐉ\u0000ﷴ㦵ᐉ\u0001\ue84d㫇ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new ascd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ascd.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
