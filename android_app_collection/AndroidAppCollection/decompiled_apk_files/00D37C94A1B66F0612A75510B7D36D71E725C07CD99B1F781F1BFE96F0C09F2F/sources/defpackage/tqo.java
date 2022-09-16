package defpackage;
/* compiled from: PG */
/* renamed from: tqo  reason: default package */
/* loaded from: classes4.dex */
public final class tqo extends aopi implements aoqv {
    public static final tqo a;
    private static volatile aorb h;
    public int b;
    public int d;
    public int f;
    public tqi g;
    public String c = "";
    public String e = "";

    static {
        tqo tqoVar = new tqo();
        a = tqoVar;
        aopi.registerDefaultInstance(tqo.class, tqoVar);
    }

    private tqo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", sml.o, "g"});
            case 3:
                return new tqo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tqo.class) {
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
