package defpackage;
/* compiled from: PG */
/* renamed from: aqkt  reason: default package */
/* loaded from: classes2.dex */
public final class aqkt extends aopi implements aoqv {
    public static final aqkt a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public int d;
    public apzg e;
    public double f;
    private byte h = 2;

    static {
        aqkt aqktVar = new aqkt();
        a = aqktVar;
        aopi.registerDefaultInstance(aqkt.class, aqktVar);
    }

    private aqkt() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0004ᐉ\u0003\u0005က\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqkt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqkt.class) {
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
