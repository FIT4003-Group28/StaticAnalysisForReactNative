package defpackage;
/* compiled from: PG */
/* renamed from: dwc  reason: default package */
/* loaded from: classes3.dex */
public final class dwc extends aopi implements aoqv {
    public static final dwc a;
    private static volatile aorb f;
    public int b;
    public dwb c;
    public dwa d;
    public int e = -1;
    private int g;

    static {
        dwc dwcVar = new dwc();
        a = dwcVar;
        aopi.registerDefaultInstance(dwc.class, dwcVar);
    }

    private dwc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဌ\u0005", new Object[]{"g", "b", "c", "d", "e", sml.d});
            case 3:
                return new dwc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (dwc.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
