package defpackage;
/* compiled from: PG */
/* renamed from: apuj  reason: default package */
/* loaded from: classes2.dex */
public final class apuj extends aopi implements aoqv {
    public static final apuj a;
    private static volatile aorb f;
    public int b;
    public apun c;
    public apuk d;
    public apok e;
    private apok g;
    private apuh h;
    private apui i;
    private byte j = 2;

    static {
        apuj apujVar = new apuj();
        a = apujVar;
        aopi.registerDefaultInstance(apuj.class, apujVar);
    }

    private apuj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0007\r\u0006\u0000\u0000\u0006\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\u0004\rᐉ\u0005", new Object[]{"b", "g", "c", "h", "i", "d", "e"});
            case 3:
                return new apuj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apuj.class) {
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
