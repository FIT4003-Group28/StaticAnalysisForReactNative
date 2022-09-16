package defpackage;
/* compiled from: PG */
/* renamed from: asco  reason: default package */
/* loaded from: classes2.dex */
public final class asco extends aopi implements aoqv {
    public static final asco a;
    private static volatile aorb f;
    public int b;
    public aroy c;
    public ascn e;
    private byte g = 2;
    public String d = "";

    static {
        asco ascoVar = new asco();
        a = ascoVar;
        aopi.registerDefaultInstance(asco.class, ascoVar);
    }

    private asco() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asco();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asco.class) {
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
