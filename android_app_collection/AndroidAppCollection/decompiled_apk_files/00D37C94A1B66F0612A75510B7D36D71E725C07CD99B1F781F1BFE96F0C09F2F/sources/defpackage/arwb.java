package defpackage;
/* compiled from: PG */
/* renamed from: arwb  reason: default package */
/* loaded from: classes2.dex */
public final class arwb extends aopi implements aoqv {
    public static final arwb a;
    private static volatile aorb f;
    public int b;
    public arpa c;
    public auna d;
    private arwe g;
    private aoux h;
    private arbf i;
    private byte j = 2;
    public aoob e = aoob.b;

    static {
        arwb arwbVar = new arwb();
        a = arwbVar;
        aopi.registerDefaultInstance(arwb.class, arwbVar);
    }

    private arwb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "g", "d", "h", "e", "i"});
            case 3:
                return new arwb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arwb.class) {
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
