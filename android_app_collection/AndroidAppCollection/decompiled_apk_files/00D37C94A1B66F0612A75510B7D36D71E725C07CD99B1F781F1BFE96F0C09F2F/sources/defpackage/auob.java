package defpackage;
/* compiled from: PG */
/* renamed from: auob  reason: default package */
/* loaded from: classes2.dex */
public final class auob extends aopi implements aoqv {
    public static final auob a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public arag e;
    public arag f;
    public apzg g;
    public auoa h;
    public auny j;
    private arag m;
    private aunb n;
    private aunb o;
    private aunb p;
    private aoux q;
    public int c = 0;
    private byte r = 2;
    public aopu i = emptyProtobufList();
    public aoob k = aoob.b;

    static {
        auob auobVar = new auob();
        a = auobVar;
        aopi.registerDefaultInstance(auob.class, auobVar);
    }

    private auob() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐼ\u0000\u0004ᐉ\u0006\u0005ᐉ\u000b\u0006ည\f\u0007ᐼ\u0000\bဉ\b\tЛ\nᐉ\u0003\u000bᐉ\u0007\fᐉ\u0001\rᐉ\t\u000eᐉ\n", new Object[]{"d", "c", "b", "e", "f", apuq.class, "h", "q", "k", arhs.class, "j", "i", aunz.class, "g", "n", "m", "o", "p"});
            case 3:
                return new auob();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (auob.class) {
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
