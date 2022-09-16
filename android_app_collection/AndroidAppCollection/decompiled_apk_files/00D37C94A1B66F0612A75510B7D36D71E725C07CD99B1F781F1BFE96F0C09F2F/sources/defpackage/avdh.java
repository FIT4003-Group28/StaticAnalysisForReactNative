package defpackage;
/* compiled from: PG */
/* renamed from: avdh  reason: default package */
/* loaded from: classes2.dex */
public final class avdh extends aopi implements aoqv {
    public static final avdh a;
    private static volatile aorb k;
    public int b;
    public arag e;
    public apzg f;
    public int h;
    public apok i;
    public aoob j;
    private arag l;
    private apzg m;
    private apzg n;
    private aoux o;
    private byte p = 2;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        avdh avdhVar = new avdh();
        a = avdhVar;
        aopi.registerDefaultInstance(avdh.class, avdhVar);
    }

    private avdh() {
        emptyProtobufList();
        this.j = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0003\n\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005Л\u0006ᐉ\u0004\bဌ\u0007\tᐉ\n\nည\u000b\u000bᐉ\t\rᐉ\u0003\u0010Л", new Object[]{"b", "c", avdf.class, "e", "l", "f", "g", avdi.class, "n", "h", avcd.j, "o", "j", "i", "m", "d", apzg.class});
            case 3:
                return new avdh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avdh.class) {
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
