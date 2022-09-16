package defpackage;
/* compiled from: PG */
/* renamed from: aurn  reason: default package */
/* loaded from: classes2.dex */
public final class aurn extends aopi implements aoqv {
    public static final aurn a;
    private static volatile aorb f;
    public int b;
    public aqkm c;
    public boolean d;
    public apzg e;
    private aoux g;
    private byte h = 2;

    static {
        aurn aurnVar = new aurn();
        a = aurnVar;
        aopi.registerDefaultInstance(aurn.class, aurnVar);
    }

    private aurn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "g"});
            case 3:
                return new aurn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aurn.class) {
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
