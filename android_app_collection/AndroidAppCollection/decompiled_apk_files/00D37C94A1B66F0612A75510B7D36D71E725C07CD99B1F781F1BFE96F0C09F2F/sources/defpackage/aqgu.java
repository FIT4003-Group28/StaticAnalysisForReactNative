package defpackage;
/* compiled from: PG */
/* renamed from: aqgu  reason: default package */
/* loaded from: classes2.dex */
public final class aqgu extends aopi implements aoqv {
    public static final aqgu a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arhs d;
    public aqgs e;
    public aqgt g;
    public apzg h;
    public avgj i;
    public int j;
    private aoux l;
    private byte m = 2;
    public aoob f = aoob.b;

    static {
        aqgu aqguVar = new aqgu();
        a = aqguVar;
        aopi.registerDefaultInstance(aqgu.class, aqguVar);
    }

    private aqgu() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\tဉ\u0007\u000bᐉ\t\fဉ\n\rဌ\u000b", new Object[]{"b", "c", "d", "e", "l", "f", "g", "h", "i", "j", aqfh.d});
            case 3:
                return new aqgu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aqgu.class) {
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
