package defpackage;
/* compiled from: PG */
/* renamed from: arlf  reason: default package */
/* loaded from: classes2.dex */
public final class arlf extends aopi implements aoqv {
    public static final arlf a;
    private static volatile aorb f;
    public arpa b;
    public int c;
    public int d;
    private int g;
    private byte h = 2;
    public aopu e = emptyProtobufList();

    static {
        arlf arlfVar = new arlf();
        a = arlfVar;
        aopi.registerDefaultInstance(arlf.class, arlfVar);
    }

    private arlf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0003Л\u0005ဋ\u0002", new Object[]{"g", "b", "c", "e", arlc.class, "d"});
            case 3:
                return new arlf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arlf.class) {
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
