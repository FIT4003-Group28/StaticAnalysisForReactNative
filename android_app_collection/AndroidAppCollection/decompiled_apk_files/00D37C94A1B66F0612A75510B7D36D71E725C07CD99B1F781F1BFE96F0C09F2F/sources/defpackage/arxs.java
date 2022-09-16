package defpackage;
/* compiled from: PG */
/* renamed from: arxs  reason: default package */
/* loaded from: classes2.dex */
public final class arxs extends aopi implements aoqv {
    public static final arxs a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public apzg d;
    public apij e;
    private apzg g;
    private byte h = 2;

    static {
        arxs arxsVar = new arxs();
        a = arxsVar;
        aopi.registerDefaultInstance(arxs.class, arxsVar);
    }

    private arxs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0003\u0005ᐉ\u0002", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new arxs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arxs.class) {
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
