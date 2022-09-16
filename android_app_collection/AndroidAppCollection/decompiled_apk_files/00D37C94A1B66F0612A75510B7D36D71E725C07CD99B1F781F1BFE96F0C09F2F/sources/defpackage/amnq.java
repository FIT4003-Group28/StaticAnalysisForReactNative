package defpackage;
/* compiled from: PG */
/* renamed from: amnq  reason: default package */
/* loaded from: classes.dex */
public final class amnq extends aopi implements aoqv {
    public static final amnq a;
    private static volatile aorb e;
    public amni b;
    public String c;
    public boolean d;

    static {
        amnq amnqVar = new amnq();
        a = amnqVar;
        aopi.registerDefaultInstance(amnq.class, amnqVar);
    }

    private amnq() {
        aoob aoobVar = aoob.b;
        this.c = "";
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\b\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\t\b\u0007", new Object[]{"c", "b", "d"});
            case 3:
                return new amnq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (amnq.class) {
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
