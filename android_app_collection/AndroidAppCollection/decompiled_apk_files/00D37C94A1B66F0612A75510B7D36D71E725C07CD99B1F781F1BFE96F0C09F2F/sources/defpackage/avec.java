package defpackage;
/* compiled from: PG */
/* renamed from: avec  reason: default package */
/* loaded from: classes2.dex */
public final class avec extends aopi implements aoqv {
    public static final avec a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private avdz e;
    private arag f;
    private avdy g;
    private aoux h;
    private aveb i;
    private arag j;
    private byte k = 2;

    static {
        avec avecVar = new avec();
        a = avecVar;
        aopi.registerDefaultInstance(avec.class, avecVar);
    }

    private avec() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0006\tᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new avec();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avec.class) {
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
