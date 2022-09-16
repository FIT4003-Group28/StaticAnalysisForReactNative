package defpackage;
/* compiled from: PG */
/* renamed from: arqe  reason: default package */
/* loaded from: classes2.dex */
public final class arqe extends aopi implements aoqv {
    public static final arqe a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        arqe arqeVar = new arqe();
        a = arqeVar;
        aopi.registerDefaultInstance(arqe.class, arqeVar);
    }

    private arqe() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"c", "b", arqd.class, arqc.class});
            case 3:
                return new arqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arqe.class) {
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
