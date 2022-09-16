package defpackage;
/* compiled from: PG */
/* renamed from: apzx  reason: default package */
/* loaded from: classes2.dex */
public final class apzx extends aopi implements aoqv {
    public static final apzx a;
    public static final aopg b;
    private static volatile aorb k;
    public int c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        apzx apzxVar = new apzx();
        a = apzxVar;
        aopi.registerDefaultInstance(apzx.class, apzxVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, apzxVar, apzxVar, null, 215, aosj.MESSAGE, apzx.class);
    }

    private apzx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new apzx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (apzx.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
