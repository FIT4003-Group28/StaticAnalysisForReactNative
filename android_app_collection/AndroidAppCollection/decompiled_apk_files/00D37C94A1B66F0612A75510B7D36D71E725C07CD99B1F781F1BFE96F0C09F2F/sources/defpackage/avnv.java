package defpackage;
/* compiled from: PG */
/* renamed from: avnv  reason: default package */
/* loaded from: classes2.dex */
public final class avnv extends aopi implements aoqv {
    public static final avnv a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public apok e;
    public aunb g;
    public avnu i;
    public apzg j;
    private aoux l;
    private apok m;
    private aunb n;
    private byte o = 2;
    public aopu d = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        avnv avnvVar = new avnv();
        a = avnvVar;
        aopi.registerDefaultInstance(avnv.class, avnvVar);
    }

    private avnv() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004Л\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005\bᐉ\u0007\tᐉ\u0002\nᐉ\b\u000bᐉ\u0006", new Object[]{"b", "c", "d", avnx.class, "e", "f", arag.class, "l", "h", "i", "m", "g", "n", "j"});
            case 3:
                return new avnv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avnv.class) {
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
