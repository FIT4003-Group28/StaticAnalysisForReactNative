package defpackage;
/* compiled from: PG */
/* renamed from: asrb  reason: default package */
/* loaded from: classes2.dex */
public final class asrb extends aopi implements aoqv {
    public static final asrb a;
    private static volatile aorb h;
    public int b;
    public arhs d;
    public arag e;
    public arag f;
    private arag i;
    private byte j = 2;
    public String c = "";
    public aopu g = emptyProtobufList();

    static {
        asrb asrbVar = new asrb();
        a = asrbVar;
        aopi.registerDefaultInstance(asrb.class, asrbVar);
    }

    private asrb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006Л\u0007ᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", apok.class, "i"});
            case 3:
                return new asrb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asrb.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
