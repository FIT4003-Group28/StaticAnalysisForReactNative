package defpackage;
/* compiled from: PG */
/* renamed from: arkx  reason: default package */
/* loaded from: classes2.dex */
public final class arkx extends aopi implements aoqv {
    public static final arkx a;
    private static volatile aorb f;
    public int b;
    public String c;
    public String d;
    public boolean e;

    static {
        arkx arkxVar = new arkx();
        a = arkxVar;
        aopi.registerDefaultInstance(arkx.class, arkxVar);
    }

    private arkx() {
        aopi.emptyProtobufList();
        this.c = "";
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new arkx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arkx.class) {
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
