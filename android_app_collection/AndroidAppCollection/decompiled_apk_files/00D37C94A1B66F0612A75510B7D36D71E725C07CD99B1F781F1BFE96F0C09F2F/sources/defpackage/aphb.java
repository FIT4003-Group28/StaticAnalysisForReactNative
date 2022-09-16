package defpackage;
/* compiled from: PG */
/* renamed from: aphb  reason: default package */
/* loaded from: classes.dex */
public final class aphb extends aopi implements aoqv {
    public static final aphb a;
    private static volatile aorb f;
    public long b;
    public long c;
    public avhn d;
    private int g;
    private aoux h;
    private apzg i;
    private aunb j;
    private byte k = 2;
    public aoob e = aoob.b;

    static {
        aphb aphbVar = new aphb();
        a = aphbVar;
        aopi.registerDefaultInstance(aphb.class, aphbVar);
    }

    private aphb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0004\u0001ဂ\u0000\u0002ဂ\u0001\u0006ᐉ\u0002\bᐉ\u0003\tည\u0004\nᐉ\u0005\fᐉ\u0007", new Object[]{"g", "b", "c", "d", "h", "e", "i", "j"});
            case 3:
                return new aphb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aphb.class) {
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
