package defpackage;
/* compiled from: PG */
/* renamed from: avyi  reason: default package */
/* loaded from: classes2.dex */
public final class avyi extends aopi implements aoqv {
    private static final avyi a;
    private static volatile aorb b;
    private int c = 0;
    private Object d;

    static {
        avyi avyiVar = new avyi();
        a = avyiVar;
        aopi.registerDefaultInstance(avyi.class, avyiVar);
    }

    private avyi() {
    }

    public static avyh a() {
        return (avyh) a.createBuilder();
    }

    public static /* synthetic */ void c(avyi avyiVar, avyg avygVar) {
        avyiVar.d(avygVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(avyg avygVar) {
        avygVar.getClass();
        this.d = avygVar;
        this.c = 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"d", "c", avyg.class});
            case 3:
                return new avyi();
            case 4:
                return new avyh();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avyi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
