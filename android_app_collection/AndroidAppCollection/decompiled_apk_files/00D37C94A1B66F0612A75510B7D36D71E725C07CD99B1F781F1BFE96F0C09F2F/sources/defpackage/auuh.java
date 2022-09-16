package defpackage;
/* compiled from: PG */
/* renamed from: auuh  reason: default package */
/* loaded from: classes2.dex */
public final class auuh extends aopi implements aoqv {
    public static final auuh a;
    private static volatile aorb m;
    public int b;
    public arcy c;
    public arex d;
    public arha e;
    public avwm f;
    public autt g;
    public auts h;
    public arhc i;
    public atfa j;
    public avqf k;
    public avrz l;
    private byte n = 2;

    static {
        auuh auuhVar = new auuh();
        a = auuhVar;
        aopi.registerDefaultInstance(auuh.class, auuhVar);
    }

    private auuh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\ue7ecᢆ\ue675匹\n\u0000\u0000\n\ue7ecᢆᐉ\u0002\ufd42ᢳᐉ\u0001\uf2b9᪇ᐉ\u0004\uf3e7ᮦᐉ\u0003\ue592᯦ᐉ\u0007\uf859᱂ᐉ\u0005\uf8a7᱂ᐉ\u0006﮼\u1f4fᐉ\u0000\uf36b㢨ᐉ\t\ue675匹ᐉ\b", new Object[]{"b", "e", "d", "g", "f", "j", "h", "i", "c", "l", "k"});
            case 3:
                return new auuh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (auuh.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
