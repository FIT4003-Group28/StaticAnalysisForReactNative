package defpackage;
/* compiled from: PG */
/* renamed from: ausv  reason: default package */
/* loaded from: classes2.dex */
public final class ausv extends aopi implements aoqv {
    public static final ausv a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public aunb d;
    public ausu f;
    private aoux h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        ausv ausvVar = new ausv();
        a = ausvVar;
        aopi.registerDefaultInstance(ausv.class, ausvVar);
    }

    private ausv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ည\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0004", new Object[]{"b", "c", "e", "h", "d", "f"});
            case 3:
                return new ausv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (ausv.class) {
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
