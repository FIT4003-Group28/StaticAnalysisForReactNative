package defpackage;
/* compiled from: PG */
/* renamed from: aoym  reason: default package */
/* loaded from: classes.dex */
public final class aoym extends aopi implements aoqv {
    public static final aoym a;
    private static volatile aorb e;
    public int b;
    public int c;
    public float d;

    static {
        aoym aoymVar = new aoym();
        a = aoymVar;
        aopi.registerDefaultInstance(aoym.class, aoymVar);
    }

    private aoym() {
    }

    public static /* synthetic */ void a(aoym aoymVar) {
        aoymVar.b |= 2;
        aoymVar.d = 0.0f;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"b", "c", aoxm.f, "d"});
            case 3:
                return new aoym();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoym.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
