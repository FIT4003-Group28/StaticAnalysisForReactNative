package defpackage;
/* compiled from: PG */
/* renamed from: apjc  reason: default package */
/* loaded from: classes.dex */
public final class apjc extends aopi implements aoqv {
    public static final apjc a;
    private static volatile aorb b;
    private int c;
    private apjb d;
    private byte e = 2;

    static {
        apjc apjcVar = new apjc();
        a = apjcVar;
        aopi.registerDefaultInstance(apjc.class, apjcVar);
    }

    private apjc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001嶺⸝嶺⸝\u0001\u0000\u0000\u0001嶺⸝ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new apjc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apjc.class) {
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
