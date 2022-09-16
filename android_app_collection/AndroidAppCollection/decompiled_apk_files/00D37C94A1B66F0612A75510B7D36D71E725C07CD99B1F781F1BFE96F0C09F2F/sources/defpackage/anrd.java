package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: anrd  reason: default package */
/* loaded from: classes.dex */
public final class anrd extends aopi implements aoqv {
    public static final anrd a;
    private static volatile aorb g;
    public int d;
    public boolean e;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        anrd anrdVar = new anrd();
        a = anrdVar;
        aopi.registerDefaultInstance(anrd.class, anrdVar);
    }

    private anrd() {
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
                return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new anrd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (anrd.class) {
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
