package defpackage;
/* compiled from: PG */
/* renamed from: atlk  reason: default package */
/* loaded from: classes2.dex */
public final class atlk extends aopi implements aoqv {
    public static final atlk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aoux e;
    private apzg f;
    private byte g = 2;

    static {
        atlk atlkVar = new atlk();
        a = atlkVar;
        aopi.registerDefaultInstance(atlk.class, atlkVar);
    }

    private atlk() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new atlk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atlk.class) {
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
