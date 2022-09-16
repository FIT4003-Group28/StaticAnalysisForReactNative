package defpackage;
/* compiled from: PG */
/* renamed from: aqpv  reason: default package */
/* loaded from: classes2.dex */
public final class aqpv extends aopi implements aoqv {
    public static final aqpv a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public boolean e;
    public boolean f;
    public aqoc g;
    private byte i = 2;
    public String d = "";

    static {
        aqpv aqpvVar = new aqpv();
        a = aqpvVar;
        aopi.registerDefaultInstance(aqpv.class, aqpvVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpvVar, aqpvVar, null, 323685881, aosj.MESSAGE, aqpv.class);
    }

    private aqpv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ဈ\u0003\u0007ဇ\u0007\bဇ\b\tဉ\t", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqpv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqpv.class) {
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
