package defpackage;
/* compiled from: PG */
/* renamed from: avch  reason: default package */
/* loaded from: classes2.dex */
public final class avch extends aopi implements aoqv {
    public static final avch a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public arag e;
    public apzg f;
    public avcj g;
    public int i;
    public int j;
    private aoux l;
    public int c = 0;
    private byte m = 2;
    public aoob h = aoob.b;

    static {
        avch avchVar = new avch();
        a = avchVar;
        aopi.registerDefaultInstance(avch.class, avchVar);
    }

    private avch() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐼ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0007ည\u0006\bᐉ\u0007\u000bဌ\b\fဌ\t\rᐼ\u0000", new Object[]{"d", "c", "b", "e", arhs.class, "f", "g", "h", "l", "i", avcd.b, "j", avcd.a, avhn.class});
            case 3:
                return new avch();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avch.class) {
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
