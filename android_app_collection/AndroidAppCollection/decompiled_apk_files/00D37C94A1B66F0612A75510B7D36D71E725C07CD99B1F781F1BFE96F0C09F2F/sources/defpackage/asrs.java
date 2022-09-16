package defpackage;
/* compiled from: PG */
/* renamed from: asrs  reason: default package */
/* loaded from: classes2.dex */
public final class asrs extends aopi implements aoqv {
    public static final asrs a;
    private static volatile aorb k;
    public int b;
    public avhn c;
    public asrt d;
    public aopu e;
    public aopu f;
    public asrp g;
    public aunb h;
    public String i;
    public apzg j;
    private arag l;
    private byte m = 2;

    static {
        asrs asrsVar = new asrs();
        a = asrsVar;
        aopi.registerDefaultInstance(asrs.class, asrsVar);
    }

    private asrs() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.i = "";
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0002\b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007Л\nᐉ\u0001\fᐉ\u0005\rဈ\u0006\u000eᐉ\u0007", new Object[]{"b", "l", "d", "g", "e", asrr.class, "f", asrq.class, "c", "h", "i", "j"});
            case 3:
                return new asrs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (asrs.class) {
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
