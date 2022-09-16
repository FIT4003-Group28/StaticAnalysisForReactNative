package defpackage;
/* compiled from: PG */
/* renamed from: aofk  reason: default package */
/* loaded from: classes.dex */
public final class aofk extends aopi implements aoqv {
    public static final aofk a;
    private static volatile aorb e;
    public aoew b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();

    static {
        aofk aofkVar = new aofk();
        a = aofkVar;
        aopi.registerDefaultInstance(aofk.class, aofkVar);
    }

    private aofk() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002Ț\u0003Ȉ", new Object[]{"b", "d", "c"});
            case 3:
                return new aofk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aofk.class) {
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
