package defpackage;
/* compiled from: PG */
/* renamed from: anrl  reason: default package */
/* loaded from: classes.dex */
public final class anrl extends aopi implements aoqv {
    public static final anrl a;
    private static volatile aorb d;
    public String b = "";
    public anrc c;

    static {
        anrl anrlVar = new anrl();
        a = anrlVar;
        aopi.registerDefaultInstance(anrl.class, anrlVar);
    }

    private anrl() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"b", "c"});
            case 3:
                return new anrl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anrl.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
