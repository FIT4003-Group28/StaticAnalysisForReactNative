package defpackage;
/* compiled from: PG */
/* renamed from: awpp  reason: default package */
/* loaded from: classes2.dex */
public final class awpp extends aopi implements aoqv {
    public static final awpp a;
    public static final aopg b;
    private static volatile aorb c;
    private int d;
    private awpd e;
    private byte f = 2;

    static {
        awpp awppVar = new awpp();
        a = awppVar;
        aopi.registerDefaultInstance(awpp.class, awppVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, awppVar, awppVar, null, 238551640, aosj.MESSAGE, awpp.class);
    }

    private awpp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "e"});
            case 3:
                return new awpp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awpp.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
