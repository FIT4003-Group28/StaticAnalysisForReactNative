package defpackage;
/* compiled from: PG */
/* renamed from: aqhc  reason: default package */
/* loaded from: classes2.dex */
public final class aqhc extends aopi implements aoqv {
    public static final aqhc a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private apok i;
    private apok j;
    private byte k = 2;

    static {
        aqhc aqhcVar = new aqhc();
        a = aqhcVar;
        aopi.registerDefaultInstance(aqhc.class, aqhcVar);
    }

    private aqhc() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\t\u000bᐉ\u0005", new Object[]{"c", "d", "e", "f", "h", "i", "j", "g"});
            case 3:
                return new aqhc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhc.class) {
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
