package defpackage;
/* compiled from: PG */
/* renamed from: atrm  reason: default package */
/* loaded from: classes2.dex */
public final class atrm extends aopi implements aoqv {
    public static final atrm a;
    private static volatile aorb j;
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean i;
    public String c = "";
    public String h = "";

    static {
        atrm atrmVar = new atrm();
        a = atrmVar;
        aopi.registerDefaultInstance(atrm.class, atrmVar);
    }

    private atrm() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဇ\u0004\u0006ဌ\u0006\u0007ဋ\u0002\bဈ\u0007\tဇ\b", new Object[]{"b", "c", "d", "f", "g", atqy.j, "e", "h", "i"});
            case 3:
                return new atrm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atrm.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
