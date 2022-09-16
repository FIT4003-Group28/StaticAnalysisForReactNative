package defpackage;
/* compiled from: PG */
/* renamed from: apny  reason: default package */
/* loaded from: classes.dex */
public final class apny extends aopi implements aoqv {
    public static final apny a;
    private static volatile aorb e;
    public Object c;
    public int b = 0;
    public aopu d = aopi.emptyProtobufList();

    static {
        apny apnyVar = new apny();
        a = apnyVar;
        aopi.registerDefaultInstance(apny.class, apnyVar);
    }

    private apny() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\uf646鲵\u0002\u0000\u0001\u0000\u0001\u001a\uf646鲵ြ\u0000", new Object[]{"c", "b", "d", awhd.class});
            case 3:
                return new apny();
            case 4:
                return new aopa((short[]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apny.class) {
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
