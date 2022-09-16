package defpackage;
/* compiled from: PG */
/* renamed from: asvz  reason: default package */
/* loaded from: classes2.dex */
public final class asvz extends aopd implements aope {
    public static final asvz a;
    public static final aopg b;
    private static volatile aorb d;
    private int e;
    private byte f = 2;
    public aoob c = aoob.b;

    static {
        asvz asvzVar = new asvz();
        a = asvzVar;
        aopi.registerDefaultInstance(asvz.class, asvzVar);
        b = aopi.newSingularGeneratedExtension(awok.a, asvzVar, asvzVar, null, 169494678, aosj.MESSAGE, asvz.class);
    }

    private asvz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"e", "c"});
            case 3:
                return new asvz();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asvz.class) {
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
