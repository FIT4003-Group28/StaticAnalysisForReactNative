package defpackage;
/* compiled from: PG */
/* renamed from: aqpw  reason: default package */
/* loaded from: classes2.dex */
public final class aqpw extends aopi implements aoqv {
    public static final aqpw a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aqpw aqpwVar = new aqpw();
        a = aqpwVar;
        aopi.registerDefaultInstance(aqpw.class, aqpwVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpwVar, aqpwVar, null, 372486289, aosj.MESSAGE, aqpw.class);
    }

    private aqpw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aqpw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqpw.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
