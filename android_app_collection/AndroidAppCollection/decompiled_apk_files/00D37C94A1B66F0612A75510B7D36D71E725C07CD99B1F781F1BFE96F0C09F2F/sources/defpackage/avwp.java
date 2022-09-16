package defpackage;
/* compiled from: PG */
/* renamed from: avwp  reason: default package */
/* loaded from: classes2.dex */
public final class avwp extends aopi implements aoqv {
    public static final avwp a;
    private static volatile aorb b;
    private int c;
    private apzg d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        avwp avwpVar = new avwp();
        a = avwpVar;
        aopi.registerDefaultInstance(avwp.class, avwpVar);
    }

    private avwp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u000e\u0003\u0000\u0000\u0003\u0003ᐉ\u0003\tᐉ\r\u000eᐉ\u000b", new Object[]{"c", "d", "f", "e"});
            case 3:
                return new avwp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avwp.class) {
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
