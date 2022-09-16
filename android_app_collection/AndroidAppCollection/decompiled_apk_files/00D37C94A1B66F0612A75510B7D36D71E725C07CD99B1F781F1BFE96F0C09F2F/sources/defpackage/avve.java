package defpackage;
/* compiled from: PG */
/* renamed from: avve  reason: default package */
/* loaded from: classes2.dex */
public final class avve extends aopi implements aoqv {
    public static final avve a;
    private static volatile aorb i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;

    static {
        avve avveVar = new avve();
        a = avveVar;
        aopi.registerDefaultInstance(avve.class, avveVar);
    }

    private avve() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\u001d\u0007\u0000\u0000\u0000\u0003ဇ\u0001\tဇ\u0005\nဇ\u0006\u0012ဇ\f\u001aဇ\u0012\u001cဇ\u0014\u001dဇ\u0015", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new avve();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avve.class) {
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
