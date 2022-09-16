package defpackage;
/* compiled from: PG */
/* renamed from: awhq  reason: default package */
/* loaded from: classes2.dex */
public final class awhq extends aopi implements aoqv {
    public static final awhq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awhq awhqVar = new awhq();
        a = awhqVar;
        aopi.registerDefaultInstance(awhq.class, awhqVar);
    }

    private awhq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ufff8╗ﾟⶡ\u0002\u0000\u0000\u0001\ufff8╗ᐼ\u0000ﾟⶡြ\u0000", new Object[]{"c", "b", awhs.class, awhr.class});
            case 3:
                return new awhq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awhq.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
