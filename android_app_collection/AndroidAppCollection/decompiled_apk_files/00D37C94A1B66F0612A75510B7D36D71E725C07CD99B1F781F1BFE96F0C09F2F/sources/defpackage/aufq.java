package defpackage;
/* compiled from: PG */
/* renamed from: aufq  reason: default package */
/* loaded from: classes2.dex */
public final class aufq extends aopd implements aope {
    public static final aufq a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aoux e;
    private arag f;
    private byte g = 2;

    static {
        aufq aufqVar = new aufq();
        a = aufqVar;
        aopi.registerDefaultInstance(aufq.class, aufqVar);
    }

    private aufq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0003\u0007ᐉ\u0006", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aufq();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aufq.class) {
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
