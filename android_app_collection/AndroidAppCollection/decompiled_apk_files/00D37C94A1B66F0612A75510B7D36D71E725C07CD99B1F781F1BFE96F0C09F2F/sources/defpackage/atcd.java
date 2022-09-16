package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: atcd  reason: default package */
/* loaded from: classes2.dex */
public final class atcd extends aopi implements aoqv {
    public static final atcd a;
    private static volatile aorb b;

    static {
        atcd atcdVar = new atcd();
        a = atcdVar;
        aopi.registerDefaultInstance(atcd.class, atcdVar);
    }

    private atcd() {
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
                return new atcd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atcd.class) {
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
