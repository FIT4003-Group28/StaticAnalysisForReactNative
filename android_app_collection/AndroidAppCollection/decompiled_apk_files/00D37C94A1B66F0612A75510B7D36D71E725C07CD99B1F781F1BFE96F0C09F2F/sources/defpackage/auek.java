package defpackage;
/* compiled from: PG */
/* renamed from: auek  reason: default package */
/* loaded from: classes2.dex */
public final class auek extends aopi implements aoqv {
    public static final auek a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        auek auekVar = new auek();
        a = auekVar;
        aopi.registerDefaultInstance(auek.class, auekVar);
    }

    private auek() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0004ᐉ\u0005\u0006ᐉ\u0003", new Object[]{"c", "d", "f", "e"});
            case 3:
                return new auek();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auek.class) {
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
