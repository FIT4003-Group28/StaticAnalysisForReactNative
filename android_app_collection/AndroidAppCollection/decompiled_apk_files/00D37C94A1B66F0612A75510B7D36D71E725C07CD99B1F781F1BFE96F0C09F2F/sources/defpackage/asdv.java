package defpackage;
/* compiled from: PG */
/* renamed from: asdv  reason: default package */
/* loaded from: classes2.dex */
public final class asdv extends aopi implements aoqv {
    public static final asdv a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public asdu d;
    public int e;
    private byte g = 2;

    static {
        asdv asdvVar = new asdv();
        a = asdvVar;
        aopi.registerDefaultInstance(asdv.class, asdvVar);
    }

    private asdv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", arpt.s});
            case 3:
                return new asdv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asdv.class) {
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
