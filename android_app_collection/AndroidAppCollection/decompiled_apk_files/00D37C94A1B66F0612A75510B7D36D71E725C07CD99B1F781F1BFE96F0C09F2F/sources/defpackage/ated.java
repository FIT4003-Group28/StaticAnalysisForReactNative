package defpackage;
/* compiled from: PG */
/* renamed from: ated  reason: default package */
/* loaded from: classes2.dex */
public final class ated extends aopi implements aoqv {
    public static final ated a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arhs d;
    public apok f;
    private aoux i;
    private byte j = 2;
    public aopu e = emptyProtobufList();
    public aoob g = aoob.b;

    static {
        ated atedVar = new ated();
        a = atedVar;
        aopi.registerDefaultInstance(ated.class, atedVar);
    }

    private ated() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005Л\u0006ᐉ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", arag.class, "f", "i", "g"});
            case 3:
                return new ated();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ated.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
