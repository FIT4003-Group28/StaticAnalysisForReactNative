package defpackage;
/* compiled from: PG */
/* renamed from: rqs  reason: default package */
/* loaded from: classes4.dex */
public final class rqs extends aopi implements aoqv {
    public static final rqs a;
    private static volatile aorb i;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public boolean g;
    public double h;

    static {
        rqs rqsVar = new rqs();
        a = rqsVar;
        aopi.registerDefaultInstance(rqs.class, rqsVar);
    }

    private rqs() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"b", "c", dnn.t, "d", rqs.class, "e", "f", "g", "h"});
            case 3:
                return new rqs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (rqs.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
