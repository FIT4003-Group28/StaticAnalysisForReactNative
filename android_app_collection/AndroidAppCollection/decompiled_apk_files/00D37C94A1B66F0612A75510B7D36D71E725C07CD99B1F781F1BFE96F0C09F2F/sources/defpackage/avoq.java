package defpackage;
/* compiled from: PG */
/* renamed from: avoq  reason: default package */
/* loaded from: classes2.dex */
public final class avoq extends aopi implements aoqv {
    public static final avoq a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aoux j;
    private byte k = 2;

    static {
        avoq avoqVar = new avoq();
        a = avoqVar;
        aopi.registerDefaultInstance(avoq.class, avoqVar);
    }

    private avoq() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0005\u0006ᐉ\t\u0007ᐉ\u0004\bᐉ\u0003\tᐉ\u0001", new Object[]{"c", "d", "f", "i", "j", "h", "g", "e"});
            case 3:
                return new avoq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avoq.class) {
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
