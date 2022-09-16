package defpackage;
/* compiled from: PG */
/* renamed from: aojo  reason: default package */
/* loaded from: classes.dex */
public final class aojo extends aopi implements aoqv {
    public static final aojo a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public aojn f;
    public int c = 0;
    public String e = "";

    static {
        aojo aojoVar = new aojo();
        a = aojoVar;
        aopi.registerDefaultInstance(aojo.class, aojoVar);
    }

    private aojo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002့\u0000\u0003ဉ\u0003\u0004ျ\u0000", new Object[]{"d", "c", "b", "e", "f"});
            case 3:
                return new aojo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aojo.class) {
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
