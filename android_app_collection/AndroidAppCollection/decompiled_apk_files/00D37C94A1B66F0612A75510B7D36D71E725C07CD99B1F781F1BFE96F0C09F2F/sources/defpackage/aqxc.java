package defpackage;
/* compiled from: PG */
/* renamed from: aqxc  reason: default package */
/* loaded from: classes2.dex */
public final class aqxc extends aopi implements aoqv {
    public static final aqxc a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private byte e = 2;

    static {
        aqxc aqxcVar = new aqxc();
        a = aqxcVar;
        aopi.registerDefaultInstance(aqxc.class, aqxcVar);
    }

    private aqxc() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"c", "d"});
            case 3:
                return new aqxc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqxc.class) {
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
