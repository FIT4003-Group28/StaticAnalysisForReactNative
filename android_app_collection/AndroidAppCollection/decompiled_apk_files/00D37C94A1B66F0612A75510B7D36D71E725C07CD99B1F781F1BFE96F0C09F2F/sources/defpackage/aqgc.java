package defpackage;
/* compiled from: PG */
/* renamed from: aqgc  reason: default package */
/* loaded from: classes2.dex */
public final class aqgc extends aopi implements aoqv {
    public static final aqgc a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public apok d;
    private aoux f;
    private byte g = 2;

    static {
        aqgc aqgcVar = new aqgc();
        a = aqgcVar;
        aopi.registerDefaultInstance(aqgc.class, aqgcVar);
    }

    private aqgc() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0001", new Object[]{"b", "c", "f", "d"});
            case 3:
                return new aqgc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqgc.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
