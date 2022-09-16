package defpackage;
/* compiled from: PG */
/* renamed from: arjb  reason: default package */
/* loaded from: classes2.dex */
public final class arjb extends aopi implements aoqv {
    public static final arjb a;
    private static volatile aorb b;
    private int c;
    private apmg d;
    private apmg e;
    private apmg f;
    private arag g;
    private arag h;
    private apzg i;
    private aoux j;
    private byte k = 2;

    static {
        arjb arjbVar = new arjb();
        a = arjbVar;
        aopi.registerDefaultInstance(arjb.class, arjbVar);
    }

    private arjb() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002ᐉ\u0004\u0003ᐉ\u0005\bᐉ\u0007\fᐉ\u0006\rᐉ\u0002\u000fᐉ\u0001\u0010ᐉ\u0003", new Object[]{"c", "g", "h", "j", "i", "e", "d", "f"});
            case 3:
                return new arjb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arjb.class) {
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
