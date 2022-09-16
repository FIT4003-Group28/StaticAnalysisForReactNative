package defpackage;
/* compiled from: PG */
/* renamed from: atfh  reason: default package */
/* loaded from: classes2.dex */
public final class atfh extends aopi implements aoqv {
    public static final atfh a;
    private static volatile aorb h;
    public int b;
    public arhs c;
    public int d;
    public aovr g;
    private aoux i;
    private byte j = 2;
    public String e = "";
    public aoob f = aoob.b;

    static {
        atfh atfhVar = new atfh();
        a = atfhVar;
        aopi.registerDefaultInstance(atfh.class, atfhVar);
    }

    private atfh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006ည\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", atdq.g, "e", "i", "f", "g"});
            case 3:
                return new atfh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atfh.class) {
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
