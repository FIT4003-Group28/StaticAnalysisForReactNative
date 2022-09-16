package defpackage;
/* compiled from: PG */
/* renamed from: apob  reason: default package */
/* loaded from: classes.dex */
public final class apob extends aopi implements aoqv {
    public static final apob a;
    private static volatile aorb i;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public aopq h = emptyIntList();
    private int j;

    static {
        apob apobVar = new apob();
        a = apobVar;
        aopi.registerDefaultInstance(apob.class, apobVar);
    }

    private apob() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u0016", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apob();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apob.class) {
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
