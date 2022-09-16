package defpackage;
/* compiled from: PG */
/* renamed from: aulf  reason: default package */
/* loaded from: classes2.dex */
public final class aulf extends aopi implements aoqv {
    public static final aulf a;
    private static volatile aorb d;
    public int b;
    public apzg c;
    private arag e;
    private arag f;
    private aoux g;
    private byte h = 2;

    static {
        aulf aulfVar = new aulf();
        a = aulfVar;
        aopi.registerDefaultInstance(aulf.class, aulfVar);
    }

    private aulf() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0007", new Object[]{"b", "e", "f", "c", "g"});
            case 3:
                return new aulf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aulf.class) {
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
