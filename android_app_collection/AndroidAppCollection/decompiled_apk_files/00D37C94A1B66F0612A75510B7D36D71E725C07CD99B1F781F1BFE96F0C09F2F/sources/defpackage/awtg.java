package defpackage;
/* compiled from: PG */
/* renamed from: awtg  reason: default package */
/* loaded from: classes2.dex */
public final class awtg extends aopi implements aoqv {
    public static final awtg a;
    private static volatile aorb e;
    public int b;
    public long c;
    public aoqp d = aoqp.a;

    static {
        awtg awtgVar = new awtg();
        a = awtgVar;
        aopi.registerDefaultInstance(awtg.class, awtgVar);
    }

    private awtg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0001\u0000\u0000\u0001ဂ\u0000\u00032", new Object[]{"b", "c", "d", awtf.a});
            case 3:
                return new awtg();
            case 4:
                return new aopa((boolean[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awtg.class) {
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
