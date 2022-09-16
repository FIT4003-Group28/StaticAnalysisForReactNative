package defpackage;
/* compiled from: PG */
/* renamed from: atjy  reason: default package */
/* loaded from: classes2.dex */
public final class atjy extends aopi implements aoqv {
    public static final atjy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private aoux g;
    private byte h = 2;

    static {
        atjy atjyVar = new atjy();
        a = atjyVar;
        aopi.registerDefaultInstance(atjy.class, atjyVar);
    }

    private atjy() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new atjy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atjy.class) {
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
