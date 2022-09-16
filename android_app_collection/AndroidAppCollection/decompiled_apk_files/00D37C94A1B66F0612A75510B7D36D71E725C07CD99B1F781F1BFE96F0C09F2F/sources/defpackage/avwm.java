package defpackage;
/* compiled from: PG */
/* renamed from: avwm  reason: default package */
/* loaded from: classes2.dex */
public final class avwm extends aopi implements aoqv {
    public static final avwm a;
    private static volatile aorb k;
    public int b;
    public int d;
    public arag e;
    public arag f;
    public boolean g;
    public apzg h;
    public int i;
    public aoob j;
    private aoux l;
    private byte m = 2;
    public aopu c = emptyProtobufList();

    static {
        avwm avwmVar = new avwm();
        a = avwmVar;
        aopi.registerDefaultInstance(avwm.class, avwmVar);
    }

    private avwm() {
        emptyProtobufList();
        this.j = aoob.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0005\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0007\u0007ည\b\bᐉ\u0004\nဌ\u0005\u000bဇ\u0003", new Object[]{"b", "c", avwn.class, "d", "e", "f", "l", "j", "h", "i", avuh.u, "g"});
            case 3:
                return new avwm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avwm.class) {
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
