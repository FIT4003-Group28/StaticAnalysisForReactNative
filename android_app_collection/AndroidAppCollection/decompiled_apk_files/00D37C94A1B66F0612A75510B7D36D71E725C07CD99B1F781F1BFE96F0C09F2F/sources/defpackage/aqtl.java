package defpackage;
/* compiled from: PG */
/* renamed from: aqtl  reason: default package */
/* loaded from: classes2.dex */
public final class aqtl extends aopi implements aoqv {
    public static final aqtl a;
    public static final aopg b;
    private static volatile aorb d;
    private byte e = 2;
    public aopu c = emptyProtobufList();

    static {
        aqtl aqtlVar = new aqtl();
        a = aqtlVar;
        aopi.registerDefaultInstance(aqtl.class, aqtlVar);
        b = aopi.newSingularGeneratedExtension(arbf.a, aqtlVar, aqtlVar, null, 2, aosj.MESSAGE, aqtl.class);
    }

    private aqtl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", aqtk.class});
            case 3:
                return new aqtl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqtl.class) {
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
