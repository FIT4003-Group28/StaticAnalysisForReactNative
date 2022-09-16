package defpackage;
/* compiled from: PG */
/* renamed from: audu  reason: default package */
/* loaded from: classes2.dex */
public final class audu extends aopi implements aoqv {
    public static final audu a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aued e;
    private aued f;
    private apnm g;
    private auee h;
    private auee i;
    private apnm j;
    private apnm k;
    private apnm l;
    private apnm m;
    private byte n = 2;

    static {
        audu auduVar = new audu();
        a = auduVar;
        aopi.registerDefaultInstance(audu.class, auduVar);
    }

    private audu() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\t", new Object[]{"c", "d", "h", "i", "j", "k", "l", "e", "f", "g", "m"});
            case 3:
                return new audu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (audu.class) {
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
