package defpackage;
/* compiled from: PG */
/* renamed from: auoh  reason: default package */
/* loaded from: classes2.dex */
public final class auoh extends aopi implements aoqv {
    public static final auoh a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopu d;

    static {
        auoh auohVar = new auoh();
        a = auohVar;
        aopi.registerDefaultInstance(auoh.class, auohVar);
    }

    private auoh() {
        aoob aoobVar = aoob.b;
        this.d = aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"b", "c", "d"});
            case 3:
                return new auoh();
            case 4:
                return new aopa((float[][][]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auoh.class) {
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
