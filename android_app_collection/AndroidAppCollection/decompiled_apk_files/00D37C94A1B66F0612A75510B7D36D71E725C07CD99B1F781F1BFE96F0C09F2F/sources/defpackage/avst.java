package defpackage;
/* compiled from: PG */
/* renamed from: avst  reason: default package */
/* loaded from: classes2.dex */
public final class avst extends aopi implements aoqv {
    public static final avst a;
    public static final aopg b;
    private static volatile aorb e;
    public aunb c;
    public aunb d;
    private int f;
    private byte g = 2;

    static {
        avst avstVar = new avst();
        a = avstVar;
        aopi.registerDefaultInstance(avst.class, avstVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, avstVar, avstVar, null, 328479972, aosj.MESSAGE, avst.class);
    }

    private avst() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new avst();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avst.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
