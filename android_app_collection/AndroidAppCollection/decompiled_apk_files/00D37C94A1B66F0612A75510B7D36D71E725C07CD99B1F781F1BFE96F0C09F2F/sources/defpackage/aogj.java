package defpackage;
/* compiled from: PG */
/* renamed from: aogj  reason: default package */
/* loaded from: classes.dex */
public final class aogj extends aopi implements aoqv {
    public static final aopr a = new uil(3);
    public static final aogj b;
    private static volatile aorb j;
    public int c;
    public int e;
    public aogd g;
    public aogb h;
    public aogn i;
    public String d = "";
    public aopq f = emptyIntList();

    static {
        aogj aogjVar = new aogj();
        b = aogjVar;
        aopi.registerDefaultInstance(aogj.class, aogjVar);
    }

    private aogj() {
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
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001e\u0005ဉ\u0002\nဉ\u0007\u001cဉ\u0018", new Object[]{"c", "d", "e", aotr.h, "f", aout.a(), "g", "h", "i"});
            case 3:
                return new aogj();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aogj.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
