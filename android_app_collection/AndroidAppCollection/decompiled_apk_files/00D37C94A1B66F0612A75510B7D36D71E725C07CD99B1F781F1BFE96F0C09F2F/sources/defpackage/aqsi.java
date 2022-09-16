package defpackage;
/* compiled from: PG */
/* renamed from: aqsi  reason: default package */
/* loaded from: classes2.dex */
public final class aqsi extends aopi implements aoqv {
    public static final aqsi a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public aunb d;
    private aunb f;
    private byte g = 2;

    static {
        aqsi aqsiVar = new aqsi();
        a = aqsiVar;
        aopi.registerDefaultInstance(aqsi.class, aqsiVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aqsiVar, aqsiVar, null, 253749840, aosj.MESSAGE, aqsi.class);
    }

    private aqsi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "f"});
            case 3:
                return new aqsi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqsi.class) {
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
