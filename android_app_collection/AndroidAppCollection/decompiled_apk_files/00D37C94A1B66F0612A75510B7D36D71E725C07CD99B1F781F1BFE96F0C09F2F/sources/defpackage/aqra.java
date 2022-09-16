package defpackage;
/* compiled from: PG */
/* renamed from: aqra  reason: default package */
/* loaded from: classes2.dex */
public final class aqra extends aopi implements aoqv {
    public static final aqra a;
    private static volatile aorb f;
    public int b;
    public aqrc c;
    public aqrg d;
    public aqrf e;
    private autr g;
    private autq h;
    private aqrb i;
    private aqrh j;
    private byte k = 2;

    static {
        aqra aqraVar = new aqra();
        a = aqraVar;
        aopi.registerDefaultInstance(aqra.class, aqraVar);
    }

    private aqra() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\uf85c⇧\uf22c鼠\u0007\u0000\u0000\u0007\uf85c⇧ᐉ\u0000\ue9c1⇨ᐉ\u0002\ueb8b≢ᐉ\u0001窱┕ᐉ\u0003\uf79d⼚ᐉ\u0004\uecb5㨞ᐉ\u0005\uf22c鼠ᐉ\u0006", new Object[]{"b", "g", "i", "h", "c", "d", "e", "j"});
            case 3:
                return new aqra();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqra.class) {
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
