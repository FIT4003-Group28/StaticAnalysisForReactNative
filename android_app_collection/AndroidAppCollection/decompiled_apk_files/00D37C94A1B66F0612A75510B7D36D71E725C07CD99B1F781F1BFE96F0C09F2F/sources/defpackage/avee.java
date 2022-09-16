package defpackage;
/* compiled from: PG */
/* renamed from: avee  reason: default package */
/* loaded from: classes2.dex */
public final class avee extends aopi implements aoqv {
    public static final avee a;
    private static volatile aorb k;
    public int b;
    public int c;
    public arag d;
    public aunb h;
    public avhn i;
    public aunb j;
    private aoux l;
    private byte m = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        avee aveeVar = new avee();
        a = aveeVar;
        aopi.registerDefaultInstance(avee.class, aveeVar);
    }

    private avee() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\b\u0001ဋ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005Л\u0006ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0005\fᐉ\b", new Object[]{"b", "c", "d", "e", apzg.class, "f", apzg.class, "g", apzg.class, "h", "i", "j", "l"});
            case 3:
                return new avee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avee.class) {
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
