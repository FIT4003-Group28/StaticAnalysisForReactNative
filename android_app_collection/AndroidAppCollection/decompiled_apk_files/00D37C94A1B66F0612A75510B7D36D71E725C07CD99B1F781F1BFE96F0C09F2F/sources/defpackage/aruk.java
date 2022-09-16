package defpackage;
/* compiled from: PG */
/* renamed from: aruk  reason: default package */
/* loaded from: classes2.dex */
public final class aruk extends aopi implements aoqv {
    public static final aruk a;
    private static volatile aorb g;
    public int b;
    public arpa c;
    public aoob e;
    public apnf f;
    private arum h;
    private aoux i;
    private arbf j;
    private aunb k;
    private aunb l;
    private aunb m;
    private byte n = 2;
    public aopu d = emptyProtobufList();

    static {
        aruk arukVar = new aruk();
        a = arukVar;
        aopi.registerDefaultInstance(aruk.class, arukVar);
    }

    private aruk() {
        emptyProtobufList();
        this.e = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001̉\n\u0000\u0001\t\u0001ᐉ\u0000\u0004Л\u0005ည\u0004\nᐉ\u0002\u000bᐉ\u0003\rᐉ\b\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b̉ᐉ\u0007", new Object[]{"b", "c", "d", arul.class, "e", "h", "i", "k", "f", "l", "m", "j"});
            case 3:
                return new aruk();
            case 4:
                return new aopa((boolean[][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aruk.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
