package defpackage;
/* compiled from: PG */
/* renamed from: asuv  reason: default package */
/* loaded from: classes2.dex */
public final class asuv extends aopi implements aoqv {
    public static final asuv a;
    private static volatile aorb i;
    public int b;
    public apzg c;
    public boolean d;
    public long f;
    public asuu g;
    public boolean h;
    private byte j = 2;
    public int e = 1;

    static {
        asuv asuvVar = new asuv();
        a = asuvVar;
        aopi.registerDefaultInstance(asuv.class, asuvVar);
    }

    private asuv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0006\u0005ဂ\u0005\u0006ဇ\u0003\u0007ဇ\u0007\nဌ\u0004", new Object[]{"b", "c", "g", "f", "d", "h", "e", asut.a});
            case 3:
                return new asuv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asuv.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
