package defpackage;
/* compiled from: PG */
/* renamed from: dpo  reason: default package */
/* loaded from: classes3.dex */
public final class dpo extends aopi implements aoqv {
    public static final dpo a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        dpo dpoVar = new dpo();
        a = dpoVar;
        aopi.registerDefaultInstance(dpo.class, dpoVar);
    }

    private dpo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", dpn.class});
            case 3:
                return new dpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (dpo.class) {
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
