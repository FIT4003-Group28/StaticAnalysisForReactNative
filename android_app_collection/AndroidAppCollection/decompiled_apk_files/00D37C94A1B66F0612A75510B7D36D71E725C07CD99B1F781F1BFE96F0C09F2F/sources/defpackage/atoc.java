package defpackage;
/* compiled from: PG */
/* renamed from: atoc  reason: default package */
/* loaded from: classes2.dex */
public final class atoc extends aopi implements aoqv {
    public static final atoc a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private apmg n;
    private avss o;
    private aoux p;
    private byte q = 2;

    static {
        atoc atocVar = new atoc();
        a = atocVar;
        aopi.registerDefaultInstance(atoc.class, atocVar);
    }

    private atoc() {
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
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0004\u0012\r\u0000\u0000\r\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\n\tᐉ\u000b\nᐉ\u0001\u000bᐉ\u0003\fᐉ\u0005\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\t\u0012ᐉ\f", new Object[]{"c", "f", "h", "i", "j", "l", "m", "d", "e", "g", "o", "p", "k", "n"});
            case 3:
                return new atoc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atoc.class) {
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
