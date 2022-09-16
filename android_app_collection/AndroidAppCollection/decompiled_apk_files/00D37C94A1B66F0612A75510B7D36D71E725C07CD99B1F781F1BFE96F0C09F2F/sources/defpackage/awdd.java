package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdd  reason: default package */
/* loaded from: classes2.dex */
public final class awdd extends aopi implements aoqv {
    public static final awdd a;
    private static volatile aorb c;
    private int d;
    private arag e;
    private apzg f;
    private arag g;
    private aoux h;
    private byte i = 2;
    public aopu b = emptyProtobufList();

    static {
        awdd awddVar = new awdd();
        a = awddVar;
        aopi.registerDefaultInstance(awdd.class, awddVar);
    }

    private awdd() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0003\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"d", "e", "b", awdc.class, "h", "f", "g"});
            case 3:
                return new awdd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awdd.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
