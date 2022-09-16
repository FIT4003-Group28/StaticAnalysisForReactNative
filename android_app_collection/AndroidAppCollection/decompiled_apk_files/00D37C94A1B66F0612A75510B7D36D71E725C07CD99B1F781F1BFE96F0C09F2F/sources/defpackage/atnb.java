package defpackage;
/* compiled from: PG */
/* renamed from: atnb  reason: default package */
/* loaded from: classes2.dex */
public final class atnb extends aopi implements aoqv {
    public static final atnb a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private ates h;
    private aoux i;
    private byte j = 2;

    static {
        atnb atnbVar = new atnb();
        a = atnbVar;
        aopi.registerDefaultInstance(atnb.class, atnbVar);
    }

    private atnb() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\tᐉ\u0003", new Object[]{"c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new atnb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atnb.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
