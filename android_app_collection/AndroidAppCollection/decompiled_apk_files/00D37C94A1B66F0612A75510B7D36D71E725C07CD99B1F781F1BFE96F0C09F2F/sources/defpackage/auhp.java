package defpackage;
/* compiled from: PG */
/* renamed from: auhp  reason: default package */
/* loaded from: classes2.dex */
public final class auhp extends aopi implements aoqv {
    public static final auhp a;
    private static volatile aorb l;
    public int b;
    public aunb c;
    public aunb d;
    public auij e;
    public auij f;
    public apzg g;
    public avhn h;
    public apzg i;
    public arag j;
    private byte m = 2;
    public String k = "";

    static {
        auhp auhpVar = new auhp();
        a = auhpVar;
        aopi.registerDefaultInstance(auhp.class, auhpVar);
    }

    private auhp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new auhp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (auhp.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
