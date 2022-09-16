package defpackage;
/* compiled from: PG */
/* renamed from: asdg  reason: default package */
/* loaded from: classes2.dex */
public final class asdg extends aopi implements aoqv {
    public static final asdg a;
    private static volatile aorb j;
    public int b;
    public arpa c;
    public asde f;
    public arxz g;
    public long i;
    private aoux k;
    private arbf l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        asdg asdgVar = new asdg();
        a = asdgVar;
        aopi.registerDefaultInstance(asdg.class, asdgVar);
    }

    private asdg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0002\u0006\u0001ᐉ\u0000\u0003\u001b\u0005Л\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0003\tည\u0004\nဂ\u0005̉ᐉ\u0006", new Object[]{"b", "c", "d", aswg.class, "e", apzg.class, "f", "g", "k", "h", "i", "l"});
            case 3:
                return new asdg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asdg.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
