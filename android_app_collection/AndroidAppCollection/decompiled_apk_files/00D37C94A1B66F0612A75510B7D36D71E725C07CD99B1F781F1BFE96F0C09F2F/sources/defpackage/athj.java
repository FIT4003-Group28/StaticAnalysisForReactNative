package defpackage;
/* compiled from: PG */
/* renamed from: athj  reason: default package */
/* loaded from: classes2.dex */
public final class athj extends aopi implements aoqv {
    public static final athj a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public int f;
    public avhn g;
    public arag j;
    private byte l = 2;
    public aopu h = emptyProtobufList();
    public aopu i = emptyProtobufList();

    static {
        athj athjVar = new athj();
        a = athjVar;
        aopi.registerDefaultInstance(athj.class, athjVar);
    }

    private athj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005Л\u0006Л\u0007ဌ\u0003\bᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "h", apok.class, "i", avac.class, "f", auca.p, "j"});
            case 3:
                return new athj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (athj.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
