package defpackage;
/* compiled from: PG */
/* renamed from: aswg  reason: default package */
/* loaded from: classes2.dex */
public final class aswg extends aopi implements aoqv {
    public static final aswg a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        aswg aswgVar = new aswg();
        a = aswgVar;
        aopi.registerDefaultInstance(aswg.class, aswgVar);
    }

    private aswg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", "d", aswf.class, "e", aswh.class});
            case 3:
                return new aswg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aswg.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
