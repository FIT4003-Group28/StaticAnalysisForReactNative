package defpackage;
/* compiled from: PG */
/* renamed from: aqna  reason: default package */
/* loaded from: classes2.dex */
public final class aqna extends aopi implements aoqv {
    public static final aqna a;
    private static volatile aorb j;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public aqmz f;
    public aunb g;
    public aunb h;
    private aoux k;
    private byte l = 2;
    public aoob i = aoob.b;

    static {
        aqna aqnaVar = new aqna();
        a = aqnaVar;
        aopi.registerDefaultInstance(aqna.class, aqnaVar);
    }

    private aqna() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0007\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ည\u0007\bᐉ\u0003\tᐉ\u0005\nᐉ\u0000", new Object[]{"b", "d", "e", "g", "k", "i", "f", "h", "c"});
            case 3:
                return new aqna();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqna.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
