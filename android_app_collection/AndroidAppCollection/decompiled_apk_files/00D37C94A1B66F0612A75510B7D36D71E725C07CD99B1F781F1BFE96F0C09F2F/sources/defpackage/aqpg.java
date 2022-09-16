package defpackage;
/* compiled from: PG */
/* renamed from: aqpg  reason: default package */
/* loaded from: classes2.dex */
public final class aqpg extends aopi implements aoqv {
    public static final aqpg a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    private byte f = 2;
    public String d = "";

    static {
        aqpg aqpgVar = new aqpg();
        a = aqpgVar;
        aopi.registerDefaultInstance(aqpg.class, aqpgVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpgVar, aqpgVar, null, 380917126, aosj.MESSAGE, aqpg.class);
    }

    private aqpg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "d"});
            case 3:
                return new aqpg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqpg.class) {
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
