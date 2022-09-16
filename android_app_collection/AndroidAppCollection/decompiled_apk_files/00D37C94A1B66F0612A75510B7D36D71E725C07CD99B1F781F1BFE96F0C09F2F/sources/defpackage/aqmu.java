package defpackage;
/* compiled from: PG */
/* renamed from: aqmu  reason: default package */
/* loaded from: classes2.dex */
public final class aqmu extends aopi implements aoqv {
    public static final aqmu a;
    private static volatile aorb i;
    public int b;
    public arhs c;
    public aoux g;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public aopu f = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        aqmu aqmuVar = new aqmu();
        a = aqmuVar;
        aopi.registerDefaultInstance(aqmu.class, aqmuVar);
    }

    private aqmu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001ဈ\u0002\u0002ᐉ\u0003\u0003ည\u0004\u0004ဈ\u0001\u0005ᐉ\u0000\u0006Л", new Object[]{"b", "e", "g", "h", "d", "c", "f", arag.class});
            case 3:
                return new aqmu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqmu.class) {
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
