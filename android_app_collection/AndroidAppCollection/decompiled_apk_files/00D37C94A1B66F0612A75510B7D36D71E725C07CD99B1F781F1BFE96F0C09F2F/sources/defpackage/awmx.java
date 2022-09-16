package defpackage;
/* compiled from: PG */
/* renamed from: awmx  reason: default package */
/* loaded from: classes2.dex */
public final class awmx extends aopi implements aoqv {
    public static final awmx a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public awos d;
    public awnc e;
    public awmy f;
    private byte h = 2;

    static {
        awmx awmxVar = new awmx();
        a = awmxVar;
        aopi.registerDefaultInstance(awmx.class, awmxVar);
        b = aopi.newSingularGeneratedExtension(awow.a, awmxVar, awmxVar, null, 168777401, aosj.MESSAGE, awmx.class);
    }

    private awmx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new awmx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awmx.class) {
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
