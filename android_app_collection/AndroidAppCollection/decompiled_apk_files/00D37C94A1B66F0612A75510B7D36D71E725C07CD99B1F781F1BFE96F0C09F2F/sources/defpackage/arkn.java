package defpackage;
/* compiled from: PG */
/* renamed from: arkn  reason: default package */
/* loaded from: classes2.dex */
public final class arkn extends aopi implements aoqv {
    public static final arkn a;
    private static volatile aorb g;
    public arpa b;
    public apzg d;
    public aunb f;
    private int h;
    private aoux i;
    private arag j;
    private apzg k;
    private auna l;
    private byte m = 2;
    public aopu c = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        arkn arknVar = new arkn();
        a = arknVar;
        aopi.registerDefaultInstance(arkn.class, arknVar);
    }

    private arkn() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\b\u0001ᐉ\u0001\u0003Л\u0004ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0005\fည\u0007\u000eᐉ\u0000\u0010ᐉ\t", new Object[]{"h", "b", "c", arko.class, "j", "d", "l", "k", "e", "i", "f"});
            case 3:
                return new arkn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arkn.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
