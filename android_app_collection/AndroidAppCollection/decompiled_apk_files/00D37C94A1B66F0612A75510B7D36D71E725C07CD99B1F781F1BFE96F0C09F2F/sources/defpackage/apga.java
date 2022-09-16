package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: apga  reason: default package */
/* loaded from: classes.dex */
public final class apga extends aopi implements aoqv {
    public static final aopr a = new uil(10);
    public static final aopr b = new uil(11);
    public static final apga c;
    private static volatile aorb i;
    public boolean d;
    public int e;
    public aopq f = emptyIntList();
    public aopq g = emptyIntList();
    public boolean h;
    private int j;

    static {
        apga apgaVar = new apga();
        c = apgaVar;
        aopi.registerDefaultInstance(apga.class, apgaVar);
    }

    private apga() {
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
                return newMessageInfo(c, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003\u001e\u0004\u001e\u0005ဇ\u0002", new Object[]{"j", "d", "e", "f", apgb.a(), "g", apgb.a(), "h"});
            case 3:
                return new apga();
            case 4:
                return new aopa(c);
            case 5:
                return c;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apga.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(c);
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
