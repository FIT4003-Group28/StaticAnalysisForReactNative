package defpackage;
/* compiled from: PG */
/* renamed from: aumg  reason: default package */
/* loaded from: classes2.dex */
public final class aumg extends aopi implements aoqv {
    public static final aumg a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public apzg f;
    private byte h = 2;
    public String d = "";
    public aoob e = aoob.b;

    static {
        aumg aumgVar = new aumg();
        a = aumgVar;
        aopi.registerDefaultInstance(aumg.class, aumgVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aumgVar, aumgVar, null, 230, aosj.MESSAGE, aumg.class);
    }

    private aumg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aumg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aumg.class) {
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
