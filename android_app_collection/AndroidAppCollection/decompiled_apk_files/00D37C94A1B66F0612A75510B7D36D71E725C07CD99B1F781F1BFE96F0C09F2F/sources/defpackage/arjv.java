package defpackage;
/* compiled from: PG */
/* renamed from: arjv  reason: default package */
/* loaded from: classes2.dex */
public final class arjv extends aopi implements aoqv {
    public static final arjv a;
    private static volatile aorb b;
    private int c;
    private avhe d;
    private byte e = 2;

    static {
        arjv arjvVar = new arjv();
        a = arjvVar;
        aopi.registerDefaultInstance(arjv.class, arjvVar);
    }

    private arjv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uefc0㨊\uefc0㨊\u0001\u0000\u0000\u0001\uefc0㨊ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new arjv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arjv.class) {
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
