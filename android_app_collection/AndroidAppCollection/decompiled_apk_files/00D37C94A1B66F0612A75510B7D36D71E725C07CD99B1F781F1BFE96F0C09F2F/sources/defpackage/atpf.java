package defpackage;
/* compiled from: PG */
/* renamed from: atpf  reason: default package */
/* loaded from: classes2.dex */
public final class atpf extends aopi implements aoqv {
    public static final atpf a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        atpf atpfVar = new atpf();
        a = atpfVar;
        aopi.registerDefaultInstance(atpf.class, atpfVar);
    }

    private atpf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", atpe.class, atpb.class, atpc.class});
            case 3:
                return new atpf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atpf.class) {
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
