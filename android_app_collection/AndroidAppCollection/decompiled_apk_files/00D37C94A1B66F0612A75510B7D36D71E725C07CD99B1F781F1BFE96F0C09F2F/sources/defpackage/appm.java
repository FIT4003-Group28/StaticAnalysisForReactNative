package defpackage;
/* compiled from: PG */
/* renamed from: appm  reason: default package */
/* loaded from: classes2.dex */
public final class appm extends aopi implements aoqv {
    public static final appm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private apok h;
    private apok i;
    private apok j;
    private apzg k;
    private aoux l;
    private byte m = 2;

    static {
        appm appmVar = new appm();
        a = appmVar;
        aopi.registerDefaultInstance(appm.class, appmVar);
    }

    private appm() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\rᐉ\u000e\u000fᐉ\u0010", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new appm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (appm.class) {
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
