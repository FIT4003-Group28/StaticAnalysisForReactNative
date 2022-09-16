package defpackage;
/* compiled from: PG */
/* renamed from: aske  reason: default package */
/* loaded from: classes2.dex */
public final class aske extends aopi implements aoqv {
    public static final aske a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public String d = "";
    public askd e;

    static {
        aske askeVar = new aske();
        a = askeVar;
        aopi.registerDefaultInstance(aske.class, askeVar);
    }

    private aske() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aske();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aske.class) {
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
