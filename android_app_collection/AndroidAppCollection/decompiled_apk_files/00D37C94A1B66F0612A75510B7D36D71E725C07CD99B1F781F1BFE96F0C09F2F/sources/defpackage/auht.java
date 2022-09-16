package defpackage;
/* compiled from: PG */
/* renamed from: auht  reason: default package */
/* loaded from: classes2.dex */
public final class auht extends aopi implements aoqv {
    public static final auht a;
    private static volatile aorb k;
    public int b;
    public aunb c;
    public aunb d;
    public auij e;
    public auij f;
    public apzg g;
    public avhn h;
    public apzg i;
    public arag j;
    private byte l = 2;

    static {
        auht auhtVar = new auht();
        a = auhtVar;
        aopi.registerDefaultInstance(auht.class, auhtVar);
    }

    private auht() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ဉ\u0003\bᐉ\u0004", new Object[]{"b", "c", "d", "e", "h", "i", "j", "f", "g"});
            case 3:
                return new auht();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (auht.class) {
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
