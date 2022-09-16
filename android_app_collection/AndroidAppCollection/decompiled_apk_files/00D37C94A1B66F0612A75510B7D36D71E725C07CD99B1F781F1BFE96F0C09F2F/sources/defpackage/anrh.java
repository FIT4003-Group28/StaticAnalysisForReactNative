package defpackage;
/* compiled from: PG */
/* renamed from: anrh  reason: default package */
/* loaded from: classes.dex */
public final class anrh extends aopi implements aoqv {
    public static final anrh a;
    private static volatile aorb d;
    public int b;
    public aopu c = emptyProtobufList();

    static {
        anrh anrhVar = new anrh();
        a = anrhVar;
        aopi.registerDefaultInstance(anrh.class, anrhVar);
    }

    private anrh() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", anrg.class});
            case 3:
                return new anrh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (anrh.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
