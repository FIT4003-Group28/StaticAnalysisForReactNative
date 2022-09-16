package defpackage;
/* compiled from: PG */
/* renamed from: aqdz  reason: default package */
/* loaded from: classes2.dex */
public final class aqdz extends aopi implements aoqv {
    public static final aqdz a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private aoux f;
    private byte g = 2;

    static {
        aqdz aqdzVar = new aqdz();
        a = aqdzVar;
        aopi.registerDefaultInstance(aqdz.class, aqdzVar);
    }

    private aqdz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0006ᐉ\u0005\nᐉ\u0006", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aqdz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqdz.class) {
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
