package defpackage;
/* compiled from: PG */
/* renamed from: atlf  reason: default package */
/* loaded from: classes2.dex */
public final class atlf extends aopi implements aoqv {
    public static final atlf a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private ates g;
    private aoux h;
    private byte i = 2;

    static {
        atlf atlfVar = new atlf();
        a = atlfVar;
        aopi.registerDefaultInstance(atlf.class, atlfVar);
    }

    private atlf() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0006ᐉ\u0007\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "h", "g"});
            case 3:
                return new atlf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atlf.class) {
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
