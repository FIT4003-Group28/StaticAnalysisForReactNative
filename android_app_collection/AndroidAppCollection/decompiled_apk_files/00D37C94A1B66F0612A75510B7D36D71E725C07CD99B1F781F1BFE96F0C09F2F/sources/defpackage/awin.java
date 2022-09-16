package defpackage;
/* compiled from: PG */
/* renamed from: awin  reason: default package */
/* loaded from: classes2.dex */
public final class awin extends aopi implements aoqv {
    public static final awin a;
    private static volatile aorb d;
    public arag b;
    public awio c;
    private int e;
    private aoux f;
    private byte g = 2;

    static {
        awin awinVar = new awin();
        a = awinVar;
        aopi.registerDefaultInstance(awin.class, awinVar);
    }

    private awin() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0001", new Object[]{"e", "b", "f", "c"});
            case 3:
                return new awin();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awin.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
