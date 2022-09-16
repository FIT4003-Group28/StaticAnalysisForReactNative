package defpackage;
/* compiled from: PG */
/* renamed from: aqyo  reason: default package */
/* loaded from: classes2.dex */
public final class aqyo extends aopi implements aoqv {
    public static final aqyo a;
    private static volatile aorb f;
    public int b;
    public apwe c;
    public aunb d;
    public long e;
    private byte g = 2;

    static {
        aqyo aqyoVar = new aqyo();
        a = aqyoVar;
        aopi.registerDefaultInstance(aqyo.class, aqyoVar);
    }

    private aqyo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqyo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqyo.class) {
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
