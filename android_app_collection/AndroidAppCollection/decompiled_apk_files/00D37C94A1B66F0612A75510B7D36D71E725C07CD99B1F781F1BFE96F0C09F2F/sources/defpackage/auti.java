package defpackage;
/* compiled from: PG */
/* renamed from: auti  reason: default package */
/* loaded from: classes2.dex */
public final class auti extends aopi implements aoqv {
    public static final auti a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private autn j;
    private arag k;
    private arag l;
    private arag m;
    private byte n = 2;

    static {
        auti autiVar = new auti();
        a = autiVar;
        aopi.registerDefaultInstance(auti.class, autiVar);
    }

    private auti() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\tᐉ\u000b\nᐉ\f\u000bᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new auti();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auti.class) {
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
