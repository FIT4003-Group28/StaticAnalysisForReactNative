package defpackage;
/* compiled from: PG */
/* renamed from: avzf  reason: default package */
/* loaded from: classes2.dex */
public final class avzf extends aopi implements aoqv {
    public static final avzf a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private avzg e;
    private apzg f;
    private arag g;
    private apzg h;
    private aoux i;
    private byte j = 2;

    static {
        avzf avzfVar = new avzf();
        a = avzfVar;
        aopi.registerDefaultInstance(avzf.class, avzfVar);
    }

    private avzf() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000f\u0006\u0000\u0000\u0006\u0004ᐉ\u0003\u0006ᐉ\u0005\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000fᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avzf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avzf.class) {
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
