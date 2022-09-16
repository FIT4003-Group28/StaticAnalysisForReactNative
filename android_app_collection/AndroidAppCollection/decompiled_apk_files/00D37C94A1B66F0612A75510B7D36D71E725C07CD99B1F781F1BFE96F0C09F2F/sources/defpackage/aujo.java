package defpackage;
/* compiled from: PG */
/* renamed from: aujo  reason: default package */
/* loaded from: classes2.dex */
public final class aujo extends aopi implements aoqv {
    public static final aujo a;
    private static volatile aorb i;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int j;

    static {
        aujo aujoVar = new aujo();
        a = aujoVar;
        aopi.registerDefaultInstance(aujo.class, aujoVar);
    }

    private aujo() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"j", "b", "c", "d", "e", auii.d, "f", "g", "h"});
            case 3:
                return new aujo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aujo.class) {
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
