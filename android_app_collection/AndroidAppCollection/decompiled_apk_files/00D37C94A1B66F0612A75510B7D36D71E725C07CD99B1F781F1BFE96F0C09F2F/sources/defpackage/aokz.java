package defpackage;
/* compiled from: PG */
/* renamed from: aokz  reason: default package */
/* loaded from: classes.dex */
public final class aokz extends aopi implements aoqv {
    public static final aokz a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aolo e;
    public aomk f;

    static {
        aokz aokzVar = new aokz();
        a = aokzVar;
        aopi.registerDefaultInstance(aokz.class, aokzVar);
    }

    private aokz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", aolf.class, "e", "f"});
            case 3:
                return new aokz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aokz.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
