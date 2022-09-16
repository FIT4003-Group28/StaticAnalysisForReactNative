package defpackage;
/* compiled from: PG */
/* renamed from: asgb  reason: default package */
/* loaded from: classes2.dex */
public final class asgb extends aopi implements aoqv {
    public static final asgb a;
    private static volatile aorb d;
    public arpa b;
    public boolean c;
    private int e;
    private arbf f;
    private byte g = 2;

    static {
        asgb asgbVar = new asgb();
        a = asgbVar;
        aopi.registerDefaultInstance(asgb.class, asgbVar);
    }

    private asgb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001̉ᐉ\u0002", new Object[]{"e", "b", "c", "f"});
            case 3:
                return new asgb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgb.class) {
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
