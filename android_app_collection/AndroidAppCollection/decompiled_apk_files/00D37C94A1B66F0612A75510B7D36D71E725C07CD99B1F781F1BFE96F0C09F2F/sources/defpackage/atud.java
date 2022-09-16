package defpackage;
/* compiled from: PG */
/* renamed from: atud  reason: default package */
/* loaded from: classes2.dex */
public final class atud extends aopi implements aoqv {
    public static final atud a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awnn d;
    public int e;
    private byte g = 2;

    static {
        atud atudVar = new atud();
        a = atudVar;
        aopi.registerDefaultInstance(atud.class, atudVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, atudVar, atudVar, null, 250283977, aosj.MESSAGE, atud.class);
    }

    private atud() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", "e", augo.a()});
            case 3:
                return new atud();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atud.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
