package defpackage;
/* compiled from: PG */
/* renamed from: aset  reason: default package */
/* loaded from: classes2.dex */
public final class aset extends aopi implements aoqv {
    public static final aset a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public aseu d;
    private arbf g;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        aset asetVar = new aset();
        a = asetVar;
        aopi.registerDefaultInstance(aset.class, asetVar);
    }

    private aset() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0003ဉ\u0001\u0004Л̉ᐉ\u0002", new Object[]{"b", "c", "d", "e", apzg.class, "g"});
            case 3:
                return new aset();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aset.class) {
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
