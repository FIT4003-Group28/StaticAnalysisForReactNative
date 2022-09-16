package defpackage;
/* compiled from: PG */
/* renamed from: aumb  reason: default package */
/* loaded from: classes2.dex */
public final class aumb extends aopi implements aoqv {
    public static final aumb a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public apzg d;
    private byte g = 2;
    public String e = "";

    static {
        aumb aumbVar = new aumb();
        a = aumbVar;
        aopi.registerDefaultInstance(aumb.class, aumbVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aumbVar, aumbVar, null, 167221110, aosj.MESSAGE, aumb.class);
    }

    private aumb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new aumb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aumb.class) {
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
