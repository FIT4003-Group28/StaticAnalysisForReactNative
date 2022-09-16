package defpackage;
/* compiled from: PG */
/* renamed from: atdw  reason: default package */
/* loaded from: classes2.dex */
public final class atdw extends aopi implements aoqv {
    private static final atdw a;
    private static volatile aorb b;
    private String c = "";
    private String d = "";

    static {
        atdw atdwVar = new atdw();
        a = atdwVar;
        aopi.registerDefaultInstance(atdw.class, atdwVar);
    }

    private atdw() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new atdw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atdw.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
