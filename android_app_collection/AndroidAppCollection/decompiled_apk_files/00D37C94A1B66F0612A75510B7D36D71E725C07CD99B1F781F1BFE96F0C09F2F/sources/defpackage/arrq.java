package defpackage;
/* compiled from: PG */
/* renamed from: arrq  reason: default package */
/* loaded from: classes2.dex */
public final class arrq extends aopi implements aoqv {
    public static final arrq a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public arag f;
    private aoux h;
    public int c = 0;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        arrq arrqVar = new arrq();
        a = arrqVar;
        aopi.registerDefaultInstance(arrq.class, arrqVar);
    }

    private arrq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐼ\u0000\u0005ျ\u0000", new Object[]{"d", "c", "b", "h", "e", "f", apzg.class});
            case 3:
                return new arrq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arrq.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
