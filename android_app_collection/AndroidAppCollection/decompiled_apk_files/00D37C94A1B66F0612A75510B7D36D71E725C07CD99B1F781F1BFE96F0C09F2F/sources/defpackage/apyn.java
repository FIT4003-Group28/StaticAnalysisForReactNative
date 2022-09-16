package defpackage;
/* compiled from: PG */
/* renamed from: apyn  reason: default package */
/* loaded from: classes2.dex */
public final class apyn extends aopi implements aoqv {
    public static final apyn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private aunb h;
    private apzg i;
    private apzg j;
    private arag k;
    private aoux l;
    private byte m = 2;

    static {
        apyn apynVar = new apyn();
        a = apynVar;
        aopi.registerDefaultInstance(apyn.class, apynVar);
    }

    private apyn() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\r\t\u0000\u0000\t\u0002ᐉ\n\u0004ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\u0004\nᐉ\u0005\u000bᐉ\u0006\fᐉ\u0007\rᐉ\b", new Object[]{"c", "l", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new apyn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apyn.class) {
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
