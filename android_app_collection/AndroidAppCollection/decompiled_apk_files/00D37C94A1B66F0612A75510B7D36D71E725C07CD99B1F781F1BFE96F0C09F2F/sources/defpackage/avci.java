package defpackage;
/* compiled from: PG */
/* renamed from: avci  reason: default package */
/* loaded from: classes2.dex */
public final class avci extends aopi implements aoqv {
    public static final avci a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        avci avciVar = new avci();
        a = avciVar;
        aopi.registerDefaultInstance(avci.class, avciVar);
        b = aopi.newSingularGeneratedExtension(avcj.a, avciVar, avciVar, null, 272544428, aosj.MESSAGE, avci.class);
    }

    private avci() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case 3:
                return new avci();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avci.class) {
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
