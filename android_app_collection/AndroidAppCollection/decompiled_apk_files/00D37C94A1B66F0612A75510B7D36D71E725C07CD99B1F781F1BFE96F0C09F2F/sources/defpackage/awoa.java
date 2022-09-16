package defpackage;
/* compiled from: PG */
/* renamed from: awoa  reason: default package */
/* loaded from: classes2.dex */
public final class awoa extends aopi implements aoqv {
    public static final awoa a;
    private static volatile aorb g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        awoa awoaVar = new awoa();
        a = awoaVar;
        aopi.registerDefaultInstance(awoa.class, awoaVar);
    }

    private awoa() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ွ\u0000\u0003ြ\u0000\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"d", "c", "b", awnx.class, "e", "f"});
            case 3:
                return new awoa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awoa.class) {
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
