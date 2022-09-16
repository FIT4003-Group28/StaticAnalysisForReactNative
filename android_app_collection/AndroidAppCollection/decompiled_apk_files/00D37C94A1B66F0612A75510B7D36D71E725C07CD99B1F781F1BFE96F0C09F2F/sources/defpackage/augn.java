package defpackage;
/* compiled from: PG */
/* renamed from: augn  reason: default package */
/* loaded from: classes2.dex */
public final class augn extends aopi implements aoqv {
    public static final augn a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public arag e;
    public arag f;
    public arag g;
    public apzg i;
    public aunb j;
    private ates m;
    private aoux n;
    private byte o = 2;
    public aopu d = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        augn augnVar = new augn();
        a = augnVar;
        aopi.registerDefaultInstance(augn.class, augnVar);
    }

    private augn() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0007\tᐉ\b\nᐉ\u0001\u000bᐉ\u0006", new Object[]{"b", "c", "d", avhc.class, "f", "g", "h", apmg.class, "i", "m", "k", "n", "e", "j"});
            case 3:
                return new augn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (augn.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
