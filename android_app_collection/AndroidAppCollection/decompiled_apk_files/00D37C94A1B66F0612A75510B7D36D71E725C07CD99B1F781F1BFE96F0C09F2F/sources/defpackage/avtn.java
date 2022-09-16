package defpackage;
/* compiled from: PG */
/* renamed from: avtn  reason: default package */
/* loaded from: classes2.dex */
public final class avtn extends aopi implements aoqv {
    public static final avtn a;
    private static volatile aorb e;
    public int b;
    public apzg c;
    public arhs d;
    private arag f;
    private aoux g;
    private byte h = 2;

    static {
        avtn avtnVar = new avtn();
        a = avtnVar;
        aopi.registerDefaultInstance(avtn.class, avtnVar);
    }

    private avtn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "f", "c", "g", "d"});
            case 3:
                return new avtn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avtn.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
