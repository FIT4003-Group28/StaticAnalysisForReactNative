package defpackage;
/* compiled from: PG */
/* renamed from: apin  reason: default package */
/* loaded from: classes.dex */
public final class apin extends aopi implements aoqv {
    public static final apin a;
    private static volatile aorb b;
    private int c;
    private avvh d;
    private byte e = 2;

    static {
        apin apinVar = new apin();
        a = apinVar;
        aopi.registerDefaultInstance(apin.class, apinVar);
    }

    private apin() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue607⨅\ue607⨅\u0001\u0000\u0000\u0001\ue607⨅ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new apin();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apin.class) {
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
