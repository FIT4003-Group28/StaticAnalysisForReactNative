package defpackage;
/* compiled from: PG */
/* renamed from: aurq  reason: default package */
/* loaded from: classes2.dex */
public final class aurq extends aopi implements aoqv {
    public static final aurq a;
    private static volatile aorb f;
    public int b;
    public int c;
    public arag d;
    private aoux g;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        aurq aurqVar = new aurq();
        a = aurqVar;
        aopi.registerDefaultInstance(aurq.class, aurqVar);
    }

    private aurq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003Л\u0005ᐉ\u0002", new Object[]{"b", "c", aupm.m, "d", "e", aurw.class, "g"});
            case 3:
                return new aurq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aurq.class) {
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
