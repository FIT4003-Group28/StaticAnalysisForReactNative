package defpackage;
/* compiled from: PG */
/* renamed from: aqcl  reason: default package */
/* loaded from: classes2.dex */
public final class aqcl extends aopi implements aoqv {
    public static final aqcl a;
    private static volatile aorb b;
    private int c;
    private aqck d;
    private byte e = 2;

    static {
        aqcl aqclVar = new aqcl();
        a = aqclVar;
        aopi.registerDefaultInstance(aqcl.class, aqclVar);
    }

    private aqcl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf7c9ⷌ\uf7c9ⷌ\u0001\u0000\u0000\u0001\uf7c9ⷌᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aqcl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqcl.class) {
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
