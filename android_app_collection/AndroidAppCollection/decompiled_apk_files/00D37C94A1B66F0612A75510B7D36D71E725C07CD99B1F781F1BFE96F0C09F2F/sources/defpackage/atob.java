package defpackage;
/* compiled from: PG */
/* renamed from: atob  reason: default package */
/* loaded from: classes2.dex */
public final class atob extends aopi implements aoqv {
    public static final atob a;
    private static volatile aorb b;
    private int c;
    private aueo d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private apzg j;
    private apzg k;
    private arag l;
    private arag m;
    private aoux n;
    private byte o = 2;

    static {
        atob atobVar = new atob();
        a = atobVar;
        aopi.registerDefaultInstance(atob.class, atobVar);
    }

    private atob() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u000f\u000b\u0000\u0000\u000b\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\n\u000bᐉ\r\rᐉ\u000b\u000eᐉ\u0001\u000fᐉ\u0004", new Object[]{"c", "e", "g", "h", "i", "j", "k", "l", "n", "m", "d", "f"});
            case 3:
                return new atob();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atob.class) {
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
