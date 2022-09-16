package defpackage;
/* compiled from: PG */
/* renamed from: arcf  reason: default package */
/* loaded from: classes2.dex */
public final class arcf extends aopi implements aoqv {
    public static final arcf a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private aoux g;
    private byte h = 2;

    static {
        arcf arcfVar = new arcf();
        a = arcfVar;
        aopi.registerDefaultInstance(arcf.class, arcfVar);
    }

    private arcf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\n\u0004\u0000\u0000\u0004\u0002ᐉ\n\u0003ᐉ\u0000\u0004ᐉ\u0001\nᐉ\u0006", new Object[]{"c", "g", "d", "e", "f"});
            case 3:
                return new arcf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcf.class) {
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
