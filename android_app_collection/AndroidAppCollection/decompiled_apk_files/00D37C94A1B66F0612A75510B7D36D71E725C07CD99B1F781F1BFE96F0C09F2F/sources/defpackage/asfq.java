package defpackage;
/* compiled from: PG */
/* renamed from: asfq  reason: default package */
/* loaded from: classes2.dex */
public final class asfq extends aopi implements aoqv {
    public static final asfq a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfq asfqVar = new asfq();
        a = asfqVar;
        aopi.registerDefaultInstance(asfq.class, asfqVar);
    }

    private asfq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue785⸓\ueb52齯\u0004\u0000\u0000\u0004\ue785⸓ᐼ\u0000瀞䢤ᐼ\u0000\uf492䤳ᐼ\u0000\ueb52齯ᐼ\u0000", new Object[]{"c", "b", avtm.class, asvh.class, aqtb.class, avtp.class});
            case 3:
                return new asfq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asfq.class) {
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
