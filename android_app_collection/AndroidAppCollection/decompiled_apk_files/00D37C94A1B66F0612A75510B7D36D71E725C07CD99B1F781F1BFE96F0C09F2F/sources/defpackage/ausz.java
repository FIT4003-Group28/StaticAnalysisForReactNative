package defpackage;
/* compiled from: PG */
/* renamed from: ausz  reason: default package */
/* loaded from: classes2.dex */
public final class ausz extends aopi implements aoqv {
    public static final ausz a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private arag f;
    private arag g;
    private arag h;
    private aunb i;
    private aunb j;
    private aunb k;
    private apzg l;
    private aoux m;
    private byte n = 2;

    static {
        ausz auszVar = new ausz();
        a = auszVar;
        aopi.registerDefaultInstance(ausz.class, auszVar);
    }

    private ausz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\u0005\bᐉ\t\tᐉ\r\rᐉ\f\u0010ᐉ\u000b", new Object[]{"c", "d", "e", "f", "h", "i", "g", "j", "m", "l", "k"});
            case 3:
                return new ausz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (ausz.class) {
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
