package defpackage;
/* compiled from: PG */
/* renamed from: aqap  reason: default package */
/* loaded from: classes2.dex */
public final class aqap extends aopi implements aoqv {
    public static final aqap a;
    private static volatile aorb f;
    public apok b;
    public apok c;
    public apok d;
    public apok e;
    private int g;
    private byte h = 2;

    static {
        aqap aqapVar = new aqap();
        a = aqapVar;
        aopi.registerDefaultInstance(aqap.class, aqapVar);
    }

    private aqap() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new aqap();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqap.class) {
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
