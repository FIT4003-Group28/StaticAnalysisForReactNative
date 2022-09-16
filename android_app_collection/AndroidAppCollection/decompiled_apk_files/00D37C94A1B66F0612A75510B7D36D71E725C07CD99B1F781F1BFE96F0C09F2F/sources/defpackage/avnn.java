package defpackage;
/* compiled from: PG */
/* renamed from: avnn  reason: default package */
/* loaded from: classes2.dex */
public final class avnn extends aopi implements aoqv {
    public static final avnn a;
    private static volatile aorb f;
    public int b;
    public auth d;
    private avnp g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aoux k;
    private byte l = 2;
    public aopu c = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        avnn avnnVar = new avnn();
        a = avnnVar;
        aopi.registerDefaultInstance(avnn.class, avnnVar);
    }

    private avnn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0002\u0007\u0001Л\u0004ᐉ\u0001\u0007\u001b\bᐉ\u0005\nᐉ\u0000\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004", new Object[]{"b", "c", autg.class, "d", "e", ausy.class, "k", "g", "h", "i", "j"});
            case 3:
                return new avnn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avnn.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
