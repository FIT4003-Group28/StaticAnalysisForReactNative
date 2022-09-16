package defpackage;
/* compiled from: PG */
/* renamed from: arfh  reason: default package */
/* loaded from: classes2.dex */
public final class arfh extends aopi implements aoqv {
    public static final arfh a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private aoux g;
    private byte h = 2;

    static {
        arfh arfhVar = new arfh();
        a = arfhVar;
        aopi.registerDefaultInstance(arfh.class, arfhVar);
    }

    private arfh() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0004\u0002ᐉ\u0002\u0006ᐉ\u0004\bᐉ\u0001\tᐉ\u0003", new Object[]{"c", "e", "g", "d", "f"});
            case 3:
                return new arfh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arfh.class) {
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
