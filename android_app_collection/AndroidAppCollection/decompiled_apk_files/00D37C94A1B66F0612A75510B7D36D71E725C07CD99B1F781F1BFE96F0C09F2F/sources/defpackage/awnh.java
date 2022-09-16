package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awnh  reason: default package */
/* loaded from: classes2.dex */
public final class awnh extends aopi implements aoqv {
    public static final awnh a;
    public static final aopg b;
    private static volatile aorb d;
    public awos c;
    private int e;
    private byte f = 2;

    static {
        awnh awnhVar = new awnh();
        a = awnhVar;
        aopi.registerDefaultInstance(awnh.class, awnhVar);
        b = aopi.newSingularGeneratedExtension(awos.a, awnhVar, awnhVar, null, 184872809, aosj.MESSAGE, awnh.class);
    }

    private awnh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"e", "c"});
            case 3:
                return new awnh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awnh.class) {
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
