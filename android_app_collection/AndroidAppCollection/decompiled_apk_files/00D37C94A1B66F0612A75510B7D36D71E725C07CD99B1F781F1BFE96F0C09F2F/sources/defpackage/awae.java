package defpackage;
/* compiled from: PG */
/* renamed from: awae  reason: default package */
/* loaded from: classes2.dex */
public final class awae extends aopi implements aoqv {
    public static final awae a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private awag f;
    private awaf g;
    private apzg h;
    private aunb i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private aoux o;
    private byte p = 2;

    static {
        awae awaeVar = new awae();
        a = awaeVar;
        aopi.registerDefaultInstance(awae.class, awaeVar);
    }

    private awae() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0010\bᐉ\u0004\tᐉ\u0005\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b\u0013ᐉ\u000f\u0014ᐉ\f", new Object[]{"c", "d", "e", "f", "g", "o", "h", "i", "j", "k", "l", "n", "m"});
            case 3:
                return new awae();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awae.class) {
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
