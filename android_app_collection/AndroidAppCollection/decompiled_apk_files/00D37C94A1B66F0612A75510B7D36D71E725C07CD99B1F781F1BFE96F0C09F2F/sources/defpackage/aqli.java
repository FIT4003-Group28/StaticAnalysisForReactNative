package defpackage;
/* compiled from: PG */
/* renamed from: aqli  reason: default package */
/* loaded from: classes2.dex */
public final class aqli extends aopi implements aoqv {
    public static final aqli a;
    private static volatile aorb g;
    public boolean b;
    public aqlh c;
    public aqlh d;
    public aqlh e;
    public aqlh f;
    private int h;

    static {
        aqli aqliVar = new aqli();
        a = aqliVar;
        aopi.registerDefaultInstance(aqli.class, aqliVar);
    }

    private aqli() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001Ɛ\u0005\u0000\u0000\u0000\u0001ဇ\u0000dဉ\u0001Èဉ\u0002Ĭဉ\u0003Ɛဉ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new aqli();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqli.class) {
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
