package defpackage;
/* compiled from: PG */
/* renamed from: aqpx  reason: default package */
/* loaded from: classes2.dex */
public final class aqpx extends aopi implements aoqv {
    public static final aqpx a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqpx aqpxVar = new aqpx();
        a = aqpxVar;
        aopi.registerDefaultInstance(aqpx.class, aqpxVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpxVar, aqpxVar, null, 378762193, aosj.MESSAGE, aqpx.class);
    }

    private aqpx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqpx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqpx.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
