package defpackage;
/* compiled from: PG */
/* renamed from: apdy  reason: default package */
/* loaded from: classes.dex */
public final class apdy extends aopi implements aoqv {
    public static final apdy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private aoux f;
    private byte g = 2;

    static {
        apdy apdyVar = new apdy();
        a = apdyVar;
        aopi.registerDefaultInstance(apdy.class, apdyVar);
    }

    private apdy() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new apdy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apdy.class) {
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
