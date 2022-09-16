package defpackage;
/* compiled from: PG */
/* renamed from: awev  reason: default package */
/* loaded from: classes2.dex */
public final class awev extends aopi implements aoqv {
    public static final awev a;
    private static volatile aorb f;
    public int b;
    public int d;
    private apzg g;
    private byte h = 2;
    public String c = "";
    public String e = "";

    static {
        awev awevVar = new awev();
        a = awevVar;
        aopi.registerDefaultInstance(awev.class, awevVar);
    }

    private awev() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဈ\u0002\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new awev();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awev.class) {
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
