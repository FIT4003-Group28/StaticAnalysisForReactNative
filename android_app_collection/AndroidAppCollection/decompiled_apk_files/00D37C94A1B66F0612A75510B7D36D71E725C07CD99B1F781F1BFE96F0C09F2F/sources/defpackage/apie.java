package defpackage;
/* compiled from: PG */
/* renamed from: apie  reason: default package */
/* loaded from: classes.dex */
public final class apie extends aopi implements aoqv {
    public static final apie a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private apok h;
    private apzg i;
    private aoux j;
    private byte k = 2;

    static {
        apie apieVar = new apie();
        a = apieVar;
        aopi.registerDefaultInstance(apie.class, apieVar);
    }

    private apie() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\f\u0007\u0000\u0000\u0007\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new apie();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apie.class) {
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
