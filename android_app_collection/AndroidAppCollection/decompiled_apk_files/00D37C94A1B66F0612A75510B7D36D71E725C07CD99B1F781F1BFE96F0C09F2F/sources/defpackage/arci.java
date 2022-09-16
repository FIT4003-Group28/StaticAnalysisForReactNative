package defpackage;
/* compiled from: PG */
/* renamed from: arci  reason: default package */
/* loaded from: classes2.dex */
public final class arci extends aopi implements aoqv {
    public static final arci a;
    private static volatile aorb b;
    private int c;
    private arcq d;
    private arag e;
    private arcs f;
    private aoux g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private byte l = 2;

    static {
        arci arciVar = new arci();
        a = arciVar;
        aopi.registerDefaultInstance(arci.class, arciVar);
    }

    private arci() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\n\u0002ᐉ\u000f\u0003ᐉ\u0010\u0004ᐉ\u0011\bᐉ\u0004\fᐉ\u0000\rᐉ\u0005\u000fᐉ\u0003", new Object[]{"c", "h", "i", "j", "k", "f", "d", "g", "e"});
            case 3:
                return new arci();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arci.class) {
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
