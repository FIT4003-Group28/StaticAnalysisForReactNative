package defpackage;
/* compiled from: PG */
/* renamed from: asbw  reason: default package */
/* loaded from: classes2.dex */
public final class asbw extends aopi implements aoqv {
    public static final asbw a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asbw asbwVar = new asbw();
        a = asbwVar;
        aopi.registerDefaultInstance(asbw.class, asbwVar);
    }

    private asbw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000樂⾪︷妻\u0002\u0000\u0000\u0002樂⾪ᐼ\u0000︷妻ᐼ\u0000", new Object[]{"c", "b", atkm.class, aupi.class});
            case 3:
                return new asbw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asbw.class) {
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
