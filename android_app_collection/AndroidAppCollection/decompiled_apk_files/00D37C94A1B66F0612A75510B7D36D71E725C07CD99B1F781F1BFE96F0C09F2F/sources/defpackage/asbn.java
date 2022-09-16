package defpackage;
/* compiled from: PG */
/* renamed from: asbn  reason: default package */
/* loaded from: classes2.dex */
public final class asbn extends aopi implements aoqv {
    public static final asbn a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public asbl d;
    public apzg e;
    public long f;
    private byte h = 2;

    static {
        asbn asbnVar = new asbn();
        a = asbnVar;
        aopi.registerDefaultInstance(asbn.class, asbnVar);
    }

    private asbn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asbn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asbn.class) {
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
