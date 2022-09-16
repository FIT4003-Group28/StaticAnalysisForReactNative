package defpackage;
/* compiled from: PG */
/* renamed from: aqcd  reason: default package */
/* loaded from: classes2.dex */
public final class aqcd extends aopi implements aoqv {
    public static final aqcd a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public avhn d;
    public apzg e;
    public boolean f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        aqcd aqcdVar = new aqcd();
        a = aqcdVar;
        aopi.registerDefaultInstance(aqcd.class, aqcdVar);
    }

    private aqcd() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new aqcd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqcd.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
