package defpackage;
/* compiled from: PG */
/* renamed from: aqrv  reason: default package */
/* loaded from: classes2.dex */
public final class aqrv extends aopi implements aoqv {
    public static final aqrv a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private arag f;
    private ates g;
    private arag h;
    private arag i;
    private apzg j;
    private argl k;
    private aoux l;
    private byte m = 2;

    static {
        aqrv aqrvVar = new aqrv();
        a = aqrvVar;
        aopi.registerDefaultInstance(aqrv.class, aqrvVar);
    }

    private aqrv() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0005\u0012\t\u0000\u0000\t\u0005ᐉ\u0013\bᐉ\u000e\tᐉ\u000f\nᐉ\u0010\u000bᐉ\u0012\u000fᐉ\u0007\u0010ᐉ\u0011\u0011ᐉ\t\u0012ᐉ\u0002", new Object[]{"c", "l", "g", "h", "i", "k", "e", "j", "f", "d"});
            case 3:
                return new aqrv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqrv.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
