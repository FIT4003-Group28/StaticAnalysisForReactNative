package defpackage;
/* compiled from: PG */
/* renamed from: aoiu  reason: default package */
/* loaded from: classes.dex */
public final class aoiu extends aopi implements aoqv {
    public static final aoiu a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;

    static {
        aoiu aoiuVar = new aoiu();
        a = aoiuVar;
        aopi.registerDefaultInstance(aoiu.class, aoiuVar);
    }

    private aoiu() {
        emptyProtobufList();
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aoiu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aoiu.class) {
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
