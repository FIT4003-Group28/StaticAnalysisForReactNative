package defpackage;
/* compiled from: PG */
/* renamed from: aqzf  reason: default package */
/* loaded from: classes2.dex */
public final class aqzf extends aopi implements aoqv {
    public static final aqzf a;
    private static volatile aorb g;
    public int b;
    public aoqp f = aoqp.a;
    public String c = "";
    public String d = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        aqzf aqzfVar = new aqzf();
        a = aqzfVar;
        aopi.registerDefaultInstance(aqzf.class, aqzfVar);
    }

    private aqzf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u00042", new Object[]{"b", "c", "d", "e", "f", aqze.a});
            case 3:
                return new aqzf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqzf.class) {
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
