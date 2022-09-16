package defpackage;
/* compiled from: PG */
/* renamed from: avyg  reason: default package */
/* loaded from: classes2.dex */
public final class avyg extends aopi implements aoqv {
    public static final avyg a;
    private static volatile aorb f;
    public int b;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public String e;

    static {
        avyg avygVar = new avyg();
        a = avygVar;
        aopi.registerDefaultInstance(avyg.class, avygVar);
    }

    private avyg() {
        emptyProtobufList();
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000", new Object[]{"b", "c", avxz.class, "d", avyd.class, "e"});
            case 3:
                return new avyg();
            case 4:
                return new aopa((int[][][]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avyg.class) {
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
