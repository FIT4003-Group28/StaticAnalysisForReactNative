package defpackage;
/* compiled from: PG */
/* renamed from: arjd  reason: default package */
/* loaded from: classes2.dex */
public final class arjd extends aopi implements aoqv {
    public static final arjd a;
    private static volatile aorb k;
    public avhn b;
    public arag c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public apzg h;
    private int l;
    private aoux m;
    private byte n = 2;
    public aoob i = aoob.b;
    public aopu j = emptyProtobufList();

    static {
        arjd arjdVar = new arjd();
        a = arjdVar;
        aopi.registerDefaultInstance(arjd.class, arjdVar);
    }

    private arjd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0010\n\u0000\u0001\b\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\nᐉ\u0007\u000bည\b\u000f\u001b\u0010ᐉ\u0002", new Object[]{"l", "b", "c", "e", "f", "g", "h", "m", "i", "j", aswg.class, "d"});
            case 3:
                return new arjd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (arjd.class) {
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
