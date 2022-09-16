package defpackage;
/* compiled from: PG */
/* renamed from: arjj  reason: default package */
/* loaded from: classes2.dex */
public final class arjj extends aopi implements aoqv {
    public static final arjj a;
    private static volatile aorb m;
    public int b;
    public avhn c;
    public arjc d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public apzg j;
    private aoux n;
    private byte o = 2;
    public aoob k = aoob.b;
    public aopu l = emptyProtobufList();

    static {
        arjj arjjVar = new arjj();
        a = arjjVar;
        aopi.registerDefaultInstance(arjj.class, arjjVar);
    }

    private arjj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0011\u000b\u0000\u0001\t\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\u000bᐉ\b\fည\t\u0010\u001b\u0011ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "n", "k", "l", aswg.class, "f"});
            case 3:
                return new arjj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arjj.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
