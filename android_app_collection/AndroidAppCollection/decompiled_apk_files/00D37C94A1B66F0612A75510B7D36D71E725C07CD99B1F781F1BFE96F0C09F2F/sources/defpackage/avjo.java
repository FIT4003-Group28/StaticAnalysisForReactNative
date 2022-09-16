package defpackage;
/* compiled from: PG */
/* renamed from: avjo  reason: default package */
/* loaded from: classes2.dex */
public final class avjo extends aopd implements aope {
    public static final avjo a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public avhn d;
    public boolean e;
    private aoux j;
    private apzg k;
    private apzg m;
    private byte n = 2;
    public String f = "";
    public aopu g = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        avjo avjoVar = new avjo();
        a = avjoVar;
        aopi.registerDefaultInstance(avjo.class, avjoVar);
    }

    private avjo() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ည\b\u0007Л\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "j", "h", "g", avjl.class, "k", "m"});
            case 3:
                return new avjo();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avjo.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
