package defpackage;
/* compiled from: PG */
/* renamed from: avjl  reason: default package */
/* loaded from: classes2.dex */
public final class avjl extends aopi implements aoqv {
    public static final avjl a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        avjl avjlVar = new avjl();
        a = avjlVar;
        aopi.registerDefaultInstance(avjl.class, avjlVar);
    }

    private avjl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueee9ᣑ\ueef3\u2b80\u0002\u0000\u0000\u0001\ueee9ᣑᐼ\u0000\ueef3\u2b80ြ\u0000", new Object[]{"c", "b", atof.class, attr.class});
            case 3:
                return new avjl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avjl.class) {
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
