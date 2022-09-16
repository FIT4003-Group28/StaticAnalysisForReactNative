package defpackage;
/* compiled from: PG */
/* renamed from: aqkz  reason: default package */
/* loaded from: classes2.dex */
public final class aqkz extends aopi implements aoqv {
    public static final aqkz a;
    private static volatile aorb e;
    public int b;
    public avhn c;
    public int d;
    private byte f = 2;

    static {
        aqkz aqkzVar = new aqkz();
        a = aqkzVar;
        aopi.registerDefaultInstance(aqkz.class, aqkzVar);
    }

    private aqkz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", aqfh.i});
            case 3:
                return new aqkz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqkz.class) {
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
