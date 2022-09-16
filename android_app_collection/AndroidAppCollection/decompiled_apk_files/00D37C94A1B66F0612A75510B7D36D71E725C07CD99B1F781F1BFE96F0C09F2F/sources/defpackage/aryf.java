package defpackage;
/* compiled from: PG */
/* renamed from: aryf  reason: default package */
/* loaded from: classes2.dex */
public final class aryf extends aopi implements aoqv {
    public static final aryf a;
    private static volatile aorb j;
    public int b;
    public arpa c;
    public apok e;
    public arxz f;
    public long h;
    private aoux k;
    private arbf l;
    private byte m = 2;
    public aopu d = emptyProtobufList();
    public String g = "";
    public aoob i = aoob.b;

    static {
        aryf aryfVar = new aryf();
        a = aryfVar;
        aopi.registerDefaultInstance(aryf.class, aryfVar);
    }

    private aryf() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0006ဈ\u0004\u0007ᐉ\u0002\tဂ\u0005\nᐉ\u0006\u000bည\u0007̉ᐉ\b", new Object[]{"b", "c", "d", apzg.class, "e", "g", "f", "h", "k", "i", "l"});
            case 3:
                return new aryf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aryf.class) {
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
