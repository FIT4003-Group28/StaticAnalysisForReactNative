package defpackage;
/* compiled from: PG */
/* renamed from: aqbj  reason: default package */
/* loaded from: classes2.dex */
public final class aqbj extends aopi implements aoqv {
    public static final aqbj a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private byte h = 2;

    static {
        aqbj aqbjVar = new aqbj();
        a = aqbjVar;
        aopi.registerDefaultInstance(aqbj.class, aqbjVar);
    }

    private aqbj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0004ᐉ\u0002\u0006ᐉ\u0006\u0007ᐉ\u0004", new Object[]{"c", "d", "e", "g", "f"});
            case 3:
                return new aqbj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqbj.class) {
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
