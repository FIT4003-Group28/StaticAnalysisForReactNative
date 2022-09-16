package defpackage;
/* compiled from: PG */
/* renamed from: aqts  reason: default package */
/* loaded from: classes2.dex */
public final class aqts extends aopi implements aoqv {
    public static final aqts a;
    private static volatile aorb f;
    public int b;
    public avhn c;
    public aunb d;
    public aunb e;
    private apzg g;
    private byte h = 2;

    static {
        aqts aqtsVar = new aqts();
        a = aqtsVar;
        aopi.registerDefaultInstance(aqts.class, aqtsVar);
    }

    private aqts() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0004\u0004ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0001", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aqts();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqts.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
