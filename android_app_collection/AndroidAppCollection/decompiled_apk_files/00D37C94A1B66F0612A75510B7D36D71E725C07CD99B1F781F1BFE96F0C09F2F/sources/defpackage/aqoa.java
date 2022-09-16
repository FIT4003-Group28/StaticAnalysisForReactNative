package defpackage;
/* compiled from: PG */
/* renamed from: aqoa  reason: default package */
/* loaded from: classes2.dex */
public final class aqoa extends aopi implements aoqv {
    public static final aqoa a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aqnl e;
    public boolean f;
    public int g;

    static {
        aqoa aqoaVar = new aqoa();
        a = aqoaVar;
        aopi.registerDefaultInstance(aqoa.class, aqoaVar);
    }

    private aqoa() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", aqnl.class, "e", "f", "g", aqob.a()});
            case 3:
                return new aqoa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqoa.class) {
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
