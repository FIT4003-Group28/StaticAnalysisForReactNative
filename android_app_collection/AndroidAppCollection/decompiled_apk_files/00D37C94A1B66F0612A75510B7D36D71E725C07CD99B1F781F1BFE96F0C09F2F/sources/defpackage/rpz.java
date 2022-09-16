package defpackage;
/* compiled from: PG */
/* renamed from: rpz  reason: default package */
/* loaded from: classes4.dex */
public final class rpz extends aopi implements aoqv {
    public static final rpz a;
    private static volatile aorb g;
    public int b;
    public int c;
    public boolean e;
    public String d = "";
    public aopu f = aopi.emptyProtobufList();

    static {
        rpz rpzVar = new rpz();
        a = rpzVar;
        aopi.registerDefaultInstance(rpz.class, rpzVar);
    }

    private rpz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"b", "c", dnn.s, "d", "e", "f"});
            case 3:
                return new rpz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (rpz.class) {
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
