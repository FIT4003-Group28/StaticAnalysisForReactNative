package defpackage;
/* compiled from: PG */
/* renamed from: avbt  reason: default package */
/* loaded from: classes2.dex */
public final class avbt extends aopi implements aoqv {
    public static final avbt a;
    private static volatile aorb m;
    public int b;
    public Object d;
    public avhn e;
    public arag g;
    public arag h;
    public aunb j;
    public aunb k;
    private aoux n;
    public int c = 0;
    private byte o = 2;
    public aopq f = emptyIntList();
    public aopu i = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        avbt avbtVar = new avbt();
        a = avbtVar;
        aopi.registerDefaultInstance(avbt.class, avbtVar);
    }

    private avbt() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\t\u0001ᐉ\u0003\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004Л\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bည\t\tᐼ\u0000\nᐼ\u0000\u000b\u001d", new Object[]{"d", "c", "b", "e", "g", "h", "i", arag.class, "j", "k", "n", "l", avhn.class, arhs.class, "f"});
            case 3:
                return new avbt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (avbt.class) {
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
