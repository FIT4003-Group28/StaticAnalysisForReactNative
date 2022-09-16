package defpackage;
/* compiled from: PG */
/* renamed from: arty  reason: default package */
/* loaded from: classes2.dex */
public final class arty extends aopi implements aoqv {
    public static final arty a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    private aoux i;
    private arbf j;
    private byte k = 2;
    public aopu d = emptyProtobufList();
    public String e = "";
    public aopu f = emptyProtobufList();
    public String g = "";

    static {
        arty artyVar = new arty();
        a = artyVar;
        aopi.registerDefaultInstance(arty.class, artyVar);
    }

    private arty() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0002\u0005\u0001ᐉ\u0000\u0002Л\u0003ဈ\u0001\u0004Л\u0005ဈ\u0002\u0006ᐉ\u0003̉ᐉ\u0005", new Object[]{"b", "c", "d", artw.class, "e", "f", artw.class, "g", "i", "j"});
            case 3:
                return new arty();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arty.class) {
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
