package defpackage;
/* compiled from: PG */
/* renamed from: asyn  reason: default package */
/* loaded from: classes2.dex */
public final class asyn extends aopi implements aoqv {
    public static final asyn a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public String d;
    public aopu e;
    public aopu f;
    public String g;

    static {
        asyn asynVar = new asyn();
        a = asynVar;
        aopi.registerDefaultInstance(asyn.class, asynVar);
    }

    private asyn() {
        aoob aoobVar = aoob.b;
        this.d = "";
        this.e = aopi.emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001a\u0005\u001b\u0006ဈ\u0003", new Object[]{"b", "c", "d", "e", "f", aqnl.class, "g"});
            case 3:
                return new asyn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asyn.class) {
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
