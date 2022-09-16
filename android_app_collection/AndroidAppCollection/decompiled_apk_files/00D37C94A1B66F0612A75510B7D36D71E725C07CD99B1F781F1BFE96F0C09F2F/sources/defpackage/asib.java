package defpackage;
/* compiled from: PG */
/* renamed from: asib  reason: default package */
/* loaded from: classes2.dex */
public final class asib extends aopi implements aoqv {
    public static final asib a;
    private static volatile aorb k;
    public int b;
    public aunb c;
    public aunb d;
    public aunb e;
    public aunb f;
    public aunb g;
    public aunb h;
    public aoyz j;
    private aunb l;
    private aunb m;
    private aoux n;
    private aunb o;
    private byte p = 2;
    public aoob i = aoob.b;

    static {
        asib asibVar = new asib();
        a = asibVar;
        aopi.registerDefaultInstance(asib.class, asibVar);
    }

    private asib() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0007\u0003ည\n\u0004ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0002\nᐉ\b\u000bᐉ\t\rᐉ\u0006\u000eဉ\f", new Object[]{"b", "c", "n", "i", "d", "l", "f", "m", "e", "h", "o", "g", "j"});
            case 3:
                return new asib();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (asib.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
