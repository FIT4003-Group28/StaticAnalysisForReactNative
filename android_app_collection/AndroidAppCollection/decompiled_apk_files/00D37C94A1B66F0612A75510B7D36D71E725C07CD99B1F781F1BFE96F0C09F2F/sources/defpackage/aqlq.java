package defpackage;
/* compiled from: PG */
/* renamed from: aqlq  reason: default package */
/* loaded from: classes2.dex */
public final class aqlq extends aopi implements aoqv {
    public static final aqlq a;
    private static volatile aorb b;
    private int c;
    private aqlp d;
    private byte e = 2;

    static {
        aqlq aqlqVar = new aqlq();
        a = aqlqVar;
        aopi.registerDefaultInstance(aqlq.class, aqlqVar);
    }

    private aqlq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uea42ⵞ\uea42ⵞ\u0001\u0000\u0000\u0001\uea42ⵞᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqlq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqlq.class) {
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
