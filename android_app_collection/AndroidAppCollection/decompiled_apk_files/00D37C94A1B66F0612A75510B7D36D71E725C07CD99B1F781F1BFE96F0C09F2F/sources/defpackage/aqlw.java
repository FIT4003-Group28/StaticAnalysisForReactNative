package defpackage;
/* compiled from: PG */
/* renamed from: aqlw  reason: default package */
/* loaded from: classes2.dex */
public final class aqlw extends aopi implements aoqv {
    public static final aqlw a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private aunb f;
    private arag g;
    private arag h;
    private arag i;
    private apuq j;
    private aunb k;
    private aunb l;
    private aunb m;
    private aunb n;
    private aoux o;
    private byte p = 2;

    static {
        aqlw aqlwVar = new aqlw();
        a = aqlwVar;
        aopi.registerDefaultInstance(aqlw.class, aqlwVar);
    }

    private aqlw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\rᐉ\n\u000eᐉ\u000b\u000fᐉ\u0005\u0010ᐉ\f\u0012ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "h", "n", "o"});
            case 3:
                return new aqlw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqlw.class) {
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
